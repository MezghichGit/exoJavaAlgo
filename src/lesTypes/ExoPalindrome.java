package lesTypes;

import java.util.Scanner;

public class ExoPalindrome {

	public static void main(String[] args) {
		System.out.println("Taper une chaine de caractères");
		Scanner s = new Scanner(System.in);
		String mot = s.next();
		
		//char d = mot.charAt(0);
		//char f = mot.charAt(mot.length()-1);
		
		int i=0;
		while((mot.charAt(i)==mot.charAt(mot.length()-1-i))&& (i<mot.length()/2))
		{
			i++;
		}
		if(i==(mot.length()/2))
		{
			System.out.println(mot +" est Palindrome");
		}
		else
			System.out.println(mot +" n'est Palindrome");
		
		//System.out.println(d);
		//System.out.println(f);
		
		//System.out.println(mot);

	}

}
