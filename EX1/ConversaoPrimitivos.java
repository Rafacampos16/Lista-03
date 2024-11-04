public class ConversaoPrimitivos {
    public static void main(String[] args) {
        int a = 10;
        long b = a;  // conversão automática de int para long
        int c = (int) b;  // conversão explícita de long para int
        float d = b;  // conversão automática de long para float
        short e = (short) a;  // conversão explícita de int para short
        double f = d;  // conversão automática de float para double
        Long g = b;  // autoboxing de long para Long
        long h = g;  // unboxing de Long para long

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
