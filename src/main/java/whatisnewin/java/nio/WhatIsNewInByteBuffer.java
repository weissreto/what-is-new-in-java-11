package whatisnewin.java.nio;

import java.nio.ByteBuffer;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ByteBuffer}
 * that were newly introduced in Java versions 11.<br>
 *
 * {@link ByteBuffer} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see ByteBuffer
 */
public final class WhatIsNewInByteBuffer
{
  /**
   * Example call to new method {@link ByteBuffer#mismatch}
   * @since 11
   * @see ByteBuffer#mismatch
   */
  public int mismatch(ByteBuffer that)
  {
    ByteBuffer testee = $$$();

    int result = testee.mismatch(that);
    return result;
  }

  private ByteBuffer $$$()
  {
    return null;
  }
}