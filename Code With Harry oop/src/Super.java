class first{
    int a;
    first(int a){
        this.a=a;
        System.out.println("I am a constructor of class 1");
    }
}
class second extends first{
    int b;
    second(int b){
        super(b);
        System.out.println("I am a constructor of class 2");

    }
}

public class Super {
    public static void main(String[] args){
        second s2 = new second(1234);
        System.out.println(s2.a+" "+s2.b);

    }
}
