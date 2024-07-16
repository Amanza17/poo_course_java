//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Jose Luis Perez", 424542, 23.23, 2568);
        c.pagar(12.3);
        c.pagar(25);

        //c.nombre();
      //  c.saldo();
        /* si eliminamos las dobles barras de las dos sentencias anteriores vemos como nos sale la linea roja
        de fallo, esto se debe a que estamos intentando acceder a atributos privados, lo que nos hemos asegurado que no
        sea posible

         */
    }
}