package cx.rain.mc.huntme.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import cx.rain.mc.huntme.item.Items;

public class GroupHuntMe extends ItemGroup {
    public static final ItemGroup HUNTME = new GroupHuntMe();

    public GroupHuntMe() {
        super("huntme");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.COMPASS.get());
    }
}
