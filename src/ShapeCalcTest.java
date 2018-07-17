import javax.xml.transform.sax.SAXSource;

public class ShapeCalcTest {

    public static void main(String[] args) {
        Square square1 = new Square(12);
        Rectangle rectangle1 = new Rectangle(23, 11);
        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(4,2,11,12);
        ShapeCalculator calc = new ShapeCalculator();

        System.out.println("Show square info");
        System.out.println(calc.squareArea(square1));
        System.out.println(square1.squarePerimeter());

        System.out.println("Show rectangle info");
        System.out.println(calc.rectArea(rectangle1));
        System.out.println(calc.rectPerimeter(rectangle1));

        System.out.println("Show circle info");
        System.out.println(calc.circleArea(circle1));
        System.out.println(calc.circlePerimeter(circle1));

        System.out.println("Show triangle info");
        System.out.println(calc.triangleArea(triangle1));
        System.out.println(calc.trianlePerimeter(triangle1));


    }
}
