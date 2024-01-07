package Student_Grade_Calculator;

import java.util.*;

class Data {
    private Collection<Integer> mrks = new ArrayList<Integer>();
    void setInput() {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total no of Subjects");
        int n = sc.nextInt();
        if (n < 4) {
            System.out.println("Enter valid no of subjects atleast 4");
            setInput();
        } else {

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter marks in subject " + i+" out of 100");
                x = sc.nextInt();
                if(x>100){
                    System.out.println("Invalid Marks entered");
                    setInput();
                }
                mrks.add(x);
            }

        }

    }
    public Collection getInput(){
        return mrks;
    }


}
