package com.second;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class First1 extends Exception{

    public First1(){
        super();
    }

    public static void main(String[] args) throws NoSuchMethodException {
//        Method method = First1.class.getDeclaredMethod("show");
//        if(method.isAnnotationPresent(Child.class)){
//            Child c = method.getAnnotation(Child.class);
//            System.out.println("Value : "+c.value());
//            System.out.println("Version : "+c.version());
//        }
        Talk t = new Talk(){
            @Override
            void say(){
                System.out.println("Anonymous...");
            }
        };
        t.say();
        MyFunctional mf = new MyFunctional() {
            @Override
            public void doWork() {
                System.out.println("Anonymous class");
            }
        };
        Show s = new Show() {
            @Override
            void add() {
                System.out.println("This is anonymous class");
            }
        };
        mf.doWork();
    }
    @Child(value ="Naveen", version = 7)
    void show(){

    }
    void reverse(){
        String s = "hello";
        char[] ch = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            ch[i] = s.charAt(s.length()-1-i);
        }
        System.out.println(new String(ch)); // O(1) time complexity
    }

}
@Retention(RetentionPolicy.RUNTIME)   // 👈 important: must be RUNTIME
@Target(ElementType.METHOD)
@interface Child{
    String value() default "default";  // element with default value
    int version() default 1;
}
interface MyFunctional{
    void doWork();
}
abstract class Show{
    abstract void add();
}
class Talk{
    void say(){

    }
}