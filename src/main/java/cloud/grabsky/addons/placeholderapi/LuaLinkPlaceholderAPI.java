package cloud.grabsky.addons.placeholderapi;

import cloud.grabsky.addons.placeholderapi.functions.LuaFunctions;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.galaxyy.lualink.api.LuaLinkAPI;
import xyz.galaxyy.lualink.api.addons.LuaAddon;

public final class LuaLinkPlaceholderAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        // Throwing exception if PlaceholderAPI plugin is not enabled.
        if (this.getServer().getPluginManager().isPluginEnabled("PlaceholderAPI") == false)
            throw new IllegalStateException("Plugin PlaceholderAPI must be loaded for this extension to work.");
        // Creating addon instance.
        final LuaAddon addon = new LuaAddon();
        // Adding functions.
        addon.addFunction("setPlaceholders", LuaFunctions.SET_PLACEHOLDERS);
        addon.addFunction("setBracketPlaceholders", LuaFunctions.SET_BRACKET_PLACEHOLDERS);
        addon.addFunction("setRelationalPlaceholders", LuaFunctions.SET_RELATIONAL_PLACEHOLDERS);
        // Registering addon.
        LuaLinkAPI.Companion.registerAddon("PlaceholderAPI", addon);
    }

}