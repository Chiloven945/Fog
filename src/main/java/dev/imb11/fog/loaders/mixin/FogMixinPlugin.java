package dev.imb11.fog.loaders.mixin;

import dev.imb11.fog.client.FogClient;
import dev.imb11.fog.config.FogConfig;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class FogMixinPlugin implements IMixinConfigPlugin {

	@Override
	public void onLoad(String mixinPackage) {}

	@Override
	public String getRefMapperConfig() { return ""; }

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		return !FogClient.isModInstalled("sodium")
				|| !mixinClassName.startsWith("dev.imb11.fog.mixin.client.rendering.WorldRendererMixin");
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

	@Override
	public List<String> getMixins() { return null; }

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}
}
