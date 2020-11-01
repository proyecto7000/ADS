package Ejercicio_1;


public class TipoDeCambioDiario {

    //Atributos de privados tipo double
    private double aDolares;
    private double aEuros;
    private double aYenes;

    private static TipoDeCambioDiario instancia;
    private TipoDeCambioDiario(){
        
    }
    public static TipoDeCambioDiario getInstancia() {
			if(instancia == null) {
				instancia = new TipoDeCambioDiario();
			}
			return instancia;
		}

    //Metodos publicos
    public  double convertirDolaresASoles(Double dolares) {
        System.out.println("3.14");
        return 3.14;
    }

    public double convertirEurosASoles(Double dolares) {
        System.out.println("3.50");
        return 3.50;
    }

    public double convertirYenesASoles(Double dolares) {
        System.out.println("2.50");
        return 2.50;
    }

}
