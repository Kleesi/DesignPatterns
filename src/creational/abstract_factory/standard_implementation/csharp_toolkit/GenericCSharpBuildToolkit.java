package creational.abstract_factory.standard_implementation.csharp_toolkit;

import creational.abstract_factory.standard_implementation.*;

import java.util.HashMap;
import java.util.Map;

public class GenericCSharpBuildToolkit extends AbstractGenericBuildToolkit {

    public static final GenericCSharpBuildToolkit INSTANCE;
    private static final Map<Class<? extends AbstractBuildTool>, Class<? extends AbstractBuildTool>> ABSTRACT_TO_CONCRETE_TYPE_MAP;

    static {
        INSTANCE = new GenericCSharpBuildToolkit();

        ABSTRACT_TO_CONCRETE_TYPE_MAP = new HashMap<>();
        ABSTRACT_TO_CONCRETE_TYPE_MAP.put(AbstractLexer.class, CSharpLexer.class);
        ABSTRACT_TO_CONCRETE_TYPE_MAP.put(AbstractParser.class, CSharpParser.class);
        ABSTRACT_TO_CONCRETE_TYPE_MAP.put(AbstractCompiler.class, CSharpCompiler.class);
        ABSTRACT_TO_CONCRETE_TYPE_MAP.put(AbstractLinker.class, CSharpLinker.class);
    }

    @Override
    public <T extends AbstractBuildTool> T createTool(Class<T> toolType) {
        try {
            Class<? extends AbstractBuildTool> concreteToolType = ABSTRACT_TO_CONCRETE_TYPE_MAP.get(toolType);
            AbstractBuildTool tool = concreteToolType.newInstance();
            return (T) tool;
        } catch (Exception exception) {
            System.err.printf("Could not create tool of type '%s'.\n", toolType != null ? toolType.getName() : "unknown");
        }
        return null;
    }


}
