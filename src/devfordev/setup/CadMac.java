package devfordev.setup;

import devfordev.data.Calculo;
public class CadMac{
	
	public static void main(String[] args) {
		Calculo cadD = new Calculo();
		cadD.calcDesc(70,9);
		System.out.printf("Valor do dia é: " + "%.2f",cadD.getValorDia());
		System.out.printf("\nValor da hora é: " + "%.2f",cadD.getValorHora());
		System.out.printf("\nValor desconto é: " + "%.2f",cadD.getValorDesconto());
	}
}
