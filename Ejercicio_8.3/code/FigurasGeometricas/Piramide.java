package FigurasGeometricas;

/**
 * Clase que representa una pirámide
 * @version 1.0/2026
 */
public class Piramide extends FiguraGeometrica {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    @Override
    public double calcularVolumen() {
        return (Math.pow(base, 2) * altura) / 3;
    }

    @Override
    public double calcularSuperficie() {
        double areaBase = Math.pow(base, 2);
        double perimetro = 4 * base;
        double areaLateral = (perimetro * apotema) / 2;
        return areaBase + areaLateral;
    }
}
