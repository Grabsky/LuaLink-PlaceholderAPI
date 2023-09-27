package xyz.galaxyy.lualink.addons.example.functions;

import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ZeroArgFunction;

public class LuaExampleFunction extends ZeroArgFunction {
    @Override
    public LuaValue call() {
        return LuaValue.valueOf("Hello from Java!");
    }
}
