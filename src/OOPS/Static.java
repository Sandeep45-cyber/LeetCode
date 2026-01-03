package OOPS;

public class Static {

     static class fun{
       public fun(String name) {
           this.name = name;
       }

        String name;

        @Override
        public String toString() {
            return name;
        }
    }


    static void main(String[] args) {
        fun obj = new fun("Hi");
        fun obj2 = new fun("babe");


//        Child obj3 = new Child(1,3,5,8);

        Parent one = new Child();
        one.greeting();



        System.out.println(obj.name);
        System.out.println(obj2.name);

        System.out.println(obj);



    }
}
