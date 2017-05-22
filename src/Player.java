import javax.swing.*;
import javax.swing.border.*;

public class Player extends JPanel {
	String panelTitle;
	JPanel configPlayers;
	JPanel player1Sect;
	JLabel player1;
	JLabel player2;
	JTextField player1Tag;
	
	public Player() {
		super();
		TitledBorder player1PanelBorder = BorderFactory.createTitledBorder("Player 1");
		this.setBorder(player1PanelBorder);
		player1 = new JLabel("Tag:");
		this.add(player1);
		player1Tag = new JTextField(20);
		this.add(player1Tag);
		JRadioButton redOne = new JRadioButton("Red", true);
		JRadioButton blueOne = new JRadioButton("Blue");
		JRadioButton yellowOne = new JRadioButton("Yellow");
		JRadioButton greenOne = new JRadioButton("Green");
		ButtonGroup player1Color = new ButtonGroup();
		player1Color.add(redOne);
		player1Color.add(blueOne);
		player1Color.add(yellowOne);
		player1Color.add(greenOne);
		this.add(redOne);
		this.add(blueOne);
		this.add(yellowOne);
		this.add(greenOne);
	}
	public Player(String panelTitle) {
		super();
		TitledBorder player1PanelBorder = BorderFactory.createTitledBorder(panelTitle);
		this.setBorder(player1PanelBorder);
		player1 = new JLabel("Tag:");
		this.add(player1);
		player1Tag = new JTextField(20);
		this.add(player1Tag);
		JRadioButton redOne = new JRadioButton("Red", true);
		JRadioButton blueOne = new JRadioButton("Blue");
		JRadioButton yellowOne = new JRadioButton("Yellow");
		JRadioButton greenOne = new JRadioButton("Green");
		ButtonGroup player1Color = new ButtonGroup();
		player1Color.add(redOne);
		player1Color.add(blueOne);
		player1Color.add(yellowOne);
		player1Color.add(greenOne);
		this.add(redOne);
		this.add(blueOne);
		this.add(yellowOne);
		this.add(greenOne);
	}
}
