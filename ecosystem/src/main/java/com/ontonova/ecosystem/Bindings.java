package com.ontonova.ecosystem;

import java.util.Map;
import java.util.HashMap;

public class Bindings {

  /**
   * A set of bindings available to instantiate new 0-argument Evaluables
   * 
   */
  public Bindings() {
    constantBindings = new HashMap<String, BoundEvaluable>();
    localBindings = new HashMap<String, BoundEvaluable>();
    dataBindings = new HashMap<String, BoundEvaluable>();
  }
   
  private Map<String, BoundEvaluable> constantBindings;
  private Map<String, BoundEvaluable> localBindings;
  private Map<String, BoundEvaluable> dataBindings;
  
  public void addConstantBinding(String inName, String inStrVal, double inNumVal, boolean inBoolVal) {
  }
}
