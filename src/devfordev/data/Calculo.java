package devfordev.data;

import java.text.DecimalFormat;

public class Calculo {
	private int dia;
	private float valorDia, valorDesconto,valorHora, hora, plano;
	
	public String formatarFloat(float numero){
		  String retorno = "";
		  DecimalFormat formatter = new DecimalFormat("0.00");
		  try{
		    retorno = formatter.format(numero);
		  }catch(Exception ex){
		    System.err.println("Erro ao formatar numero: " + ex);
		  }
		  return retorno;
		}
	 // Method to convert String to Float
	  public float strToFloat(String s) {
	    float floatVal = 0;
	    try {
	      // Using parseFloat()
	      floatVal = Float.parseFloat(s);
	      
	    } catch (Exception e) {
	      // Print the error
	      System.out.println("Error occured:- " + e);
	    }
		return floatVal;
	  }
	// Method to convert Float to String  
		  public String floatToStr(float s) {
		    String stringVal = "";
		    try {
		      // Using parseFloat()
		    	stringVal = Float.toString(s);
		      
		    } catch (Exception e) {
		      // Print the error
		      System.out.println("Error occured:- " + e);
		    }
			return stringVal;
		  }
	public float calcDesc(float plano, float hora) {
		this.plano = plano;
		this.hora = hora;
		this.valorDia = plano/30;
		this.valorHora = valorDia/24;
		this.valorDesconto = valorHora*hora;
		return valorDesconto;
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
