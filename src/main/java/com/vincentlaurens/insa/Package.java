package com.vincentlaurens.insa;

public class Package {

    private static int DIMENSIONSGABARIT = 229*162*25;
    private static double poidsGabaritlimite = 1.800;
    private static double prixPoidsGabarit = 17.59;
    private static int prixDimensionGabarit =  12;
    private static double frais_fixes = 2.86;
    private static double prixKg = 21.62;
    private static double prixCmCube = 1.43;

    private int height;
    private int depth;
    private int weight;
    private double poids;
    //private String destination;


    public Package (int height, int depth, int weight, double poids){
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.poids = poids;

    }
    protected boolean verifVolumeunder229_162_25(){
        boolean heightUnder229_162_25= false;

        int volume = this.calcul_Volume();

        if(volume <= DIMENSIONSGABARIT){
            heightUnder229_162_25 = true;
        }
        return heightUnder229_162_25;
    }

    protected boolean verifpoidsunder1800(double poids){
        boolean poidsUnder1800= false;
        if(poids <= poidsGabaritlimite){
            poidsUnder1800 = true;
        }
        return poidsUnder1800;
    }
    protected int calcul_Volume(){
        return this.height * this.depth * this.weight;

    }
    protected double petit_pacquet(){
        return prixDimensionGabarit ;
    }
    protected double moyen_pacquet(){
        return prixPoidsGabarit;
    }
    protected double gros_pacquet(){

        double tarif_Volume = this.calcul_Volume() * prixCmCube;
        double tarif_Poids = this.weight * prixKg;
        if(tarif_Poids<tarif_Volume){
            return tarif_Volume + frais_fixes;
        }else{
            return tarif_Poids + frais_fixes;
        }
    }

    public double calculateLocalShippingCost(){
        double tarif;
        if (this.verifVolumeunder229_162_25()){
            tarif = this.petit_pacquet();
        }else if (this.verifpoidsunder1800(this.poids)){
            tarif = this.moyen_pacquet();
        }else{
            tarif = this.gros_pacquet();
        }

        return tarif;

        //retourne frais deport en France

    }
}
