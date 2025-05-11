package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Page<Item> getPagedItems(int page, int size) {
        return itemRepository.findAll(PageRequest.of(page, size));
    }

    public Item saveItem(Item item) {
        // 设置创建时间为当前时间
        item.setCreateTime(java.time.LocalDateTime.now());
        return itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    public Item updateItem(Long id, Item item) {
        Item existingItem = itemRepository.findById(id).orElse(null);
        if (existingItem != null) {
            item.setId(id);
            return itemRepository.save(item);
        }
        return null;
    }
}