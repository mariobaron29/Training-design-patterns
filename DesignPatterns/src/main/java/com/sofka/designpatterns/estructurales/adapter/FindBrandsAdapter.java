package com.sofka.designpatterns.estructurales.adapter;

import java.util.List;

public class FindBrandsAdapter extends Adapter<BrandRequest, BrandResponse> {

    Service service = new Service();
    private Object resp;
    @Override
    public void request(BrandRequest payload) {
        resp = service.call(payload);
    }

    @Override
    public BrandResponse response() {
        return  new BrandResponse((List<String>)resp);
    }
}
