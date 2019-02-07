package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        // Variables to fill in burriito
        String rice_hold = "";
        String meat_hold = "";
        String beans_hold = "";
        String salsa_hold = "";
        String veggies_hold = "";
        int runs = 0;

        // Rice Array
        String[] rice = new String[3];
        rice[0] = "white";
        rice[1] = "brown";
        rice[2] = "no rice";

        //Meat Array
        String[] meat = new String[6];
        meat[0] = "chicken";
        meat[1] = "steak";
        meat[2] = "carnidas";
        meat[3] = "chorizo";
        meat[4] = "sofritas";
        meat[5] = "veggies";

        //Bean Array
        String[] beans = new String[3];
        beans[0] = "pinto";
        beans[1] = "black";
        beans[2] = "no";

        //Salsa Array
        String[] salsa = new String[4];
        salsa[0] = "mild";
        salsa[1] = "medium";
        salsa[2] = "hot";
        salsa[3] = "no";

        //Veggies Array
        String[] veggies = new String[4];
        veggies[0] = "lettuce";
        veggies[1] = "fajita veggies";
        veggies[2] = "no veggies";

        do {    runs++;
                for (int i = 0; i < 3; i++) {
                 int x = r.nextInt(3);

                     rice_hold = rice[x];
            }
            {
                for (int i = 0; i < 3; i++) {
                    int x = r.nextInt(6);

                    meat_hold = meat[x];
                }
                {
                    for (int i = 0; i < 3; i++) {
                        int x = r.nextInt(3);

                        beans_hold = beans[x];
                    }
                    {
                        for (int i = 0; i < 3; i++) {
                            int x = r.nextInt(4);

                            salsa_hold = salsa[x];
                        }
                        {
                            for (int i = 0; i < 3; i++) {
                                int x = r.nextInt(3);

                                veggies_hold = veggies[x];
                            }
                        }
                        System.out.println("Burrito " + runs +": " + rice_hold + "" + " rice, " + meat_hold + " meat, " + beans_hold +
                                " beans, " + salsa_hold + " salsa, " + veggies_hold);

                    }
                }
            }

        } while (runs < 10) ;
        System.exit(0);
    }
}
