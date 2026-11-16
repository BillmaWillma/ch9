import java.util.Arrays;

public class Calc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Calc <add|mult|min|max|minus|div> <numbers>");
            return;
        }
        String a = args[0];
        int b = 0;
        int c = Integer.parseInt(args[1]);
        for (int i = 2; i < args.length; i++) {
            b = Integer.parseInt(args[i]);
            if (a.equals("add")) {
                c += b;
            } else if (a.equals("minus")) {
                c -= b;
            } else if (a.equals("mult")) {
                c *= b;
            } else if (a.equals("div")) {
                c /= b;
            } else if (a.equals("min")) {
                if (c > Integer.parseInt(args[i])) {
                    c = Integer.parseInt(args[i]);
                }
            } else if (a.equals("max")) {
                if (c < Integer.parseInt(args[i])) {
                    c = Integer.parseInt(args[i]);
                }
            } else {
                a = ("Unknown operation: " + a);
                break;
            }
        }
        if (a.equals("Unknown operation: " + args[0])) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    }
}
