package whatisnewin.java.net.http;

import java.net.http.HttpResponse.BodySubscriber;
import java.util.concurrent.CompletionStage;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link BodySubscriber}
 * that were newly introduced in Java version 11.<br>
 *
 * {@link BodySubscriber} is a completely new class.
 * @since 11
 * @see BodySubscriber
 */
public final class WhatIsNewInHttpResponse$BodySubscriber<T>
{
  /**
   * Example call to new method {@link BodySubscriber#getBody()}.
   * @since 11
   * @see BodySubscriber#getBody()
   */
  public CompletionStage<T> getBody()
  {
    BodySubscriber<T> testee = $$$();

    CompletionStage<T> result = testee.getBody();
    return result;
  }

  private BodySubscriber<T> $$$()
  {
    return null;
  }
}
