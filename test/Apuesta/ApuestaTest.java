package Apuesta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Igor Jaroslavecv
 */
public class ApuestaTest {
    
    public ApuestaTest() {
    }
    /**
     * Test apostar 0.
     */
    @Test
    public void testApostar0() throws Exception{
        System.out.println("\napostar 0");
        Apuesta instance = new Apuesta(1000, 4, 2);
        int dinero = 0;
        try {
            instance.apostar(dinero);
            System.out.println("==>ERROR.");
        }
        catch (Exception e) {
            //e.printStackTrace(); //imprime en output mensaje de Exception
            System.out.println(e);
            System.out.println("==>OK.");
        }
    }
    /**
     * Test apostar mas de lo que tenemos.
     */
    @Test
    public void testApostarMas() throws Exception{
        Apuesta instance = new Apuesta(1000, 4, 2);
        int dinero = 1001;
        System.out.println("\napostar "+dinero);
        try {
            instance.apostar(dinero);
            System.out.println("==>ERROR.");
        }
        catch (Exception e) {
            //e.printStackTrace(); //imprime en output mensaje de Exception
            System.out.println(e);
            System.out.println("==>OK.");
        }
    }
    /**
     * Test apostar cantidad correcta.
     */
    @Test
    public void testApostarBien() throws Exception {
        int dinero = 400;
        int dineroEsperado = 600;
        System.out.println("\napostar "+dinero);
        Apuesta instance = new Apuesta(1000, 4, 2);
        instance.apostar(dinero);//apostamos
        int dineroDisponible = instance.getDinero_disp();
        if (dineroDisponible == dineroEsperado){
            System.out.println("==> OK");
            assertTrue(true);
        }
        else {
            System.out.println("==> ERROR");
            fail ("No calcula correctamente dinero despues de apostar.");
        }
    }
    /**
     * Test cobrar_apuesta no acertada.
     * 
     */
    @Test
    public void testCobrar_apuesta_false() throws Exception{
        System.out.println("\ncobrar_apuesta no acertada");
        Apuesta instance = new Apuesta(1000, 4, 2);
        int cantidad_goles_local = 0;
        int cantidad_goles_visit = 0;
        try {
            instance.cobrar_apuesta(cantidad_goles_local, cantidad_goles_visit);
            System.out.println("==>ERROR.");
        }
        catch (Exception e) {
            //e.printStackTrace(); //imprime en output mensaje de Exception
            System.out.println(e);
            System.out.println("==>OK.");
        }
    }
    /**
     * Test cobrar_apuesta acertada.
     */
    @Test
    public void testCobrar_apuesta_ture() throws Exception {
        System.out.println("\ncobrar_apuesta acertada");
        int cantidad_goles_local = 4;
        int cantidad_goles_visit = 2;
        Apuesta instance = new Apuesta(1000, 4, 2);
        instance.cobrar_apuesta(cantidad_goles_local, cantidad_goles_visit);
        if(instance.comprobar_resultado(cantidad_goles_local, cantidad_goles_visit)==true){
            System.out.println("==> OK");
            assertTrue(true);
        }
        else {
            System.out.println("==> ERROR");
            fail ("Resultado y apuesta no corresponden.");
        }
    }
}
