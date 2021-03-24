package at.campus02.iwi.pr1.bsp1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
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
        System.out.println("es gibt " + tierAnzahl(GEWICHTE) + " Tiere im Zoo.");
        System.out.println("davon sind " + elefanten(GEWICHTE) + " Elefanten.");
        System.out.println("Das Durchschnittsgewicht beträgt: " + mittleresGewicht(GEWICHTE));
        System.out.println("Die Futterkosten während des Transportes betragen: " + futterKosten(GEWICHTE));
        System.out.println(problemFallVorhanden(GEWICHTE));
        System.out.println("Welche Nummer haben die untergew. Tiere? " + problemFallIndex(GEWICHTE, 1));

        System.out.println("ab dem folgenden Tier (startIndex), ist folgendes Tier zum aufpäppeln:");
        System.out.println(problemFallIndex(GEWICHTE, 0));
        System.out.println(problemFallIndex(GEWICHTE, 63));
        System.out.println(problemFallIndex(GEWICHTE, 140));
        System.out.println(problemFallIndex(GEWICHTE, 46));

        System.out.println("ab dem Index.ten Tier, passen soviele Tiere in einen Container:");
        System.out.println(tiereImContainer(GEWICHTE, 5));
        System.out.println(tiereImContainer(GEWICHTE, 0));
        System.out.println(tiereImContainer(GEWICHTE, 63));
        System.out.println(tiereImContainer(GEWICHTE, 140));
        System.out.println(tiereImContainer(GEWICHTE, 190));


    }

    // 16 %
    public static int tierAnzahl(double[] gewichte) {
        int anzahl = gewichte.length;
        return anzahl; // Platzhalter
    }

    // 16 %
    public static int elefanten(double[] gewichte) {
        int counter = 0;
        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] >= LIMIT_GROSZTIER) {
                counter++;
            }
        }
        return counter;
    }

    // 16 %
    public static double mittleresGewicht(double[] gewichte) {
        double summe = 0;
        double durchschnitt = 0;
        for (int i = 0; i < gewichte.length; i++) {
            summe = summe + gewichte[i];
            durchschnitt++;
        }
        durchschnitt = summe / durchschnitt;
        return durchschnitt; // Platzhalter
    }

    // 16 %
    public static double futterKosten(double[] gewichte) {
        int anzahlKleintier = 0;
        int anzahlGrosstier = 0;
        int anzahlElefanten = elefanten(gewichte);

        int counter = 0;
        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] < LIMIT_KLEINTIER) {
                counter++;
            }
        }

        anzahlKleintier = counter;
        System.out.println("kleintiere: " + anzahlKleintier);
        anzahlGrosstier = tierAnzahl(gewichte) - (anzahlKleintier + anzahlElefanten);
        System.out.println("grosstiere: " + anzahlGrosstier);
        System.out.println("elefanten: " + anzahlElefanten);

        return (anzahlKleintier * KOSTEN_KLEINTIER) + (anzahlGrosstier * KOSTEN_GROSZTIER) + (anzahlElefanten * KOSTEN_ELEFANT);
    }

    // 16 %
    public static boolean problemFallVorhanden(double[] gewichte) {
        for (int i = 0; i < gewichte.length; i++) {
            if (gewichte[i] < 1.0) {
                System.out.println("Achtung ein untergewichtiges Tier!");
                return true;
            }
        }
        return false; // Platzhalter
    }

    // 10%
    public static int problemFallIndex(double[] gewichte, int startIndex) {
        if (gewichte[startIndex] < 1.0) {
            return startIndex;
        } else if (startIndex == 140) {
            return -1;
        }
        return problemFallIndex(gewichte, startIndex + 1);
    }

    // 10 %
    public static int tiereImContainer(double[] gewichte, int index) {
        //index ist die Nummer des Tiers
        int tiereAnzahl = 0;
        double sum = 0;

        for (int i = index; i <= gewichte.length - 1; i++) {
            if (tiereAnzahl < 6 || sum <= LIMIT_CONTAINER) {
                if (gewichte[i] < LIMIT_GROSZTIER) {
                    sum = sum + gewichte[i];
                    tiereAnzahl++;
                }
            }
        }
        return tiereAnzahl; // Platzhalter
    }

}
