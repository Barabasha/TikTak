public class Tik extends Thread {
    private TikTakObject obj = new TikTakObject();

    Tik(TikTakObject obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Tik");
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
