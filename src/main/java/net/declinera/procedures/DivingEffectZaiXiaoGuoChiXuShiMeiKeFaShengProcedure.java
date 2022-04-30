package net.declinera.procedures;

import net.minecraft.entity.Entity;

import net.declinera.DeclineraMod;

import java.util.Map;

public class DivingEffectZaiXiaoGuoChiXuShiMeiKeFaShengProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DeclineraMod.LOGGER.warn("Failed to load dependency entity for procedure DivingEffectZaiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion(0, (-0.1), 0);
	}
}
