import javax.swing.JOptionPane;

/** Programa: Calculadora feita em Java 
 @author Odair 
 @version 1.0
 
 *
 */

public class calculadora {
	public static void main(String[] args) {

		double a;
		double b;
		String operacao;
		double resultado;


		a = Double.parseDouble(JOptionPane
				.showInputDialog("Entre com 1 Numero: "));

			operacao = JOptionPane.showInputDialog("Entre com a Operação: ");
			
		
			b = Double.parseDouble(JOptionPane
					.showInputDialog("Entre com 1 Numero: "));

			if (operacao.equals("+")) {
				resultado = a + b;
				JOptionPane.showMessageDialog(null, "O resultado e :"
						+ resultado, "Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				a = resultado;
			}

			if (operacao.equals("-")) {
				resultado = a - b;
				JOptionPane.showMessageDialog(null, "O resultado e :"
						+ resultado, "Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				a = resultado;
			}

			if (operacao.equals("*")) {
				resultado = a * b;
				JOptionPane.showMessageDialog(null, "O resultado e :"
						+ resultado, "Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				a = resultado;
			}

			if (operacao.equals("/")) {
				resultado = a / b;
				JOptionPane.showMessageDialog(null, "O resultado e :"
						+ resultado, "Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				a = resultado;
			}
			
			if (operacao.equals("^")) {
				resultado = Math.pow(a, b);
				JOptionPane.showMessageDialog(null, "O resultado e :"
						+ resultado, "Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				a = resultado;
			}

	
	}
	
 
}