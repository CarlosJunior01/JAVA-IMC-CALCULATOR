package imc;

import javax.swing.JOptionPane;

public class IMC_Calc {

	public static void main(String[] args) {
		int peso = 0;
		double altura = 0, calculoImc = 0;
		
		String nome = JOptionPane.showInputDialog("Primeiramente informe seu nome: ");
				
		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso atual: "));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		
		calculoImc = peso/(Math.pow(2, altura));
		
		if (calculoImc <= 18.5) {
			JOptionPane.showMessageDialog(null, nome + " seu IMC é: " + String.format("%.2f", calculoImc) + " você se encontra Abaixo de seu Peso ideal.");
		} else if(calculoImc > 18.5 && calculoImc <= 24.9) {
			JOptionPane.showMessageDialog(null, nome + " seu IMC é: " + String.format("%.2f", calculoImc) + " você se encontra com Peso ideal.");
		} else if(calculoImc > 24.9 && calculoImc <= 29.9) {
			JOptionPane.showMessageDialog(null, nome + " seu IMC é: " + String.format("%.2f", calculoImc) + " você se encontra com Sobrepeso.");
		} else if(calculoImc > 29.9 && calculoImc <= 34.9) {
			JOptionPane.showMessageDialog(null, nome + " seu IMC é: " + String.format("%.2f", calculoImc) + " você se encontra com Obesidade grau 1.");
		} else if(calculoImc > 34.9 && calculoImc <= 39.9) {
			JOptionPane.showMessageDialog(null, nome + " seu IMC é: " + String.format("%.2f", calculoImc) + " você se encontra com Obesidade grau 2.");
		} else 
			JOptionPane.showMessageDialog(null, nome + " seu IMC é: " + String.format("%.2f", calculoImc) + " você se encontra com Obesidade grau 3.");		
		
	}

}
