package creational.abstract_factory.standard_implementation;

import creational.abstract_factory.standard_implementation.csharp_toolkit.CSharpBuildToolkit;
import creational.abstract_factory.standard_implementation.csharp_toolkit.GenericCSharpBuildToolkit;

public class Client {

    public static void main(String[] arguments) {
        System.out.println("Standard implementation:");
        testStandardImplementation();

        System.out.println("Generic implementation:");
        testGenericImplementation();


    }

    private static void testStandardImplementation() {
        AbstractBuildToolkit toolkit = CSharpBuildToolkit.INSTANCE;
        AbstractLexer lexer = toolkit.createLexer();
        AbstractParser parser = toolkit.createParser();
        AbstractCompiler compiler = toolkit.createCompiler();
        AbstractLinker linker = toolkit.createLinker();

        System.out.println(lexer.toString());
        System.out.println(parser.toString());
        System.out.println(compiler.toString());
        System.out.println(linker.toString());
    }

    private static void testGenericImplementation() {
        AbstractGenericBuildToolkit toolkit = GenericCSharpBuildToolkit.INSTANCE;
        AbstractLexer lexer = toolkit.createTool(AbstractLexer.class);
        AbstractParser parser = toolkit.createTool(AbstractParser.class);
        AbstractCompiler compiler = toolkit.createTool(AbstractCompiler.class);
        AbstractLinker linker = toolkit.createTool(AbstractLinker.class);

        System.out.println(lexer.toString());
        System.out.println(parser.toString());
        System.out.println(compiler.toString());
        System.out.println(linker.toString());

    }
}
