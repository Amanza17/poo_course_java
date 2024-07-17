public class Furgoneta extends Coche{
    //el constructor de la furgoneta se hace invocando a super (que es el constructor del coche)
    public Furgoneta(String marca, String modelo, String color, int numero_puertas) {
        super(marca, modelo, color, numero_puertas);
    }

    //con el metodo override hacemos que aunque se llame igual que la funcion de la clase coche, esta predomine sobre ella
    @Override
    public void arrancar() {
        System.out.println("Arrancando furgoneta");
        System.out.println("Furgoneta arrancada");
    }
}
