import argparse
import os

#################################################################################
# Configuration section. Modify this to suit your mod. Run this python script
# from within the root of your mod project. Directories in this configuration
# are relative to that root

# This is the string that represents a reference to your modid. You can also
# use a string here but it is usually better to have some constant somewhere
MODID_REF = 'MHConstants.NAMESPACE'

# This is the actual modid as used in json for example
MODID = 'mhcraft'

# The root package of your mod
ROOT_PACKAGE = 'fr.slashandroses.mhcraft'

# The relative path to the mod root (where your main mod file is located)
SOURCE_ROOT = 'src/main/java/fr/slashandroses/mhcraft'
# The relative path to the root of your asset resources
ASSET_RESOURCE_ROOT = 'src/main/resources/assets/mhcraft'
# The relative path to the root of your data resources
DATA_RESOURCE_ROOT = 'src/main/resources/data/mhcraft'

# Package where you want to generate code. These can be the same in case you
# want to generate all in the same package but you can also separate it
PACKAGE_BLOCKS = 'blocks'
PACKAGE_TILES = 'blocks'
PACKAGE_CONTAINERS = 'blocks'
PACKAGE_SCREENS = 'blocks'


TEMPLATE_BLOCKSTATE_JSON = '''
{
    "variants": {
        "": { "model": "${modid}:block/$L{name}" }
    }
}
'''

TEMPLATE_BLOCKMODEL_JSON = '''
{
    "parent": "block/cube_all",
    "textures": {
        "all": "${modid}:block/$L{name}"
    }
}
'''

TEMPLATE_ITEMMODEL_JSON = '''
{
  "parent": "${modid}:block/$L{name}"
}
'''

TEMPLATE_LOOTTABLE_JSON = '''
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "${modid}:$L{name}"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
'''

TEMPLATE_RECIPE_JSON = '''
{
  "type": "minecraft:crafting_shaped",
  "pattern": [
    "ccc",
    "ccc",
    "ccc"
  ],
  "key": {
    "c": {
      "item": "minecraft:clay"
    }
  },
  "result": {
    "item": "${modid}:$L{name}"
  }
}'''


#################################################################################

def generate(template, inputs):
    for inp, val in inputs.items():
        template = template.replace('${' + inp + '}', val)
        template = template.replace('$U{' + inp + '}', val.upper())
        template = template.replace('$L{' + inp + '}', val.lower())

    return template.strip()


def add_templated_json(path, package, name, template):
    for p in package.split('.'):
        path = os.path.join(path, p)
    os.makedirs(path, exist_ok=True)
    json_name = name.lower() + '.json'
    path = os.path.join(path, json_name)

    if os.path.exists(path):
        print(f'File {json_name!r} already exists. Not generated')
    else:
        print(f'Generated {json_name!r}')
        f = open(path, 'w')

        f.write(
            generate(
                template,
                {
                    'package': f"{ROOT_PACKAGE}.{package}",
                    'modid_ref': MODID_REF,
                    'modid': MODID,
                    'name': name
                }
            )
        )

        f.close()


def add_block(name):
    add_templated_json(ASSET_RESOURCE_ROOT, 'blockstates', name, TEMPLATE_BLOCKSTATE_JSON)
    add_templated_json(ASSET_RESOURCE_ROOT, 'models.block', name, TEMPLATE_BLOCKMODEL_JSON)
    add_templated_json(ASSET_RESOURCE_ROOT, 'models.item', name, TEMPLATE_ITEMMODEL_JSON)
    add_templated_json(DATA_RESOURCE_ROOT, 'loot_tables.blocks', name, TEMPLATE_LOOTTABLE_JSON)
    add_templated_json(DATA_RESOURCE_ROOT, 'recipes', name, TEMPLATE_RECIPE_JSON)


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='Make a block')
    parser.add_argument('name', help='CamelCase name of the block to add')
    args = parser.parse_args()

    print(f'Adding block {args.name}')
    add_block(args.name)
