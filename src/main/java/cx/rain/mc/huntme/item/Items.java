package cx.rain.mc.huntme.item;

import cx.rain.mc.huntme.HuntMe;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HuntMe.MODID);

    public Items(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static RegistryObject<Item> COMPASS = ITEMS.register("compass", () -> new ItemsCompass());
}
