package creational.abstract_factory.standard_implementation.csharp_toolkit;

import creational.abstract_factory.standard_implementation.*;

public class CSharpBuildToolkit extends AbstractBuildToolkit {

    public static final String LANGUAGE = "C# 5.0";

    public static final CSharpBuildToolkit INSTANCE;

    static {
        INSTANCE = new CSharpBuildToolkit();
    }

    private CSharpBuildToolkit() {

    }

    @Override
    public AbstractLexer createLexer() {
        return new CSharpLexer();
    }

    @Override
    public AbstractParser createParser() {
        return new CSharpParser();
    }

    @Override
    public AbstractCompiler createCompiler() {
        return new CSharpCompiler();
    }

    @Override
    public AbstractLinker createLinker() {
        return new CSharpLinker();
    }
}
