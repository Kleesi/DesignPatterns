package creational.abstract_factory.standard_implementation;

public abstract class CompilerPrototype extends AbstractCompiler implements ICopyable {
    @Override
    public abstract CompilerPrototype createCopy();
}
