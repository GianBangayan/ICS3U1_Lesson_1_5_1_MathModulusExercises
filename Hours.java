class Hours extends ConsoleProgram {

  /**
  *   Takes hours and turns it into days and hours
  * @author:
  */
  
  public void run() {
    //input hours 
    int intHours = readInt("Input hours: ");

    //Calc Days
    int intDays = intHours / 24;

    //Calc remainder hours
    int intRemainHours = intHours % 24;

  //prints the number of days and modulus of the hours 
    System.out.println("There are " + intDays +" Days and "+ intRemainHours + " Hours");
  }
}