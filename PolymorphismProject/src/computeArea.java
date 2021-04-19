abstract class ClosedCurve {
abstract double computeArea();
}

final class Triangle extends ClosedCurve {
final double base;
final double height;
Triangle(double base, double height){
. . .
}
double computeArea() {
return (0.5 * base * height);
}
}

final class Square extends ClosedCurve {
final double side;
Square(double side) {
this.side = side;
}
double computeArea() {
return(side*side);
}
}
final class Circle extends ClosedCurve {
final double radius;
Circle(double radius) {
this.radius = radius;
}
double computeArea() {
return (Math.PI * radius * radius);
}
}

class GeometricArea{
public static void main(String[] args) {
ClosedCurve[] objects = {new Triangle(3,3),
new Square(3),
new Circle(3)};
//compute areas
for(ClosedCurve cc : objects) {
System.out.println(cc.computeArea());
}
}
}