import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.border.*;


public class ScoreConfig extends JFrame {
	JPanel configPlayers;
	JPanel player1Sect;
	JPanel player2Sect;
	JLabel player1;
	JLabel player2;
	JTextField player1Tag;
	JTextField player2Tag;
	JButton updateInfo;


	public static void main(String[] args) {
		new ScoreConfig();
	}

	public ScoreConfig() {
		super("Melee Scoreboard");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(640,480);

		Border player1PanelBorder = BorderFactory.createTitledBorder("Player 1");
		Border player2PanelBorder = BorderFactory.createTitledBorder("Player 2");
		configPlayers = new JPanel();
		player1Sect = new JPanel();
		player1Sect.setBorder(player1PanelBorder);
		player2Sect = new JPanel();
		player2Sect.setBorder(player2PanelBorder);
		player1 = new JLabel("Tag:");
		player1Sect.add(player1);
		player1Tag = new JTextField(20);
		player1Sect.add(player1Tag);
		player2 = new JLabel("Tag:");
		player2Sect.add(player2);
		player2Tag = new JTextField(20);
		player2Sect.add(player2Tag);

		configPlayers.add(player1Sect);
		configPlayers.add(player2Sect);
		updateInfo = new JButton("Update");
		configPlayers.add(updateInfo);

		this.add(configPlayers);



		this.setVisible(true);
	}
}
