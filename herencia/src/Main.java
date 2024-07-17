
public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("Renault", "r5", "verde", 5);


        Coche d = new Furgoneta("Citroen", "Jumper", "blanco", 6);
        //por el tema de que furgoneta es hijo de coche, podemos inicializar una furgoneta como coche para facilitar trabajo
        //en listas, pilas, etc

        Furgoneta f = new Furgoneta("Mercedes", "Vito", "negro", 4);
        //empiezan las salidas de un coche c
        System.out.println("COCHE C");
        c.arrancar();
        c.frenar();
        System.out.println(c.getColor());
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getModeloMarca());
        System.out.println(c.getNumero_puertas());

        //empiezan las salidas de una furgoneta d
        System.out.println("FURGO D");
        d.arrancar();
        d.frenar();
        System.out.println(d.getColor());
        System.out.println(d.getMarca());
        System.out.println(d.getModelo());
        System.out.println(d.getModeloMarca());
        System.out.println(d.getNumero_puertas());

        //empiezan las salidas de una furgoneta f
        System.out.println("FURGO F");
        f.arrancar();
        f.frenar();
        System.out.println(f.getColor());
        System.out.println(f.getMarca());
        System.out.println(f.getModelo());
        System.out.println(f.getModeloMarca());
        System.out.println(f.getNumero_puertas());

    }


}