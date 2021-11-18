package com.pnsdev.guiapi.misc;

import com.pnsdev.guiapi.MenuInterface;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface OnChange {
    void onChange(MenuInterface menu, Player player, InventoryClickEvent event);
}
