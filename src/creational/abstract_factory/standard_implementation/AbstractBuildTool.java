package creational.abstract_factory.standard_implementation;

public abstract class AbstractBuildTool {

    public abstract String getPlatform();

    public abstract String getLanguage();

    public abstract String getName();

    @Override
    public String toString() {
        return String.format("Tool=\"%s\" Language=\"%s\" Platform=\"%s\"", getName(), getLanguage(), getPlatform());
    }
}
