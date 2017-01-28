package creational.abstract_factory.standard_implementation.csharp_toolkit;

import creational.abstract_factory.standard_implementation.AbstractCompiler;
import creational.abstract_factory.standard_implementation.IObjectCode;
import creational.abstract_factory.standard_implementation.ISyntaxTree;

class CSharpCompiler extends AbstractCompiler {
    @Override
    public IObjectCode compile(ISyntaxTree tree) {
        return null;
    }


    @Override
    public String getPlatform() {
        return "Windows";
    }

    @Override
    public String getLanguage() {
        return CSharpBuildToolkit.LANGUAGE;
    }
}
