import model.EvenThread;
import model.OddThread;
import sun.awt.windows.ThemeReader;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread=new OddThread();
        EvenThread evenThread=new EvenThread();
        Thread t1=new Thread(oddThread);
        Thread t2=new Thread(evenThread);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
