package whatisnewin.jdk.nio;

import jdk.nio.Channels.SelectableChannelCloser;
import java.nio.channels.SelectableChannel;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SelectableChannelCloser}
 * that were newly introduced in Java version 11.<br>
 *
 * {@link SelectableChannelCloser} is a completely new class.
 * @since 11
 * @see SelectableChannelCloser
 */
public final class WhatIsNewInChannels$SelectableChannelCloser
{
  /**
   * Example call to new method {@link SelectableChannelCloser#implCloseChannel(SelectableChannel)}.
   * @since 11
   * @see SelectableChannelCloser#implCloseChannel(SelectableChannel)
   */
  public void implCloseChannel(SelectableChannel sc) throws IOException
  {
    SelectableChannelCloser testee = $$$();

    testee.implCloseChannel(sc);
  }

  /**
   * Example call to new method {@link SelectableChannelCloser#implReleaseChannel(SelectableChannel)}.
   * @since 11
   * @see SelectableChannelCloser#implReleaseChannel(SelectableChannel)
   */
  public void implReleaseChannel(SelectableChannel sc) throws IOException
  {
    SelectableChannelCloser testee = $$$();

    testee.implReleaseChannel(sc);
  }

  private SelectableChannelCloser $$$()
  {
    return null;
  }
}
