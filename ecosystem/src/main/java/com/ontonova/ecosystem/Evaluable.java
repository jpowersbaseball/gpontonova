package com.ontonova.ecosystem;

public interface Evaluable {

  /**
   * The core requirements for an organism in the ecosystem
   */
   
  public String evaluateAsString();
  
  public double evaluateAsNumber();
  
  public boolean evaluateAsBoolean();
  
  public String getNaturalType();
  
  public void populate();
}
