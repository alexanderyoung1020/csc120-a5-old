/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * TODO: Modify this method to print ASCII Art Boot
     */
    //save each line as a variable? line1 + "\n" + line2;
    public void display() {
        if (this.direction.equals("left")) {
         String line1 = "         ##";
         String line2 = "        ###"; 
         String leftBoot = line1 + "\n" + line2;
         System.out.println(leftBoot);


                                  
                                             
            
        } else if (this.direction.equals("right")) {
          String line1 = " ##  ";
          String line2 = " ###";
          String rightBoot = line1 + "\n" + line2;
          System.out.println(rightBoot);

         
          
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
