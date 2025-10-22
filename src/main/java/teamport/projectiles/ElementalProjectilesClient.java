package teamport.projectiles;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelBow;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.item.Item;
import teamport.projectiles.core.item.EPItems;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static teamport.projectiles.ElementalProjectiles.MOD_ID;

public class ElementalProjectilesClient implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
			setIcon(EPItems.AMMO_ARROW_EGG, "projectiles:item/arrow/egg");
			setIcon(EPItems.AMMO_ARROW_EXPLOSIVE, "projectiles:item/arrow/explosive");
			setIcon(EPItems.AMMO_ARROW_FIRE, "projectiles:item/arrow/fire");
			setIcon(EPItems.AMMO_ARROW_ICE, "projectiles:item/arrow/ice");
			setIcon(EPItems.AMMO_ARROW_LIGHTNING, "projectiles:item/arrow/lightning");
			ModelHelper.setItemModel(EPItems.TOOL_BOW_HOMING, () -> new ItemModelBow(EPItems.TOOL_BOW_HOMING, "tool.bow.homing").setIcon("projectiles:item/homing_bow"));

	}

	private static void setIcon(Item item, String model)
	{
		ModelHelper.setItemModel(item, () -> new ItemModelStandard(item, MOD_ID).setIcon(model));
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
