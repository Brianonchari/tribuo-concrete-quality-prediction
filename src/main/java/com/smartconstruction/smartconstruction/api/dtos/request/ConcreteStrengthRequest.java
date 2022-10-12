package com.smartconstruction.smartconstruction.api.dtos.request;

public class ConcreteStrengthRequest {
    public static final  String [] featureNames = {"Cement (component 1)(kg in a m^3 mixture)","Stone Pebbles-Kokoto (component 2)(kg in a m^3 mixture)","Quarry Dust(component 3)(kg in a m^3 mixture)","Water  (component 4)(kg in a m^3 mixture)","Superplasticizer (component 5)(kg in a m^3 mixture)","Coarse Sand (component 6)(kg in a m^3 mixture)","Fine Sand (component 7)(kg in a m^3 mixture)","Age (day)","Concrete compressive strength(MPa, megapascals) "};


    private double cement;
    private double stonePebbles;
    private double quaryDust;
    private double water;
    private double superplasticizer;
    private double coarsesand;
    private double finesand;
    private double age;
    private double strength;

    public ConcreteStrengthRequest() {
    }

    public double[] getFeatureValues(){
        return new double[] {cement, stonePebbles,quaryDust, water, superplasticizer, coarsesand,finesand, age, strength
        };
    }


    public double getCement() {
        return cement;
    }

    public double getStonePebbles() {
        return stonePebbles;
    }

    public double getQuaryDust() {
        return quaryDust;
    }

    public double getWater() {
        return water;
    }

    public double getSuperplasticizer() {
        return superplasticizer;
    }

    public double getCoarsesand() {
        return coarsesand;
    }

    public double getFinesand() {
        return finesand;
    }

    public double getAge() {
        return age;
    }

    public double getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "ConcreteStrengthRequest [cement = "+cement + ",stonePebbles = "+stonePebbles + ", quaryDust = "+ quaryDust
                + ", water = "+water + ", superplasticizer = "+superplasticizer+", coarsesand = "+coarsesand +",finesand = "+finesand+
                ", age="+age +", strength ="+strength +"]";
    }
}
