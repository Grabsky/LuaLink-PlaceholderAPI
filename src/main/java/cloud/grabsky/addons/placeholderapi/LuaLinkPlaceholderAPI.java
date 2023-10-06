/*
 * MIT License
 *
 * Copyright (c) 2023 Grabsky <44530932+Grabsky@users.noreply.github.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * HORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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