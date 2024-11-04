public class Casting {
	
	public static void main (String[] args) {
	    long numero1 = 2147483648L;  
        int numero2 = (int) numero1;  // realizando o casting de long para int

        System.out.println("Valor de numero1 (long): " + numero1);
        System.out.println("Valor de numero2 (int): " + numero2);
    }
}
