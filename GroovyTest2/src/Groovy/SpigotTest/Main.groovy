package Groovy.SpigotTest


import org.bukkit.plugin.java.JavaPlugin

class Main extends  JavaPlugin{

    @Override
    void onEnable() {
        this.getCommand("hi").setExecutor(new HiCommand())
    }

    @Override
    voidt onDisable() {}
}
