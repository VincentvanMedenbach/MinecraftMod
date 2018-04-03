package Vin.Moon;

import java.util.Random;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import micdoodle8.mods.galacticraft.api.world.ITeleportType;
import micdoodle8.mods.galacticraft.core.client.CloudRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;

public class VinWorldProvider extends WorldProviderSpace implements IGalacticraftWorldProvider, ISolarLevel, ITeleportType {

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier >= 1;
	}

	@Override
	public float getFallDamageModifier() {
		return 0.75F;
	}

	@Override
	public double getFuelUsageMultiplier() {
		return 0.8;
	}

	@Override
	public float getGravity() {
		return 0.07F;
	}

	// The moon is 7.0, 0 is none, lower numbers mean more
	@Override
	public double getMeteorFrequency() {
		return 1.0;
	}

	@Override
	public float getSoundVolReductionAmount() {
		return Float.MAX_VALUE;
	}

	@Override
	public float getThermalLevelModifier() {
		return -2;
	}

	@Override
	public float getWindLevel() {
		return 0;
	}

	@Override
	public boolean canRainOrSnow() {
		return false;
	}

	@Override
	public CelestialBody getCelestialBody() {
		return Main.harry;
	}

	// Created later
	@Override
	public Class<? extends IChunkProvider> getChunkProviderClass() {
		return VinChunkProvider.class;
	}

	@Override
	public long getDayLength() {
		return 24L;
	}

	@Override
	public Vector3 getFogColor() {
		return new Vector3(0, 0, 0);
	}

	@Override
	public Vector3 getSkyColor() {
		return new Vector3(0, 0, 0);
	}

	// Created Later
	@Override
	public Class<? extends WorldChunkManager> getWorldChunkManagerClass() {
		return WorldChunkManagerVin.class;
	}

	@Override
	public boolean hasSunset() {
		return false;
	}

	// Can players respawn here?
	@Override
	public boolean shouldForceRespawn() {
		return true;
	}

	@Override
	public double getSolarEnergyMultiplier() {
		return 10;
	}

	public double getYCoordinateToTeleport() {
		return 800;
	}

	
	public Vector3 getEntitySpawnLocation(WorldServer arg0, Entity arg1) {
		return new Vector3(arg1.posX, 140, arg1.posZ);
	}

	
	public Vector3 getParaChestSpawnLocation(WorldServer arg0, EntityPlayerMP arg1, Random arg2) {

		return new Vector3(arg1.posX - 5 + arg2.nextInt(10), 150, arg1.posZ - 5 + arg2.nextInt(10));
	}

	
	public Vector3 getPlayerSpawnLocation(WorldServer arg0, EntityPlayerMP arg1) {
		return getEntitySpawnLocation(arg0, arg1);
	}

	
	public void onSpaceDimensionChanged(World arg0, EntityPlayerMP arg1, boolean arg2) {
	}

	
	public boolean useParachute() {
		return true;
	}

	@Override
	public IRenderHandler getCloudRenderer() {
		return new CloudRenderer();
	}
}