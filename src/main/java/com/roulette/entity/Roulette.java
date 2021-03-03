package com.roulette.entity;

import javax.persistence.Id;

public class Roulette {

  @Id
  public Long id;
  public int winner;
  public boolean open;
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
   * @return the winner
   */
  public int getWinner() {
    return winner;
  }
  /**
   * @param winner the winner to set
   */
  public void setWinner(int winner) {
    this.winner = winner;
  }
  /**
   * @return the open
   */
  public boolean isOpen() {
    return open;
  }
  /**
   * @param open the open to set
   */
  public void setOpen(boolean open) {
    this.open = open;
  }
  
  public Roulette() {
    super();
  }
  
  
}
