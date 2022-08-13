public class ComputadorMain {
    public static void main(String args[]){
        Processador process = new Processador("Intel", "i7-6950X", 3.8, 10);
        Memoria mem = new Memoria("Corsair Vengeance LPX", "DDR4", 8.0, 2.1, 8);
        Disco disc = new Disco("Western Digital","HDD",4000.0,9600);
        Computador comp = new Computador("DELL", process, mem, disc);
        System.out.println(comp.getDescricao());
    }
}
