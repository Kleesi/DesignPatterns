package creational.abstract_factory.standard_implementation;

public abstract class LexerPrototype extends AbstractLexer implements ICopyable {
    @Override
    public abstract LexerPrototype createCopy();
}
