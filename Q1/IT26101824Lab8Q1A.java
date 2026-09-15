import java.util.Scanner;
public class IT26101824Lab8Q1A
{
    public static void main(String[] args){
	
		int i;
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[5];
		
		for(i =0; i<5; i++){
			
			System.out.print("Enter a number "+ (i+1) + ":");
			myArray[i] = input.nextInt();
			
		}
		System.out.print("\n");
		System.out.println("Arrays in Revers Order:");
	
		for(i=4; i>=0; i--){
				
			System.out.print(myArray[i]+" ");	
			
		}
	
	
	
	
	
	}
}

