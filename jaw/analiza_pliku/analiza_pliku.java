import java.util.*;
import java.io.FileReader;

/**
   Ten program wyświetla liczbę liter,
   cyfr i spacji w łańcuchu znaków.
*/

public class analiza_pliku
{
   public static void main(String [] args)
   {
   
      char[] array = new char[100];        // Tablica na dane wejściowe.
      int letters = 0;     // Liczba liter.
      int digits = 0;      // Liczba cyfr.
      int whitespaces = 0; // Liczba spacji.

	  try 
	  {
		  FileReader input = new FileReader("plik.txt");
		  input.read(array);
		  System.out.println("zapisano");
		  System.out.println(array);
		  input.close();
	  }
	catch (Exception e) 
	{
      e.getStackTrace();
	}

      // Analizowanie znaków.
      for (int i = 0; i < array.length; i++)
      {
         if (Character.isLetter(array[i]))
            letters++;
         else if (Character.isDigit(array[i]))
            digits++;
         else if (Character.isWhitespace(array[i]))
            whitespaces++;
      }

      // Wyświetlanie wyników.
      System.out.println("Liczba liter: " +
                         letters + ", liczba cyfr: " +
                         digits + ", liczba spacji: " +
                         whitespaces + 
                         ".");
   }
}
