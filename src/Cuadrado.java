public class Cuadrado extends Cuadrilatero implements Forma{

    private double lado;

    Cuadrado() {

    }

    public void dibujar_puntos() {
        System.out.println("Dibuja puntos cuadrado");
    }

    public void rellenar_forma() {
        System.out.println("Rellena forma cuadrado");
    }

    public double calcular_area() {
        double area = lado * lado;
        System.out.println(area);
        return area;
    }

    public double calcular_perimetro() {
        double perimetro = (lado * 4);
        System.out.println(perimetro);
        return perimetro;
    }

}