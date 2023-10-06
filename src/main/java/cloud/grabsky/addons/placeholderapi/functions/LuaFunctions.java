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
package cloud.grabsky.addons.placeholderapi.functions;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ThreeArgFunction;
import org.luaj.vm2.lib.TwoArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

public final class LuaFunctions {

    public static final LuaFunction SET_PLACEHOLDERS = new TwoArgFunction() {

        @Override
        public LuaValue call(final LuaValue player, final LuaValue text) {
            return CoerceJavaToLua.coerce(
                    PlaceholderAPI.setPlaceholders(
                            (OfflinePlayer) CoerceLuaToJava.coerce(player, OfflinePlayer.class),
                            (String) CoerceLuaToJava.coerce(text, String.class)
                    )
            );
        }

    };

    public static final LuaFunction SET_BRACKET_PLACEHOLDERS = new TwoArgFunction() {

        @Override
        public LuaValue call(final LuaValue player, final LuaValue text) {
            return CoerceJavaToLua.coerce(
                    PlaceholderAPI.setBracketPlaceholders(
                            (OfflinePlayer) CoerceLuaToJava.coerce(player, OfflinePlayer.class),
                            (String) CoerceLuaToJava.coerce(text, String.class)
                    )
            );
        }

    };

    public static final LuaFunction SET_RELATIONAL_PLACEHOLDERS = new ThreeArgFunction() {

        @Override
        public LuaValue call(final LuaValue playerOne, final LuaValue playerTwo, final LuaValue text) {
            return CoerceJavaToLua.coerce(
                    PlaceholderAPI.setRelationalPlaceholders(
                            (Player) CoerceLuaToJava.coerce(playerOne, Player.class),
                            (Player) CoerceLuaToJava.coerce(playerTwo, Player.class),
                            (String) CoerceLuaToJava.coerce(text, String.class)
                    )
            );
        }

    };

}
