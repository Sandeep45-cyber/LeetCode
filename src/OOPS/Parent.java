package OOPS;

public class Parent {

    int length;
    int width;
    int height;


    Parent(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Parent() {

    }

    void greeting(){
        System.out.println("Hi im inside parent class");
    }



}
