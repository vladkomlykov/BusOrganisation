
import java.util.*;

public class Route {
    BusStop busStop = new BusStop();
    public Route() {
    }

    private Map<Integer, List<BusStop>> routes = new HashMap();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер автобуса: \n 1. 225 \n 2. 46 \n 3. 21");
        String select = scanner.nextLine();

        switch (select) {
            case "1" -> print225();
            case  "2" -> print46();
            case  "3" -> print21();
        }
    }

    private void print21() {
        Bus bus = new Bus(21);
        IntervalOfRoute intervalOfRoute = new IntervalOfRoute();
        busStop.pullBusStop21();
        for (int i = 0; i < 5; i++) {
            routes.put(i,busStop.busStop);
            System.out.println(bus.getNumberOfBus() + " " + routes.get(i).get(i).getAddress()
            + " автобус приедет в " + intervalOfRoute.roteTime());
        }
    }


    private void print225() {
        Bus bus = new Bus(225);
        IntervalOfRoute intervalOfRoute = new IntervalOfRoute();
        busStop.pullBusStop225();
        for (int i = 0; i < 5; i++) {
            routes.put(i, busStop.busStop);
            System.out.println(bus.getNumberOfBus() + " " + routes.get(i).get(i).getAddress()
                    + " автобус приедет в " + intervalOfRoute.roteTime());
        }
    }
    private void print46() {
        Bus bus = new Bus(46);
        IntervalOfRoute intervalOfRoute = new IntervalOfRoute();
        busStop.pullBusStop46();
        for (int i = 0; i < 5; i++) {
            routes.put(i,busStop.busStop);
            System.out.println(bus.getNumberOfBus() + " " + routes.get(i).get(i).getAddress()
            + " автобус приедет в " + intervalOfRoute.roteTime());
        }
    }
}