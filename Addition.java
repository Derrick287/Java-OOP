import java.swing.*;
public class Addition {
    public static void main(String[] args){
        int a,b,c;
        String s;
        s = JOptionPane.showInputDialogue("Enter first number: ");
        a = Integer.parseInt(s);
        s = JOptionPane.showInputDialogue("Enter first number: ");
        b = Integer.parseInt(s);
        c= a+b;
        JOptionPane.showMessageDialogue(null, "The answer is"+c);
    }
}
