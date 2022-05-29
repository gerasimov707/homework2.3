package compass;

public class Bicycle extends WheelableTransport implements Service {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("menyem pokrishky");}
        @Override
        public void check() {
            System.out.println("obslyzivaem " + getModelName());
            for (int i = 0; i <getWheelsCount(); i++) {
                updateTyre();
            }
        }
    }

