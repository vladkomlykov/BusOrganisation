import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class BusStop {

    public BusStop(String address) {
        this.address = address;
    }

    public BusStop(){

    }

    private String address;

    public String getAddress() {

        return address;
    }
    public List<BusStop> busStop = new ArrayList<>();

   public void pullBusStop225() {
        BusStop busStop1 = new BusStop("Метро Купчино");
        BusStop busStop2 = new BusStop("Малая Балканская д.30");
        BusStop busStop3 = new BusStop("Купчинская");
        BusStop busStop4 = new BusStop("Малая Балканская (ул. Будапештская)");
        BusStop busStop5 = new BusStop("Будапештская (ул. Олеко Дундича)");
        busStop.add(busStop1);
        busStop.add(busStop2);
        busStop.add(busStop3);
        busStop.add(busStop4);
        busStop.add(busStop5);

    }
    public void pullBusStop46() {
       BusStop busStop1 = new BusStop("Вазаский пер.");
        BusStop busStop2 = new BusStop("Вазаский пер.");
        BusStop busStop3 = new BusStop("Вазаский пер.");
        BusStop busStop4 = new BusStop("Вазаский пер.");
        BusStop busStop5 = new BusStop("Вазаский пер.");
        busStop.add(busStop1);
        busStop.add(busStop2);
        busStop.add(busStop3);
        busStop.add(busStop4);
        busStop.add(busStop5);
    }

    public void pullBusStop21() {
       BusStop busStop1 = new BusStop("Финляндский вокзал. Метро Площадь Ленина");
        BusStop busStop2 = new BusStop("Финляндский вокзал, Метро Площадь Ленина, Комсомола");
        BusStop busStop3 = new BusStop("Чайковского");
        BusStop busStop4 = new BusStop("Кирочная");
        BusStop busStop5 = new BusStop("Метро Чернышевская");
        busStop.add(busStop1);
        busStop.add(busStop2);
        busStop.add(busStop3);
        busStop.add(busStop4);
        busStop.add(busStop5);
   }
}