package view;

import control.ParkingLotController;
import entity.ParkingLot;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkingLotController controller = new ParkingLotController();

        List<ParkingLot> lots = controller.loadParkingLotsFromJSON();

        for (ParkingLot lot : lots) {
            System.out.println(
                lot.getLotID() + " - " +
                lot.getLotName() + " (" +
                lot.getCity() + ")"
            );
        }
    }
}