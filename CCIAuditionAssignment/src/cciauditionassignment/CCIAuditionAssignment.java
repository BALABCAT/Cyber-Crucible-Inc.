/*
 * Catherine Bababan
 * Cyber Crucible Coding Assignment
 * Requirements : 
 * Spring Boot REST server
 * One endpoint for HTTP POST which accepts a JSON payload/body
 * one Pojo with the following attributes:
 * username
 * AES key (base64 encoded)
 * AES cipher/variant (CBC, EBS, CTR, etc.)
 * data to encrypt (base64 encoded)
 *
 */
package cciauditionassignment;

/**
 *
 * @author catherinebalaban
 */

import java.util.Scanner;
import java.util.Base64;
//import javax.crypto.*;    
//import java.security.*; 
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class CCIAuditionAssignment {
    
    //private static SecretKeySpec secretKey;
    //private static byte[] key;

    public static void main(String[] args) 
   
    {
        
        Scanner keyboard = new Scanner(System.in);  //set up scanner class
        
        System.out.print ("Please enter a username for yourself: ");
        String secretKey = keyboard.next();
        
        
        byte[] encodedBytes = Base64.getEncoder().encode(secretKey.getBytes());
        System.out.println("encodedBytes " + new String(encodedBytes));
        
        
         System.out.print("Enter the data you wish to encrypt: ");
        String sampleData = keyboard.next();
        
        //take the data that the user wants encrypted and using the base 64
        //encoded key encode the actual data using AES then print the result
        String encryptedString = AES.encrypt(sampleData, secretKey) ;
        System.out.print(encryptedString);
        
    
            
        }
       
               
}
                
        
        
        
       
