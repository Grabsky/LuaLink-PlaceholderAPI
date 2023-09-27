package xyz.galaxyy.lualink.addons.example;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.galaxyy.lualink.addons.example.functions.LuaExampleFunction;
import xyz.galaxyy.lualink.api.addons.LuaAddon;

public class LuaLinkExampleAddon extends JavaPlugin {
    @Override
    public void onEnable() {
        LuaAddon addon = new LuaAddon();
        addon.addFunction("example", new LuaExampleFunction());
    }
}