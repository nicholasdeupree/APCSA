import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogInScreen implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JButton logIn;
	private JLabel uN;
	private JLabel pN;
	private JTextField uT;
	private JTextField pT;
	//Username and Password you must type in
	private static String name = "User";
	private static String pass = "javacodingisfun";
	public LogInScreen()
	{
		frame = new JFrame();
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,150);
		panel.setLayout(null);
		frame.add(panel);
		frame.setTitle("Log-in");
		frame.setResizable(false);
		
		uN = new JLabel();
		uN.setBounds(10,10,75,25);
		uN.setText("Username:");
		panel.add(uN);
		
		pN = new JLabel();
		pN.setBounds(10,50,75,25);
		pN.setText("Password:");
		panel.add(pN);
		
		uT = new JTextField();
		uT.setBounds(80,10,100,25);
		panel.add(uT);
		
		pT = new JTextField();
		pT.setBounds(80,50,100,25);
		panel.add(pT);
		
		logIn = new JButton();
		logIn.setText("Log-in");
		logIn.setBounds(200,50,100,25);
		logIn.addActionListener(this);
		panel.add(logIn);
		
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new LogInScreen();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String u = uT.getText();
		String p = pT.getText();
		if (u.equals(name) && p.equals(pass))
			JOptionPane.showMessageDialog(null, "Username and Password Correct \nWelcome " + name);
		else
			JOptionPane.showMessageDialog(null, "Username and Password are incorrect");
	}
}
