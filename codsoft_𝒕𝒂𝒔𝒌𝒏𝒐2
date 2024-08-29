import java.util.Scanner;
public class grading
{
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
 		int totalmarks=0;
 		int[] marks=new int[5];
		System.out.println("Please enter the name of the student: ");
		String name=scanner.next();
		for(int i=0;i<5;i++){
		    System.out.println("Marks in "+(i+1)+" subject: ");
		    marks[i]=scanner.nextInt();
		}
		for(int i=0;i<5;i++){
		    totalmarks+=marks[i];
	}
	float average;
	average=totalmarks/5.0f;
	System.out.println("Total Marks: " + totalmarks+" out of 500");
    System.out.println("Average Percentage: " + average + "%");
	
	if(average>=90){
	    System.out.println("Congratulations! Your Grade is: A");
	}
		else if(average>=80){
	    System.out.println("Congratulations! Your Grade is: B");
	}
		else if(average>=70){
	    System.out.println("Congratulations! Your Grade is: C");
	}
		else{
	    System.out.println("Congratulations! Your Grade is: D");
	}
}
}
