package up.mi.jgm.td01;

public class UtilMath {
	
	
	
	public static int somme3(int a, int b, int c) {
		return a+b+c;
	}
	
	public static long factIt(int n) {
		int prod = 1;
		for (int i = 1; i<=n;i++) {
			prod*=i;
		}
		return prod;
	}
	public static long factRec(int n) {
		if (n==0||n==1) {
			return 1;
		}
		
		return n*factRec(n-1);
	}
	
	public static long comb(int n, int p) {
		
		return (long)factRec(n)/(factRec(p)*factRec(n-p));
	}
	
	public static long puissance(int n, int m) {
		int prod = 1;
		for (int i = 1; i<=m;i++) {
			prod*= n;
		}
		return (long) prod;
	}
	
	public static int max2(int a, int b) {
		return a<b ? b : a;
	}
	
	public static int max3v1(int a, int b, int c) {
		return a<b ? (b<c ? c : b) : (a<c ? c : a);
	}
	
	public static int max3v2(int a, int b, int c) {
		return max2(max2(a,b),max2(b,c));
	}
	
	

}
