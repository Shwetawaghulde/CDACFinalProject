package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		

		
		int[] a = {-20,-10,-3,-7,40,50,90,1,2,3,4};
		int n = a.length;
		

		int k = 4;
		int min = (a[0]+a[1]+a[2]+a[3])/k;
		int t =0;
		int count = 0;
	
		
		if(k>n) {
			System.out.println("invalid input for sub array size");
		}
		
		int e = -7;
		for(int i = 0;i<n;i++) {
			int avg = 0;
			boolean flag = false;
			int j = i;
			while(j<i+k && i+k<n) {
				if(a[j] == e) {
					flag=true;
				}
				j++;
			}
			if(flag == false && (i+k<=n)) {
				for(int m =i ;m<n ;m++) {
					if(m<i+k) {
						avg = avg + a[m];
					}
					
				}
				
				avg = avg/k;
				if(avg <= min) {
					min = avg;
					t = i;
				}
			
			
			}
		}
		
		for(int i=t;i<t+k;i++) {
			System.out.println(a[i]);
		}
		

	}

}
