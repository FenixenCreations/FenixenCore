package org.FenixCore.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Messages {

    public void commandMessageColor(CommandSender sender, String message){
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public void consoleMessageColor(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public void loggerMessageColor(String message){
        Bukkit.getLogger().info(translateToAnsi(message));
    }

    public void playerMessageColor(Player player, String message){
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public String translateToAnsi(String text){
        return text
                .replace("&0", "\u001B[30m") // Negro
                .replace("&1", "\u001B[34m") // Azul oscuro
                .replace("&2", "\u001B[32m") // Verde
                .replace("&3", "\u001B[36m") // Aqua
                .replace("&4", "\u001B[31m") // Rojo oscuro
                .replace("&5", "\u001B[35m") // Púrpura
                .replace("&6", "\u001B[33m") // Oro
                .replace("&7", "\u001B[37m") // Gris claro
                .replace("&8", "\u001B[90m") // Gris oscuro
                .replace("&9", "\u001B[94m") // Azul claro
                .replace("&a", "\u001B[92m") // Verde claro
                .replace("&b", "\u001B[96m") // Aqua claro
                .replace("&c", "\u001B[91m") // Rojo claro
                .replace("&d", "\u001B[95m") // Rosa
                .replace("&e", "\u001B[93m") // Amarillo
                .replace("&f", "\u001B[97m") // Blanco
                .replace("&r", "\u001B[0m")  // Reset
                + "\u001B[0m";
    }

}
