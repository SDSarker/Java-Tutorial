class phone{
    public void on(){
        System.out.println("Phone is turning on");
    }

    public void showTime(){
        System.out.println("The time is 8 am");
    }
}

class smartphone extends phone{
    public void on(){
        System.out.println("SmartPhone is turning on");
    }

    public void music(){
        System.out.println("Kaise tu gun gunaye muskuraye");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args){
        phone s1 = new smartphone();
        s1.on();
        //s1.music();    will be error
    }

}
