package etelfutar.logic.model;

import etelfutar.logic.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Order extends BaseEntity {

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private boolean done;

    @Column(nullable = false)
    private Status status;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private User user;

    @OneToOne
    @JoinColumn(name = "food_id")
    private Food food;


  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Food getFood() {
    return food;
  }

  public void setFood(Food food) {
    this.food = food;
  }
}
