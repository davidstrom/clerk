package com.luzsoft.clerk.api.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class ShopItem {

    private String name;
    private String itemCode;
    private ItemCategory category;
    private Integer units;
    private Float weight;
    private Integer price;
    private boolean packaged;


}
