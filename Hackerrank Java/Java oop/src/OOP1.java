class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void introduce(){
        System.out.println("Color of the pen is "+this.color);
        System.out.println("Type of the pen is "+this.type);
    }

}

public class OOP1 {
    public static void main(String[] args){
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="Ballpoint";

        pen1.write();
        pen1.introduce();
    }
}
