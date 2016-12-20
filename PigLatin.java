/**
 * 
 * @author Eric J. Pilegaard
 *
 */

//Importing appropriate java files
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner; 


public class PigLatin extends JFrame implements ActionListener{
						
//Setting the window size
	public static final int WIDTH = 400;
	public static final int HEIGHT = 600;
	public static final int NUMBER_OF_CHAR = 100;

//Setting the input and output areas
	private JTextArea inputArea;
	private JTextArea outputArea;

	public static void main(String[] args){
		
		PigLatin gui = new PigLatin();
		gui.setVisible(true);
	}
		public PigLatin()
		{
//Setting up the window and format			
			super("English to Pig Latin");
			setSize(WIDTH, HEIGHT);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());

//Setting up input text panel
			JPanel inputText = new JPanel();
			inputText.setLayout(new FlowLayout());
			inputText.setBackground(Color.WHITE);
			
//Inserting input text area	
			inputArea = new JTextArea("Enter text in English:", 10, 20);
			inputText.add(inputArea);
			
//Adding input text panel
			add(inputText);
			
//Setting up output text panel
			JPanel outputText = new JPanel();
			outputText.setLayout(new FlowLayout());
			outputText.setBackground(Color.WHITE);

//Inserting output text area
			outputArea = new JTextArea("Text in Pig Latin", 10, 20);
			outputText.add(outputArea);
					
//Adding output text panel
			add(outputText);
			
//Setting up button panel
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new FlowLayout());
			buttonPanel.setBackground(Color.GRAY);
			
//Adding translate button	
			JButton translateButton = new JButton("Translate");
			translateButton.addActionListener(this);
			buttonPanel.add(translateButton);
			
//Adding clear button
			JButton clearButton = new JButton("Clear");
			clearButton.addActionListener(this);
			buttonPanel.add(clearButton);
			
//Adding button panel
			add(buttonPanel);
			
		}
			
			public void actionPerformed(ActionEvent e)
			{
				String actionCommand = e.getActionCommand();

//Translate button action
				if (actionCommand.equals("Translate"))
				{	
//Setting up scanner for inputArea text					
					Scanner scan = new Scanner(inputArea.getText());
					
//While loop to translate English into Pig Latin					
					while (scan.hasNext())
					{
						String nextString = scan.next();
						char newcharacter = Character.toLowerCase(nextString.charAt(0));
						String newconsonant = nextString.substring(1, nextString.length()) + nextString.substring(0, 1) + "ay "; 
						if (newcharacter == 'a' || newcharacter == 'e' || newcharacter == 'i' || newcharacter == 'o' || newcharacter == 'u' || newcharacter == 'y')
						{	
							outputArea.setText(outputArea.getText() + nextString + "way ");
						}
						else 
						{	
							outputArea.setText(outputArea.getText() + newconsonant);
						}
					}

//Closing scanner
				scan.close();
				}
				
//Clear button action
				else if (actionCommand.equals("Clear"))
				{
					inputArea.setText("Enter Text in English");
					outputArea.setText("Text in Pig Latin");
				}
				
			}
	}
		
	
		
		
		
	

