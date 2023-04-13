import com.prototype.pattern.BookShop;
import org.testng.annotations.Test;

public class testPrototypePatter {

    @Test
    public void testClones() throws CloneNotSupportedException{
        BookShop bs = new BookShop();
        bs.setBookShopName("Priyas Books");
        bs.setBooks();

        //bs.printBooks();
        //Shallow copy
        BookShop bs2 = (BookShop)bs.clone();
        bs2.setBookShopName("Arjuns bookshop");

        bs.getBooks().remove(2);

        System.out.println(bs.toString());

        System.out.println(bs2.toString());


    }
}
