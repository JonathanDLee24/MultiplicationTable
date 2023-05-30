/*
Author: Jonathan Lee
Professor: Gita
Class: Sierra College CSCI12
*/


import java.util.Scanner;
public class School
{
   public static final int multi = 3; //multiplyer
   public static void main (String args[])
   {
      Scanner console = new Scanner (System.in);
      System.out.print("Type an integer for rows: ");
      int numrow = console.nextInt();
      System.out.println();
      System.out.println("You entered for rows. . . " + numrow);
      System.out.println();
      System.out.print("Type an integer for columns: ");
      int numcol = console.nextInt();
      System.out.println();
      System.out.println("You enterd for colums. . ." + numcol);
      System.out.println();
      System.out.println("Type an integer for multiplier: ");
      int multi = console.nextInt();
      System.out.println();
      System.out.println("You entered for multiplier. . ." + multi);
      System.out.println();
      printGrid(numrow, numcol, multi);
   }
   public static void printGrid(int rows, int cols, int multi)
   {
      int range = (rows * cols);
      int j = 1;
      int k = 1;
      for (int r=0; r<rows; r++)
      {
         j=0+k;
         for (int i=0; i<cols; i++, j+=rows)
         {
            if (i<cols-1)
               System.out.print((j*multi)+", ");
            else
               System.out.print(j*multi);
         }
         System.out.println();
         k++;
      }
   }
}
