class AreaSin extends ConsoleProgram {

  /**
  *    Takes sides and angle to find area of a triangle
  * @author:G. Bangayan
  */
  
  public void run() {
    //Take inputs from user
    double dblSideA = readDouble("Input Side A: ");
    double dblSideB = readDouble("Input Side B: ");
    double dblAngleC = readDouble("Input Angle c: ");

    //Area Calculation
    double dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC)))/2;

  //prints area
    System.out.println("Your area is " + dblArea);
  }
}