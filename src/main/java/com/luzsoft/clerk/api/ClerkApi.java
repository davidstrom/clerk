package com.luzsoft.clerk.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luzsoft.clerk.api.model.ItemCategory;
import com.luzsoft.clerk.api.model.ShopItem;
import com.luzsoft.clerk.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("inventory/")
public class ClerkApi {

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private ObjectMapper jsonSchemaObjectMapper;

    @GetMapping(value = "items/{itemCode}", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ShopItem getShopItem(@PathVariable String itemCode) {
        return inventoryService.getShopItem(itemCode);
    }

    public List<ShopItem> getItemsByCategory(String category) {
        final ItemCategory itemCategory = ItemCategory.valueOf(category);
        return inventoryService.getAllItemsByCategory(itemCategory);
    }

    @PostMapping(value = "items", produces = "application/json")
    public ShopItem addItem(@RequestBody String item) throws JsonProcessingException {
        final ShopItem shopItem = jsonSchemaObjectMapper.readValue(item, ShopItem.class);
        return inventoryService.storeShopItem(shopItem);
    }



}
