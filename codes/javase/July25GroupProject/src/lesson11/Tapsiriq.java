package lesson11;

public class Tapsiriq {
    public static void main(String[] args) {

        // Tapşırıq 1
        int eded = 8;

        String netice = (eded % 2 == 0) ? "Cutdur" : "Tekdir";
        System.out.println(netice);

        // Tapşırıq 2
        boolean a = false;
        boolean b = true;
        boolean c = true;

        boolean result = !a && b || c; 
        System.out.println(result);

    }
}