import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) throws FileNotFoundException {
        
        // TODO: Process the file via token-based processing
        
        Scanner fileScnr = new Scanner(new File("coins1.txt"));
        // Scanner fileScnr = new Scanner(new File("coins2.txt"));

        
    }
}

/*
 ********* Sample output *********
 
 ================ coins1.txt =================
 3 pennies 2 quarters 1 pennies 3 nickels 4 dimes
 =============================================
 Console output: Total money: $1.09
 
 ================ coins2.txt =================
 12     QUARTERS        1      Pennies     33
 PeNnIeS

     10     niCKELs
 =============================================
 Console output: Total money: $3.84

 */
