package cx.rain.mc.huntme.item;

import cx.rain.mc.huntme.group.GroupHuntMe;
import net.minecraft.item.CompassItem;
import net.minecraft.item.ItemStack;

public class ItemsCompass extends CompassItem {
    public ItemsCompass() {
        super(new Properties().maxStackSize(1).group(GroupHuntMe.HUNTME));
    }

    @Override
    public String getTranslationKey() {
        return "item.huntme.compass";
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return "item.huntme.compass";
    }
}
