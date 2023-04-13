package com.factory.pattern;

public class CorridorMain {

    //Main factory class
    //To decide which class to return on the basis of user inputs
    public static Corridor getInstance(String corridor){

        if (corridor.toLowerCase().equals("sg"))
            return new SGCorridor();
        else if (corridor.toLowerCase().equals("hk"))
            return new HKCorridor();
        else
            return new AUCorridor();

    }

}
