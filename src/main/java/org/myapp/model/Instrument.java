package org.myapp.model;

public enum Instrument {
    BOND("облигация"),
    SHARE("акция"),
    CURRENCY("валюта"),
    ETF("фонд"),
    FEATURES("фьючерс");

    private final String description;

    Instrument(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
