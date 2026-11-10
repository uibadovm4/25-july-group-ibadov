package lesson20;

public class Tasks {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Java is very interesting");
        // StringBuilder result = new StringBuilder();

        // for (int i = 0; i < sb.length(); i++) {
        //     if (sb.charAt(i) != ' ') {
        //         result.append(sb.charAt(i));
        //     }
        // }

        // result.reverse();
        // System.out.println(result);
//
        StringBuilder sb2 = new StringBuilder("123456789");
        StringBuilder result2 = new StringBuilder();

        for (int i = 0; i < sb2.length(); i++) {
            if (i % 2 == 0) {
                result2.append(sb2.charAt(i));
            }
        }

        System.out.println(result2);
    }
}