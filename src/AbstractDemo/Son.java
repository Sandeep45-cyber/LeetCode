package AbstractDemo;

public class Son extends Parent{

    public Son(int age) {
        this.age = age;
    }

    @Override
    void normal(){
        super.normal();
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name, int age) {

        System.out.println("I love " + name + " She is " + age);

    }
}
