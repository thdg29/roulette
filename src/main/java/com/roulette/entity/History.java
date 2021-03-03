package com.roulette.entity;

import javax.persistence.Id;

public class History {

  @Id
  public Long idRoulette;
  public int result;
  /**
   * @return the idRoulette
   */
  public Long getIdRoulette() {
    return idRoulette;
  }
  /**
   * @param idRoulette the idRoulette to set
   */
  public void setIdRoulette(Long idRoulette) {
    this.idRoulette = idRoulette;
  }
  /**
   * @return the result
   */
  public int getResult() {
    return result;
  }
  /**
   * @param result the result to set
   */
  public void setResult(int result) {
    this.result = result;
  }
  public History() {
    super();
  }
  
  
}
