package creational.abstract_factory.standard_implementation.csharp_toolkit;

import creational.abstract_factory.standard_implementation.AbstractLinker;
import creational.abstract_factory.standard_implementation.IObjectCode;

import java.io.OutputStreamWriter;

class CSharpLinker extends AbstractLinker {

    @Override
    public String getPlatform() {
        return "Windows";
    }

    @Override
    public String getLanguage() {
        return CSharpBuildToolkit.LANGUAGE;
    }

    @Override
    public OutputStreamWriter link(IObjectCode... objectCodes) {
        return null;
    }
}
