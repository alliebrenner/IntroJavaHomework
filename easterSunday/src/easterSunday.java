import java.util.Scanner;
public class easterSunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int a;
		a = year%19;
		int b = year/100;
		int c = year %100;
		int j=c/4;
		int k =c%4;
		int e= b%4;
		int d = b/4;
		int g=(8*b+13)/25;
		int h= (19*a+b-d-g+15)%30;
		int m = (a+11*h)/319;
		int r=(2*e+2*j-k-h+m+32)%7;
		int n= (h-m+r+90)/25;
		int p=(h-m+r+n+19)%32;
		
		System.out.println("Intermediate values");
		System.out.println("a= "+a);	
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
		System.out.println("e= "+e);
		System.out.println("g= "+g);
		System.out.println("r= "+r);
		System.out.println("h= "+h);
		System.out.println("m= "+m);
		System.out.println("p= "+p);
		System.out.println("n= "+n);
		
		System.out.println("Easter Sunday Fell On Month Number "+n);
		System.out.println("Easter Sunday fell On Day Number "+p);
		System.out.println(n + "-"+ p +"-"+year);
	}

}
