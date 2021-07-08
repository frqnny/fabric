package net.fabricmc.fabric.api.biome.v1.tag;

import net.minecraft.tag.Tag;
import net.minecraft.world.biome.Biome;

import java.util.Optional;

public record FabricBiomeTag() {



	public FabricBiomeTag(Tag.Identified<Biome> tag) {
		this(tag, null);
	}

	public FabricBiomeTag(Tag.Identified<Biome> tag, Biome.Category cat) {
		this.tag = tag;
		category = Optional.ofNullable(cat);
	}



}
