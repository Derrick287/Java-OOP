import java.swing.*;
public class EvenOdd {
    public static void main(String[] args){
        int n;
        String s;
        s = JOptionPane.showInputDialogue("Enter number check: ");
        n = Integer.parseInt(s);
        if(n%2==0){
            JOptionPane.showMessageDialogue(null, "Number is Even");
        }
        else{
            JOptionPane.showMessageDialogue(null, "Number is Odd");
        }

    }
}
