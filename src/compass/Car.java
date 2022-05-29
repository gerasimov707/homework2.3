package compass;

public class Car extends WheelableTransport implements Service{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("menyem pokrishky");
    }

    public void checkEngine() {
        System.out.println("proveryem dvigatel");
    }
    @Override
    public void check() {
        System.out.println("obslyzivaem " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
        }
        checkEngine();
    }
}

