package com.parking_lot.parking_lot.dto;

import com.parking_lot.parking_lot.enums.VehicleType;
import com.parking_lot.parking_lot.utils.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j
public class ParkingSpot {
    private final String id;
    private boolean isEmpty = true;
    private Vehicle vehicle;
    private final int price;
    private final VehicleType allowedVehicleType;

    public boolean isCompatible(Vehicle vehicle) {
        return this.allowedVehicleType == vehicle.getVehicleType();
    }

    public void parkVehicle(Vehicle v) {
        if(Objects.isNull(v)) return;
        if(!this.isEmpty()) {
            log.error("Spot id: {} is already Occupied", this.getId());
            return;
        }
        if(!isCompatible(v)) {
            log.error("Vehicle v: {} is not Compatible to the Parking Spot Type", JsonUtil.convertObjToJson(v));
            return;
        }
        this.vehicle = v;
        this.isEmpty = false;
        log.info("VehicleNumber: {} parked in Parking Spot id: {}", v.getVehicleType(), this.getId());
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }
}
