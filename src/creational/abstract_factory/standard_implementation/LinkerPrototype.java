package creational.abstract_factory.standard_implementation;

public abstract class LinkerPrototype extends AbstractLinker implements ICopyable {
    @Override
    public abstract LinkerPrototype createCopy();
}
