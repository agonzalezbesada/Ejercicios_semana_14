import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);


        Cuadrado cuadrado1 = new Cuadrado();
        Rectangulo rectangulo1 = new Rectangulo();
        Triangulo tringulo1 = new Triangulo();


        Forma[] arrayFormas = new Forma[3];
        arrayFormas[0] = cuadrado1;
        arrayFormas[1] = rectangulo1;
        arrayFormas[2] = tringulo1;

        arrayFormas[0].rellenar_forma();
        arrayFormas[1].rellenar_forma();
        arrayFormas[2].rellenar_forma();


        /*

        // Para hacerlo mediante usuario

        System.out.println("Elija una figura"+"\n"+"1. Cuadrado"+"\n"+"2. Rectángulo"+"\n"+"3. Triángulo"+"\n"+"0. SALIR");
        int eleccion = guardar.nextInt();

        switch (eleccion) {

            case 1:
                Punto p1cuad = new Punto();
                Punto p2cuad = new Punto();
                Punto p3cuad = new Punto();
                Punto p4cuad = new Punto();
                Cuadrado cuadrado1 = new Cuadrado();
                break;

            case 2:
                Punto p1rect = new Punto();
                Punto p2rect = new Punto();
                Punto p3rect = new Punto();
                Punto p4rect = new Punto();
                Rectangulo rectangulo1 = new Rectangulo();
                break;


            case 3:


                break;


            default:


        }
         */

    }
}