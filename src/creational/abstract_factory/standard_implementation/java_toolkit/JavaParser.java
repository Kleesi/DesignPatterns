package creational.abstract_factory.standard_implementation.java_toolkit;

import creational.abstract_factory.standard_implementation.AbstractLexer;
import creational.abstract_factory.standard_implementation.ISyntaxTree;
import creational.abstract_factory.standard_implementation.ParserPrototype;

class JavaParser extends ParserPrototype {
    @Override
    public String getPlatform() {
        return "Any";
    }

    @Override
    public String getLanguage() {
        return "Java";
    }

    @Override
    public ISyntaxTree parse(AbstractLexer lexer) {
        return null;
    }

    @Override
    public ParserPrototype createCopy() {
        return new JavaParser();
    }
}
