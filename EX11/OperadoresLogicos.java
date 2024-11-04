public class OperadoresLogicos {
	
	public static void main (String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		// (a > b) é false e (c < d) é true -> !(false && true) = true
        System.out.println(!(a > b && c < d));  // Exibe true
		
        // (a > b) é false e (c < d) é true -> false || true = true
        System.out.println(a > b || c < d);  // Exibe true

		// (a > b) é false e (c < d) é true -> false && true = false
        System.out.println(a > b && c < d);  // Exibe false

        // (a > b) é false e (c < d) é true -> !(false || true) = false
        System.out.println(!(a > b || c < d));  // Exibe false

        // (a > b) é false e (c < d) é true -> (a > b) ^ (c < d) = true
        System.out.println((a > b) ^ (c < d));  // Exibe true
	}
}
//true, true, false, false e true

/* &&: E lógico (AND) - O resultado é true apenas se ambos os operandos forem true.
||: Ou lógico (OR) - O resultado é true se pelo menos um dos operandos for true.
!: Negação lógica (NOT) - Inverte o valor lógico do operando.
^: Exclusivo (XOR) - O resultado é true se exatamente um dos operandos for true, mas não
*/
