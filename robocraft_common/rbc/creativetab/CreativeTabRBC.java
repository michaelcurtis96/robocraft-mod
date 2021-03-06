package rbc.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import rbc.lib.ItemIds;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Robocraft
 * 
 * CreativeTabRBC
 * 
 * @author michaelcurtis96
 * 
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class CreativeTabRBC extends CreativeTabs {

    public CreativeTabRBC(int par1, String label) {

        super(par1, label);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return ItemIds.BATTERY_DEFAULT;
    }

    public static void initTab() {
        LanguageRegistry.instance().addStringLocalization("itemGroup.RBC",
                "en_US", "Robocraft");
    }

}
