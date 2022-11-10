import javax.swing.*;
public class TestingSwitch {
    public static void main(String[] args){
        int choice;
        String s;
        do {
            s = JOptionPane.showInputDialogue("1.Compiler"+"2.BBM\n"+"3.Journalism\n"+"4.Quite\n"+"Enter selection 1 - 4\n");
            choice = Integer.parseInt(s);
            switch (choice)
            {
                case 1:
                    JOptionPane.showMessageDialogue("Computer Science is good course");
                    break;
                case 2:
                    JOptionPane.showMessageDialogue("BBM is good course");
                    break;
                case 3:
                    JOptionPane.showMessageDialogue("Journalism is challenging course");
                    break;
                case 4:
                    JOptionPane.showMessageDialogue("Good bye for now");
                    break;
                default:
                    JOptionPane.showMessageDialogue(null, "wrong selection 1 - 4");
                    break;
            }while(choice!=4)
        A}
    }
}
