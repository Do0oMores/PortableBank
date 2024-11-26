package top.mores.portableBank;

import org.bukkit.plugin.java.JavaPlugin;

public final class PortableBank extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PortableBank is enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("PortableBank is disabled");
    }
}
