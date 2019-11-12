package whatisnewin.java.util;

import java.util.Collection;
import java.util.function.IntFunction;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Collection}
 * that were newly introduced in Java versions 11.<br>
 *
 * {@link Collection} is an old class but has new fields, constructors or methods
 * @since 1.2
 * @see Collection
 */
public final class WhatIsNewInCollection<E>
{
  /**
   * Example call to new method {@link Collection#toArray}
   * @since 11
   * @see Collection#toArray
   */
  public <T> T[] toArray(IntFunction<T[]> generator)
  {
    Collection<E> testee = $$$();

    T[] result = testee.toArray(generator);
    return result;
  }

  private Collection $$$()
  {
    return null;
  }
}
