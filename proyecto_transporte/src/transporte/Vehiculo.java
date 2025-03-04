package proyecto_transporte.src.transporte;


abstract class Vehiculo {
  public Vehiculo (int velocidadmaxima){
  
      this.velocidadmaxima = velocidadmaxima;
  
  
  }
  public int velocidadmaxima;
  
      public void  arrancar(){
  
          System.out.println("el vehiculo está en marcha");
  
      } 
  
      
  abstract void descripcion();
  
  
  }