package creational.abstract_factory.standard_implementation.java_toolkit;


import creational.abstract_factory.standard_implementation.*;

public class JavaBuildToolkit extends AbstractBuildToolkit {

    public static final JavaBuildToolkit INSTANCE;

    static {
        INSTANCE = new JavaBuildToolkit(
                new JavaLexer(),
                new JavaParser(),
                new JavaCompiler(),
                new JavaLinker()
        );
    }

    private final LexerPrototype lexerPrototype;
    private final ParserPrototype parserPrototype;
    private final CompilerPrototype compilerPrototype;
    private final LinkerPrototype linkerPrototype;

    private JavaBuildToolkit(LexerPrototype lexer, ParserPrototype parser, CompilerPrototype compiler, LinkerPrototype linker) {
        this.lexerPrototype = lexer;
        this.parserPrototype = parser;
        this.compilerPrototype = compiler;
        this.linkerPrototype = linker;
    }


    @Override
    public AbstractLexer createLexer() {
        return lexerPrototype.createCopy();
    }

    @Override
    public AbstractParser createParser() {
        return parserPrototype.createCopy();
    }

    @Override
    public AbstractCompiler createCompiler() {
        return compilerPrototype.createCopy();
    }

    @Override
    public AbstractLinker createLinker() {
        return linkerPrototype.createCopy();
    }
}
