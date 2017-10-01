package cn.com.auction.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity(name = "auc_item")
public class Item implements Serializable{

    @Id
    @GeneratedValue
    protected Long id;

    @NotNull
    @Size(max = 255)
    protected String name;

    @Size(max = 4000)
    protected String description;

    @Future
    @NotNull
    protected Date endDate;

    @OneToMany(mappedBy = "item")
    protected Set<Bid> bids;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
