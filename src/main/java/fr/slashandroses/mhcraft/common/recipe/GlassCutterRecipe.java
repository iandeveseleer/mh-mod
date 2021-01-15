package fr.slashandroses.mhcraft.common.recipe;

import fr.slashandroses.mhcraft.MHConstants;
import fr.slashandroses.mhcraft.MHCraft;
import fr.slashandroses.mhcraft.registry.BlockRegistry;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class GlassCutterRecipe extends CuttingRecipe {

    public static final RecipeType<GlassCutterRecipe> TYPE = RecipeType.register(MHConstants.NAMESPACE + ":glasscutter");

    public GlassCutterRecipe(Identifier id, String group, Ingredient input, ItemStack output) {
        super(TYPE, MHCraft.GLASSCUTTING, id, group, input, output);
    }

    public boolean matches(Inventory inv, World world) {
        return this.input.test(inv.getStack(0));
    }

    public ItemStack getRecipeKindIcon() {
        return new ItemStack(BlockRegistry.GLASSCUTTER);
    }

    public static class Serializer2<T extends CuttingRecipe> extends Serializer<T> {

        public Serializer2(RecipeFactory<T> recipeFactory) {
            super(recipeFactory);
        }
    }
}
