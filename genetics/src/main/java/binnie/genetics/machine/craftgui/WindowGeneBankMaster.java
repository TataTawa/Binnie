package binnie.genetics.machine.craftgui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;

import net.minecraftforge.fml.relauncher.Side;

public class WindowGeneBankMaster extends WindowGeneBank {
	public WindowGeneBankMaster(final EntityPlayer player, final IInventory inventory, final Side side) {
		super(player, inventory, side, true);
	}
}
