
class Parent {

    public Parent(String name) {
        System.out.println("I am parent: " + name);
    }
}

class Child extends Parent {
    public Child() {
        this("stuff");
        System.out.println("I am child: stuff");
    }

    public Child(String name) {
        super(name);
        System.out.println("I am child: " + name);
    }

}


public class ThisAndSuper {
    public static void main(String[] args) {
//        Parent p = new Parent("alice");
        Child c = new Child();
//
//        Parent p2 = new Child();
    }
}
