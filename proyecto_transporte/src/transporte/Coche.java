package proyecto_transporte.src.transporte;

public class Coche extends Vehiculo implements ConMotor {
         public void encenderMotor(){
                System.out.println("El motor del coche esta encendido");

        }

                public Coche(int velocidadmaxima) {
                    super(velocidadmaxima); 


                    }

                public void descripcion(){
                    System.out.println("Soy un coche que puede alcanzar " +velocidadmaxima+" km/h");
                 }



}
