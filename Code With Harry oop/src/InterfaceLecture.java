interface Bicycle{
    void apply_brake(int n);
    void speed_up(int increment);
}

class Honda implements Bicycle{
    int speed =10;

    @Override
    public void apply_brake(int n) {
        speed = speed-n;
    }

    @Override
    public void speed_up(int increment) {
        speed+=increment;
    }
}

public class InterfaceLecture {
}
