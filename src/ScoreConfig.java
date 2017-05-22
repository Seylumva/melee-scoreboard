import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.border.*;

/* This configuration interface should prompt the user to enter
 * both player's tag, character, score, team (if they have one)
 * and player color (RGBY) as per Melee's colors.
 */

public class ScoreConfig extends JFrame {
	JPanel configPlayers;
	JButton updateInfo;


	public static void main(String[] args) {
		new ScoreConfig();
	}

	public ScoreConfig() {
		/* JFrame settings */
		super("Melee Scoreboard");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(550,480);

		/* Main panel */
		configPlayers = new JPanel();
		
		// Adding player objects of superclass JPanel to the main panel
		Player playerOne = new Player("Player 1");
		configPlayers.add(playerOne);
		Player playerTwo = new Player("Player 2");
		configPlayers.add(playerTwo);
		
		// Adding update button to main panel
		updateInfo = new JButton("Update");
		configPlayers.add(updateInfo);
		this.add(configPlayers);

		this.setVisible(true);
	}
}
