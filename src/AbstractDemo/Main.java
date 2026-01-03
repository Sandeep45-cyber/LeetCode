package AbstractDemo;

public class Main {

    static void main(String[] args) {
        Son son = new Son(25);
        son.career("pilot");

        son.normal();

        Daughter daughter = new Daughter(26);
        daughter.career("Doctor");

        Parent.hello();


    }
}
