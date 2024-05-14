package canvases;

import arc.Core;
import arc.audio.Sound;
import arc.files.Fi;
import arc.func.Cons;
import arc.graphics.Color;
import arc.graphics.g2d.TextureRegion;
import arc.math.geom.Position;
import arc.math.geom.QuadTree;
import arc.math.geom.Rect;
import arc.math.geom.Vec2;
import arc.scene.ui.Label;
import arc.scene.ui.layout.Table;
import arc.struct.Bits;
import arc.util.Align;
import arc.util.Timer;
import arc.util.io.Reads;
import arc.util.io.Writes;
import mindustry.ai.types.CommandAI;
import mindustry.ctype.Content;
import mindustry.ctype.UnlockableContent;
import mindustry.entities.EntityCollisions;
import mindustry.entities.units.BuildPlan;
import mindustry.entities.units.UnitController;
import mindustry.game.Team;
import mindustry.gen.*;
import mindustry.logic.LAccess;
import mindustry.type.Item;
import mindustry.type.StatusEffect;
import mindustry.type.UnitType;
import mindustry.ui.Styles;
import mindustry.world.Block;
import mindustry.world.Tile;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.storage.CoreBlock;

import java.nio.FloatBuffer;

public class SomeUnit extends UnitType {
    public SomeUnit(String name) {
        super(name);
    }
    public static Sound gone = Core.audio.newSound(CanvasesJavaMod.inTree.child("sounds/gone.ogg"));

    @Override
    public Unit create(Team team) {
        Unit unit = super.create(team);

        Table table = new Table(Styles.black9);
        table.setSize(Core.graphics.getWidth(), Core.graphics.getHeight());
        table.setPosition(Core.graphics.getWidth() / 2f, Core.graphics.getHeight() / 2f, Align.center);

        Label label = new Label("[#f]MANKIND IS DEAD \n[#f]BLOOD IF FUEL \n[#f]HELL IS FULL", Styles.outlineLabel);
        label.setFontScale(2f);
        table.add(label);

        Table table2 = new Table(Styles.black3);
        table2.setSize(Core.graphics.getWidth(), Core.graphics.getHeight());
        table2.setPosition(Core.graphics.getWidth() / 2f, Core.graphics.getHeight() / 2f, Align.center);

        Label label2 = new Label("[#f]BYE", Styles.outlineLabel);
        label2.setFontScale(12f);
        table2.add(label2);

        Label label3 = new Label("[#f]BYE", Styles.outlineLabel);
        label3.setFontScale(10f);
        Label label4 = new Label("[#f]BYE", Styles.outlineLabel);
        label4.setFontScale(18f);
        Label label5 = new Label("[#f]BYE", Styles.outlineLabel);
        label5.setFontScale(6f);
        Label label6 = new Label("[#f]HU235HPWE90PR7EYUHIFJ[DUGYFSHDSHGUBKFSUIGDBJFSDIGFUHSDBFISDGFIBSDFOUIGSEFOHUIDSF", Styles.outlineLabel);
        label6.setFontScale(7f);


        Core.audio.play(gone, 100f, 1f, 1f, true);
        Core.scene.add(table);
        Timer.schedule(() -> {
            Core.scene.clear();
            Timer.schedule(() -> {
                Core.scene.resize(100,100);
                Core.scene.add(label2);

                Core.audio.play(gone, 100f, 1f, 1f, true);
                Timer.schedule(() -> {
                    Timer.schedule(() -> {
                        Core.scene.resize(100,100);
                        Core.scene.add(label3);

                        Core.audio.play(gone, 100f, 1f, 1f, true);
                        Timer.schedule(() -> {
                            Core.scene.resize(100,100);
                            Core.scene.add(label4);
                            Core.audio.play(gone, 100f, 1f, 1f, true);
                            Timer.schedule(() -> {
                                Core.scene.add(label5);
                                Core.audio.play(gone, 100f, 1f, 1f, true);
                                Timer.schedule(() -> {
                                    Core.scene.resize(100,100);
                                    Core.scene.add(label6);
                                    Core.audio.play(gone, 100f, 1f, 1f, true);
                                    Timer.schedule(() -> {
                                        Core.atlas.dispose();
                                        Core.audio.dispose();
                                        Core.graphics.clear(Color.black);
                                        Timer.schedule(() -> {
                                            Core.app.exit();
                                        }, 60 * 2 / 60f);
                                    }, 60 * 2 / 60f);
                                }, 60 * 2 / 60f);
                            }, 60 * 2 / 60f);
                        }, 60 * 2 / 60f);
                    }, 60 * 2 / 60f);
                }, 60 * 2 / 60f);
            }, 60 * 10 / 60f);
        }, 60 * 10 / 60f);
        return unit;
    }
}

