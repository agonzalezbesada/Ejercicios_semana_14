public class Triangulo extends Trigono implements Forma{

    private double lado1;

    private double lado2;

    private double lado3;

    Triangulo() {

    }

    public void dibujar_puntos() {
        System.out.println("Dibujar puntos triangulo");
    }
    public void rellenar_forma() {
        System.out.println("Rellenar forma triangulo");
    }
    public double calcular_area() {
        double area = 0; // Por completar (compleja)
        System.out.println(area);
        return area;
    }
    public double calcular_perimetro() {
        double perimetro = lado1 + lado2 + lado3;
        System.out.println(perimetro);
        return perimetro;
    }

}
