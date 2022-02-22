package PROGRAMMING2;

import java.util.Arrays;

import java.util.Scanner;

public class CheckingWhetherTwoStringsAreAnagram {


    
    public static void checkIfAnagram(String string1, String string2) {
        
        int Str1 = string1.length();
        int Str2 = string2.length();

       
        if(Str1 != Str2) {
            System.out.println("Two string are not anagram");
        }

       
        char[] charArray1 = string1.toUpperCase().toCharArray();
        char[] charArray2 = string2.toUpperCase().toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

            string1 = String.valueOf(charArray1);
        string2 = String.valueOf(charArray2);

       
        boolean isAnagram = string1.equalsIgnoreCase(string2);

        
        if (isAnagram == true) {
            System.out.println("The Two strings are anagram");
        } else if (isAnagram == false){
            System.out.println("The two strings are not anagram");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();
        System.out.println();

      
        checkIfAnagram(string1, string2);
    }
}       


