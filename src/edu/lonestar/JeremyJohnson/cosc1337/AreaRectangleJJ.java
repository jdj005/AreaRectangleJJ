package edu.lonestar.JeremyJohnson.cosc1337;
import javax.swing.JOptionPane;

/**
 * Calculates the area of a rectangle from user input of width & length dimensions.
 *
 */
public class AreaRectangleJJ {
   /**
    * Gets a positive number input from the user.
    * 
    * @param prompt
    *           the message to display to retrieve the input
    * @return the value input, or CANCELED if the user cancels
    */
   public static Double getPositiveDouble(String prompt) {
      String displayPrompt = prompt;
      double value = 0.0;
      String userInput = null;
      while (value <= 0.0 && (userInput = JOptionPane.showInputDialog(null, displayPrompt)) != null) {
         try {
            value = Double.parseDouble(userInput);
         } catch (NumberFormatException e) {
            value = 0.0;
         }
         if (value <= 0.0)
            displayPrompt = "The input must be a number greater than zero.\n" + prompt;
      }
      return userInput == null ? null : value;
   }

   /**
    * Gets the base of the triangle.
    * 
    * @return the input base value, or CANCELED if the user cancels
    */
   public static Double getWidth() {
      final String prompt = "Please enter the rectangle's width.";
      return getPositiveDouble(prompt);
   }

   /**
    * Gets the height of the triangle.
    * 
    * @return the input height value, or CANCELED if the user cancels
    */
   public static Double getLength() {
      final String prompt = "Please enter the rectangle's length.";
      return getPositiveDouble(prompt);
   }

   /**
    * This calculates the area of a rectangle, given its width and length.
    * 
    * @param width
    *           the width (short side) dimension of the rectangle
    * @param length
    *           the length (long side) dimension of the rectangle
    * @return the calculated area of the rectangle
    */
   public static double getArea(double width, double length) {
      return .5 * (width * length);
   }

   /**
    * This is the application main. Calculates the area of a rectangle when the
    * user inputs values for the width and length.
    * 
    * @param args
    *           command line arguments (not used for this app)
    */
   public static void main(String[] args) {
      Double width, length;
      if ((width = getWidth()) != null && (length = getLength()) != null) {
    	  JOptionPane.showMessageDialog(null, new Rectangle(width, length), new String("Rectangle Area"), JOptionPane.INFORMATION_MESSAGE);
      }
      else
         JOptionPane.showMessageDialog(null, "User canceled operation.",
               new String("Rectangle Area"), JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
   }

}
