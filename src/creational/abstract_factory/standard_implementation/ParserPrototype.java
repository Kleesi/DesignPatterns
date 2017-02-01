package creational.abstract_factory.standard_implementation;

public abstract class ParserPrototype extends AbstractParser implements ICopyable {
    @Override
    public abstract ParserPrototype createCopy();
}
