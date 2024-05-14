package canvases;

import arc.*;
import arc.audio.Sound;
import arc.files.Fi;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import javax.annotation.processing.RoundEnvironment;

public class CanvasesJavaMod extends Mod{

    public static InTree inTree = new InTree(CanvasesJavaMod.class);

    public CanvasesJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");
    }

    @Override
    public void loadContent(){
        Log.info("Loading some content.");
        CanvasesBlocks.load();
    }


}
