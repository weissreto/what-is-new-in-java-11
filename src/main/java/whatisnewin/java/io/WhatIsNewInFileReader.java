package whatisnewin.java.io;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link FileReader}
 * that were newly introduced in Java versions 11.<br>
 *
 * {@link FileReader} is an old class but has new fields, constructors or methods
 * @since 1.1
 * @see FileReader
 */
public final class WhatIsNewInFileReader
{
  /**
   * Example call to new constructor {@link FileReader#FileReader}
   * @since 11
   * @see FileReader#FileReader
   */
  public WhatIsNewInFileReader(String fileName, Charset charset) throws IOException
  {
    FileReader testee = new FileReader(fileName, charset);
  }

}
