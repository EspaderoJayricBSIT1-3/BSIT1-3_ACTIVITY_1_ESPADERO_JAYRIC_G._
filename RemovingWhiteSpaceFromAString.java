package PROGRAMMING2;

import java.util.Scanner;

public class RemovingWhiteSpaceFromAString {
private static Scanner sc;

 public static void main(String[] args){
 
 

     sc = new Scanner(System.in);
   
   System.out.println("Enter String to Remove White Spaces = Hello World");
   String space = sc.nextLine();
   System.out.println("Original String = " + space);
   
 String str2 = space.replaceAll("\\s","");
   
   System.out.println("Final String = " + str2);
   
   
   
 
 }
 }
  
 