> [!CAUTION]
> **This repository is no longer maintained.**  
> With the release of **[LuaLink v2](https://github.com/LuaLink/LuaLinkV2)**, this addon is no longer necessary.
> 
> Check **[Dependencies](https://lualink.github.io/docs/dependencies/)** section in documentation to learn more about accessing plugin APIs.

<br />

# LuaLink-PlaceholderAPI
**[LuaLink](https://github.com/LuaLink/LuaLink)** addon which brings support for some basic PlaceholderAPI functionality.

<br />

### Requirements
Plugin requires following environment.

- **[Paper](https://github.com/PaperMC/Paper)** server software, version **1.20.1** or higher.
- **[LuaLink](https://github.com/LuaLink/LuaLink)** plugin.
- **[PlacehlderAPI](https://github.com/PlaceholderAPI/PlaceholderAPI)** plugin.

Other versions and environments may work too, but are not supported.

<br />

### Example Usage
Replacing placeholders in text can be done as follows.
```lua
-- Getting the PlaceholderAPI addon instance.
local PlaceholderAPI = addons.get("PlaceholderAPI")

-- Hooking into PlayerJoinEvent.
script.hook("org.bukkit.event.player.PlayerJoinEvent", function(event)
    -- Creating message and replacing placeholders.
    local message = PlaceholderAPI.setPlaceholders(event:getPlayer(), "Welcome back, %player_name%. There are currently %server_online% players online.")
    -- Sending message to the player.
    event:getPlayer():sendMessage(message)
end)
```

<br />

### Reference
So far, only following functions has been ported. There is no way to register custom placeholders yet.

<br />

`(PlaceholderAPI).setPlaceholders(player: OfflinePlayer, text: string): string`

&nbsp;&nbsp; **Description**  
&nbsp;&nbsp;&nbsp;&nbsp; Returns string with all placeholders translated into their corresponding values.

&nbsp;&nbsp; **Parameters**  
&nbsp;&nbsp;&nbsp;&nbsp; `player` - player to use for placeholder resolution.  
&nbsp;&nbsp;&nbsp;&nbsp; `text` - string to replace placeholders in.

<br />

`(PlaceholderAPI).setBracketPlaceholders(player: OfflinePlayer, text: string): string`

&nbsp;&nbsp; **Description**  
&nbsp;&nbsp;&nbsp;&nbsp; Returns string with all bracket placeholders translated into their corresponding values.

&nbsp;&nbsp; **Parameters**  
&nbsp;&nbsp;&nbsp;&nbsp; `player` - player to use for placeholder resolution.  
&nbsp;&nbsp;&nbsp;&nbsp; `text` - string to replace placeholders in.

<br />

`(PlaceholderAPI).setRelationalPlaceholders(playerOne: Player, playerTwo: Player, text: string): string`

&nbsp;&nbsp; **Description**  
&nbsp;&nbsp;&nbsp;&nbsp; Returns string with all relational placeholders translated into their corresponding values.

&nbsp;&nbsp; **Parameters**  
&nbsp;&nbsp;&nbsp;&nbsp; `playerOne` - first player to use for comparison.  
&nbsp;&nbsp;&nbsp;&nbsp; `playerTwo` - second player to use for comparison.  
&nbsp;&nbsp;&nbsp;&nbsp; `text` - string to replace placeholders in.

<br />

### Building (Linux)
```shell
# Cloning repository
$ git clone https://github.com/Grabsky/LuaLink-PlaceholderAPI.git
# Entering cloned repository
$ cd ./LuaLink-PlaceholderAPI
# Compiling
$ ./gradlew clean assemble
```

<br />

### Contributing
This project is open for contributions. Any kind of help is greatly appreciated.
