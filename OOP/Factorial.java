import java.util.Scanner;

public class Factorial {
    int num, fact=1, i;
    void reads(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number to calculate Factorial: ");
        num = s.nextInt();
    }
    void compute(){
        for(i=1; i<=num; i++){
          fact = fact * i;
        }
    }
    void show(){
        System.out.println("The Factorial is: ");
        System.out.println(fact);
    }
    public static void main(String[] args){
        Factorial m = new Factorial();
        m.reads();
        m.compute();
        m.show();
    }
}
