public class Cuenta {
    //lo primero que debemos configurar como atributos son los datos que tiene el banco sobre nosotros
    private String nombre;
    private int numeroDeCuenta;
    private double saldo;
    private int pin;
    //como vemos todos estos atributos son públicos, es decir, fuera del código de esta clase no puede acceder nadie

    public Cuenta(String nombre, int numeroDeCuenta, double saldo, int pin) {
        //Este es el constructor, que inicializa una nueva cuenta. Este debe ser público, para que podamos comprobar el funcionamiento
        //pero en una situación real los datos que introduciría la empresa serían otros
        this.nombre = nombre;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.pin = pin;
    }

    private boolean canAfford(double precio){
        //como no podemos decir a la web el dinero del usuario, tenemos que darle la opción de que estudie si se puede
        //realizar el pago, por ello indica el precio que ha de pagar y se le devuelve true o false
        if (precio > saldo){
            return false;
        }
        return true;
    }


    public void pagar(double precio){
        //la funcion canAfford antes de crear esta funcion era publica, pero seguimos el principio del encpsulamiento
        //y decidimos que no es una función esttrictamente necesaria para la web, ya que se puede integrar aquí, por lo
        //que la convertimos en private
        if (canAfford(precio)){
            //si los datos son correctos (habría que hacer más en la realidad) se realiza el pago
            saldo = saldo - precio;
            System.out.println("La operación se ha realizado con éxito");
        }
        else{
            //si algo falla se devuelve este menaje de error
            System.err.println("La operación no ha podido realizarse");
        }
    }
}
