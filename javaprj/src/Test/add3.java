package Test;

public class add3 {
	static int add(int a,int b, int c) {
		return(a+b*c);
	}

	public static void main(String[] args) {
		int a =3;
		int b =4;
		int c =-3;
		
		int total =add(a,b,c);
 
		System.out.println(total);
	}
	

}
