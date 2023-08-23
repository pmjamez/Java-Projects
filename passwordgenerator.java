import java.util.Random;
import java.util.Scanner;

public class passwordgenerator {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scan = new Scanner(System.in);
        
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_+{}:<>?|ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String pass = "";

        int min = 0;
        int max = chars.length();

        System.out.println("Desired length of password?");
        int length = scan.nextInt();
        scan.close();

        for (int i =0; i < length; i++ ){
            int randomvalue = random.nextInt(max - min + 1) + min;
            int index = randomvalue % chars.length();
            char ranchar = chars.charAt(index);
            pass = pass + ranchar;
        }
        System.out.println("Your password is: " + pass);
    }
}

