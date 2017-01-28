package creational.abstract_factory;

import creational.abstract_factory.standard_implementation.*;
import creational.abstract_factory.standard_implementation.csharp_toolkit.CSharpBuildToolkit;

public class Client {

    public static void main(String[] arguments) {
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
}
