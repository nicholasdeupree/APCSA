import javax.swing.JFrame;
import javax.swing.JPanel;

public class EasyGUI {
	private JFrame frame;
	private JPanel panel;
	public EasyGUI()
	{
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setSize(400,400);
		panel.setLayout(null);
		frame.setTitle("Minesweeper");
		frame.setResizable(false);
		
	}
}
