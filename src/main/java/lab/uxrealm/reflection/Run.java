package lab.uxrealm.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class Run {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Please provide the name of the method to run");
            return;
        }
        String methodName = args[0];
        try{
            Method method = Run.class.getMethod(methodName);
            method.invoke(null);
        } catch (NoSuchMethodException e){
            System.out.println("Method not found: " + methodName);
        } catch (IllegalAccessException | InvocationTargetException e){
            System.out.println("Error invoking method: " + e.getMessage());
        }
    }
    public static void method1(){
        System.out.println("Running method1");
    }
    public static void method2(){
        System.out.println("Running method2");
    }
    public static void method3(){
        System.out.println("Running method3");
    }
}