package de.hrw.progra2.assignment8;



import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public  class EnumUtil {

    private String name;
    private String beverageVersion;
    private double unhealthySubstances;
    private boolean isBluffPackage;


    private boolean getIsBluffPackage(){
    Softdrink name = Softdrink.valueOf(beverageVersion);
    if(this.unhealthySubstances{

        }
        return true;


    }



    private String getSoftdrinkVersion() {
        Softdrink name = Softdrink.valueOf(beverageVersion);
        try {
            name = Softdrink.valueOf(beverageVersion);

        } catch (Exception e) {
            System.out.println("leider bieten wir das Getränk nicht an!");
        }
        return this.name;
    }

    public int  mapUnheltySubstancesToBeverrageVersion(){
        EnumMap<Softdrink, Double> enumMap = new EnumMap<Softdrink, Double>(Softdrink.class);
        Softdrink.put(Softdrink.COLA, 8.0 );
        Softdrink.put(Softdrink.COLA_LIGHT,5.6);
    }
