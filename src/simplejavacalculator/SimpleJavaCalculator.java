/**
 * @name        Simple Java Calculator
 * @package     ph.calculator
 * @file        Main.java
 * @author      John Brown
 * @email       johnte.brown0321@student.boardmanschools.org
 * @link        http://github.com/JohnTeBrown
 * @copyright   Copyright Dusk & Rain, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

public class SimpleJavaCalculator {
   
   public static void main(String[] args) {
      try {
         UI uiCal = new UI();
         uiCal.init();
      }
      catch (Exception e) {
         System.out.println(e.getMessage());   
      }
      
   }
}
