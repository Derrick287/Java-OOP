import java.util.Scanner;

public class Areaofcircle {
    double r, pi = 3.142, area;
    void get(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        r = s.nextInt();
    }
    void compute(){
        area = pi * r * r;
    }
    void display(){
        System.out.println("The Area of a circle with radius "+ r +" is: ");
        System.out.println(area);
    }
    public static void main(String[] args){
        Areaofcircle m = new Areaofcircle();
        m.get();
        m.compute();
        m.display();
    }
}
