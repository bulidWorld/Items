package cn.com.auction.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "auc_item")
public class Bid {

    @Id
    @GeneratedValue
    protected Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    protected Item item;

    @Column(updatable = false)
    @NotNull
    protected Date createdOn;

    @NotNull
    @Column(updatable = false)
    protected BigDecimal amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Bid(Item item, Date createdOn, BigDecimal amount) {
        this.item = item;
        this.createdOn = createdOn;
        this.amount = amount;
    }
}
