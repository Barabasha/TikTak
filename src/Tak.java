public class Tak extends Thread{
    TikTakObject obj = new TikTakObject();

    public Tak(TikTakObject obj) {
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
                    e.printStackTrace();
                }
            }
        }
    }
}
