package org.ctrlstm;

public class Comany {
	
	public static void main(String[] args) {        //i=0 0<10 0 0+1=1
		                                            //i=1 1<10 1 1+1=2
		for (int i = 0; i < 10; i++) {              //i=2 2<10 2 2+1=3
			                                        //i=9 9<10 9 2+9=10
			System.out.println(i);                  //i=10 10<10 for loop is terminated
			
		}
		System.out.println("while loop");
		int a= 0;
		while (a<10) {
			System.out.println(a);
			a++;
		}
		System.out.println("do while loop");
		int b= 100;
		do {
			System.out.println(a);
			a++;
		} while (a<100);
		
	}
	
	
	

}
