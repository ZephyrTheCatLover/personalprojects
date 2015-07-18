import java.util.Scanner;

public class uhateme
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    
    String name;
    
    System.out.print( "What is your name? " );
    name = keyboard.next();
    
    if ( name.equals("Lexxie"));
    {
      System.out.println( "You are short. " );
    }
  }
}
