class Circumference extends ConsoleProgram {
  /**
  *    Calculates radius 
  * @author:G. Bangayan
  */
  
  public void run() {
    //read input from user
    double dblRad = readDouble("Please give me the Radius of the Circle: ");

    //calculates Circumference
    double dblCirc = (dblRad * 2 * Math.PI);

    //prints circumference
    System.out.println("The circumference is " + dblCirc);
  }
}