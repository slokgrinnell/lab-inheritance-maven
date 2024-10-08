package edu.grinnell.csc207.experiments;

// import edu.grinnell.csc207.util.Counter;
// import edu.grinnell.csc207.util.BasicCounter;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.BasicCounter;
import edu.grinnell.csc207.util.BoundedCounter;
import edu.grinnell.csc207.util.Counter;
import edu.grinnell.csc207.util.DblCtr;
import edu.grinnell.csc207.util.NamedCounter;


/**
 * Some experiments as we explore our various Counter classes.
 */
public class CounterExperiments {
  /**
   * Run our experiments.
   *
   * @param args
   *   The command-line arguments. Ignored.
   */
  public static void main(String[] args) throws Exception {
    // Set up output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Set up some counters
    //Counter alpha = new BasicCounter(0);
    //Counter alpha = new Tally();
    Counter alpha = new NamedCounter("alfa", 0);
    //Counter beta = new BasicCounter(123);
    //Counter beta = new DoubleCounter(123);
    Counter beta = new DblCtr(new BasicCounter(0));
    // DecrementableCounter gamma = new DecrementableCounter(-5);
    BasicCounter gamma = new BoundedCounter(-5,3);


    // Print original values
    pen.println("Original alpha = " + alpha);
    pen.println("Original beta = " + beta);
    pen.println("Original gamma = " + gamma);
  
    // Print incremented values
    alpha.increment();
    beta.increment();
    gamma.increment();
    pen.println("Updated alpha = " + alpha);
    pen.println("Updated beta = " + beta);
    pen.println("Updated gamma = " + gamma);

    gamma.reset();
    pen.println("After resetting gamma: " + gamma);
    // gamma.decrement();
    // pen.println("After decrementing gamma: " + gamma);

    // And we're done
    pen.close();
  } // main(String[])
} // class CounterExperiments
