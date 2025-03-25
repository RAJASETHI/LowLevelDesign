package com.parking_lot.parking_lot.dto;

import com.parking_lot.parking_lot.enums.VehicleType;
import lombok.Data;

@Data
public class TwoWheelerParkingSpot extends ParkingSpot{
    private static final int TWO_WHEELER_PRICE = 50;
    public TwoWheelerParkingSpot(String id, int price) {
        super(id, price, VehicleType.TWO_WHEELER);
    }
}
