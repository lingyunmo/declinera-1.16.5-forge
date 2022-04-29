package net.declinera.procedures;

import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.declinera.DeclineraMod;

import java.util.Map;

public class DivingEffectZaiXiaoGuoChiXuShiMeiKeFaShengProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DeclineraMod.LOGGER.warn("Failed to load dependency x for procedure DivingEffectZaiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DeclineraMod.LOGGER.warn("Failed to load dependency y for procedure DivingEffectZaiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DeclineraMod.LOGGER.warn("Failed to load dependency z for procedure DivingEffectZaiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DeclineraMod.LOGGER.warn("Failed to load dependency entity for procedure DivingEffectZaiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof ServerPlayerEntity)
			((ServerPlayerEntity) entity).func_242111_a(((ServerPlayerEntity) entity).world.getDimensionKey(),
					new BlockPos((int) x, (int) (y - 1), (int) z), 0, true, false);
	}
}
