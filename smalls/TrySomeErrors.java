import java.util.ArrayList;
import java.util.List;

final class Util {
    private Util() {}

    public static void printWithThreadNamePrefix(String message) {
        System.out.println(Thread.currentThread().getName() + ": " + message);
    }
}

final class FellowErrors {

    private FellowErrors() {}

    public static void outOfMemoryError() {
        List<Integer> list = new ArrayList<>();
        try {
            while (true) {
                list.add(1);
                list.addAll(list);
                if (list.size() % 10_000 == 0) {
                    System.out.println(list.size());
                }
            }
        } catch (Error e) {
            Util.printWithThreadNamePrefix("Error: " + e.getMessage());
            Util.printWithThreadNamePrefix("The array size we tried to expand beyond universe's ends: " + list.size());
        }
    }

    public static void outOfMemoryErrorExtreme() {
        List<Integer> list = new ArrayList<>();
        try {
            while (true) {
                list.add(1);
                list.addAll(list);
                if (list.size() % 10_000 == 0) {
                    System.out.println(list.size());
                }
            }
        } catch (Error e) {
            Util.printWithThreadNamePrefix("Error: " + e.getMessage());
            Util.printWithThreadNamePrefix("The array size we tried to expand beyond universe's ends: " + list.size());

            List<Integer> anotherList = new ArrayList<>();
            for (int i = 0; i < 100_000_000; i++) {
                anotherList.add(i);
            }

            Util.printWithThreadNamePrefix("Another list's size: " + anotherList.size());
            Util.printWithThreadNamePrefix("And here's a poem I wrote: Jack and Jill went up the hill...");
        }
    }

}

final class FellowExceptions {

    private FellowExceptions() {}
    
    public static void arithmeticException() {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            Util.printWithThreadNamePrefix(e.getClass() + ": " + e.getMessage());
        }
    }
    
    public static void classCastException() {
        Integer i1 = 10;
        Object o1 = i1;
        
        try {
            String s1 = (String) o1;
            System.out.println("Happily, I have a casted string: " + s1);
        } catch (ClassCastException e) {
            Util.printWithThreadNamePrefix(e.getMessage());
        }
    }

    public static void tryExceptionWithFinallyBlock() {
        List<Integer> list = List.of();

        try {
            list.add(10);
        } finally {
//            e.printStackTrace();
            Util.printWithThreadNamePrefix("Running finally!");
        }
    }
}

class ThreadRipper implements Runnable {

    public static void letItRip() {
        /*
        Only 2/10 threads survived this experiment when tested on:
            Intel(R) Core(TM) i5-10310U CPU @ 1.70GHz

            Base speed:	2.21 GHz
            Cores:	4
            Logical processors:	8
         */
        for (int i = 0; i < 10; i++) {
            ThreadRipper t1 = new ThreadRipper();
            new Thread(t1).start();
        }
    }

    @Override
    public void run() {
        FellowErrors.outOfMemoryErrorExtreme();
        Util.printWithThreadNamePrefix("I survived. Congrats if you saw this message!");
    }
}


public class TrySomeErrors {

    public static void main(String[] args) {
        trySomeExceptions();
        trySomeErrors();
        // ThreadRipper.letItRip();
    }

    private static void trySomeErrors() {
//        FellowErrors.outOfMemoryError();
    }

    private static void trySomeExceptions() {
        FellowExceptions.arithmeticException();
        FellowExceptions.classCastException();
        FellowExceptions.tryExceptionWithFinallyBlock();
    }
}
