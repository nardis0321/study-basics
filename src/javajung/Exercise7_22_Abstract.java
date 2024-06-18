package javajung;

public class Exercise7_22_Abstract {
    /**
     * 1. Shape를 조상으로 하는 Circle , Rectangle 클래스 작성
     * 2. 면적을 구하는 메서드 작성, 테스트
     */

    double sumArea(Shape[] arr){
        double sum = 0;
        for(Shape shape : arr){
            sum += shape.calcArea();    // 다형성!
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println(new Exercise7_22_Abstract().sumArea(arr));
    }
}


class Circle extends Shape{
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double calcArea() {
        return r*r*Math.PI;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea(){
        return width*height;
    }

    boolean isSquare(){
        return this.width == this.height;
    }
}

abstract class Shape{
    Point p;

    Shape() {
        this (new Point(0,0));
    }

    Shape(Point p){
        this.p = p;
    }

    abstract double calcArea(); //도형 면적 계산해서 반환

    Point getPosition(){
        return p;
    }
    void setPosition(Point p){
        this.p = p;
    }

}

class Point{
    int x;
    int y;

    Point(){
        this(0,0);
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public  String toString(){
        return "";
    }
}