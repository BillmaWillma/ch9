import java.util.Arrays;

public class Longest {
    public static void main(String[] args) {
		
		int maxl = Integer.MIN_VALUE;
        String max = "";
        String fa = "z";
		for(String arg : args){
			if (arg.length()>maxl){
				maxl = arg.length();
				max = arg;
			}
			if(fa.compareTo(arg)>0){
				fa = arg;
			}
		}
		
		
		System.out.println("Longest: " + max + " (" + maxl + " letters)" );
		System.out.println("First Alphabetically: " + fa);
    }
}
