public class MultithreadRunnable implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("[RUN] Current thread id: " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Some exception: " + e);
        }
    }
}
