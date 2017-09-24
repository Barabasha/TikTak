public class Tik extends Thread{
    TikTakObject obj = new TikTakObject();

    public Tik(TikTakObject obj) {
        this.obj = obj;
    }

    @Override
    public void run(){
        synchronized (obj) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Tik");
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
