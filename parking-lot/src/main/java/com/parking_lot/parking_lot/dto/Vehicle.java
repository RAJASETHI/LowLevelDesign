package com.parking_lot.parking_lot.dto;

import com.parking_lot.parking_lot.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;
}
