package Student_Grade_Calculator;

import java.util.ArrayList;
import java.util.Collection;

public class Calculation {
    Collection<Integer> a = new ArrayList<Integer>();

    void getData(){
        Data s = new Data();
        s.setInput();
        a= s.getInput();
         int n = a.size();
        double sum = sum(a);
        double avgPer = percent(n,sum);
        char grade = grade(avgPer);
        display(sum, avgPer, grade);
    }
    int sum(Collection<Integer> m) {
        int sum = 0;
        for (int s : m) {
            sum += s;
        }
        return sum;
    }
    double percent(int n, double s){
        return s/n;
    }

    char grade(double per){
        if(per>=80)
            return 'A';
        else if (per>=60 && per<80)
            return 'B';
        else if(per>=40 && per<60)
            return 'D';
        else
            return 'D';
    }

    void display(double sum, double avgPer, char grade){
        System.out.println("Total Marks Obtained : "+sum);
        System.out.println("Avearage Percent obtained: "+avgPer+"%");
        System.out.println("Grade: "+grade);
    }

}
