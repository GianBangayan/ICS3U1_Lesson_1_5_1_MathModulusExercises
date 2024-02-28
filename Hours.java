class Hours extends ConsoleProgram {

  /**
  *   Takes hours and turns it into days and hours
  * @author:
  */
  
  public void run() {
    //input hours 
    int intHours = readInt("Input hours: ");

    //Calculate modulus of the hours 
    System.out.println("There are " + intHours/24 +" Days and "+ intHours%24 + " Hours");
  }
}