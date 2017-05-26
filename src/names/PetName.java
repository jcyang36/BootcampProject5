package names;
import java.util.Scanner;
  
 public class PetName
 {
     public static void main( String[] args )
    {
        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        
		Scanner keyboard=new Scanner(System.in);
		
        name = keyboard.next();
        
 
        System.out.print( "What kind of animal is " + name + "? " );
        
        keyboard=new Scanner(System.in);
		
        breed = keyboard.next();
        
        System.out.print( "How old is " + name + "? ");
        
        keyboard=new Scanner(System.in);
		
        age = keyboard.nextInt();
        
        
        System.out.println( name + " is your " + breed + " and it is " + age );
     }
 }