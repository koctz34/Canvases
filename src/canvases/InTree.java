package canvases;

import arc.files.Fi;
import arc.files.ZipFi;

public class InTree {

    public Class<?> anchorClass;

    public static ZipFi root;

    /**
     * @param owner navigation anchor
     **/
    public InTree(Class<?> owner) {
        anchorClass = owner;

        String classPath = owner.getResource("").getFile().replaceAll("%20", " ");
        classPath = classPath.substring(classPath.indexOf(":")+2);
        String jarPath = classPath.substring(0, classPath.indexOf("!"));

        root = new ZipFi(new Fi(jarPath));
    }

    public static Fi child(String childPath) {
        Fi out = root;
        for (String s : childPath.split("/")) {
            if (!"".equals(s))
                out = out.child(s);
        }
        return out;
    }
}