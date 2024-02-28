class Km_To_Miles extends ConsoleProgram {
/**
*   converts KM into miles
* @author: G. Bangayan
*/
    public void run(){
        // takes in KM
        double dblKilometers = readDouble("Input Km to convert to Miles: ");

        System.out.println("That is " + dblKilometers*0.621371 +" miles");

    }
    
}
