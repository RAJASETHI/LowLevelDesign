package com.parking_lot.parking_lot.dto;

import lombok.Data;

@Data
public class TwoWheelerParkingSpot extends ParkingSpot{
    private static final int TWO_WHEELER_PRICE = 50;
    public TwoWheelerParkingSpot(int id, int price) {
        super(id, price);
    }
}
