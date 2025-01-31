import javax.swing.JOptionPane;

public class UserInput {
public static void main(String[] args) {
	
	String name =JOptionPane.showInputDialog("Enter your Name");
	JOptionPane.showMessageDialog(null, "Hello "+ name);
	
	String place =JOptionPane.showInputDialog("Enter your Place");
	JOptionPane.showMessageDialog(null, "You are from "+ place);
	
	int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
	JOptionPane.showMessageDialog(null, "You are "+ age);
	
}
}
