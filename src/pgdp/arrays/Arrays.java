package pgdp.arrays;

import static pgdp.MiniJava.*;

public class Arrays {
    public static void print(int[] feld) {
        writeConsole("{");
        if (feld.length > 0) {
            writeConsole(feld[0]);
            for (int i = 1; i < feld.length; i++) {
                writeConsole(", " + feld[i]);
            }
        }
        write("}");
    }

    public static void minUndMax(int[] feld) {
        int min = 0;
        int max = 0;
        int x = 0;
        while (x< feld.length){
            if (feld[x]<feld[x+1]){
                min = feld[x];
                max = feld[x+1];
            }else if (feld[x]>feld[x+1]){
                min = feld[x+1];
                max = feld [x];
            }
            x++;}
        write("Minimum = " + min + ", Maximum = " + max);
    }

    public static int[] invertieren(int[] feld) {
        int[] invertiert = new int[feld.length];

        for (int i = 0; i < feld.length; i++) {
            invertiert[invertiert.length - 1 - i] = feld[i];
        }

        return invertiert;
    }

    public static int[] schneiden(int[] feld, int laenge) {
        if (laenge <= 0) {
            return new int[0];
        }

        int[] geschnitten = new int[laenge];

        for (int i = 0; i < laenge && i < feld.length; i++) {
            geschnitten[i] = feld[i];
        }

        return geschnitten;
    }

    public static int[] linearisieren(int[][] feld) {
        int laenge = 0;

        for (int i = 0; i < feld.length; i++) {
            laenge = laenge + feld[i].length;
        }

        int[] linearisiert = new int[laenge];
        int linIndex = 0;

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                linearisiert[linIndex++] = feld[i][j];
            }
        }

        return linearisiert;
    }
}
