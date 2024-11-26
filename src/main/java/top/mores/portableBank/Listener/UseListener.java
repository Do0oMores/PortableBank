package top.mores.portableBank.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class UseListener implements Listener {

    /**
     * 玩家右键物品使用
     * @param event
     */
    @EventHandler
    public void onUse(PlayerInteractEvent event) {
        Player player = event.getPlayer();
    }
}
