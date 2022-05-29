package compass;

public class Truck extends WheelableTransport implements Service{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("menyem pokrishky");
    }

    public void checkEngine() {
        System.out.println("proveryem dvigatel");
    }

    public void checkTrailer() {
        System.out.println("proveryem pricep");
    }
    @Override
    public void check() {
        System.out.println("obslyzivaem" + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
