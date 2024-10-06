package com.example.demo.controller;

import com.example.demo.dto.InventoryDTO;
import com.example.demo.model.Inventory;
import com.example.demo.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/getitems")
    public List<InventoryDTO> getItems() {
        return inventoryService.getAllItems();
    }

    @PostMapping("/additem")
    public InventoryDTO saveItem(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.saveItem(inventoryDTO);
    }


}
