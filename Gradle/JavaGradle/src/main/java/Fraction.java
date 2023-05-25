import java.io.*;
import java.util.Scanner;

/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         Fraction frac = new Fraction();

         // add 2 arguments
         if (args.length == 2) {
            int num = 0;
            int denom = 0;
            try {
               num = Integer.parseInt(args[0]);
               denom = Integer.parseInt(args[1]);
            } catch (Exception e) {
               System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
               System.exit(1);
            }
            // set the values
            frac.setNumerator(num);
            frac.setDenominator(denom);

            //print it
            System.out.println("The fraction is: ");
            frac.print();
            System.out.println("");
         } else {
            System.out.println("Exactly 2 arguments should be provided.\n gradle run --args='1 2'");
         }



      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}

