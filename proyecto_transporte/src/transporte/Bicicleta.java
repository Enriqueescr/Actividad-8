package proyecto_transporte.src.transporte;

  public class Bicicleta extends Vehiculo implements SinMotor {
    public void fuezaHumana(){

        System.out.println("Usando fuerza humana para moverse.");
    }
    public Bicicleta(int velocidadmaxima) {
        super(velocidadmaxima); 


        }

    public void descripcion(){
        System.out.println("Soy una bicicleta que puede alcanzar " +velocidadmaxima+" km/h");
     }

}

