public class TikTak {

    public static void main(String[] args) {
        TikTakObject obj = new TikTakObject();
        Tik tik = new Tik(obj);
        Tak tak = new Tak(obj);
        Thread threadTik = new Thread(tik);
        Thread threadTak = new Thread(tak);
        threadTik.start();
        threadTak.start();
    }
}
