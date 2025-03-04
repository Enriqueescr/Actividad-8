package proyecto_transporte.src.transporte;



  public class Barco extends Vehiculo implements ConMotor {
    public void encenderMotor(){
        System.out.println("El motor esta encendido");
    }
        public Barco(int velocidadmaxima){
            super(velocidadmaxima);

        }
        public void descripcion(){
            System.out.println("Soy un barco que puede alcanzar " +velocidadmaxima+" km/h");
         }



}

