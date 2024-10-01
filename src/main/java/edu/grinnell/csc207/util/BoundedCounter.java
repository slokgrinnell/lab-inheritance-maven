package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter{

  final int bound;

  public BoundedCounter(int start, int bound) {
    super(start);
    this.bound = bound;
  }

  @Override
  public void increment() throws Exception{
    if(this.count+1 > bound) { 
      throw new Exception("Count exceeds bound");
    }
    this.count++;
  }
  
}
