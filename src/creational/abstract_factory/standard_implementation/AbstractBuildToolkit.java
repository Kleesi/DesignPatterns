package creational.abstract_factory.standard_implementation;

public abstract class AbstractBuildToolkit {
    public abstract AbstractLexer createLexer();

    public abstract AbstractParser createParser();

    public abstract AbstractCompiler createCompiler();

    public abstract AbstractLinker createLinker();
}
