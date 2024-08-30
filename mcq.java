import java.util.Scanner;

class mcq {
    public static void main(String[] args) {
        int score=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("This is a MCQ game.");
        System.out.println("You will have to choose one of the correct answer out of 4 given options.");
        
        
        String[] array1=new String[]{"Delhi", "Mumbai", "Banglore", "Kolkata"};
        System.out.println("\nQ1) What is the capital of India?");
        for(int i=0;i<array1.length;i++){
            System.out.println((i+1)+". "+array1[i]);
        }
        int ans1=sc.nextInt()-1;
        if(array1[ans1]==array1[0]){
            System.out.println("Correct! The capital of India is Delhi.");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Delhi.");
        }
        
        String[] array2=new String[]{"Ohio", "Los Angeles", "Washington", "Boston"};
        System.out.println("\nQ1) What is the capital of United States of America?");
        for(int i=0;i<array2.length;i++){
            System.out.println((i+1)+". "+array2[i]);
        }
        int ans2=sc.nextInt()-1;
        if(array2[ans2]==array2[2]){
            System.out.println("Correct! The capital of United States of America is Washington.");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Washington.");
        }
        
        String[] array3=new String[]{"Barcelona", "Seville", "Valencia", "Madrid"};
        System.out.println("\nQ1) What is the capital of Spain?");
        for(int i=0;i<array3.length;i++){
            System.out.println((i+1)+". "+array3[i]);
        }
        int ans3=sc.nextInt()-1;
        if(array3[ans3]==array3[3]){
            System.out.println("Correct! The capital of Spain is Madrid.");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Madrid.");
        }
        
        String[] array4=new String[]{"Nagasaki", "Tokyo", "Hiroshima", "Osaka"};
        System.out.println("\nQ1) What is the capital of Japan?");
        for(int i=0;i<array4.length;i++){
            System.out.println((i+1)+". "+array4[i]);
        }
        int ans4=sc.nextInt()-1;
        if(array4[ans4]==array4[1]){
            System.out.println("Correct! The capital of Japan is Tokyo.");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Tokyo.");
        }
        
        System.out.println("\nYou have scored " + score + "/4");
    }
}