class Circle{
    int radius;
    Circle(int r){
        this.radius=r;
    }
}

class Cylinder extends Circle{
    int height;
    Cylinder(int c,int r){
        super(c);
        this.radius=r;
    }
}

class Rectangle{
    int a,b;
    Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
}

class Cuboid{
    int a;

}

public class Chapter10Practice {
    public static void main(String[] args) {

    }
}
