package cc.lixou.lobbyextension

import net.minestom.server.extensions.Extension

class LobbyExtension : Extension() {

    override fun initialize() {
        println("[Lobby] Enabled successfully")
    }

    override fun terminate() {
        println("[Lobby] Disabled successfully")
    }

}