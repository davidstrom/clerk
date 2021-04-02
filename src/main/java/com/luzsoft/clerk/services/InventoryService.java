package com.luzsoft.clerk.services;

import com.luzsoft.clerk.api.model.ItemCategory;
import com.luzsoft.clerk.api.model.ShopItem;
import com.luzsoft.clerk.data.PackagedItemRepository;
import com.luzsoft.clerk.data.WeightItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InventoryService {

    @Autowired
    PackagedItemRepository unitItemRepository;
    @Autowired
    WeightItemRepository weightItemRepository;

    public ShopItem getShopItem(String itemCode) {

        return null;
    }

    public ShopItem storeShopItem(ShopItem item) {
        return null;
    }

    public List<ShopItem> getAllItemsByCategory(ItemCategory itemCategory) {
        return null;
    }
}
