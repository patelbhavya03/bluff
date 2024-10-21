class ShapeArea {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public int calculateArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();
        System.out.println("Area of Circle: " + shapeArea.calculateArea(5.0));
        System.out.println("Area of Triangle: " + shapeArea.calculateArea(4.0, 6.0));
        System.out.println("Area of Square: " + shapeArea.calculateArea(3));
    }
}
