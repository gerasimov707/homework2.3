package compass;

public class ServiceStation {
    /*public void check(Car car){
        System.out.println("obslyzivaem " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }
    public void check(Bicycle bicycle){
        System.out.println("obslyzivaem " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public void check(Truck truck){
        System.out.println("obslyzivaem" + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }*/
    public void check(Service service) {
        service.check();
    }
}
