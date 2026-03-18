import java.util.Scanner;

public class HolaMundoTest {

    @Test
    public void testMain() {
        HolaMundo holaMundo = new HolaMundo();
        holaMundo.main(null);
        System.out.println("¡Hola, Mundo!");
    }

}