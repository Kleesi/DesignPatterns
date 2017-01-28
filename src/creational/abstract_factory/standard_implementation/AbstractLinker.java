package creational.abstract_factory.standard_implementation;

import java.io.OutputStreamWriter;

public abstract class AbstractLinker extends AbstractBuildTool {
    public abstract OutputStreamWriter link(IObjectCode... objectCodes);

    @Override
    public String getName() {
        return "Linker";
    }
}
