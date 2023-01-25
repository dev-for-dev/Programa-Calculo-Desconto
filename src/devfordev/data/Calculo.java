package devfordev.data;

public class Calculo {
	private int dia;
	private float valorDia, valorDesconto,valorHora, hora, plano;
	
	public void calcDesc(float plano, float hora) {
		this.plano = plano;
		this.hora = hora;
		this.valorDia = plano/30;
		this.valorHora = valorDia/24;
		this.valorDesconto = valorHora*hora;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public float getHora() {
		return hora;
	}

	public void setHora(float hora) {
		this.hora = hora;
	}

	public float getPlano() {
		return plano;
	}

	public void setPlano(float plano) {
		this.plano = plano;
	}

	public float getValorDia() {
		return valorDia;
	}

	public void setValorDia(float valorDia) {
		this.valorDia = valorDia;
	}

	public float getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
}
