package fr.thebrian22950.plugin.portableinventory;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryView;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Commande utilisable seulement en tant que joueur");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("portableworkbench")) {
			Player player = (Player) sender;
			player.openWorkbench(player.getLocation(), true);
			player.sendMessage(ChatColor.DARK_RED
					+ "Vous avez ouvert votre établi portable !");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("portableenchant")) {
			Player player = (Player) sender;
			player.openEnchanting(player.getLocation(), true);
			player.sendMessage(ChatColor.DARK_RED
					+ "Vous avez ouvert votre table d'enchantement portable !");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("portablefurnace")) {
			Player player = (Player) sender;
			player.playEffect(player.getLocation(), Effect.POTION_BREAK, 5);
			
			player.sendMessage(ChatColor.DARK_RED
					+ "Vous avez ouvert votre table d'enchantement portable !");
			return true;
		}
		return false;
	}
}