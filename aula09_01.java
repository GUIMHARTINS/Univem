public class aula09_01 {
    public static void main(String args[]) {
        Lampada lampada1 = new Lampada ("Incandescente");
        lampada1.setPotencia(40);
        System.out.println(lampada1);
        Interruptor il = new Interruptor();
        il.conectar(lampada1);
        System.out.println(lampada1);
        il.ligar();
        System.out.println(lampada1);
        il.desligar();
        System.out.println(lampada1);
    }
}