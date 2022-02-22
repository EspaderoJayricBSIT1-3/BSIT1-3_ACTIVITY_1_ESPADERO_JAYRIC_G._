package PROGRAMMING2;

public class FindingNonRepeatedCharacters{
 
 public static void main(String[] args){

  String NonRepeated = "Non Repeated Characters";
  
 for(char i :NonRepeated.toCharArray()){
 
   if (NonRepeated.indexOf(i) == NonRepeated.lastIndexOf(i)){
   
  System.out.println("First non-repeated character is: "+i);
  
     break;
     }
    }  
  
}

}
 
 
 



