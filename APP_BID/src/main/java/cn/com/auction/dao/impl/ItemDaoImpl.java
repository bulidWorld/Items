package cn.com.auction.dao.impl;

import cn.com.auction.dao.api.ItemDao;
import cn.com.auction.entity.Item;
import cn.com.auction.entity.ItemBidSummary;
import cn.com.common.dao.impl.GenericDaoImpl;

import java.util.List;

public class ItemDaoImpl extends GenericDaoImpl<Item, Long> implements ItemDao {

    public ItemDaoImpl() {
        super(Item.class);
    }


    public List<Item> findAll(boolean withBids) {
        return null;
    }

    public List<Item> findByName(String name, boolean substring) {
        return null;
    }

    public List<ItemBidSummary> findItemBidSummaries() {
        return null;
    }
}
