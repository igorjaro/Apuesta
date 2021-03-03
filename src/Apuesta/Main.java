package Apuesta;

public class Main
{

  public static void main(String[] args)
  {
    Apuesta miApuesta;
    int mi_dinero;

     miApuesta = new Apuesta(1000, 4, 2);//4,2
    try
    {
      System.out.println("Apostando...");
      miApuesta.apostar(50);//dinero que voy a apostar
    }
    catch (Exception e)
    {
      System.out.println("Fallo al realizar la Apuesta");
    }

    try
    {
      System.out.println("Intento cobrar apuesta segun el resultado del partido ");
      miApuesta.cobrar_apuesta(3, 4);//3,4 a provar
    }
    catch (Exception e)
    {
      System.out.println("Fallo al cobrar la apuesta");
    }
    mi_dinero = miApuesta.getDinero_disp();
    System.out.println("El dinero que tengo tras las apuestas es " + mi_dinero);
  }
}
