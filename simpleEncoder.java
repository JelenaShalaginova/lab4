package lab4;

import java.util.Scanner;

public class simpleEncoder {
		public static void main(String[] args) {
			
			String word;
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a one word: ");
			word = keyboard.next();
			
			StringBuffer sb = new StringBuffer();
			
			//len - the number of chars in the word
			int len = word.length();
			//vowels:a, e, i, o,u
		
			
			for(int i = 0; i < len; i++) {
				
				if(word.charAt(i) == 'e') {	
					sb.append('1');
					
				}else if
					(word.charAt(i) == 'i'){
						sb.append('2');
						
					}else if
							(word.charAt(i) == 'o') {
							sb.append('3');
					}else if
							(word.charAt(i) == 'u') {
							sb.append('3');
					}else if
							(word.charAt(i) == 'a') {
							sb.append('4');
					}else {		
					sb.append(word.charAt(i));
				}		
			}//end for

			String encoded = sb.toString();
			System.out.println("Encoded word: " + encoded);
}
}
