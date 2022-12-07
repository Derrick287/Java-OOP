public class AddOOPDialog {
    int a,b,c;
    void get{
        s = JOptionPane.showInputDialogue("Enter first number: ");
        a = Integer.parseInt(s);
        s = JOptionPane.showInputDialogue("Enter first number: ");
        b = Integer.parseInt(s);
    }
    void compute{
        c = a+b;
    }
    void display{

    }
    public static void main(String[] args){
        AddOOPDialog m = new AddOOPDialog();
        m.get();
        m.compute();
        m.display();
    }
}
