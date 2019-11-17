package whatisnewin.java.net.http;

import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.BodyHandler;
import java.nio.file.Path;
import java.nio.file.OpenOption;
import java.nio.charset.Charset;
import java.util.concurrent.Flow.Subscriber;
import java.util.function.Function;
import java.io.InputStream;
import java.util.List;
import java.nio.ByteBuffer;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.Optional;
import java.util.concurrent.Flow.Publisher;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link BodyHandlers}
 * that were newly introduced in Java version 11.<br>
 *
 * {@link BodyHandlers} is a completely new class.
 * @since 11
 * @see BodyHandlers
 */
public final class WhatIsNewInHttpResponse$BodyHandlers
{
  /**
   * Example call to new method {@link BodyHandlers#ofFile(Path, java.nio.file.OpenOption[])}.
   * @since 11
   * @see BodyHandlers#ofFile(Path, java.nio.file.OpenOption[])
   */
  public static BodyHandler<Path> ofFile(Path file, OpenOption[] openOptions)
  {
    BodyHandler<Path> result = BodyHandlers.ofFile(file, openOptions);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofFile(Path)}.
   * @since 11
   * @see BodyHandlers#ofFile(Path)
   */
  public static BodyHandler<Path> ofFile(Path file)
  {
    BodyHandler<Path> result = BodyHandlers.ofFile(file);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofString(Charset)}.
   * @since 11
   * @see BodyHandlers#ofString(Charset)
   */
  public static BodyHandler<String> ofString(Charset charset)
  {
    BodyHandler<String> result = BodyHandlers.ofString(charset);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofString()}.
   * @since 11
   * @see BodyHandlers#ofString()
   */
  public static BodyHandler<String> ofString()
  {
    BodyHandler<String> result = BodyHandlers.ofString();
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#fromLineSubscriber(Subscriber)}.
   * @since 11
   * @see BodyHandlers#fromLineSubscriber(Subscriber)
   */
  public static BodyHandler<Void> fromLineSubscriber(Subscriber<? super String> subscriber)
  {
    BodyHandler<Void> result = BodyHandlers.fromLineSubscriber(subscriber);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#fromLineSubscriber(Subscriber, Function, String)}.
   * @since 11
   * @see BodyHandlers#fromLineSubscriber(Subscriber, Function, String)
   */
  public static <S extends Subscriber<? super String>, T> BodyHandler<T> fromLineSubscriber(S subscriber, Function<? super S, ? extends T> finisher, String lineSeparator)
  {
    BodyHandler<T> result = BodyHandlers.fromLineSubscriber(subscriber, finisher, lineSeparator);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofInputStream()}.
   * @since 11
   * @see BodyHandlers#ofInputStream()
   */
  public static BodyHandler<InputStream> ofInputStream()
  {
    BodyHandler<InputStream> result = BodyHandlers.ofInputStream();
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#buffering(BodyHandler, int)}.
   * @since 11
   * @see BodyHandlers#buffering(BodyHandler, int)
   */
  public static <T> BodyHandler<T> buffering(BodyHandler<T> downstreamHandler, int bufferSize)
  {
    BodyHandler<T> result = BodyHandlers.buffering(downstreamHandler, bufferSize);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#fromSubscriber(Subscriber)}.
   * @since 11
   * @see BodyHandlers#fromSubscriber(Subscriber)
   */
  public static BodyHandler<Void> fromSubscriber(Subscriber<? super List<ByteBuffer>> subscriber)
  {
    BodyHandler<Void> result = BodyHandlers.fromSubscriber(subscriber);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#fromSubscriber(Subscriber, Function)}.
   * @since 11
   * @see BodyHandlers#fromSubscriber(Subscriber, Function)
   */
  public static <S extends Subscriber<? super List<ByteBuffer>>, T> BodyHandler<T> fromSubscriber(S subscriber, Function<? super S, ? extends T> finisher)
  {
    BodyHandler<T> result = BodyHandlers.fromSubscriber(subscriber, finisher);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#discarding()}.
   * @since 11
   * @see BodyHandlers#discarding()
   */
  public static BodyHandler<Void> discarding()
  {
    BodyHandler<Void> result = BodyHandlers.discarding();
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofLines()}.
   * @since 11
   * @see BodyHandlers#ofLines()
   */
  public static BodyHandler<Stream<String>> ofLines()
  {
    BodyHandler<Stream<String>> result = BodyHandlers.ofLines();
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#replacing(Object)}.
   * @since 11
   * @see BodyHandlers#replacing(Object)
   */
  public static <U> BodyHandler<U> replacing(U value)
  {
    BodyHandler<U> result = BodyHandlers.replacing(value);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofFileDownload(Path, java.nio.file.OpenOption[])}.
   * @since 11
   * @see BodyHandlers#ofFileDownload(Path, java.nio.file.OpenOption[])
   */
  public static BodyHandler<Path> ofFileDownload(Path directory, OpenOption[] openOptions)
  {
    BodyHandler<Path> result = BodyHandlers.ofFileDownload(directory, openOptions);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofByteArray()}.
   * @since 11
   * @see BodyHandlers#ofByteArray()
   */
  public static BodyHandler<byte[]> ofByteArray()
  {
    BodyHandler<byte[]> result = BodyHandlers.ofByteArray();
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofByteArrayConsumer(Consumer)}.
   * @since 11
   * @see BodyHandlers#ofByteArrayConsumer(Consumer)
   */
  public static BodyHandler<Void> ofByteArrayConsumer(Consumer<Optional<byte[]>> consumer)
  {
    BodyHandler<Void> result = BodyHandlers.ofByteArrayConsumer(consumer);
    return result;
  }

  /**
   * Example call to new method {@link BodyHandlers#ofPublisher()}.
   * @since 11
   * @see BodyHandlers#ofPublisher()
   */
  public static BodyHandler<Publisher<List<ByteBuffer>>> ofPublisher()
  {
    BodyHandler<Publisher<List<ByteBuffer>>> result = BodyHandlers.ofPublisher();
    return result;
  }

}
