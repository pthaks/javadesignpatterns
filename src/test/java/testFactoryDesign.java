import com.factory.pattern.Corridor;
import com.factory.pattern.CorridorMain;
import org.testng.annotations.Test;

public class testFactoryDesign {

    @Test
    public void testOnboarding(){

        //Provide the corridor in which onboarding to be done
        Corridor corObj = CorridorMain.getInstance("sg");

        corObj.onboarding();
    }
}
