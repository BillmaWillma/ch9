import java.util.Arrays;

public class Stats {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (args.length == 0) {
            System.err.println("Usage: java Max <numbers>");
            return;
        }
        int sum = 0;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            sum += value;
        }
        double avg = sum / args.length;
        System.out.println("Count: " + args.length);
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
    }
}
