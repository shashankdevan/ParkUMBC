package model;

public class Entry {
	private double latitude;
	private double longitude;
	private long parking_lot_id;
	private long is_parked;

    public Entry(double latitude, double longitude, long parking_lot_id, long is_parked) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.parking_lot_id = parking_lot_id;
        this.is_parked = is_parked;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public long getParkingLotId() {
        return parking_lot_id;
    }

    public long getParkingStatus() {
        return is_parked;
    }
}