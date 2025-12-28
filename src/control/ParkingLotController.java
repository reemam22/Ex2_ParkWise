package control;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import entity.ParkingLot;
import entity.Vehicle;
import utils.JSONLoader;

public class ParkingLotController {
    public List<ParkingLot> getParkingLots() { return null; }
    public void updateParkingLot(ParkingLot lot) {}
    public void handleArrival(Vehicle vehicle) {}
    public void handleDeparture(String vehicleId) {}
    
    public List<ParkingLot> loadParkingLotsFromJSON() {
        List<ParkingLot> lots = new ArrayList<>();

        String jsonStr = JSONLoader.loadJSON("resources/sample_data.json");
        JSONObject root = new JSONObject(jsonStr);
        JSONArray jsonLots = root.getJSONArray("parkingLots");

        for (int i = 0; i < jsonLots.length(); i++) {
            JSONObject obj = jsonLots.getJSONObject(i);

            ParkingLot lot = new ParkingLot();
            lot.setLotID(obj.getInt("LotID"));
            lot.setLotName(obj.getString("LotName"));
            lot.setAddress(obj.getString("Address"));
            lot.setCity(obj.getString("City"));
            lot.setAvailableSpaces(obj.getInt("AvailableSpaces"));

            lots.add(lot);
        }

        return lots;
    }
}
