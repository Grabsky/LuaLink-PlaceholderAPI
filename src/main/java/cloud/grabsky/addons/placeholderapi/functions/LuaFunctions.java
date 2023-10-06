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
