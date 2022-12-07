import java.util.Scanner;

public class volumedemo {
    int l, w, h, v;
    void get(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length: ");
        l = s.nextInt();
        System.out.println("Enter Width: ");
        w = s.nextInt();
        System.out.println("Enter height: ");
        h = s.nextInt();
    }
    void compute(){
        v = l * w * h;
    }
    void display(){
        System.out.println("The volume is: ");
        System.out.println(v);
    }
    public static void main(String[] args){
        volumedemo m = new volumedemo();
        m.get();
        m.compute();
        m.display();
    }
}
