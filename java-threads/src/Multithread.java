public class Multithread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("[THR] Current thread id: " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Some exception!" + e);
        }
    }
}
