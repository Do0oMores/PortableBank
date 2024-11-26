package top.mores.portableBank.ConfigUtils;

import org.bukkit.configuration.Configuration;
import top.mores.portableBank.PortableBank;

public class ConfigUtil {
    private Configuration config= PortableBank.getInstance().getConfig();

    //获取
    public double getGoldNuggetVault(){
        return config.getDouble("金粒.价值");
    }

    public double getGoldNuggetReclaimVault(){
        return config.getDouble("金粒.回收价值");
    }

    public double getGoldIngotVault(){
        return config.getDouble("金锭.价值");
    }

    public double getGoldIngotReclaimVault(){
        return config.getDouble("金锭.回收价值");
    }

    public double getGoldBlockVault(){
        return config.getDouble("金块.价值");
    }

    public double getGoldBlockReclaimVault(){
        return config.getDouble("金块.回收价值");
    }

    //回写
}
