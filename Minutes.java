class Minutes extends ConsoleProgram {

  /**
  *   Takes min and turns it into days, hours and min
  * @author:
  */
  
  public void run() {
    //input min
    int intHours = readInt("Input minutes: ");

    //Calculate modulus of the hours 
    System.out.println("There are " + intHours/1440 +" Days, "+ intHours/60 + " Hours, and "+ intHours%60 + " minutes");
  }
}