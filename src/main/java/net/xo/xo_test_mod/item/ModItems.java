package net.xo.xo_test_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xo.xo_test_mod.XoTestMod;
public class ModItems {
    public static final Item ruby = registerItem("ruby",new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsTab(FabricItemGroupEntries entries) {
        final Item[] IngredientItems = {ruby};
        for (int i = 0; i < IngredientItems.length; i++) {
            entries.add(IngredientItems[i]);
        }

    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(XoTestMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        XoTestMod.LOGGER.info("Registering items for " + XoTestMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTab);
    }
}
