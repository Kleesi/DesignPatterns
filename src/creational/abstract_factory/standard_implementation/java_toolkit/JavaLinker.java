package creational.abstract_factory.standard_implementation.java_toolkit;

import creational.abstract_factory.standard_implementation.IObjectCode;
import creational.abstract_factory.standard_implementation.LinkerPrototype;

import java.io.OutputStreamWriter;

class JavaLinker extends LinkerPrototype {
    @Override
    public String getPlatform() {
        return "Any";
    }

    @Override
    public String getLanguage() {
        return "Java";
    }

    @Override
    public LinkerPrototype createCopy() {
        return new JavaLinker();
    }

    @Override
    public OutputStreamWriter link(IObjectCode... objectCodes) {
        return null;
    }
}
