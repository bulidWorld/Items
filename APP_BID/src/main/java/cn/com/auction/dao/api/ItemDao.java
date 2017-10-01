package cn.com.auction.dao.api;

import cn.com.auction.entity.Item;
import cn.com.auction.entity.ItemBidSummary;
import cn.com.common.dao.api.GenericDAO;

import java.util.List;

public interface ItemDao extends GenericDAO<Item, Long>{

    List<Item> findAll(boolean withBids);

    List<Item> findByName(String name, boolean substring);

    List<ItemBidSummary> findItemBidSummaries();

}
