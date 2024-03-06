import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {

        System.out.println("Welcome to the DMV!");

        Random random = new Random();
        int userNumber = random.nextInt(200) + 1;
        System.out.println("Your number is " + userNumber + ". Please wait until your number is called.");

        for (int i = 1; i <= 200; i++) {
            int callNumber = (userNumber + i) % 200; 
            callNumber = callNumber == 0 ? 200 : callNumber; 
            System.out.println("Now calling: " + callNumber);

            if (callNumber == userNumber) {
                break;
            }
        }
        System.out.println("Get outta here! You don't have the required papers HAHAHDUHAUDHAUHDAUHUAHUHAHU!!!!!");
    }
}

