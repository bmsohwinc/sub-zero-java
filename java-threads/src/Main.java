public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Multithread multithread = new Multithread();
            multithread.start();

            Thread thread = new Thread(new MultithreadRunnable());
            thread.start();
        }
    }
}