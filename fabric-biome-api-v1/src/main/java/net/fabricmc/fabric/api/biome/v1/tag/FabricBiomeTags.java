package net.fabricmc.fabric.api.biome.v1.tag;

import net.minecraft.tag.RequiredTagList;
import net.minecraft.tag.RequiredTagListRegistry;
import net.minecraft.tag.Tag;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

//TODO sort biome categories into tags,
//TODO find a way to
public class FabricBiomeTags {
	protected static final RequiredTagList<Biome> BIOME_TAGS = RequiredTagListRegistry.register(Registry.BIOME_KEY, "tags/biomes");
	public static final Tag.Identified<Biome> TAIGA = BIOME_TAGS.add("taiga");
	public static final Tag.Identified<Biome> EXTREME_HILLS = BIOME_TAGS.add("extreme_hills");
	public static final Tag.Identified<Biome> JUNGLE = BIOME_TAGS.add("jungle");
	public static final Tag.Identified<Biome> MESA = BIOME_TAGS.add("mesa");
	public static final Tag.Identified<Biome> PLAINS = BIOME_TAGS.add("plains");
	public static final Tag.Identified<Biome> SAVANNA = BIOME_TAGS.add("savanna");
	public static final Tag.Identified<Biome> ICY = BIOME_TAGS.add("icy");
	public static final Tag.Identified<Biome> BEACH = BIOME_TAGS.add("beach");
	public static final Tag.Identified<Biome> FOREST = BIOME_TAGS.add("forest");
	public static final Tag.Identified<Biome> OCEAN = BIOME_TAGS.add("ocean");
	public static final Tag.Identified<Biome> DESERT = BIOME_TAGS.add("desert");
	public static final Tag.Identified<Biome> RIVER = BIOME_TAGS.add("river");
	public static final Tag.Identified<Biome> SWAMP = BIOME_TAGS.add("swamp");
	public static final Tag.Identified<Biome> MUSHROOM = BIOME_TAGS.add("mushroom");
	public static final Tag.Identified<Biome> UNDERGROUND = BIOME_TAGS.add("underground");
	public static final Tag.Identified<Biome> NETHER = BIOME_TAGS.add("nether");
	public static final Tag.Identified<Biome> THEEND = BIOME_TAGS.add("the_end");
	public static final Tag.Identified<Biome> OVERWORLD = BIOME_TAGS.add("overworld");


	private FabricBiomeTags() {
	}


	public static Biome.Category getBiomeCategoryFor(Tag.Identified<Biome> tag) {
		for (Biome.Category category : Biome.Category.values()) {

		}

		return Biome.Category.NONE;
	}
}
