import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int phy,chem,maths,totalmarks,avg_per;
        char grade='\0';
        System.out.println("Enter the three subject marks of the students respestively:");
        phy = in.nextInt();
        chem = in.nextInt();
        maths = in.nextInt();
        totalmarks = phy+chem+maths;
        System.out.println("Total Marks obtained is :"+ totalmarks);
        avg_per = totalmarks/3;
        System.out.println("Average Percentage of the student is: "+ avg_per);
        if (avg_per > 90) { 
            grade = 'A'; 
        } else if ((avg_per > 85) && (avg_per < 90)) { 
            grade = 'B'; 
        } else if ((avg_per > 80) && (avg_per < 85)) { 
            grade = 'C'; 
        } else if ((avg_per > 70) && (avg_per < 80)) { 
            grade = 'D'; 
        } else if ((avg_per > 60) && (avg_per < 70)) { 
            grade = 'E'; 
        } else if ((avg_per > 50) && (avg_per < 60)) { 
            grade = 'F'; 
        } 
        System.out.println("Student Grade is :"+ grade);
    }
}