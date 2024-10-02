### Files that 1 block will need

#### Note :: this is for a very basic block, more complex blocks will need more files/more advanced json file configurations

assets/modid/blockstates/blockname.json

```json
{
  "variants": {
    "": {
      "model": "modid:block/blockname"
    }
  }
}
```

---

assets/modid/models/block/blockname.json

```json
{
  "parent": "block/cube_all",
  "textures": {
    "all": "modid:block/blockname"
  }
}
```

---

assets/modid/models/item/blockname.json

```json
{
  "parent": "modid:block/blockname"
}
```

---

They also need the textures in assets/modid/textures/block/blockname.png
If there is multiple textures, they need to be in the same folder with the same name but with a different suffix
ex. blockname_top.png, blockname_side.png, blockname_bottom.png

The model/blockstate files will then need to be adjusted.

**Ofc add the translations and lang files if needed.**
