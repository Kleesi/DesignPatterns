package creational.abstract_factory.standard_implementation.java_toolkit;

import creational.abstract_factory.standard_implementation.CompilerPrototype;
import creational.abstract_factory.standard_implementation.IObjectCode;
import creational.abstract_factory.standard_implementation.ISyntaxTree;

class JavaCompiler extends CompilerPrototype {
    @Override
    public String getPlatform() {
        return "Any";
    }

    @Override
    public String getLanguage() {
        return "Java";
    }

    @Override
    public IObjectCode compile(ISyntaxTree tree) {
        return null;
    }

    @Override
    public CompilerPrototype createCopy() {
        return new JavaCompiler();
    }
}
