import java.util.Scanner;
class GenericMax {
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a; 

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max; 
    }
    public static void main(String args[]) {
        System.out.println("Int max = " + maximum(25, 40, 5));
        System.out.println("Double max = " + maximum(12.5, 25.7, 18.2));
        System.out.println("float max = " + maximum(10.1f, 8.2f, 15.7f));
        System.out.println("long max = " + maximum(1000L, 5000L, 3000L));
        System.out.println("short max = " + maximum((short)10, (short)30, (short)20));
        System.out.println("byte max = " + maximum((byte)5, (byte)12, (byte)8));
        System.out.println("char max = " + maximum('A', 'Z', 'M'));
        System.out.println("String max = " + maximum("Apple", "Mango", "Banana"));
    }
}
