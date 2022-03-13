package hangman;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	public static JFrame frame;
	public static JPanel panel;
	public static JLabel guessedWord;
	public static JLabel incorrectGuesses;
	public static JLabel totalGuesses;
	public static BufferedImage image = null;
	private static JButton bA,bB,bD,bE,bF,bG,bH,bI,bJ,bK,bL,bM,bN,bO,bP,bQ,bR,bS,bT,bU,bV,bW,bX,bY,bZ,bC;
	public static JLabel lbl;
	public static JLabel gWords;
	public static JTextField gWord;
	private static JLabel g;
	private static JButton gF;
	public GUI()
	{
		//essentials
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(600, 510);
		panel.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("HangMan");
		frame.setResizable(false);
		frame.add(panel);
		
		
		//labels
		
		guessedWord = new JLabel();
		guessedWord.setBounds(10, 10, 300, 50);
		String s = "";
		for(int k = 0; k<HangMan.getLen();k++)
		{
			if(HangMan.wordSoFar.get(k) == "#")
				s+= "   ";
			else
				s+=HangMan.wordSoFar.get(k) + " ";
		}
		guessedWord.setFont(new Font("Serif", Font.BOLD, 20));
		guessedWord.setText("Word: " + s);
		panel.add(guessedWord);
		guessedWord.setVisible(true);
		
		incorrectGuesses = new JLabel();
		incorrectGuesses.setBounds(400,10,200,25);
		incorrectGuesses.setText("Incorrect Guesses: " + HangMan.getGuesses());
		panel.add(incorrectGuesses);
		incorrectGuesses.setVisible(true);
		
		totalGuesses = new JLabel();
		totalGuesses.setBounds(400,30,200,25);
		totalGuesses.setText("Total Guesses: " + HangMan.getTotGuess());
		panel.add(totalGuesses);
		totalGuesses.setVisible(true);
		
		gWord = new JTextField();
		gWord.setBounds(280, 265, 150, 25);
		panel.add(gWord);
		
		g = new JLabel();
		g.setBounds(200,250,100,50);
		g.setText("Guess Word: ");
		panel.add(g);
		g.setVisible(true);
		
		gF = new JButton();
		gF.setBounds(430,265,140,25);
		gF.setText("Guess Word");
		gF.addActionListener(this);
		panel.add(gF);
		gF.setVisible(true);
		
		//Man

		try {
			image = ImageIO.read(new File("src/hangman/images/stageOne.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lbl = new JLabel();
		lbl.setIcon(new ImageIcon(image));
		lbl.setBounds(200, 50, 200, 200);
		panel.add(lbl);
		
		
		//Letter Buttons
		bQ = new JButton();bQ.addActionListener(this);bQ.setText("Q");bQ.setBounds(40, 300, 50, 50);panel.add(bQ);
		bW = new JButton();bW.addActionListener(this);bW.setText("W");bW.setBounds(90, 300, 50, 50);panel.add(bW);
		bE = new JButton();bE.addActionListener(this);bE.setText("E");bE.setBounds(140, 300, 50, 50);panel.add(bE);
		bR = new JButton();bR.addActionListener(this);bR.setText("R");bR.setBounds(190, 300, 50, 50);panel.add(bR);
		bT = new JButton();bT.addActionListener(this);bT.setText("T");bT.setBounds(240, 300, 50, 50);panel.add(bT);
		bY = new JButton();bY.addActionListener(this);bY.setText("Y");bY.setBounds(290, 300, 50, 50);panel.add(bY);
		bU = new JButton();bU.addActionListener(this);bU.setText("U");bU.setBounds(340, 300, 50, 50);panel.add(bU);
		bI = new JButton();bI.addActionListener(this);bI.setText("I");bI.setBounds(390, 300, 50, 50);panel.add(bI);
		bO = new JButton();bO.addActionListener(this);bO.setText("O");bO.setBounds(440, 300, 50, 50);panel.add(bO);
		bP = new JButton();bP.addActionListener(this);bP.setText("P");bP.setBounds(490, 300, 50, 50);panel.add(bP);
		bA = new JButton();bA.addActionListener(this);bA.setText("A");bA.setBounds(50, 350, 50, 50);panel.add(bA);
		bS = new JButton();bS.addActionListener(this);bS.setText("S");bS.setBounds(100, 350, 50, 50);panel.add(bS);
		bD = new JButton();bD.addActionListener(this);bD.setText("D");bD.setBounds(150, 350, 50, 50);panel.add(bD);
		bF = new JButton();bF.addActionListener(this);bF.setText("F");bF.setBounds(200, 350, 50, 50);panel.add(bF);
		bG = new JButton();bG.addActionListener(this);bG.setText("G");bG.setBounds(250, 350, 50, 50);panel.add(bG);
		bH = new JButton();bH.addActionListener(this);bH.setText("H");bH.setBounds(300, 350, 50, 50);panel.add(bH);
		bJ = new JButton();bJ.addActionListener(this);bJ.setText("J");bJ.setBounds(350, 350, 50, 50);panel.add(bJ);
		bK = new JButton();bK.addActionListener(this);bK.setText("K");bK.setBounds(400, 350, 50, 50);panel.add(bK);
		bL = new JButton();bL.addActionListener(this);bL.setText("L");bL.setBounds(450, 350, 50, 50);panel.add(bL);
		bZ = new JButton();bZ.addActionListener(this);bZ.setText("Z");bZ.setBounds(60, 400, 50, 50);panel.add(bZ);
		bX = new JButton();bX.addActionListener(this);bX.setText("X");bX.setBounds(110, 400, 50, 50);panel.add(bX);
		bC = new JButton();bC.addActionListener(this);bC.setText("C");bC.setBounds(160, 400, 50, 50);panel.add(bC);
		bV = new JButton();bV.addActionListener(this);bV.setText("V");bV.setBounds(210, 400, 50, 50);panel.add(bV);
		bB = new JButton();bB.addActionListener(this);bB.setText("B");bB.setBounds(260, 400, 50, 50);panel.add(bB);
		bN = new JButton();bN.addActionListener(this);bN.setText("N");bN.setBounds(310, 400, 50, 50);panel.add(bN);
		bM = new JButton();bM.addActionListener(this);bM.setText("M");bM.setBounds(360, 400, 50, 50);panel.add(bM);

		
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == gF)
			HangMan.checkPhrase(gWord.getText());
		if(e.getSource() == bA && HangMan.guessedWords.contains("a") == false) {			
			bA.setBackground(Color.GRAY);HangMan.check('a');
		}
		if(e.getSource() == bB && HangMan.guessedWords.contains("b") == false) {			
			bB.setBackground(Color.GRAY);HangMan.check('b');
		}
		if(e.getSource() == bC && HangMan.guessedWords.contains("c") == false) {			
			bC.setBackground(Color.GRAY);HangMan.check('c');
		}
		if(e.getSource() == bD && HangMan.guessedWords.contains("d") == false) {
			bD.setBackground(Color.GRAY);HangMan.check('d');
		}
		if(e.getSource() == bE && HangMan.guessedWords.contains("e") == false) {			
			bE.setBackground(Color.GRAY);HangMan.check('e');
		}
		if(e.getSource() == bF && HangMan.guessedWords.contains("f") == false) {			
			bF.setBackground(Color.GRAY);HangMan.check('f');
		}
		if(e.getSource() == bG && HangMan.guessedWords.contains("g") == false) {			
			bG.setBackground(Color.GRAY);HangMan.check('g');
		}
		if(e.getSource() == bH && HangMan.guessedWords.contains("h") == false) {			
			bH.setBackground(Color.GRAY);HangMan.check('h');
		}
		if(e.getSource() == bI && HangMan.guessedWords.contains("i") == false) {
			bI.setBackground(Color.GRAY);HangMan.check('i');
		}
		if(e.getSource() == bJ && HangMan.guessedWords.contains("j") == false) {
			bJ.setBackground(Color.GRAY);HangMan.check('j');
		}
		if(e.getSource() == bK && HangMan.guessedWords.contains("k") == false) {	
			bK.setBackground(Color.GRAY);HangMan.check('k');
		}
		if(e.getSource() == bL && HangMan.guessedWords.contains("l") == false) {
			bL.setBackground(Color.GRAY);HangMan.check('l');
		}
		if(e.getSource() == bM && HangMan.guessedWords.contains("m") == false) {
			bM.setBackground(Color.GRAY);HangMan.check('m');
		}
		if(e.getSource() == bN && HangMan.guessedWords.contains("n") == false) {		
			bN.setBackground(Color.GRAY);HangMan.check('n');
		}
		if(e.getSource() == bO && HangMan.guessedWords.contains("o") == false) {		
			bO.setBackground(Color.GRAY);HangMan.check('o');
		}
		if(e.getSource() == bP && HangMan.guessedWords.contains("p") == false) {		
			bP.setBackground(Color.GRAY);HangMan.check('p');
		}
		if(e.getSource() == bQ && HangMan.guessedWords.contains("q") == false) {			
			bQ.setBackground(Color.GRAY);HangMan.check('q');
		}
		if(e.getSource() == bR && HangMan.guessedWords.contains("r") == false) {			
			bR.setBackground(Color.GRAY);HangMan.check('r');
		}
		if(e.getSource() == bS && HangMan.guessedWords.contains("s") == false) {
			bS.setBackground(Color.GRAY);HangMan.check('s');
		}
		if(e.getSource() == bT && HangMan.guessedWords.contains("t") == false) {			
			bT.setBackground(Color.GRAY);HangMan.check('t');
		}
		if(e.getSource() == bU && HangMan.guessedWords.contains("u") == false) {		
			bU.setBackground(Color.GRAY);HangMan.check('u');
		}
		if(e.getSource() == bV && HangMan.guessedWords.contains("v") == false) {			
			bV.setBackground(Color.GRAY);HangMan.check('v');
		}
		if(e.getSource() == bW && HangMan.guessedWords.contains("w") == false) {			
			bW.setBackground(Color.GRAY);HangMan.check('w');
		}
		if(e.getSource() == bX && HangMan.guessedWords.contains("x") == false) {			
			bX.setBackground(Color.GRAY);HangMan.check('x');
		}
		if(e.getSource() == bY && HangMan.guessedWords.contains("y") == false) {			
			System.out.print(HangMan.getGuesses());HangMan.check('y');
			bY.setBackground(Color.GRAY);
		}
		if(e.getSource() == bZ && HangMan.guessedWords.contains("z") == false) {
			bZ.setBackground(Color.GRAY);HangMan.check('z');
		}
	}
	public static void changeImage()
	{
		if(HangMan.getGuesses() == 1)
			try {
				image = ImageIO.read(new File("src/hangman/images/stageTwo.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else if(HangMan.getGuesses() == 2)
			try {
				image = ImageIO.read(new File("src/hangman/images/stageThree.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else if(HangMan.getGuesses() == 3)
			try {
				image = ImageIO.read(new File("src/hangman/images/stageFour.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else if(HangMan.getGuesses() == 4)
			try {
				image = ImageIO.read(new File("src/hangman/images/stageFive.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else if(HangMan.getGuesses() == 5)
			try {
				image = ImageIO.read(new File("src/hangman/images/stageSix.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else if(HangMan.getGuesses() == 6)
			try {
				image = ImageIO.read(new File("src/hangman/images/stageSeven.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		lbl.setIcon(new ImageIcon(image));
		frame.revalidate();
		frame.repaint();
	}
	public static void resetColor() {
		bA.setBackground(null);
		bB.setBackground(null);
		bC.setBackground(null);
		bD.setBackground(null);
		bE.setBackground(null);
		bF.setBackground(null);
		bG.setBackground(null);
		bH.setBackground(null);
		bI.setBackground(null);
		bJ.setBackground(null);
		bK.setBackground(null);
		bL.setBackground(null);
		bM.setBackground(null);
		bN.setBackground(null);
		bO.setBackground(null);
		bP.setBackground(null);
		bQ.setBackground(null);
		bR.setBackground(null);
		bS.setBackground(null);
		bT.setBackground(null);
		bU.setBackground(null);
		bV.setBackground(null);
		bW.setBackground(null);
		bX.setBackground(null);
		bY.setBackground(null);
		bZ.setBackground(null);
		
	}
}
