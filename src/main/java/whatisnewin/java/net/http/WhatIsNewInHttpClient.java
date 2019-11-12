package whatisnewin.java.net.http;

import java.net.http.HttpClient;
import java.net.http.WebSocket.Builder;
import java.util.Optional;
import java.time.Duration;
import javax.net.ssl.SSLParameters;
import java.net.CookieHandler;
import java.net.Authenticator;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;
import java.io.IOException;
import java.net.ProxySelector;
import java.net.http.HttpClient.Redirect;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLContext;
import java.net.http.HttpClient.Version;
import java.util.concurrent.CompletableFuture;
import java.net.http.HttpResponse.PushPromiseHandler;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link HttpClient}
 * that were newly introduced in Java versions 11.<br>
 *
 * {@link HttpClient} is a completely new class
 * @since 11
 * @see HttpClient
 */
public final class WhatIsNewInHttpClient
{
  /**
   * Example call to new method {@link HttpClient#newWebSocketBuilder}
   * @since 11
   * @see HttpClient#newWebSocketBuilder
   */
  public Builder newWebSocketBuilder()
  {
    HttpClient testee = $$$();

    Builder result = testee.newWebSocketBuilder();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#connectTimeout}
   * @since 11
   * @see HttpClient#connectTimeout
   */
  public Optional<Duration> connectTimeout()
  {
    HttpClient testee = $$$();

    Optional<Duration> result = testee.connectTimeout();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#sslParameters}
   * @since 11
   * @see HttpClient#sslParameters
   */
  public SSLParameters sslParameters()
  {
    HttpClient testee = $$$();

    SSLParameters result = testee.sslParameters();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#cookieHandler}
   * @since 11
   * @see HttpClient#cookieHandler
   */
  public Optional<CookieHandler> cookieHandler()
  {
    HttpClient testee = $$$();

    Optional<CookieHandler> result = testee.cookieHandler();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#authenticator}
   * @since 11
   * @see HttpClient#authenticator
   */
  public Optional<Authenticator> authenticator()
  {
    HttpClient testee = $$$();

    Optional<Authenticator> result = testee.authenticator();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#send}
   * @since 11
   * @see HttpClient#send
   */
  public <T> HttpResponse<T> send(HttpRequest request, BodyHandler<T> responseBodyHandler) throws IOException, InterruptedException
  {
    HttpClient testee = $$$();

    HttpResponse<T> result = testee.send(request, responseBodyHandler);
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#proxy}
   * @since 11
   * @see HttpClient#proxy
   */
  public Optional<ProxySelector> proxy()
  {
    HttpClient testee = $$$();

    Optional<ProxySelector> result = testee.proxy();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#followRedirects}
   * @since 11
   * @see HttpClient#followRedirects
   */
  public Redirect followRedirects()
  {
    HttpClient testee = $$$();

    Redirect result = testee.followRedirects();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#executor}
   * @since 11
   * @see HttpClient#executor
   */
  public Optional<Executor> executor()
  {
    HttpClient testee = $$$();

    Optional<Executor> result = testee.executor();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#sslContext}
   * @since 11
   * @see HttpClient#sslContext
   */
  public SSLContext sslContext()
  {
    HttpClient testee = $$$();

    SSLContext result = testee.sslContext();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#newBuilder}
   * @since 11
   * @see HttpClient#newBuilder
   */
  public static java.net.http.HttpClient.Builder newBuilder()
  {
    java.net.http.HttpClient.Builder result = HttpClient.newBuilder();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#version}
   * @since 11
   * @see HttpClient#version
   */
  public Version version()
  {
    HttpClient testee = $$$();

    Version result = testee.version();
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#sendAsync}
   * @since 11
   * @see HttpClient#sendAsync
   */
  public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, BodyHandler<T> responseBodyHandler)
  {
    HttpClient testee = $$$();

    CompletableFuture<HttpResponse<T>> result = testee.sendAsync(request, responseBodyHandler);
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#sendAsync}
   * @since 11
   * @see HttpClient#sendAsync
   */
  public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, BodyHandler<T> responseBodyHandler, PushPromiseHandler<T> pushPromiseHandler)
  {
    HttpClient testee = $$$();

    CompletableFuture<HttpResponse<T>> result = testee.sendAsync(request, responseBodyHandler, pushPromiseHandler);
    return result;
  }

  /**
   * Example call to new method {@link HttpClient#newHttpClient}
   * @since 11
   * @see HttpClient#newHttpClient
   */
  public static HttpClient newHttpClient()
  {
    HttpClient result = HttpClient.newHttpClient();
    return result;
  }

  private HttpClient $$$()
  {
    return null;
  }
}
