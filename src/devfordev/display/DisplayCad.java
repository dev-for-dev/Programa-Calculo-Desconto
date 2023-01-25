package devfordev.display;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.MaskFormatter;

import devfordev.data.MaskTextMAC;
import devfordev.data.MeuJButton;

@SuppressWarnings("serial")
public class DisplayCad extends Resolution {

	private MeuJButton adicionar, copiar;
	private JTextPane macs;
	private String macText = "", macTemp;
	private JFormattedTextField mac;
	private TextField diaTf;
	private Ouvinte o = new Ouvinte();

	public DisplayCad() {
//		this.adicionarLb();
		this.adicionarTf();
		this.adicionarBt();
		this.repaint();
	}

	public void adicionarBt() {
		// MeuJButton("NOME DO BOTAO",x, y, width, height,"ICONE USADO NO
		// BOTAO");
		copiar = new MeuJButton("Calcular", 265, 160, 100, 30);
		copiar.addActionListener(o);
		this.add(copiar);
	}

	/**
	 * Metodo utilizado para adicionar JTextFields na tela.
	 */
	public void adicionarJl() {
		
	}
	public void adicionarTf() {
		MaskFormatter maskMac;
		try {
			maskMac = new MaskFormatter("##.##");
			mac = new JFormattedTextField(maskMac);
			mac.setBounds(15, 40, 240, 30);
			mac.setValue(null);
			add(mac);
			diaTf = new TextField();
			diaTf.setBounds(15, 100, 240, 30);
			diaTf.setText("");
			add(diaTf);
			macs = new JTextPane();
			macs.setBounds(15, 160, 240, 180);
			macs.setEditable(false);
			add(macs);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private class Ouvinte implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == adicionar) {
				macText = mac.getText().toUpperCase();
				if (macText.replace(" ", "").length() < 17) {
					JOptionPane.showMessageDialog(macs, "Mac Incompleto!");
				} else {
					macText = mac.getText().toUpperCase();
					macTemp = macs.getText() + macText + "\n";
					macs.setText(macTemp);
					mac.setValue(null);
				}

			}
			if (e.getSource() == copiar) {
				macs.selectAll();
				macs.copy();
				macs.setText(null);
			}
		}

	}

}
