package whatisnewin.java.io;

import java.io.InputStream;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link InputStream}
 * that were newly introduced in Java versions 11.<br>
 *
 * {@link InputStream} is an old class but has new fields, constructors or methods
 * @since 1.0
 * @see InputStream
 */
public final class WhatIsNewInInputStream
{
  /**
   * Example call to new method {@link InputStream#nullInputStream}
   * @since 11
   * @see InputStream#nullInputStream
   */
  public static InputStream nullInputStream()
  {
    InputStream result = InputStream.nullInputStream();
    return result;
  }

  /**
   * Example call to new method {@link InputStream#readNBytes}
   * @since 11
   * @see InputStream#readNBytes
   */
  public byte[] readNBytes(int len) throws IOException
  {
    InputStream testee = $$$();

    byte[] result = testee.readNBytes(len);
    return result;
  }

  private InputStream $$$()
  {
    return null;
  }
}
