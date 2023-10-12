import java.util.*;   
public class StudentMarks
{ 
    public static void main(String args[]) 
    {   
        // Taking input from user 
        Scanner sc = new Scanner(System.in); 
        int n;     //Declaring Variables
        
        //Ask the user to enter the Array Size
        System.out.println("Enter the total subjects ");
        n=sc.nextInt();
        
        //Declare the array
        int arr[] = new int[n]; 
        System.out.println("Enter the marks secured in each subject ");
        for(int i=0;i<n;i++)   //Initialize the array
        {
            arr[i]=sc.nextInt();
        }
        
        int total=0;
        //Calculate the total marks
        for(int i=0;i<n;i++)
        {
            total=total+arr[i];
        }
        //Display the total marks
        System.out.println("The total marks obtained is "+total);
        
        //Calculate the percentage
        float percentage; 
        percentage = (total / (float)n); 
        
        //Display the total percentage
        System.out.println( "Total Percentage : " + percentage + "%");   
        
        // Display the grade
        if(percentage>=90)
			System.out.println("Grade A");
		else if(percentage>=80)
			System.out.println("Grade B");
		else if(percentage>=70)
			System.out.println("Grade C");
		else if(percentage>=60)
			System.out.println("Grade D");
		else if(percentage>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
    }   
