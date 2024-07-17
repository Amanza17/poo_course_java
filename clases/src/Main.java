//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creamos una persona y aplicaos los distintos métodos creados
       Persona p = new Persona("Juan", "Perez", 5, "rojo", "verde", 1);
       System.out.println(p.getNombre());
        System.out.println(p.getApellido());
        System.out.println(p.getEdad());
        System.out.println(p.getColor_ojos());
        System.out.println(p.getColor_pelo());
        System.out.println(p.getSexo());

       p.dormir();
       p.comer();
       p.respirar();

        p.setNombre("Luis");
        p.setApellido("Gomez");
        p.setEdad(12);
        p.setColor_ojos("negro");
        p.setColor_pelo("AZUL");


        System.out.println(p.getNombre());
        System.out.println(p.getApellido());
        System.out.println(p.getEdad());
        System.out.println(p.getColor_ojos());
        System.out.println(p.getColor_pelo());
        System.out.println(p.getSexo());



    }
}