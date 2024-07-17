public class Persona {
    //estos son los atributos de las personas
    private String nombre;
    private String apellido;
    private int edad;
    private String color_pelo;
    private String color_ojos;
    private int sexo; //(1 hombre / 0 mujer)

    //constructor de una persona, es lo que hace falta para incializarla
    public Persona(String n, String a, int ed, String cp, String co, int s) {
        nombre = n;
        apellido = a;
        edad = ed;
        color_pelo = cp;
        color_ojos = co;
        sexo = s;

    }
    //todas las funciones get devuelven el atributo escrito, y las set lo configuran
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getColor_pelo() {
        return color_pelo;
    }
    public String getColor_ojos() {
        return color_ojos;
    }
    public int getSexo() {
        return sexo;
    }
    public void setNombre(String n) {
        nombre = n;
    }
    public void setApellido(String a) {
        apellido = a;
    }
    public void setEdad(int e) {
        edad = e;
    }
    public void setColor_pelo(String cp) {
        color_pelo = cp;
    }
    public void setColor_ojos(String c) {
        color_ojos = c;
    }
    public void setSexo(int s) {
        sexo = s;
    }

    //estos métodos son las funciones básicas de una persona
    public void respirar(){
        System.out.println("Respirando " );

    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public void dormir(){
        System.out.println("Durmiendo");
    }
}
