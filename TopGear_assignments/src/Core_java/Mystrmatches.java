package Core_java;

public class MyStrMatches {
	public static boolean matchFun(String st){
		return (st.matches("www(.*)"));
	}
	public static void main(String[] args) {
		 String input = new String("www.mystrmatches.com");
		 System.out.println(matchFun(input));
	}

}
