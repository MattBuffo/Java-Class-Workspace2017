import javax.swing.JOptionPane;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		{
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.print("Hello  ");
		System.out.println(name);
		System.out.println("I don't have a name, because I am just a java program");
		System.out.println("Please give me a name");
		String givenname = JOptionPane.showInputDialog("Given Name");
		System.out.print("Thanks! My new name is now ");
		System.out.println(givenname);
		System.out.println("There is no meaning to life");
		System.out.println("Goodbye Cruel World");
		System.exit(0);
		}
		
	}
}