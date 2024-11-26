package top.mores.portableBank;

import org.bukkit.plugin.java.JavaPlugin;
import top.mores.portableBank.Listener.UseListener;

public final class PortableBank extends JavaPlugin {
    private static PortableBank instance;

    @Override
    public void onEnable() {
        instance = this;
        //注册监听器
        this.getServer().getPluginManager().registerEvents(new UseListener(), this);
        getLogger().info("PortableBank is enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("PortableBank is disabled");
    }

    //插件实例
    public static PortableBank getInstance() {
        return instance;
    }
}
