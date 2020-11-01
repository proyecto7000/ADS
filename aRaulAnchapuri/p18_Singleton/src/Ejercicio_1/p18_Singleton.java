package Ejercicio_1;


public class p18_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaCorriente raul = new CuentaCorriente();
        CuentaCorriente Profesor = new CuentaCorriente();
        //
        TipoDeCambioDiario cambio = TipoDeCambioDiario.getInstancia();
        cambio.convertirDolaresASoles(1.0);
        cambio.convertirEurosASoles(2.0);
        cambio.convertirYenesASoles(3.50);
    }
    
}
