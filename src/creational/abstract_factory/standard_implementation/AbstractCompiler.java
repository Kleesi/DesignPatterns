package creational.abstract_factory.standard_implementation;

public abstract class AbstractCompiler extends AbstractBuildTool {
    public abstract IObjectCode compile(ISyntaxTree tree);

    @Override
    public String getName() {
        return "Compiler";
    }
}
