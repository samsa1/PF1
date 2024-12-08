import java.util.Arrays;

public class Exo3 {

    // Takes as argument an integer and a size len and
    // returns an array of len booleans that corresponds to the binary
    // representation of n : ie. array[i] = ith bit of n.
    static boolean intToArray_finished = false; // remplacez `false` par `true` pour tester.
    public static boolean[] intToArray(int n, int len) {


        // À compléter

        return new boolean[]{};
    }


    // Takes as argument an array of boolean representing an integer and
    // returns the corresponding integer.
    // NB : arrayToInt(intToArray(n, len)) = n if n can be encoded in len bits.
    static boolean arrayToInt_finished = false; // remplacez `false` par `true` pour tester.
    public static int arrayToInt(boolean[] array) {

        // À compléter

        return 0;
    }

    // Takes as argument an array of boolean representing
    // an integer (array[i] = ith bit).
    // Return the string representing the binary reprensentation in a printable format !
    // NB : arrayToString(intToArray(n, len)) is similar to Integer.toBinaryString(n)
    static boolean arrayToString_finished = false; // remplacez `false` par `true` pour tester.
    public static String arrayToString(boolean[] array) {

        // À compléter

        return "";
    }

    // Takes as argument 2 arrays (a and b) of the same length and
    // returns the array representing a - b. 
    static boolean sub_finished = false; // remplacez `false` par `true` pour tester.
    public static boolean[] sub(boolean[] a, boolean[] b) {

        // À compléter

        return new boolean[]{};
    }


    /**************************************************************************/
    /*                                                                        */
    /*                                TESTS                                   */
    /*                                                                        */
    /*  A partir d'ici commence les tests, vous pouvez modifier la fonction   */
    /*   test afin de rajouter des examples supplémentaire si ça vous aide.   */
    /*                                                                        */
    /**************************************************************************/

    public static boolean test_intToArray(int n, int len, boolean[] out) {
        boolean[] out2 = intToArray(n, len);
        if (!Arrays.equals(out2, out)) {
            System.out.println("Il y a un bug dans intToArray");
            System.out.println(" - n = " + n);
            System.out.println(" - len = " + len);
            System.out.println(" - intToArray(n, len) = " + Arrays.toString(out2));
            System.out.println(" - sortie attendue    = " + Arrays.toString(out));
            return false;
        } {
            return true;
        }
    }

    public static boolean test_arrayToInt(boolean[] array, int out) {
        int out2 = arrayToInt(array);
        if (out != out2) {
            System.out.println("Il y a un bug dans arrayToInt");
            System.out.println(" - array = " + Arrays.toString(array));
            System.out.println(" - arrayToInt(array) = " + out2);
            System.out.println(" - sortie attendue   = " + out);
            return false;
        } else {
            return true;
        }
    }

    public static boolean test_arrayToString(boolean[] array, String str) {
        String out2 = arrayToString(array);
        if (!out2.equals(str)) {
            System.out.println("Il y a un bug dans arrayToString");
            System.out.println("- array = " + Arrays.toString(array));
            System.out.println("- arrayToString(array) = " + out2);
            System.out.println("- sortie attendue      = " + str);
            return false;
        } else {
            return true;
        }
    }

    public static boolean test_sub(boolean[] a, boolean[] b, boolean[] expected) {
        boolean[] out2 = sub(a, b);
        if (!Arrays.equals(out2, expected)) {
            System.out.println("Il y a un bug dans sub");
            System.out.println("- a = " + Arrays.toString(a));
            System.out.println("- b = " + Arrays.toString(b));
            System.out.println("- sub(a, b)       = " + Arrays.toString(out2));
            System.out.println("- sortie attendue = " + Arrays.toString(expected));
            return false;
        } else {
            return true;
        }
    }

    public static void test() {
        boolean T = true;
        boolean F = false;
        if (intToArray_finished) {
            boolean b = true;
            b &= test_intToArray(  5,  4, new boolean[]{T, F, T, F});
            b &= test_intToArray(  5,  6, new boolean[]{T, F, T, F, F, F});
            b &= test_intToArray( -5,  6, new boolean[]{T, T, F, T, T, T});
            b &= test_intToArray(  0,  8, new boolean[]{F, F, F, F, F, F, F, F});
            b &= test_intToArray(  0,  8, new boolean[]{F, F, F, F, F, F, F, F});
            b &= test_intToArray(  5,  8, new boolean[]{T, F, T, F, F, F, F, F});
            b &= test_intToArray( -5,  8, new boolean[]{T, T, F, T, T, T, T, T});
            b &= test_intToArray(255, 16, new boolean[]{T, T, T, T, T, T, T, T,
                                                        F, F, F, F, F, F, F, F});
            b &= test_intToArray( 23, 16, new boolean[]{T, T, T, F, T, F, F, F,
                                                        F, F, F, F, F, F, F, F});
            if (b) {
                System.out.println("intToArray passe tous les tests");
            }
        } else {
            System.out.println("intToArray_finished == false donc les intToArray n'est pas testée.");
        }

        if (arrayToInt_finished) {
            boolean b = true;
            b &= test_arrayToInt(new boolean[]{T, T, T, F}, 7);
            b &= test_arrayToInt(new boolean[]{T, T, T, F, F}, 7);
            b &= test_arrayToInt(new boolean[]{T, F, T, F, T, F, F, F}, 21);
            b &= test_arrayToInt(new boolean[]{T, T, T, T, T, T, T, T}, -1);
            b &= test_arrayToInt(new boolean[]{T, F, T, F, T, T, T, T}, -11);
            b &= test_arrayToInt(new boolean[]{F, F, F, F, F, F, F, F,
                                               T, F, F, F, F, F, F, F}, 256);

            if (b) {
                System.out.println("arrayToInt passe tous les tests");
            }
        } else {
            System.out.println("arrayToInt_finished == false donc les arrayToInt n'est pas testée.");
        }

        if (arrayToString_finished) {
            boolean b = true;

            b &= test_arrayToString(new boolean[]{F}, "0");
            b &= test_arrayToString(new boolean[]{T}, "1");
            b &= test_arrayToString(new boolean[]{T, F, T, F}, "0101");
            b &= test_arrayToString(new boolean[]{F, T, F, F, F, T, F, F}, "00100010");


            if (b) {
                System.out.println("arrayToString passe tous les tests");
            }
        } else {
            System.out.println("arrayToString_finished == false donc les arrayToString n'est pas testée.");
        }


        if (sub_finished) {
            boolean b = true;
            b &= test_sub(
                new boolean[]{F, F, F, F}, // 0
                new boolean[]{F, F, F, F}, // 0
                new boolean[]{F, F, F, F}  // 0
            );
            b &= test_sub(
                new boolean[]{F, F, T, F}, // 4
                new boolean[]{F, F, T, F}, // 4
                new boolean[]{F, F, F, F}  // 0
            );
            b &= test_sub(
                new boolean[]{F, F, T, F}, // 4
                new boolean[]{F, T, F, F}, // 2
                new boolean[]{F, T, F, F}  // 0
            );
            b &= test_sub(
                new boolean[]{F, T, F, F, F, F, F, F}, // 2
                new boolean[]{T, F, T, F, F, F, F, F}, // 5
                new boolean[]{T, F, T, T, T, T, T, T}  // -3
            );

            if (b) {
                System.out.println("sub passe tous les tests. Felicitations !");
            }
        } else {
            System.out.println("sub_finished == false donc les sub n'est pas testée.");
        }

    }

    public static void main(String[] args) {
        test();
    }
}