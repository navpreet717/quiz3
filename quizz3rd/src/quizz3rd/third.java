package quizz3rd;

import java.util.HashMap;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a string
				String name= "copyandpastecopyandpastecopyandpastecopyandpastecopyandpastecopyandpastecommitandpushcommitandpushcommitandpushcommitandpushpushcccccommmitttsss";
				
				//number of characters in the string
				int numberofcharactrs=name.length();
				System.out.println("number of characters:"+numberofcharactrs);

//The last 15 characters in the string
				System.out.println("last 15 characters: " +
                        name.substring(name.length() - 15));		
				
				
				//the number of times  c appear in the sentence 
				int charCount = 0;
		        for(int i =0 ; i<name.length(); i++){
		            if(name.charAt(i) == 'c'){
		                charCount++;
		            }
		            
		        }
		        System.out.println(" the number of times c appear in the sentence  " + charCount);
		      //the number of times  p appear in the sentence 
				int charCount1 = 0;
		        for(int i =0 ; i<name.length(); i++){
		            if(name.charAt(i) == 'p'){
		                charCount1++;
		            }
		            
		        }
		        System.out.println(" the number of times p appear in the sentence  " + charCount1);
		        
		      }}
		       
