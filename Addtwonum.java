import java.util.*;
public class Addtwonum {
    int a, b, c;
    void get(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = s.nextInt();
        System.out.println("Enter b: ");
        b = s.nextInt();
    }
    void compute(){
        c = a + b;
    }
    void display(){
        System.out.println("Result ");
        System.out.println(c);
    }
    public static void main(String[] args){
        Addtwonum m = new Addtwonum();
        m.get();
        m.compute();
        m.display();
    }
}
