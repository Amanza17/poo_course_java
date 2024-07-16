public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("Citroen", "c3", "dorado" , 5);
        c.arrancar();
        c.frenar();
        System.out.println(c.getColor());
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getModeloMarca());
        System.out.println(c.getNumero_puertas());

    }
}