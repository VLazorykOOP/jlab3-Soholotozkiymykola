// Абстрактний клас Figure
abstract class Figure {
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);
}

// Похідний клас Rectangle (Прямокутник)
class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Прямокутник: довжина = " + length + ", ширина = " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.length, length) == 0 &&
               Double.compare(rectangle.width, width) == 0;
    }
}

// Похідний клас Circle (Коло)
class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Коло: радіус = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}

// Похідний клас Trapezium (Трапеція)
class Trapezium extends Figure {
    private double a, b, h, side1, side2;

    public Trapezium(double a, double b, double h, double side1, double side2) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return 0.5 * (a + b) * h;
    }

    @Override
    public double getPerimeter() {
        return a + b + side1 + side2;
    }

    @Override
    public String toString() {
        return "Трапеція: основи = " + a + " і " + b + ", висота = " + h;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trapezium trapezium = (Trapezium) obj;
        return Double.compare(trapezium.a, a) == 0 &&
               Double.compare(trapezium.b, b) == 0 &&
               Double.compare(trapezium.h, h) == 0 &&
               Double.compare(trapezium.side1, side1) == 0 &&
               Double.compare(trapezium.side2, side2) == 0;
    }
}

public class lab3 {
    public static void main(String[] args) {
        // Створення масиву об'єктів типу Figure
        Figure[] figures = new Figure[3];

        // Заповнення масиву різними фігурами
        figures[0] = new Rectangle(5, 3);
        figures[1] = new Circle(4);
        figures[2] = new Trapezium(3, 5, 4, 4, 3);

        // Виведення інформації про всі фігури
        for (Figure figure : figures) {
            System.out.println(figure.toString());
            System.out.println("Площа: " + figure.getArea());
            System.out.println("Периметр: " + figure.getPerimeter());
            System.out.println("-----------------");
        }
    }
}
