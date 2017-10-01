package cn.com.auction.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ItemBidSummary {

    private Long itemId;

    private Date aucEnd;

    private BigDecimal highestBid;

    private String name;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Date getAucEnd() {
        return aucEnd;
    }

    public void setAucEnd(Date aucEnd) {
        this.aucEnd = aucEnd;
    }

    public BigDecimal getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(BigDecimal highestBid) {
        this.highestBid = highestBid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

