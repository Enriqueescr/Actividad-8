package proyecto_transporte.src.app;
import proyecto_transporte.src.transporte.*;

public class Main{
    public static void main (String[] args)  {
        Coche cocheKike = new Coche(180);
        cocheKike.arrancar();
        cocheKike.encenderMotor();
        cocheKike.descripcion();

        Bicicleta BicicletaKike = new Bicicleta(30);
        BicicletaKike.arrancar();
        BicicletaKike.fuezaHumana();
        BicicletaKike.descripcion();

        Barco barcoKike = new Barco(50);
        barcoKike.arrancar();
        barcoKike.encenderMotor();
        barcoKike.descripcion();

        Avion avionKike = new Avion(900);
        avionKike.arrancar();
        avionKike.encenderMotor();
        avionKike.descripcion();


    }
}
