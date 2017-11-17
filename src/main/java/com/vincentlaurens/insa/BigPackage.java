package com.vincentlaurens.insa;

public class BigPackage extends Package {

    public BigPackage (int height, int depth, int weight, double poids){
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.poids = poids;
    }

    private double calcul_Volume(){
        return (this.height*this.depth*this.weight);
    }

    @Override
    public double calculateLocalShippingCost(){
        double volume_dm = (this.calcul_Volume()/1000000);
        double tarif_Volume = volume_dm * prixdmCube;
        double tarif_Poids = this.poids * prixKg;
        double tarif;

        if(tarif_Poids<tarif_Volume){
            tarif = tarif_Volume;
        }else{
            tarif =  tarif_Poids;
        }
        return tarif;
    }
}
