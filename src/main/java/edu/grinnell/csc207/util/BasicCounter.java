package edu.grinnell.csc207.util;

public class BasicCounter implements Counter{
  int count;
  final int start;
  /**
   * Count something.
   *
   * @throws Exception
   *   When the count gets too large.
   */
  public void increment() throws Exception {
    if(this.count == Integer.MAX_VALUE) { 
      throw new Exception("Value too big");
    }
    this.count++;
  }

  /**
   * Reset the counter.
   */
  public void reset() { 
    this.count = this.start;
  }

  /**
   * Get the value of the counter.
   *
   * @return the current value of the counter
   */
  public int get() { 
    return this.count;
  }

  public BasicCounter(int start) { 
    this.start = start;
    this.count = this.start;
  }

  public String toString() { 
    return "[" + this.count + "]";
  }
}
