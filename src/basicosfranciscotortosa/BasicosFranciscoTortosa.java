/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosfranciscotortosa;

/**
 *
 * @author Francisco
 */
public class BasicosFranciscoTortosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        logicos();
    }
      public static void logicos() {
          //Variables
          int x = 3;
          int y = 8;
          System.out.println("El valor de X es 3 y el de Y es 8");
          if (y > x) {
              System.out.println("Y es mayor que X");                      
          }
          if (x > y) {
              System.out.println("Y es menor que X");
          }
    }    
}
