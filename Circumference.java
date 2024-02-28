class Circumference extends ConsoleProgram {
  /**
  *    Calculates radius 
  * @author:G. Bangayan
  */
  
  public void run() {
    //read input from user
    double dblRad = readDouble("Please give me the Radius of the Circle: ");

    //calculate and prints radius
    System.out.println("The Radius is " + (dblRad * 2 * Math.PI));
  }
}