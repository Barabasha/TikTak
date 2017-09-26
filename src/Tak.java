public class Tak extends Thread {
    private TikTakObject obj = new TikTakObject();

    Tak(TikTakObject obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Tak");
                obj.notify();
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
