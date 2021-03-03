package com.roulette.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  private Long id;
  private int credit;
  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }
  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }
  /**
   * @return the credit
   */
  public int getCredit() {
    return credit;
  }
  /**
   * @param credit the credit to set
   */
  public void setCredit(int credit) {
    this.credit = credit;
  }
  
  public User() {
    super();
  }
}
