package creational.abstract_factory.standard_implementation;

public abstract class AbstractParser extends AbstractBuildTool {
    public abstract ISyntaxTree parse(AbstractLexer lexer);

    @Override
    public String getName() {
        return "Parser";
    }
}
