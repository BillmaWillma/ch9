import java.util.Arrays;

public class Calc {
    public static void main(String[] args) {
		if(args.length<2){
			System.out.println("Usage: java Calc <add|mult|max|min> <numbers>");
			return;
		}
		String a = args[0];
		int b = 0;
		for(int i=1; i<args.length; i++){
			b = Integer.parseInt(args[i]);
			if(a.equals("add")){
				
			} else if(a.equals("min")){
				
			}else if(a.equals("mult")){

		}
		 System.out.println(b);
    }
}
}
