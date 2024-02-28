class Power extends ConsoleProgram {

  /**
  * Description Takes two inputs and puts the first number to the power of the second
  * @author: G. Bangayan
  */
  
  public void run() {
    // Takes inputs
    double dblA = readDouble("Input base: ");
    double dblB = readDouble("Input power: ");

    // Calculates the power of A and prints
    System.out.println("Your result is: " + Math.pow(dblA, dblB));
    
  }
}