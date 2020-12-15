package cx.rain.mc.huntme;

import cx.rain.mc.huntme.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HuntMe.MODID)
public class HuntMe {
    public static final String MODID = "huntme";
    
    private static HuntMe Instance;
    
    public HuntMe() {
        Instance = this;
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        new Items(bus);
    }

    public static HuntMe getInstance() {
        return Instance;
    }
}
