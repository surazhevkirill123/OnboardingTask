import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassB {
    public static void invokeMethod(String name, String arg) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        ClassA classA;
        Class<?> clazz = Class.forName(ClassA.class.getName());
        classA = (ClassA) clazz.getConstructor().newInstance();
        Method method = ClassA.class.getDeclaredMethod(name, String.class);
        method.setAccessible(true);
        method.invoke(classA,arg);
    }
    public static void main(String[]args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        invokeMethod("aaa", "Rise and shine");
    }
}
