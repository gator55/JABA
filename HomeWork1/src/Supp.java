import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 5/28/13
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Supp {
    public static void main(String[] args) {
        System.out.println("Hello!");

        AtomicInteger i;
        i = new AtomicInteger();

        for(i.set(0); i.get() != 5; i.getAndIncrement()){
            System.out.println(i.get());

        }
    }

}
