package devfordev.display;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Resolution extends JFrame {

		public Resolution() {

			setLayout(null);
			setTitle("Desconto");
			setSize(240, 180);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setIconImage(new javax.swing.ImageIcon(getClass().getResource("/devfordev/resource/icon.png")).getImage());
			setLocationRelativeTo(null);
			getContentPane().setBackground(Color.DARK_GRAY);
			setVisible(true);
			repaint();
		}
	
}
