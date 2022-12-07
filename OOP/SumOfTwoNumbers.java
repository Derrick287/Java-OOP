import javax.swing.JOptionPane;

public class SumOfTwoNumbers {
    int a, b, sum;
    void reads()
    {
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of b"));
    }
    void compute(){
      sum=a+b;
    }
    void show(){
      JOptionPane.showMessageDialog(null, "Value of sum: " + sum);
    }
    public static void main (String[] args) {
        SumOfTwoNumbers m = new SumOfTwoNumbers();
        m.reads();
        m.compute();
        m.show();
        
    }

}
