# Fresh Proxy Command

This project is a fork of the project [Proxy Command](https://modrinth.com/mod/proxy-command) from [michiruf](https://modrinth.com/user/michiruf) updated for the new version of Minecraft.


## Installation

To install this mod on fabric minecraft servers these requirements must be met:
* **fabric** and **[fabric API](https://modrinth.com/mod/fabric-api)** is installed on your minecraft servers
* **[FabricProxy-Lite](https://modrinth.com/mod/fabricproxy-lite)** is installed and working on you minecraft servers
* **[CrossStitch](https://modrinth.com/mod/crossstitch)** is installed on you minecraft servers
* You have a velocity server up and running
* You must install both the fabric mod and the velocity plugin

This fabric mod is available on [modrinth](https://modrinth.com/mod/fresh-proxy-command) with slug `fresh-proxy-command` and the velocity plugin is available on the [original project releases](https://github.com/michiruf/MCProxyCommand/releases/tag/1.0) ([direct download](https://github.com/michiruf/MCProxyCommand/releases/download/1.0/proxy-command-velocity-1.0-1-9fa21f82.jar))

The project source is available on [github/laToufff](https://github.com/laToufff/MCProxyCommand) with the latest
readme [here](https://github.com/laToufff/MCProxyCommand/blob/master/README.md).


## Usage instructions

On minecraft server instances the command `proxycommand "[command]"` can get used via command blocks or other
command sources, where a player is the source. The player must be a source of the command, since the plugin and
velocity needs this to handle the context of the command execution and send e.g. error messages back to
the player.

For example, you can teleport all players to a different server with a command block using
```
execute as @a run proxycommand "server SERVERNAME"
```


## License

[MIT License](https://github.com/laToufff/MCProxyCommand/blob/master/LICENSE)


## Additional reading (for devs)

* [Fabric wiki](https://fabricmc.net/wiki/start)
* [Multiloader template](https://github.com/jaredlll08/MultiLoader-Template)
