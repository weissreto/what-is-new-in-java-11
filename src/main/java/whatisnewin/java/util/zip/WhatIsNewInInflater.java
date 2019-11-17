package whatisnewin.java.util.zip;

import java.util.zip.Inflater;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Inflater}
 * that were newly introduced in Java version 11.<br>
 *
 * {@link Inflater} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see Inflater
 */
public final class WhatIsNewInInflater
{
  /**
   * Example call to new method {@link Inflater#setInput(ByteBuffer)}.
   * @since 11
   * @see Inflater#setInput(ByteBuffer)
   */
  public void setInput(ByteBuffer input)
  {
    Inflater testee = $$$();

    testee.setInput(input);
  }

  /**
   * Example call to new method {@link Inflater#setDictionary(ByteBuffer)}.
   * @since 11
   * @see Inflater#setDictionary(ByteBuffer)
   */
  public void setDictionary(ByteBuffer dictionary)
  {
    Inflater testee = $$$();

    testee.setDictionary(dictionary);
  }

  /**
   * Example call to new method {@link Inflater#inflate(ByteBuffer)}.
   * @since 11
   * @see Inflater#inflate(ByteBuffer)
   */
  public int inflate(ByteBuffer output) throws DataFormatException
  {
    Inflater testee = $$$();

    int result = testee.inflate(output);
    return result;
  }

  private Inflater $$$()
  {
    return null;
  }
}
