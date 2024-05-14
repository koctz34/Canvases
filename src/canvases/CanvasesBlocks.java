package canvases;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.content.Items;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

import mindustry.world.Block;

public class CanvasesBlocks {
    public static Block

    smallCanvas16, canvas16,
    smallCanvas32, canvas32, bigCanvas32,
    smallCanvas8, canvas8,
    canvas64, bigCanvas64,
    bigCanvas128
            ;

    public static UnitType

    some;
    public static void load(){
        smallCanvas16 = new ColorsCanvas("small-canvas-16"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 5, Items.beryllium, 5));
            canvasSize = 16;
            size = 1;
        }};

        canvas16 = new ColorsCanvas("canvas-16"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 10, Items.beryllium, 10));
            canvasSize = 16;
            size = 2;
        }};

        smallCanvas32 = new ColorsCanvas("small-canvas-32"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 10, Items.beryllium, 10));
            canvasSize = 32;
            size = 1;
        }};
        canvas32 = new ColorsCanvas("canvas-32"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 15, Items.beryllium, 15));
            canvasSize = 32;
            size = 2;
        }};
        bigCanvas32 = new ColorsCanvas("big-canvas-32"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 20, Items.beryllium, 20));
            canvasSize = 32;
            size = 3;
        }};
        smallCanvas8 = new ColorsCanvas("small-canvas-8"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 10, Items.beryllium, 10));
            canvasSize = 8;
            size = 1;
        }};
        canvas8 = new ColorsCanvas("canvas-8"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 10, Items.beryllium, 10));
            canvasSize = 8;
            size = 2;
        }};
        canvas64 = new ColorsCanvas("canvas-64"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 15, Items.beryllium, 15));
            canvasSize = 64;
            size = 2;
        }};
        bigCanvas64 = new ColorsCanvas("big-canvas-64"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 15, Items.beryllium, 15));
            canvasSize = 64;
            size = 3;
        }};
        bigCanvas128 = new ColorsCanvas("big-canvas-128"){{
            requirements(Category.logic, BuildVisibility.shown, with(Items.silicon, 30, Items.beryllium, 30));
            canvasSize = 128;
            size = 3;
        }};

        some = new SomeUnit("some"){{
            constructor = LegsUnit::create;
        }};
    }
}
