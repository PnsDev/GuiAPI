package com.pnsdev.guiapi.misc;

import com.pnsdev.guiapi.MenuInterface;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public interface OnClick {
    ButtonAction onClick(HumanEntity entity, ItemStack stack, MenuInterface i, InventoryClickEvent e);

    enum ButtonAction {
        CLOSE,
        CANCEL;
    }
}
