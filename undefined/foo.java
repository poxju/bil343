package com.edu.bil343.undefined;
public class foo{
	public static void main(String[] args){
		String s1 = new String("Ali Veli");
		int num = 49;

		System.out.println(s1);
		System.out.println(num); // overloading

		s1 = s1+num; //pointer'in ici degisti. nesneler ayni kaliyor.
        System.out.println(s1);
		StringBuffer sb = new StringBuffer("Ali Veli");
		sb.append(" elli");
		System.out.println(sb);
    }
}