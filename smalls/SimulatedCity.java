import java.util.ArrayList;
import java.util.List;

interface Moveable {
    void move();
}

class Man implements Moveable {

    @Override
    public void move() {
        System.out.println("Man is moving");
        //
    }
}

class Dog implements Moveable {

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }
}

class Vehicle implements Moveable {

    @Override
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Mountain {

}

public class SimulatedCity {

    public static void main(String[] args) {

        List<Moveable> moveables = new ArrayList<Moveable>();

        for (int i = 0; i < 10; i++) {
            moveables.add(new Man());
            moveables.add(new Dog());
            moveables.add(new Vehicle());
        }

        moveables.forEach(Moveable::move);



    }

}
