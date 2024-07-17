
public class Main {
    public static void main(String[] args) {
        Coche c = new Coche("Renault", "r5", "verde", 5);

        Furgoneta f = new Furgoneta("Mercedes", "Vito", "negro", 4);
        //empiezan las salidas de un coche c
        System.out.println("COCHE C");
        c.arrancar();
        c.frenar();
      //c.intermitentes();//si quitamos las dos primeras // nos damos cuenta que no funciona, es porque ntermitente es unico de furgo
        System.out.println(c.getColor());
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getModeloMarca());
        System.out.println(c.getNumero_puertas());


        //empiezan las salidas de una furgoneta f
        System.out.println("FURGO F");
        f.arrancar();
        f.frenar();
        f.intermitentes();
        System.out.println(f.getColor());
        System.out.println(f.getMarca());
        System.out.println(f.getModelo());
        System.out.println(f.getModeloMarca());
        System.out.println(f.getNumero_puertas());

    }


}