public class Furgoneta extends Coche{
    //el constructor de la furgoneta se hace invocando a super (que es el constructor del coche)
    public Furgoneta(String marca, String modelo, String color, int numero_puertas) {
        super(marca, modelo, color, numero_puertas);
    }

    //añadimos sobre la funcion de coches la de intermitentes (la clase de coche anterior son bmw y van sin intermitentes)
    //esta funcion es única de las furgonetss


    public void intermitentes() {
        System.out.println("Encendiento intermitentes furgoneta");

    }
}
