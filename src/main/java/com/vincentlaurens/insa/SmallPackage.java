package com.vincentlaurens.insa;

public class SmallPackage extends Package{
    public SmallPackage (int height, int depth, int weight, double poids){
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.poids = poids;

    }
  /*  @Override
    protected boolean verifVolumeunder229_162_25(){
        boolean heightUnder229_162_25= false;

        int volume = this.calcul_Volume();

        if(volume <= DIMENSIONSGABARIT){
            heightUnder229_162_25 = true;
        }
        return heightUnder229_162_25;
    }
    @Override
    protected boolean verifpoidsunder1800(double poids){
        boolean poidsUnder1800= false;
        if(poids <= poidsGabaritlimite){
            poidsUnder1800 = true;
        }
        return poidsUnder1800;
    }
    @Override
    protected int calcul_Volume() {
        return this.height * this.depth * this.weight;
    }*/

    @Override
    public double calculateLocalShippingCost(){
        return prixDimensionGabarit;
    }

}

