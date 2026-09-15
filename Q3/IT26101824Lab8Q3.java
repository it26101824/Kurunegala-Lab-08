import java.util.Scanner;
public class IT26101824Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numberArray = new int[6];
        int count = 0;
        int max;

        // Input numbers
        while (count < 6) {
            System.out.print("Enter a positive number ("+(count+1)+"/6):");
            int num = input.nextInt();

			//validation
            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numberArray[count] = num;
                count++;
            }
        }

        
        max = numberArray[0];

        for (int i = 1; i < numberArray.length; i++) {
            if (numberArray[i] > max) {
                max = numberArray[i];
            }
        }
		
		System.out.println("\n");
        
        System.out.println("Array Contents:");

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i]+" ");
        }
		System.out.println(" ");

        System.out.println("The Maximum number Entered = " + max);


    }
}
