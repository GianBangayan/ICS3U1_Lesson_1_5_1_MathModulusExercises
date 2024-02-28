class FtoC extends ConsoleProgram {

  /**
  *   converts from celcius fahrenheit 
  * @author:G. Bangayan
  */
  
  public void run() {
    // Takes in celcius 
    int intFahrenheit = readInt("Input Temp in Fahrenheit: ");

    //Calculates celcius
    double dblCelc = Math.round((double)((5 * (intFahrenheit - 32)) /9));

    // prints out Celcius
    System.out.println("Your temperature in Celcius is: " + (int)dblCelc );
    
  }
}