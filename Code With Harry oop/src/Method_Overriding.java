class s1{
    public void meth1(){
        System.out.println("This is method 1");
    }
}

class s2 extends s1{
    public void meth2(){
        System.out.println("This is method 2");
    }

    @Override
    public void meth1(){
        System.out.println("This is method 1 from S2");
    }
}

public class Method_Overriding {
    public static void main(String[] str){
        s2 class1=new s2();
        class1.meth2();
        class1.meth1();
    }

}
