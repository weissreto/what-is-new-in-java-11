package whatisnewin.java.net.http;

import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpClient.Version;
import java.util.Optional;
import javax.net.ssl.SSLSession;
import java.net.http.HttpRequest;
import java.net.http.HttpHeaders;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link HttpResponse}
 * that were newly introduced in Java versions 11.<br>
 *
 * {@link HttpResponse} is a completely new class
 * @since 11
 * @see HttpResponse
 */
public final class WhatIsNewInHttpResponse<T>
{
  /**
   * Example call to new method {@link HttpResponse#statusCode}
   * @since 11
   * @see HttpResponse#statusCode
   */
  public int statusCode()
  {
    HttpResponse<T> testee = $$$();

    int result = testee.statusCode();
    return result;
  }

  /**
   * Example call to new method {@link HttpResponse#uri}
   * @since 11
   * @see HttpResponse#uri
   */
  public URI uri()
  {
    HttpResponse<T> testee = $$$();

    URI result = testee.uri();
    return result;
  }

  /**
   * Example call to new method {@link HttpResponse#version}
   * @since 11
   * @see HttpResponse#version
   */
  public Version version()
  {
    HttpResponse<T> testee = $$$();

    Version result = testee.version();
    return result;
  }

  /**
   * Example call to new method {@link HttpResponse#body}
   * @since 11
   * @see HttpResponse#body
   */
  public T body()
  {
    HttpResponse<T> testee = $$$();

    T result = testee.body();
    return result;
  }

  /**
   * Example call to new method {@link HttpResponse#previousResponse}
   * @since 11
   * @see HttpResponse#previousResponse
   */
  public Optional<HttpResponse<T>> previousResponse()
  {
    HttpResponse<T> testee = $$$();

    Optional<HttpResponse<T>> result = testee.previousResponse();
    return result;
  }

  /**
   * Example call to new method {@link HttpResponse#sslSession}
   * @since 11
   * @see HttpResponse#sslSession
   */
  public Optional<SSLSession> sslSession()
  {
    HttpResponse<T> testee = $$$();

    Optional<SSLSession> result = testee.sslSession();
    return result;
  }

  /**
   * Example call to new method {@link HttpResponse#request}
   * @since 11
   * @see HttpResponse#request
   */
  public HttpRequest request()
  {
    HttpResponse<T> testee = $$$();

    HttpRequest result = testee.request();
    return result;
  }

  /**
   * Example call to new method {@link HttpResponse#headers}
   * @since 11
   * @see HttpResponse#headers
   */
  public HttpHeaders headers()
  {
    HttpResponse<T> testee = $$$();

    HttpHeaders result = testee.headers();
    return result;
  }

  private HttpResponse $$$()
  {
    return null;
  }
}
