package com.blocktyper.helpers;

import java.util.List;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface IPlayerHelper {
	ItemStack getItemInHand(Player player);
	ItemStack getFirstArrowStack(Player player);
	Entity getTargetEntity(Player player);
	boolean playerCanDoAction(Player player, List<String> permissions);
	boolean playerCanDoAction(HumanEntity player, List<String> permissions);
	boolean itemHasEnchantment(ItemStack item, Enchantment enchantment);
	public String getLocale(Player player);
}
