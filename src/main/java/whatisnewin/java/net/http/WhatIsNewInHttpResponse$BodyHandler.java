package whatisnewin.java.net.http;

import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.ResponseInfo;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link BodyHandler}
 * that were newly introduced in Java version 11.<br>
 *
 * {@link BodyHandler} is a completely new class.
 * @since 11
 * @see BodyHandler
 */
public final class WhatIsNewInHttpResponse$BodyHandler<T>
{
  /**
   * Example call to new method {@link BodyHandler#apply(ResponseInfo)}.
   * @since 11
   * @see BodyHandler#apply(ResponseInfo)
   */
  public BodySubscriber<T> apply(ResponseInfo responseInfo)
  {
    BodyHandler<T> testee = $$$();

    BodySubscriber<T> result = testee.apply(responseInfo);
    return result;
  }

  private BodyHandler $$$()
  {
    return null;
  }
}
