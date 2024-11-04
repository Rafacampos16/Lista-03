public class DivisaoInteiraReal {
	 public static void main(String[] args) {
	 int a = 5;
	 int b = 2;

	   // Divisão inteira
        System.out.println(a / b);  

        // Divisão real com casting de um dos operandos
        System.out.println((double) a / b); 

        // Divisão real com casting de ambos os operandos
        System.out.println((double) a / (double) b); 

        // Divisão real com casting de 'b'
        System.out.println(a / (double) b);  
        
        // Divisão real com casting e parênteses ao redor da expressão
        System.out.println((double) (a / b));  
	 }
}

// 2, 2.5, 2.5, 2.5 e 2.0
