public class MainTest {

    public static void main(String[] args){

        assert calcular(100)==118;

        assert calcular(200)==212.4;

        System.out.println("Pruebas correctas");

    }

    public static double calcular(double precio){

        if(precio>100){

            precio=precio*0.90;

        }

        return precio*1.18;

    }

}