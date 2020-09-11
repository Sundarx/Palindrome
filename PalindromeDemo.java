//SUNDAR RAJ
import javax.swing.JOptionPane;

public class PalindromeDemo
{
	public static void main(String [] args)
	{
		int loop = 0;
		do
		{
			LinkedStackDS<Character> stack = new LinkedStackDS<Character>();

			String pldrome = JOptionPane.showInputDialog(null,
								"Enter a String to test if it is a palindrome");

			String testStr = pldrome.replaceAll("[^a-zA-Z]+","");

			for(int i = 0; i < testStr.length(); i++)
			{
				stack.push(testStr.charAt(i));
			}

			StringBuilder str = new StringBuilder();

			while(!stack.isEmptyStack())
			{
				str.append(stack.peek());
				stack.pop();
			}

			if(testStr.equalsIgnoreCase(str.toString()))
			{
				JOptionPane.showMessageDialog(null, "'" + pldrome
												+ "' is a palindrome");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "'" + pldrome
											+ "' is not a palindrome");
			}

			int again = JOptionPane.YES_NO_OPTION;

		    if(JOptionPane.showConfirmDialog(null, "Test another String?",
					"Continue", again) == JOptionPane.NO_OPTION)
		    {
		    	JOptionPane.showMessageDialog(null, "Program exited.");
		    	System.exit(0);
		    }
		}

		while(true);
	}
}