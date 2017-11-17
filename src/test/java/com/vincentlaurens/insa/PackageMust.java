package com.vincentlaurens.insa;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static com.vincentlaurens.insa.Test.testParameters;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class PackageMust {
    private ByteArrayOutputStream out;

    @Before
    public void setUp(){
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void premiereLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[0];

        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);

        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);

        String laLargeurAsText = laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);

        String lePoidsAsText = laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);

        String lePrixAsText = laPremiereLigneDuTableau[5].toString();
        //Double lePrix = Double.parseDouble(lePoidsAsText);


    // tu récupère ensuite la destination sous forme d'enum
    // puis le prix en string

        Package paquetAtester = new Package(laLongueur,laProfondeur,laLargeur,lePoids);
        double calculate = paquetAtester.calculateLocalShippingCost();
        System.out.println(calculate);

        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }
    @Test
    public void deuxiemeLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[1];

        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);

        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);

        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);

        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);

        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        //Double lePrix = Double.parseDouble(lePoidsAsText);


        // tu récupère ensuite la destination sous forme d'enum
        // puis le prix en string

        Package paquetAtester = new Package(laLongueur,laProfondeur,laLargeur,lePoids);
        double calculate = paquetAtester.calculateLocalShippingCost();
        System.out.println(calculate);

        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }

    @Test
    public void troisièmeLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[2];

        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);

        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);

        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);

        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);

        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        //Double lePrix = Double.parseDouble(lePoidsAsText);


        // tu récupère ensuite la destination sous forme d'enum
        // puis le prix en string

        Package paquetAtester = new Package(laLongueur,laProfondeur,laLargeur,lePoids);
        double calculate = paquetAtester.calculateLocalShippingCost();
        System.out.println(calculate);

        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }

    @Test
    public void quatrièmeLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[3];

        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);

        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);

        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);

        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);

        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        //Double lePrix = Double.parseDouble(lePoidsAsText);


        // tu récupère ensuite la destination sous forme d'enum
        // puis le prix en string

        Package paquetAtester = new Package(laLongueur,laProfondeur,laLargeur,lePoids);
        double calculate = paquetAtester.calculateLocalShippingCost();
        System.out.println(calculate);

        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }

    @Test
    public void cinquiemeLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[4];

        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);

        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);

        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);

        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);

        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        //Double lePrix = Double.parseDouble(lePoidsAsText);


        // tu récupère ensuite la destination sous forme d'enum
        // puis le prix en string

        Package paquetAtester = new Package(laLongueur,laProfondeur,laLargeur,lePoids);
        double calculate = paquetAtester.calculateLocalShippingCost();
        System.out.println(calculate);

        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }

    @Test
    public void sixiemeLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[5];

        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);

        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);

        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);

        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);

        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        //Double lePrix = Double.parseDouble(lePoidsAsText);


        // tu récupère ensuite la destination sous forme d'enum
        // puis le prix en string

        Package paquetAtester = new Package(laLongueur,laProfondeur,laLargeur,lePoids);
        double calculate = paquetAtester.calculateLocalShippingCost();
        System.out.println(calculate);

        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }

    @Test
    public void septiemeLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[6];

        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);

        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);

        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);

        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);

        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        //Double lePrix = Double.parseDouble(lePoidsAsText);


        // tu récupère ensuite la destination sous forme d'enum
        // puis le prix en string

        Package paquetAtester = new Package(laLongueur,laProfondeur,laLargeur,lePoids);
        double calculate = paquetAtester.calculateLocalShippingCost();
        System.out.println(calculate);

        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }
    @Test
    public void huitiemeLigne(){
        Object [ ] laPremiereLigneDuTableau = testParameters[7];

        String laLongueurAsText = laPremiereLigneDuTableau[0].toString();
        int laLongueur = Integer.parseInt(laLongueurAsText);

        String laProfondeurAsText = laPremiereLigneDuTableau[2].toString();
        int laProfondeur = Integer.parseInt(laProfondeurAsText);

        String laLargeurAsText =  laPremiereLigneDuTableau[1].toString();
        int laLargeur = Integer.parseInt(laLargeurAsText);

        String lePoidsAsText =  laPremiereLigneDuTableau[3].toString();
        Double lePoids = Double.parseDouble(lePoidsAsText);

        String lePrixAsText =  laPremiereLigneDuTableau[5].toString();
        //Double lePrix = Double.parseDouble(lePoidsAsText);


        // tu récupère ensuite la destination sous forme d'enum
        // puis le prix en string

        Package paquetAtester = new Package(laLongueur,laProfondeur,laLargeur,lePoids);
        double calculate = paquetAtester.calculateLocalShippingCost();
        System.out.println(calculate);

        String expectedOutput = lePrixAsText ;
        assertThat(standardOutput(), containsString(expectedOutput));
    }


    private String standardOutput(){
        return out.toString();
    }
}