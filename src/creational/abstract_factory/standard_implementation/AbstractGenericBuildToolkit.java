package creational.abstract_factory.standard_implementation;

public abstract class AbstractGenericBuildToolkit {

    public abstract <T extends AbstractBuildTool> T createTool(Class<T> toolType);

}
