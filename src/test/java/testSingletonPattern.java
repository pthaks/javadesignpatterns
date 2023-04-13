import com.singleton.pattern.SingleInfo;
import org.testng.annotations.Test;

public class testSingletonPattern {

    @Test
    public void verifySingletonPatter() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingleInfo obj = SingleInfo.getInstance();
                obj.k = 7;
                obj.show();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingleInfo obj2 = SingleInfo.getInstance();
                //obj2.k = 8;
                obj2.show();
            }
        });

        t1.start();
        System.out.println(t1.threadId());
        t2.start();
        System.out.println(t2.threadId());

        //Both the objects will return same value of k, which is initialised in First thread
    }
}
