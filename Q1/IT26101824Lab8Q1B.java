import java.util.Scanner;
public class IT26101824Lab8Q1B
{
    public static void main(String[] args){
	
		int i,count;
		count =0;
		
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[5];
		int[] evenArray = new int[5];
		
		for(i =0; i<5; i++){
			
			System.out.print("Enter a number "+ (i+1) + ":");
			myArray[i] = input.nextInt();
			
		}
		
		for(i =0; i<5; i++){
			if(myArray[i]%2 ==0)
			{
				evenArray[count]=myArray[i];
				count++ ;
				
				
			}
			
		}
		
		System.out.print("\n");
		System.out.println("myArray Contents:");
	
	
		for(i=4; i>=0; i--){
				
			System.out.print(myArray[i]+" ");	
			
		}
		System.out.println("\n");
		System.out.println("evenArray Contents:");
		
		for (i=0; i<count; i++){
			
			System.out.print(evenArray[i]+" ");
			
		}
	
	
	
	
	
	}
}