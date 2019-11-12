package whatisnewin.java.net.http;

import java.net.http.HttpRequest.Builder;
import java.net.URI;
import java.net.http.HttpClient.Version;
import java.time.Duration;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Builder}
 * that were newly introduced in Java versions 11.<br>
 *
 * {@link Builder} is a completely new class
 * @since 11
 * @see Builder
 */
public final class WhatIsNewInHttpRequest$Builder
{
  /**
   * Example call to new method {@link Builder#uri}
   * @since 11
   * @see Builder#uri
   */
  public Builder uri(URI uri)
  {
    Builder testee = $$$();

    Builder result = testee.uri(uri);
    return result;
  }

  /**
   * Example call to new method {@link Builder#version}
   * @since 11
   * @see Builder#version
   */
  public Builder version(Version version)
  {
    Builder testee = $$$();

    Builder result = testee.version(version);
    return result;
  }

  /**
   * Example call to new method {@link Builder#timeout}
   * @since 11
   * @see Builder#timeout
   */
  public Builder timeout(Duration duration)
  {
    Builder testee = $$$();

    Builder result = testee.timeout(duration);
    return result;
  }

  /**
   * Example call to new method {@link Builder#setHeader}
   * @since 11
   * @see Builder#setHeader
   */
  public Builder setHeader(String name, String value)
  {
    Builder testee = $$$();

    Builder result = testee.setHeader(name, value);
    return result;
  }

  /**
   * Example call to new method {@link Builder#PUT}
   * @since 11
   * @see Builder#PUT
   */
  public Builder PUT(BodyPublisher bodyPublisher)
  {
    Builder testee = $$$();

    Builder result = testee.PUT(bodyPublisher);
    return result;
  }

  /**
   * Example call to new method {@link Builder#POST}
   * @since 11
   * @see Builder#POST
   */
  public Builder POST(BodyPublisher bodyPublisher)
  {
    Builder testee = $$$();

    Builder result = testee.POST(bodyPublisher);
    return result;
  }

  /**
   * Example call to new method {@link Builder#method}
   * @since 11
   * @see Builder#method
   */
  public Builder method(String method, BodyPublisher bodyPublisher)
  {
    Builder testee = $$$();

    Builder result = testee.method(method, bodyPublisher);
    return result;
  }

  /**
   * Example call to new method {@link Builder#headers}
   * @since 11
   * @see Builder#headers
   */
  public Builder headers(String[] headers)
  {
    Builder testee = $$$();

    Builder result = testee.headers(headers);
    return result;
  }

  /**
   * Example call to new method {@link Builder#header}
   * @since 11
   * @see Builder#header
   */
  public Builder header(String name, String value)
  {
    Builder testee = $$$();

    Builder result = testee.header(name, value);
    return result;
  }

  /**
   * Example call to new method {@link Builder#copy}
   * @since 11
   * @see Builder#copy
   */
  public Builder copy()
  {
    Builder testee = $$$();

    Builder result = testee.copy();
    return result;
  }

  /**
   * Example call to new method {@link Builder#build}
   * @since 11
   * @see Builder#build
   */
  public HttpRequest build()
  {
    Builder testee = $$$();

    HttpRequest result = testee.build();
    return result;
  }

  /**
   * Example call to new method {@link Builder#GET}
   * @since 11
   * @see Builder#GET
   */
  public Builder GET()
  {
    Builder testee = $$$();

    Builder result = testee.GET();
    return result;
  }

  /**
   * Example call to new method {@link Builder#expectContinue}
   * @since 11
   * @see Builder#expectContinue
   */
  public Builder expectContinue(boolean enable)
  {
    Builder testee = $$$();

    Builder result = testee.expectContinue(enable);
    return result;
  }

  /**
   * Example call to new method {@link Builder#DELETE}
   * @since 11
   * @see Builder#DELETE
   */
  public Builder DELETE()
  {
    Builder testee = $$$();

    Builder result = testee.DELETE();
    return result;
  }

  private Builder $$$()
  {
    return null;
  }
}
