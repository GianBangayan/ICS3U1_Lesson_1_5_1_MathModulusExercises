class FtoC extends ConsoleProgram {

  /**
  *   converts from celcius fahrenheit 
  * @author:G. Bangayan
  */
  
  public void run() {
    // Takes in celcius 
    int intFahrenheit = readInt("Input Temp in Fahrenheit: ");

    // Calcuates fahrenheit and prints it 
    System.out.println("Your temperature in Celcius is: " + Math.round(((double)5 * (intFahrenheit - 32)) /9));
    
  }
}