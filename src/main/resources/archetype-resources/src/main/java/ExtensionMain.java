package ${groupId}.${artifactId};

import net.minestom.server.extensions.Extension;

/**
 * Cube Colony
 */
public class ExtensionMain extends Extension {

    @Override
    public void initialize() {
        System.out.println("Hello World!");
    }

    @Override
    public void terminate() {
        System.out.println("Goodbye World!");
    }

}
