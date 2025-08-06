package com.problems;

public class FactoryTest {
    public static void main(String[] args) {
        D d =  Over.getInstance("circle");
        d.draw();
    }
}
interface D{
    void draw();
}
class Circle1 implements D{

    @Override
    public void draw() {
        System.out.println("circle");
    }
}
class Rectangle implements D{
    @Override
    public void draw(){
        System.out.println("reactangle");
    }
}
class Over{

    public static D getInstance(String type){
        if(type.equalsIgnoreCase("circle")){
            return new Circle1();
        }else if(type.equalsIgnoreCase("reactangle")){
            return new Rectangle();
        }else{
            return null;
        }
    }
}

