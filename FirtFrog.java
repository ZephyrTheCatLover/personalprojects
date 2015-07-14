import java.util.Scanner;

public class FirtFrog
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    
    String word;
    boolean yep, nope;
    
    System.out.println( "Type the sentence \"Zephyr is cool\", please." );
    word = keyboard.next();
    
    yep =  !  word.equals("Zephyr is cool");
    nope = ! word.equals("Zephyr is cool");
    
    System.out.println( "I say thank you: " + yep );
    System.out.println( "You are ignorant: " + nope );
  }
}
