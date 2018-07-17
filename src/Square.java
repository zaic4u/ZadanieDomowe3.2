public class Square {

    double side;

    Square(double s) {
        side = s;
    }

    double squareArea() {
        double area = side * side;
        return area;
    }

    double squarePerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }
}
