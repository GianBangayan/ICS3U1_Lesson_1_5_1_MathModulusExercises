class Km_To_Miles extends ConsoleProgram {
/**
*   converts KM into miles
* @author: G. Bangayan
*/
    public void run(){
        // takes in KM
        double dblKilometers = readDouble("Input Km to convert to Miles: ");

        //convert to miles
        double dblMiles = dblKilometers * 0.621371;

        //Prints out miles
        System.out.println("That is " + dblMiles +" miles");

    }
}
