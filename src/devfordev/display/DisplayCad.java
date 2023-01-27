package devfordev.display;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import devfordev.data.Calculo;
import devfordev.data.MeuJButton;

@SuppressWarnings("serial")
public class DisplayCad extends Resolution {

	private String valorPlanoText = "", valorHoraText = "",descFloat;
	private float vHora,vPlano, descontoD;
	private MeuJButton calcularDesc;
	private JTextPane valorDesconto;
	private TextField valorHora,valorPlano;
	private JLabel planoLabel,horaLabel,descLabel;
	private Ouvinte o = new Ouvinte();
	private Calculo calc = new Calculo();

	public DisplayCad() {
//		this.adicionarLb();
		this.adicionarTf();
		this.adicionarBt();
		this.adicionarJl();
		this.repaint();
	}

	public void adicionarBt() {
		// MeuJButton("NOME DO BOTAO",x, y, width, height,"ICONE USADO NO
		// BOTAO");
		calcularDesc = new MeuJButton("Calcular", 125, 90, 80, 30);
		calcularDesc.addActionListener(o);
		this.add(calcularDesc);
	}

	/**
	 * Metodo utilizado para adicionar JTextFields na tela.
	 */
	public void adicionarJl() {
		planoLabel = new JLabel("Valor do Plano");
		planoLabel.setBounds(15, 5, 100, 20);
		planoLabel.setForeground(Color.WHITE);
		add(planoLabel);
		horaLabel = new JLabel("Horas Offline");
		horaLabel.setBounds(125, 5, 100, 20);
		horaLabel.setForeground(Color.WHITE);
		add(horaLabel);
		descLabel = new JLabel("Valor do Desconto");
		descLabel.setBounds(15, 65, 120, 20);
		descLabel.setForeground(Color.WHITE);
		add(descLabel);
	}
	public void adicionarTf() {
			valorPlano = new TextField();
			valorPlano.setBounds(15, 30, 80, 30);
			valorPlano.setText(null);
			add(valorPlano);
			valorHora = new TextField();
			valorHora.setBounds(125, 30, 80, 30);
			valorHora.setText("");
			add(valorHora);
			valorDesconto = new JTextPane();
			valorDesconto.setBounds(15, 90, 80, 30);
			valorDesconto.setEditable(false);
			add(valorDesconto);
	}

	private class Ouvinte implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == calcularDesc) {
				valorPlanoText = valorPlano.getText();
				valorHoraText = valorHora.getText();
				vPlano = calc.strToFloat(valorPlanoText);//String convert to Float
				vHora = calc.strToFloat(valorHoraText);//String convert to Float
				descontoD = calc.calcDesc(vPlano, vHora);
				if(descontoD < 1.0) {
					descFloat = calc.formatarFloat(descontoD).toString() + " Centavos";
				}
				else if(descontoD < 2.0) {
					descFloat = calc.formatarFloat(descontoD).toString() + " Real";
				}
				else {
					descFloat = calc.formatarFloat(descontoD).toString() + " Reais";
				}
				valorDesconto.setText(descFloat);
				valorPlano.setText(null);
				valorHora.setText(null);
				

			}

		}

	}

}
