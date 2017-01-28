package creational.abstract_factory.standard_implementation;

import java.io.InputStreamReader;
import java.util.List;

public abstract class AbstractLexer extends AbstractBuildTool {
    public abstract List<String> getTokens(InputStreamReader reader);

    @Override
    public String getName() {
        return "Lexer";
    }
}
