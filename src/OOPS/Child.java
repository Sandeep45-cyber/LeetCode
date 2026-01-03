package OOPS;

public class Child extends Parent{

    int weight;

    Child(int length, int width, int height, int weight ){
        super(length, width, height);
        this.weight = weight;
    }

    public Child() {
        super();
    }


    @Override
    void greeting(){
        System.out.println("Hi i am inside Child class");
    }
}
