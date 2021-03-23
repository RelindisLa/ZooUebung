package at.campus02.iwi.pr1.bsp1;

import java.util.Arrays;

public class Zoo {
    static final int LIMIT_KLEINTIER = 5;
    static final int LIMIT_GROSZTIER = 500;

    static final double KOSTEN_KLEINTIER = 3.2;
    static final double KOSTEN_GROSZTIER = 8.5;
    static final double KOSTEN_ELEFANT = 23.9;

    static final int LIMIT_CONTAINER = 500;

    public static void main(String[] args) {

        final double[] GEWICHTE = ZooData.ANIMAL_WEIGHTS;
        System.out.println(tierAnzahl(GEWICHTE));



    }

    // 16 %
    public static int tierAnzahl(double[] gewichte) {
        int anzahl = gewichte.length;
        return anzahl; // Platzhalter
    }

    // 16 %
    public static int elefanten(double[] gewichte) {

        return 1; // Platzhalter
    }

    // 16 %
    public static double mittleresGewicht(double[] gewichte) {
        return 1.0; // Platzhalter
    }

    // 16 %
    public static double futterKosten(double[] gewichte) {
        return 1.0; // Platzhalter
    }

    // 16 %
    public static boolean problemFallVorhanden(double[] gewichte) {
        return true; // Platzhalter
    }

    // 10%
    public static int problemFallIndex(double[] gewichte, int startIndex) {
        return 1; // Platzhalter
    }

    // 10 %
    public static int tiereImContainer(double[] gewichte, int index) {
        return 1; // Platzhalter
    }

}
