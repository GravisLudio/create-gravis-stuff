package net.gravis.stuff;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.PushReaction;

public class GravisStuffMod implements ModInitializer {
    public static final String MOD_ID = "gravis_stuff";

    // --- 1. MAGMA DE TOBA ---
    public static final ResourceKey<Block> MAGMA_DE_TOBA_KEY = ResourceKey.create(
            Registries.BLOCK,
            Identifier.fromNamespaceAndPath(MOD_ID, "magma_de_toba")
    );
    public static final ResourceKey<Item> MAGMA_DE_TOBA_ITEM_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "magma_de_toba")
    );
    public static final Block MAGMA_DE_TOBA = new Block(
            BlockBehaviour.Properties.of()
                    .setId(MAGMA_DE_TOBA_KEY)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
    );

    // --- 2. MASA DE TOBA ---
    public static final ResourceKey<Block> MASA_DE_TOBA_KEY = ResourceKey.create(
            Registries.BLOCK,
            Identifier.fromNamespaceAndPath(MOD_ID, "masa_de_toba")
    );
    public static final ResourceKey<Item> MASA_DE_TOBA_ITEM_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "masa_de_toba")
    );
    public static final Block MASA_DE_TOBA = new Block(
            BlockBehaviour.Properties.of()
                    .setId(MASA_DE_TOBA_KEY)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
    );

    // --- 3. MASA DE TOBA FRÍA ---
    public static final ResourceKey<Block> MASA_DE_TOBA_FRIA_KEY = ResourceKey.create(
            Registries.BLOCK,
            Identifier.fromNamespaceAndPath(MOD_ID, "masa_de_toba_fria")
    );
    public static final ResourceKey<Item> MASA_DE_TOBA_FRIA_ITEM_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "masa_de_toba_fria")
    );
    public static final Block MASA_DE_TOBA_FRIA = new Block(
            BlockBehaviour.Properties.of()
                    .setId(MASA_DE_TOBA_FRIA_KEY)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
    );

    // --- 4. MASA DE TOBA DENSA ---
    public static final ResourceKey<Block> MASA_DE_TOBA_DENSA_KEY = ResourceKey.create(
            Registries.BLOCK,
            Identifier.fromNamespaceAndPath(MOD_ID, "masa_de_toba_densa")
    );
    public static final ResourceKey<Item> MASA_DE_TOBA_DENSA_ITEM_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "masa_de_toba_densa")
    );
    public static final Block MASA_DE_TOBA_DENSA = new Block(
            BlockBehaviour.Properties.of()
                    .setId(MASA_DE_TOBA_DENSA_KEY)
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
    );

    // --- 5. BLOQUE DE ALEACIÓN GRAVIS (BEACON BASE) ---
    public static final ResourceKey<Block> GRAVIS_ALLOY_BLOCK_KEY = ResourceKey.create(
            Registries.BLOCK,
            Identifier.fromNamespaceAndPath(MOD_ID, "gravis_alloy_block")
    );
    public static final ResourceKey<Item> GRAVIS_ALLOY_BLOCK_ITEM_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "gravis_alloy_block")
    );
    public static final Block GRAVIS_ALLOY_BLOCK = new Block(
            BlockBehaviour.Properties.of()
                    .setId(GRAVIS_ALLOY_BLOCK_KEY)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.NETHERITE_BLOCK)
                    .requiresCorrectToolForDrops()
    );

    // --- 6. PEDAZO DE MASA DE TOBA ---
    public static final ResourceKey<Item> PEDAZO_DE_MASA_DE_TOBA_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "pedazo_de_masa_de_toba")
    );
    public static final Item PEDAZO_DE_MASA_DE_TOBA = new Item(
            new Item.Properties().setId(PEDAZO_DE_MASA_DE_TOBA_KEY)
    );

    // --- 7. POLVO DE TOBA ---
    public static final ResourceKey<Item> POLVO_DE_TOBA_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "polvo_de_toba")
    );
    public static final Item POLVO_DE_TOBA = new Item(
            new Item.Properties().setId(POLVO_DE_TOBA_KEY)
    );

    // --- 8. GRAVIS ALLOY ---
    public static final ResourceKey<Item> GRAVIS_ALLOY_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "gravis_alloy")
    );
    public static final Item GRAVIS_ALLOY = new Item(
            new Item.Properties().setId(GRAVIS_ALLOY_KEY)
    );

    // --- 9. GRAVIS ALLOY NUGGET ---
    public static final ResourceKey<Item> GRAVIS_ALLOY_NUGGET_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "gravis_alloy_nugget")
    );
    public static final Item GRAVIS_ALLOY_NUGGET = new Item(
            new Item.Properties().setId(GRAVIS_ALLOY_NUGGET_KEY)
    );

    // --- 10. ALQUITRÁN VOLCÁNICO (FLUID) ---
    public static final ResourceKey<Fluid> STILL_VOLCANIC_TAR_KEY = ResourceKey.create(
            Registries.FLUID,
            Identifier.fromNamespaceAndPath(MOD_ID, "volcanic_tar")
    );
    public static final ResourceKey<Fluid> FLOWING_VOLCANIC_TAR_KEY = ResourceKey.create(
            Registries.FLUID,
            Identifier.fromNamespaceAndPath(MOD_ID, "flowing_volcanic_tar")
    );
    public static final ResourceKey<Block> VOLCANIC_TAR_BLOCK_KEY = ResourceKey.create(
            Registries.BLOCK,
            Identifier.fromNamespaceAndPath(MOD_ID, "volcanic_tar")
    );
    public static final ResourceKey<Item> VOLCANIC_TAR_BUCKET_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "volcanic_tar_bucket")
    );

    public static final FlowingFluid STILL_VOLCANIC_TAR = new VolcanicTarFluid.Still();
    public static final FlowingFluid FLOWING_VOLCANIC_TAR = new VolcanicTarFluid.Flowing();

    public static final Block VOLCANIC_TAR_BLOCK = new VolcanicTarBlock(
            STILL_VOLCANIC_TAR,
            BlockBehaviour.Properties.of()
                    .setId(VOLCANIC_TAR_BLOCK_KEY)
                    .liquid()
                    .replaceable()
                    .noCollision()
                    .strength(100.0f)
                    .pushReaction(PushReaction.DESTROY)
    );

    public static final Item VOLCANIC_TAR_BUCKET = new BucketItem(
            STILL_VOLCANIC_TAR,
            new Item.Properties()
                    .setId(VOLCANIC_TAR_BUCKET_KEY)
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)
    );

    // Creative Tabs
    public static final ResourceKey<CreativeModeTab> NATURAL_BLOCKS_TAB = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath("minecraft", "natural_blocks")
    );
    public static final ResourceKey<CreativeModeTab> BUILDING_BLOCKS_TAB = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath("minecraft", "building_blocks")
    );
    public static final ResourceKey<CreativeModeTab> INGREDIENTS_TAB = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath("minecraft", "ingredients")
    );
    public static final ResourceKey<CreativeModeTab> TOOLS_AND_UTILITIES_TAB = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath("minecraft", "tools_and_utilities")
    );

    @Override
    public void onInitialize() {
        // Register Blocks & Items
        Registry.register(BuiltInRegistries.BLOCK, MAGMA_DE_TOBA_KEY, MAGMA_DE_TOBA);
        Registry.register(BuiltInRegistries.ITEM, MAGMA_DE_TOBA_ITEM_KEY, new BlockItem(MAGMA_DE_TOBA, new Item.Properties().setId(MAGMA_DE_TOBA_ITEM_KEY)));

        Registry.register(BuiltInRegistries.BLOCK, MASA_DE_TOBA_KEY, MASA_DE_TOBA);
        Registry.register(BuiltInRegistries.ITEM, MASA_DE_TOBA_ITEM_KEY, new BlockItem(MASA_DE_TOBA, new Item.Properties().setId(MASA_DE_TOBA_ITEM_KEY)));

        Registry.register(BuiltInRegistries.BLOCK, MASA_DE_TOBA_FRIA_KEY, MASA_DE_TOBA_FRIA);
        Registry.register(BuiltInRegistries.ITEM, MASA_DE_TOBA_FRIA_ITEM_KEY, new BlockItem(MASA_DE_TOBA_FRIA, new Item.Properties().setId(MASA_DE_TOBA_FRIA_ITEM_KEY)));

        Registry.register(BuiltInRegistries.BLOCK, MASA_DE_TOBA_DENSA_KEY, MASA_DE_TOBA_DENSA);
        Registry.register(BuiltInRegistries.ITEM, MASA_DE_TOBA_DENSA_ITEM_KEY, new BlockItem(MASA_DE_TOBA_DENSA, new Item.Properties().setId(MASA_DE_TOBA_DENSA_ITEM_KEY)));

        Registry.register(BuiltInRegistries.BLOCK, GRAVIS_ALLOY_BLOCK_KEY, GRAVIS_ALLOY_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, GRAVIS_ALLOY_BLOCK_ITEM_KEY, new BlockItem(GRAVIS_ALLOY_BLOCK, new Item.Properties().setId(GRAVIS_ALLOY_BLOCK_ITEM_KEY)));

        Registry.register(BuiltInRegistries.ITEM, PEDAZO_DE_MASA_DE_TOBA_KEY, PEDAZO_DE_MASA_DE_TOBA);
        Registry.register(BuiltInRegistries.ITEM, POLVO_DE_TOBA_KEY, POLVO_DE_TOBA);
        Registry.register(BuiltInRegistries.ITEM, GRAVIS_ALLOY_KEY, GRAVIS_ALLOY);
        Registry.register(BuiltInRegistries.ITEM, GRAVIS_ALLOY_NUGGET_KEY, GRAVIS_ALLOY_NUGGET);

        // Register Fluid & Bucket
        Registry.register(BuiltInRegistries.FLUID, STILL_VOLCANIC_TAR_KEY, STILL_VOLCANIC_TAR);
        Registry.register(BuiltInRegistries.FLUID, FLOWING_VOLCANIC_TAR_KEY, FLOWING_VOLCANIC_TAR);
        Registry.register(BuiltInRegistries.BLOCK, VOLCANIC_TAR_BLOCK_KEY, VOLCANIC_TAR_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, VOLCANIC_TAR_BUCKET_KEY, VOLCANIC_TAR_BUCKET);

        // Creative Tabs
        CreativeModeTabEvents.modifyOutputEvent(NATURAL_BLOCKS_TAB).register(output -> {
            output.accept(MAGMA_DE_TOBA);
            output.accept(MASA_DE_TOBA);
            output.accept(MASA_DE_TOBA_FRIA);
            output.accept(MASA_DE_TOBA_DENSA);
            output.accept(VOLCANIC_TAR_BUCKET);
        });
        CreativeModeTabEvents.modifyOutputEvent(BUILDING_BLOCKS_TAB).register(output -> {
            output.accept(MAGMA_DE_TOBA);
            output.accept(MASA_DE_TOBA);
            output.accept(MASA_DE_TOBA_FRIA);
            output.accept(MASA_DE_TOBA_DENSA);
            output.accept(GRAVIS_ALLOY_BLOCK);
        });
        CreativeModeTabEvents.modifyOutputEvent(INGREDIENTS_TAB).register(output -> {
            output.accept(PEDAZO_DE_MASA_DE_TOBA);
            output.accept(POLVO_DE_TOBA);
            output.accept(GRAVIS_ALLOY);
            output.accept(GRAVIS_ALLOY_NUGGET);
        });
        CreativeModeTabEvents.modifyOutputEvent(TOOLS_AND_UTILITIES_TAB).register(output -> {
            output.accept(VOLCANIC_TAR_BUCKET);
        });

        System.out.println("[Create: Gravis Stuff] Gravis Alloy Block registered successfully!");
    }
}
