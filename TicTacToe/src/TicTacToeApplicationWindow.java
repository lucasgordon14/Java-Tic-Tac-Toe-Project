import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TicTacToeApplicationWindow {

	private JFrame frame;
	private JLabel turnlabel;
	
	// Determining factor on who's turn it is
	public boolean PlayerOneTurn;
	public boolean PlayerTwoTurn;
	
	// Taken By Players One and Two
	public boolean SpotTakenSpaceOneP1 = false;
	public boolean SpotTakenSpaceOneP2 = false;
	public boolean SpotTakenSpaceTwoP1 = false;
	public boolean SpotTakenSpaceTwoP2 = false;
	public boolean SpotTakenSpaceThreeP1 = false;
	public boolean SpotTakenSpaceThreeP2 = false;
	public boolean SpotTakenSpaceFourP1 = false;
	public boolean SpotTakenSpaceFourP2 = false;
	public boolean SpotTakenSpaceFiveP1 = false;
	public boolean SpotTakenSpaceFiveP2 = false;
	public boolean SpotTakenSpaceSixP1 = false;
	public boolean SpotTakenSpaceSixP2 = false;
	public boolean SpotTakenSpaceSevenP1 = false;
	public boolean SpotTakenSpaceSevenP2 = false;
	public boolean SpotTakenSpaceEightP1 = false;
	public boolean SpotTakenSpaceEightP2 = false;
	public boolean SpotTakenSpaceNineP1 = false;
	public boolean SpotTakenSpaceNineP2 = false;
	
	public boolean win = false;
	
	// Checks if spot is taken, prints error if it is and person tries to use it again
	public boolean SpotTakenSpaceOne;
	public boolean SpotTakenSpaceTwo;
	public boolean SpotTakenSpaceThree;
	public boolean SpotTakenSpaceFour;
	public boolean SpotTakenSpaceFive;
	public boolean SpotTakenSpaceSix;
	public boolean SpotTakenSpaceSeven;
	public boolean SpotTakenSpaceEight;
	public boolean SpotTakenSpaceNine;
	
	public int turn = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeApplicationWindow window = new TicTacToeApplicationWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToeApplicationWindow() {
		initialize();
		// Player One is Always X
		// Player Two is Always O
		PlayerOneTurn = true;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Button Double Zero
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (SpotTakenSpaceOne == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceOne == false) {
					btnNewButton.setText("X");
					btnNewButton.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceOne = true;
					SpotTakenSpaceOneP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceOne == false) {
					btnNewButton.setText("O");
					btnNewButton.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceOne = true;
					SpotTakenSpaceOneP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		btnNewButton.setBounds(184, 146, 140, 127);
		frame.getContentPane().add(btnNewButton);
		
		// Button Zero
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (SpotTakenSpaceTwo == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceTwo == false) {
					button.setText("X");
					button.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceTwo = true;
					SpotTakenSpaceTwoP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceTwo == false) {
					button.setText("O");
					button.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceTwo = true;
					SpotTakenSpaceTwoP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		button.setBounds(379, 146, 140, 127);
		frame.getContentPane().add(button);
		
		// Button One
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (SpotTakenSpaceThree == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceThree == false) {
					button_1.setText("X");
					button_1.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceThree = true;
					SpotTakenSpaceThreeP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceThree == false) {
					button_1.setText("O");
					button_1.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceThree = true;
					SpotTakenSpaceThreeP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		button_1.setBounds(567, 146, 140, 127);
		frame.getContentPane().add(button_1);
		
		// Button Two
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (SpotTakenSpaceFour == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceFour == false) {
					button_2.setText("X");
					button_2.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceFour = true;
					SpotTakenSpaceFourP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceFour == false) {
					button_2.setText("O");
					button_2.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceFour = true;
					SpotTakenSpaceFourP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		button_2.setBounds(184, 310, 140, 127);
		frame.getContentPane().add(button_2);
		
		// Button Three
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (SpotTakenSpaceFive == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceFive == false) {
					button_3.setText("X");
					button_3.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceFive = true;
					SpotTakenSpaceFiveP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceFive == false) {
					button_3.setText("O");
					button_3.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceFive = true;
					SpotTakenSpaceFiveP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		button_3.setBounds(379, 310, 140, 127);
		frame.getContentPane().add(button_3);
		
		// Button Four
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (SpotTakenSpaceSix == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceSix == false) {
					button_4.setText("X");
					button_4.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceSix = true;
					SpotTakenSpaceSixP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceSix == false) {
					button_4.setText("O");
					button_4.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceSix = true;
					SpotTakenSpaceSixP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		button_4.setBounds(567, 310, 140, 127);
		frame.getContentPane().add(button_4);
		
		// Button Five
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (SpotTakenSpaceSeven == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceSeven == false) {
					button_5.setText("X");
					button_5.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceSeven = true;
					SpotTakenSpaceSevenP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceSeven == false) {
					button_5.setText("O");
					button_5.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceSeven = true;
					SpotTakenSpaceSevenP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		button_5.setBounds(184, 484, 140, 127);
		frame.getContentPane().add(button_5);
		
		// Button Six
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (SpotTakenSpaceEight == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceEight == false) {
					button_6.setText("X");
					button_6.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceEight = true;
					SpotTakenSpaceEightP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceEight == false) {
					button_6.setText("O");
					button_6.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceEight = true;
					SpotTakenSpaceEightP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		button_6.setBounds(379, 484, 140, 127);
		frame.getContentPane().add(button_6);
		
		// Button Seven
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (SpotTakenSpaceNine == true) {
					JOptionPane.showMessageDialog(null, "Error: Please only use unoccupied spaces whilst playing.");
				}
				
				if (PlayerOneTurn == true && SpotTakenSpaceNine == false) {
					button_7.setText("X");
					button_7.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = false;
					PlayerTwoTurn = true;
					SpotTakenSpaceNine = true;
					SpotTakenSpaceNineP1 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				if (PlayerTwoTurn == true && SpotTakenSpaceNine == false) {
					button_7.setText("O");
					button_7.setFont(new Font("Arial", Font.PLAIN, 60));
					PlayerOneTurn = true;
					PlayerTwoTurn = false;
					SpotTakenSpaceNine = true;
					SpotTakenSpaceNineP2 = true;
					turn++;
					turnlabel.setText(Integer.toString(turn));
				}
				
				// Winning Conditionals
				// Horizontal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceTwoP1 == true && SpotTakenSpaceThreeP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceTwoP2 == true && SpotTakenSpaceThreeP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceFourP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP1 == true && SpotTakenSpaceEightP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceSevenP2 == true && SpotTakenSpaceEightP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Vertical
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFourP1 == true && SpotTakenSpaceSevenP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFourP2 == true && SpotTakenSpaceSevenP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceEightP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceTwoP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceEightP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceSixP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceSixP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Diagonal
				if (SpotTakenSpaceOneP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceNineP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceOneP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceNineP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP1 == true && SpotTakenSpaceFiveP1 == true && SpotTakenSpaceSixP1 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player One!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				if (SpotTakenSpaceThreeP2 == true && SpotTakenSpaceFiveP2 == true && SpotTakenSpaceSixP2 == true) {
					JOptionPane.showMessageDialog(null,"Congradulations: Player Two!  You Win!  You are the Tic-Tac-Toe Champion");
					win = true;
				}
				
				// Turn made it to nine and ended in a draw
				if (turn == 9 && win == false) {
					JOptionPane.showMessageDialog(null,"Oh no!  The match ended in a draw!  You two were too skilled to have just one victor.");
				}
			}
		});
		button_7.setBounds(567, 484, 140, 127);
		frame.getContentPane().add(button_7);
		
		JLabel lblTicTacToe = new JLabel("Tic-Tac-Toe");
		lblTicTacToe.setForeground(Color.PINK);
		lblTicTacToe.setFont(new Font("Arial", Font.PLAIN, 30));
		lblTicTacToe.setBackground(Color.LIGHT_GRAY);
		lblTicTacToe.setBounds(367, 78, 168, 40);
		frame.getContentPane().add(lblTicTacToe);
		
		JLabel lblPlayerOne = new JLabel("Player One = X");
		lblPlayerOne.setForeground(Color.RED);
		lblPlayerOne.setBounds(875, 10, 95, 59);
		frame.getContentPane().add(lblPlayerOne);
		
		JLabel lblPlayerTwo = new JLabel("Player Two = O");
		lblPlayerTwo.setForeground(Color.BLUE);
		lblPlayerTwo.setBounds(875, 31, 95, 59);
		frame.getContentPane().add(lblPlayerTwo);
		
		JLabel lblTurn = new JLabel("Turn = ");
		lblTurn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTurn.setForeground(Color.GREEN);
		lblTurn.setBounds(12, 13, 86, 40);
		frame.getContentPane().add(lblTurn);
		
		turnlabel = new JLabel("0");
		turnlabel.setFont(new Font("Arial", Font.PLAIN, 25));
		turnlabel.setBounds(107, 6, 109, 59);
		frame.getContentPane().add(turnlabel);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Resets the entire board for a new game at any time.
				btnNewButton.setText("");
				button.setText("");
				button_1.setText("");
				button_2.setText("");
				button_3.setText("");
				button_4.setText("");
				button_5.setText("");
				button_6.setText("");
				button_7.setText("");
				
				// Sets all board values to false
				SpotTakenSpaceOne = false;
				SpotTakenSpaceTwo = false;
				SpotTakenSpaceThree = false;
				SpotTakenSpaceFour = false;
				SpotTakenSpaceFive = false;
				SpotTakenSpaceSix = false;
				SpotTakenSpaceSeven = false;
				SpotTakenSpaceEight = false;
				SpotTakenSpaceNine = false;
				
				// Sets winning boolean values to false
				SpotTakenSpaceOneP1 = false;
				SpotTakenSpaceOneP2 = false;
				SpotTakenSpaceTwoP1 = false;
				SpotTakenSpaceTwoP2 = false;
				SpotTakenSpaceThreeP1 = false;
				SpotTakenSpaceThreeP2 = false;
				SpotTakenSpaceFourP1 = false;
				SpotTakenSpaceFourP2 = false;
				SpotTakenSpaceFiveP1 = false;
				SpotTakenSpaceFiveP2 = false;
				SpotTakenSpaceSixP1 = false;
				SpotTakenSpaceSixP2 = false;
				SpotTakenSpaceSevenP1 = false;
				SpotTakenSpaceSevenP2 = false;
				SpotTakenSpaceEightP1 = false;
				SpotTakenSpaceEightP2 = false;
				SpotTakenSpaceNineP1 = false;
				SpotTakenSpaceNineP2 = false;
				
				// Resets Turns back to zero.
				turn = 0;
				turnlabel.setText(Integer.toString(turn));
			}
		});
		ResetButton.setBackground(Color.ORANGE);
		ResetButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ResetButton.setForeground(Color.RED);
		ResetButton.setBounds(839, 681, 116, 48);
		frame.getContentPane().add(ResetButton);
	}
}
