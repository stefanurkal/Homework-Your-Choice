import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        
        int[] randNum = new int[10];

        // Create a Random object
        Random random = new Random();

        
        for (int i = 0; i < randNum.length; i++) {
            randNum[i] = random.nextInt(10); 
        }

        System.out.println("Random Numbers: ");
        for (int num : randNum) {
            System.out.println(num + " ");    
        
        }

        int sum = randNum[0] + randNum[randNum.length-1];
        System.out.println( "First number + last number in the array = " + sum );
    }


    
}