package org.myapp.model;

import lombok.Data;

@Data
public class Bond {
    private String figi;
    private String ticker;
    private Integer lot;
    private String name;
    private Boolean buy_available_flag;
    private Boolean sell_available_flag;
}
