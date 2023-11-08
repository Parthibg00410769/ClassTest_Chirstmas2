package com.example.warehouseservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class getWarehouseById {
    private int warehouseId;
    private String location;
    private int capacity;

}
