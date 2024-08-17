package utilities;


import java.util.Arrays;

public class ArraysUtility {


    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static int[] addElement(int[] array, int element) {

        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static double[] addElement(double[] array, double element) {

        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;

    }

    public static char[] addElement(char[] array, char element) {

        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;

    }

    public static String[] addElement(String[] array, String element) {

        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;

    }

    public static boolean contains(int[] array, int element) {
        
        for (int each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }
    
    public static boolean contains(double[] array, double element) {
        
        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element) {

        for (String each : array) {

            if (each.equals (element)) {
                return true;
            }
        }
        return false;
    }

    
}



