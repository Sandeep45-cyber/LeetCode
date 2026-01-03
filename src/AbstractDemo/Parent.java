package AbstractDemo;

public abstract class Parent {

    int age;

    abstract void career(String name);

    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("This is normal from Parent");
    }

    abstract  void partner(String name, int age);
}
