import com.builder.pattern.BuilderOnboarding;
import com.builder.pattern.Onboarding;
import org.testng.annotations.Test;

public class testBuilderDesign {

    @Test
    public void completeOnboarding(){

        //Only filling information for Singapore Resident
        Onboarding sgOnboarding = new BuilderOnboarding()
                .setFirstName("Radhika")
                .setLastName("Merchant")
                .setAddress1("211 HENDERSON ROAD, #10-03")
                .setCity("Singapore")
                .setCountry("Singapore")
                .setNricFront("FIN1234")
                .setNricBack("FIN1234")
                .getOnboardingObject();

        System.out.println(sgOnboarding.toString());

        //Only filling information for American Resident
        Onboarding usaOnboarding = new BuilderOnboarding()
                .setFirstName("Rishi")
                .setLastName("Chaturvedi")
                .setAddress1("42 MARICOPA STREET")
                .setCity("TORRANCE")
                .setState("California")
                .setCountry("USA")
                .setSsn("456-667-990")
                .getOnboardingObject();

        System.out.println(usaOnboarding.toString());

        //Only filling information for Indian Resident
        Onboarding indiaOnboarding = new BuilderOnboarding()
                .setFirstName("Priya")
                .setLastName("Thakur")
                .setAddress1("A/8, Shanti Niketan CHS")
                .setAddress2("SP Jain Marg, Kandivali WEST")
                .setCity("Mumbai")
                .setState("Maharashtra")
                .setCountry("India")
                .setPhoneNo("456-667-9905")
                .setPan("ABCD1234E")
                .setAdhaar("1111-2222-3333-4444")
                .getOnboardingObject();

        System.out.println(indiaOnboarding.toString());
    }


}

