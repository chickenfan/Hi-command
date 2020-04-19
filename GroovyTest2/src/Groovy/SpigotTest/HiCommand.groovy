package Groovy.SpigotTest

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class HiCommand implements CommandExecutor{

    @Override
    boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("hi")) {
            sender.sendMessage("Hi")
        }

        return false
    }
}
