package creational.abstract_factory.standard_implementation.java_toolkit;

import creational.abstract_factory.standard_implementation.LexerPrototype;

import java.io.InputStreamReader;
import java.util.List;

class JavaLexer extends LexerPrototype {
    @Override
    public String getPlatform() {
        return "Any";
    }

    @Override
    public String getLanguage() {
        return "Java";
    }

    @Override
    public LexerPrototype createCopy() {
        return new JavaLexer();
    }

    @Override
    public List<String> getTokens(InputStreamReader reader) {
        return null;
    }
}
