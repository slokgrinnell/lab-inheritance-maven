package edu.grinnell.csc207.util;

/**
 * Things that count twice.
 */
public class DblCtr implements Counter {
  /**
   * The underlying counter.
   */
  Counter base;

  /**
   * Build a new counter that counts twice as fast as counter.
   *
   * @param counter
   *   The underlying objet we use for counting.
   */
  public DblCtr(Counter counter) {
    this.base = counter;
  } // DblCtr(Counter)

  /**
   * Increment the counter, twice.
   */
  @Override
  public void increment() throws Exception  { 
    this.base.increment();
    this.base.increment();
  } // increment()

  /**
   * Reset the counter.
   */
  @Override
  public void reset() {
    this.base.reset();
  } // reset()

  /**
   * Get the value.
   *
   * @return
   *   The counter value.
   */
  @Override
  public int get() {
    return this.base.get();
  } // get()

  /**
   * Convert to a string.
   *
   * @return
   *   The counter as a string
   */
  @Override
  public String toString() {
    return this.base.toString();
  } // toString()
} // class DblCtr