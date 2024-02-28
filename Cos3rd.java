class Cos3rd extends ConsoleProgram {
  /**
  *   Calcuates third side from contained angle + 2 sides
  * @author:G. Bangayan
  */
  
  public void run() {
    
    //takes inputs from user
    double dblSideA = readDouble("Input Side A: ");
    double dblSideB = readDouble("Input Side B: ");
    double dblAngleC = readDouble("Input Angle c: ");

    // Calculate side length
    double dblSideC = Math.sqrt(((dblSideA * dblSideA + dblSideB * dblSideB) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC))));

    // Prints side length C
    System.out.println("Side C is " + dblSideC + "long");
    
  }
}