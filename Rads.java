class Rads extends ConsoleProgram {

  /**
  *   Converts degrees to radians 
  * @author:G. Bangayan
  */
  
  public void run() {
    // take in degrees
    double dblDeg = readDouble("Please give me the angle you want to convert to radians");

    // Calculates and prints radians
    System.out.println("Your angle is" + Math.toRadians(dblDeg) + " Radians");
  }
}