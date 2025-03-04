package proyecto_transporte.src.transporte;

public final class Avion extends Vehiculo implements ConMotor {
  public void encenderMotor(){
      System.out.println("El motor esta encendido");
  }
      public Avion(int velocidadmaxima){
          super(velocidadmaxima);

      }
      public void descripcion(){
          System.out.println("Soy un avion que puede alcanzar " +velocidadmaxima+" km/h");
       }



}
