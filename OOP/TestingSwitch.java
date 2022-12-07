
import javax.swing.*;
public class TestingSwitch {
    public static void main(String[] args){
        int choice;
        String s;
        do {
            s = JOptionPane.showInputDialog("1.Compiler\n"+"2.BBM\n"+"3.Journalism\n"+"4.Quite\n"+"Enter selection 1 - 4\n");
            choice = Integer.parseInt(s);
            switch (choice){
                case 1:
                    JOptionPane.showMessageDialog(null, "Computer Science is good course");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "BBM is good course");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Journalism is challenging course");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Good bye for now");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "wrong selection 1 - 4");
                    break;
            }
         }while(choice!=4);
    }
}
