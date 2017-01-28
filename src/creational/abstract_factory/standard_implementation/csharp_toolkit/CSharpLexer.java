package creational.abstract_factory.standard_implementation.csharp_toolkit;

import creational.abstract_factory.standard_implementation.AbstractLexer;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class CSharpLexer extends AbstractLexer {

    @Override
    public List<String> getTokens(InputStreamReader reader) {
        return new ArrayList<>();
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
