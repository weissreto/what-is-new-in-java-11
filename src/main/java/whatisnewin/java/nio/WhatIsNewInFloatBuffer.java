package whatisnewin.java.nio;

import java.nio.FloatBuffer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link FloatBuffer}
 * that were newly introduced in Java version 11.<br>
 *
 * {@link FloatBuffer} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see FloatBuffer
 */
public final class WhatIsNewInFloatBuffer
{
  /**
   * Example call to new method {@link FloatBuffer#mismatch(FloatBuffer)}.
   * @since 11
   * @see FloatBuffer#mismatch(FloatBuffer)
   */
  public int mismatch(FloatBuffer that)
  {
    FloatBuffer testee = $$$();

    int result = testee.mismatch(that);
    return result;
  }

  private FloatBuffer $$$()
  {
    return null;
  }
}
