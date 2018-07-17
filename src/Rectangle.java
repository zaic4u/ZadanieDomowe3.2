public class Rectangle {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double rectArea() {
        double area = length * width;
        return area;
    }

    double rectPerimeter() {
        double perimeter = (length + width) * 2;
        return perimeter;
    }


}
