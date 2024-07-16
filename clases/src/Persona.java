public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String color_pelo;
    private String color_ojos;
    private int sexo; //(1 hombre / 0 mujer)


    public Persona(String n, String a, int ed, String cp, String co, int s) {
        nombre = n;
        apellido = a;
        edad = ed;
        color_pelo = cp;
        color_ojos = co;
        sexo = s;

    }
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
