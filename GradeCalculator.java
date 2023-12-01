
package gradecalculator;
import java.util.Scanner;


public class Gradecalculator {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of subjects");
        int numberofsubjects=input.nextInt();
        double totalMarks=0;
        for(int i=1;i<=numberofsubjects;i++){
            System.out.println("enter the marks of the subjects"+i+":");
            double marks=input.nextInt();
            totalMarks=totalMarks+marks;
        }
        double averagePercentage=(totalMarks/(numberofsubjects*100))*100;
        System.out.println("The total marks of all subjects is"+"="+totalMarks);
        System.out.println("The percentage of all subjects is"+"="+averagePercentage+"%");
        
        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade is"+" "+grade);
        
    }
    public static String calculateGrade(double averagePercentage){
        
        if(averagePercentage>=90){
            return "O";
       }
        else if(averagePercentage>=80){
            return "A+";
        }
        else if(averagePercentage>=70){
            return "A";
        }
        else if(averagePercentage>=60){
            return "B+";
        }
        else{
            return "F";
        }
        
    }
    
}

