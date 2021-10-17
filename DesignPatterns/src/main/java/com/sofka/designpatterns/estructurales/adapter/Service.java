package com.sofka.designpatterns.estructurales.adapter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    public  Object call(BrandRequest req){
        Map<String, List<String>> brandsByType = new HashMap<>();
        brandsByType.put("Hatchback", Arrays.asList("Kia", "Mazda", "Honda"));
        brandsByType.put("Sedan", Arrays.asList("Kia", "Toyota"));
        brandsByType.put("Sports car", Arrays.asList("Jaguar", "Porsche", "Lamborghini", "Mazda"));

        return brandsByType.get(req.getType());
    }

}
