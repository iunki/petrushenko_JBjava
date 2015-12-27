import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Throwable {
        Class clazz = Class.forName("Task10");
        Object obj = clazz.newInstance();
        Method[] methods = clazz.getMethods();

        System.out.println(Arrays.toString(methods));
        methods[1].invoke(obj, 10);
        methods[0].invoke(obj);
    }
}
