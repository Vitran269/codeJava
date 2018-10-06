package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##.##");
	    int sec ;
	    sec = 800;
	    double hour,minute;
	    minute = sec/60d;
	    System.out.print(df.format(minute));

		System.out.print(System.currentTimeMillis());

//	    int a = 1;
//	    int b = 1;
//	    System.out.println(a++);
//		System.out.println(++b);
//		System.out.println(a);
//		System.out.println(b);

	}
}
