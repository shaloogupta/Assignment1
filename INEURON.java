package Ineuron;

public class INEURON {

	public static void main(String[] args) {
		
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==(n-1)/2 ||i==0 || i==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int k=0;k<n;k++) {
				if(k==0 || k==n-1 || i==k) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int l=0;l<n;l++) {
				if(i==0 || i==n-1 || l==0 || i==(n-1)/2) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int m=0;m<n;m++) {
				if(m==0 && i!=n-1 || m==n-1 && i!=n-1 || i==(n-1) && m!=0 && m!=(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int o=0;o<n;o++) {
				if(o==0 || i==0 && o!=n-1 ||o==n-1 && i<(n-1)/2 && i!=0 ||i==(n-1)/2 && o!=(n-1) || i==o && i>(n-1)/2) {
				
				System.out.print("*");
			}
			else {
				System.out.print(" ");	
			}
		}
			System.out.print("   ");
			for(int p=0;p<n;p++) {
				if(i==0 && p!=0 && p!=n-1 ||p==0 && i!=0 && i!=n-1 || i==n-1 && p!=n-1 && p!=0 || p==n-1 && i!=0 &&i!=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int q=0;q<n;q++) {
				if(q==0 || q==n-1 || i==q) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			      System.out.println();
		}
	}

}
