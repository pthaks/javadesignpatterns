import com.composite.pattern.Composite;
import com.composite.pattern.Leaf;
import org.testng.annotations.Test;

public class testCompositePattern {

    @Test
    public void familyTree(){

        //Create a family tree

        Leaf anjani = new Leaf("Anjani" , 15, "Daughter");
        Leaf arjun = new Leaf("Arjun" , 9, "Son");
        Leaf aarav = new Leaf("Aarav" , 10, "Son");

        Composite thakurFamily = new Composite("Thakur", "Family Tree");
        Composite abhi = new Composite("abhijit", "Brother");
        Composite ashwin = new Composite("Ashwin", "Brother");

        abhi.addComponent(anjani);
        abhi.addComponent(arjun);

        ashwin.addComponent(aarav);

        thakurFamily.addComponent(abhi);
        thakurFamily.addComponent(ashwin);

        thakurFamily.showInfo();

    }
}
