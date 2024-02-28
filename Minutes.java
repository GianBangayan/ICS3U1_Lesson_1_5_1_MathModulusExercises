class Minutes extends ConsoleProgram {

  /**
  *   Takes min and turns it into days, hours and min
  * @author:
  */
  
  public void run() {
    //input min
    int intMin = readInt("Input minutes: ");

    //Calc number of days
    int intDays = intMin / 1440;
    intMin = intMin % 1440;

    //calc number of hours
    int intHours = intMin / 60;
    intMin = intMin % 60;

    //Calculate modulus of the hours 
    System.out.println("There are " + intDays +" Days, "+ intHours + " Hours, and "+ intMin + " minutes");
  }
}