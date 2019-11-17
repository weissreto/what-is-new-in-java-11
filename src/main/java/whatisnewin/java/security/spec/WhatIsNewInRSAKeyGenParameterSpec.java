package whatisnewin.java.security.spec;

import java.security.spec.RSAKeyGenParameterSpec;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link RSAKeyGenParameterSpec}
 * that were newly introduced in Java version 11.<br>
 *
 * {@link RSAKeyGenParameterSpec} is an old class but has new fields, constructors or methods.
 * @since 1.3
 * @see RSAKeyGenParameterSpec
 */
public final class WhatIsNewInRSAKeyGenParameterSpec
{
  /**
   * Example call to new constructor {@link RSAKeyGenParameterSpec#RSAKeyGenParameterSpec(int, BigInteger, AlgorithmParameterSpec)}.
   * @since 11
   * @see RSAKeyGenParameterSpec#RSAKeyGenParameterSpec(int, BigInteger, AlgorithmParameterSpec)
   */
  public WhatIsNewInRSAKeyGenParameterSpec(int keysize, BigInteger publicExponent, AlgorithmParameterSpec keyParams)
  {
    RSAKeyGenParameterSpec testee = new RSAKeyGenParameterSpec(keysize, publicExponent, keyParams);
  }

}
