a=1
for i in *.json; do
  new=$(printf "oak_leaves_path_%01d.json" "$a") #04 pad to length of 4
  mv -i -- "$i" "$new"
  let a=a+1
done
