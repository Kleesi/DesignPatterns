package creational.abstract_factory.standard_implementation.csharp_toolkit;

import creational.abstract_factory.standard_implementation.AbstractLexer;
import creational.abstract_factory.standard_implementation.AbstractParser;
import creational.abstract_factory.standard_implementation.ISyntaxTree;

class CSharpParser extends AbstractParser {

    @Override
    public ISyntaxTree parse(AbstractLexer lexer) {
        return null;
    }

    @Override
    public String getPlatform() {
        return "Any";
    }

    @Override
    public String getLanguage() {
        return CSharpBuildToolkit.LANGUAGE;
    }
}
