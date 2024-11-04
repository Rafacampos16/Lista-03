public class Conversao {
	
	public static void main (String[] args) {
		String texto = "19.09";
		
        // Conversão da String para double
        double numero = Double.parseDouble(texto);
		
		System.out.println("Valor convertido para double: " + numero);
	}
}

