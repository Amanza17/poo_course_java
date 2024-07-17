public class Coche {
    //definimos los atributos propios del coche
    private final int numero_puertas;
    private final String marca;
    private final String modelo;
    private final String color;


    //creamos el constructor para poder
    public Coche(String marca, String modelo, String color, int numero_puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numero_puertas = numero_puertas;

    }
    //devuelve un string con la marca y el modelo
    public String getModeloMarca() {
        String m = marca + " " + modelo;
        return m;
    }
    //devuelve un string con el color
    public String getColor() {
        return color;
    }
    //devuelve el numero de puertas
    public int getNumero_puertas() {
        return numero_puertas;
    }
    //devuelve un string con la marca
    public String getMarca() {
        return marca;

    }
    //devuelve un string con  el modelo
    public String getModelo(){
        return modelo;
    }
    //simula un arranque
    public void arrancar() {

        System.out.println("Arrancando coche");
        System.out.println("Coche arrancado");
    }

    //simula una frenada
    public void frenar(){
        System.out.println("Frenando vehículo");
        System.out.println("Vehículo frenado");
    }
}