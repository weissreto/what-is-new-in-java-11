package whatisnewin.java.lang.invoke;

import java.lang.invoke.ConstantBootstraps;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandle;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ConstantBootstraps}
 * that were newly introduced in Java version 11.<br>
 *
 * {@link ConstantBootstraps} is a completely new class.
 * @since 11
 * @see ConstantBootstraps
 */
public final class WhatIsNewInConstantBootstraps
{
  /**
   * Example call to new constructor {@link ConstantBootstraps#ConstantBootstraps()}.
   * @since 11
   * @see ConstantBootstraps#ConstantBootstraps()
   */
  public WhatIsNewInConstantBootstraps()
  {
    ConstantBootstraps testee = new ConstantBootstraps();
  }

  /**
   * Example call to new method {@link ConstantBootstraps#primitiveClass(Lookup, String, Class)}.
   * @since 11
   * @see ConstantBootstraps#primitiveClass(Lookup, String, Class)
   */
  public static Class<?> primitiveClass(Lookup lookup, String name, Class<?> type)
  {
    Class<?> result = ConstantBootstraps.primitiveClass(lookup, name, type);
    return result;
  }

  /**
   * Example call to new method {@link ConstantBootstraps#staticFieldVarHandle(Lookup, String, Class, Class, Class)}.
   * @since 11
   * @see ConstantBootstraps#staticFieldVarHandle(Lookup, String, Class, Class, Class)
   */
  public static VarHandle staticFieldVarHandle(Lookup lookup, String name, Class<VarHandle> type, Class<?> declaringClass, Class<?> fieldType)
  {
    VarHandle result = ConstantBootstraps.staticFieldVarHandle(lookup, name, type, declaringClass, fieldType);
    return result;
  }

  /**
   * Example call to new method {@link ConstantBootstraps#enumConstant(Lookup, String, Class)}.
   * @since 11
   * @see ConstantBootstraps#enumConstant(Lookup, String, Class)
   */
  public static <E extends Enum<E>> E enumConstant(Lookup lookup, String name, Class<E> type)
  {
    E result = ConstantBootstraps.enumConstant(lookup, name, type);
    return result;
  }

  /**
   * Example call to new method {@link ConstantBootstraps#fieldVarHandle(Lookup, String, Class, Class, Class)}.
   * @since 11
   * @see ConstantBootstraps#fieldVarHandle(Lookup, String, Class, Class, Class)
   */
  public static VarHandle fieldVarHandle(Lookup lookup, String name, Class<VarHandle> type, Class<?> declaringClass, Class<?> fieldType)
  {
    VarHandle result = ConstantBootstraps.fieldVarHandle(lookup, name, type, declaringClass, fieldType);
    return result;
  }

  /**
   * Example call to new method {@link ConstantBootstraps#arrayVarHandle(Lookup, String, Class, Class)}.
   * @since 11
   * @see ConstantBootstraps#arrayVarHandle(Lookup, String, Class, Class)
   */
  public static VarHandle arrayVarHandle(Lookup lookup, String name, Class<VarHandle> type, Class<?> arrayClass)
  {
    VarHandle result = ConstantBootstraps.arrayVarHandle(lookup, name, type, arrayClass);
    return result;
  }

  /**
   * Example call to new method {@link ConstantBootstraps#nullConstant(Lookup, String, Class)}.
   * @since 11
   * @see ConstantBootstraps#nullConstant(Lookup, String, Class)
   */
  public static Object nullConstant(Lookup lookup, String name, Class<?> type)
  {
    Object result = ConstantBootstraps.nullConstant(lookup, name, type);
    return result;
  }

  /**
   * Example call to new method {@link ConstantBootstraps#invoke(Lookup, String, Class, MethodHandle, Object[])}.
   * @since 11
   * @see ConstantBootstraps#invoke(Lookup, String, Class, MethodHandle, Object[])
   */
  public static Object invoke(Lookup lookup, String name, Class<?> type, MethodHandle handle, Object[] args) throws Throwable
  {
    Object result = ConstantBootstraps.invoke(lookup, name, type, handle, args);
    return result;
  }

  /**
   * Example call to new method {@link ConstantBootstraps#getStaticFinal(Lookup, String, Class, Class)}.
   * @since 11
   * @see ConstantBootstraps#getStaticFinal(Lookup, String, Class, Class)
   */
  public static Object getStaticFinal(Lookup lookup, String name, Class<?> type, Class<?> declaringClass)
  {
    Object result = ConstantBootstraps.getStaticFinal(lookup, name, type, declaringClass);
    return result;
  }

  /**
   * Example call to new method {@link ConstantBootstraps#getStaticFinal(Lookup, String, Class)}.
   * @since 11
   * @see ConstantBootstraps#getStaticFinal(Lookup, String, Class)
   */
  public static Object getStaticFinal(Lookup lookup, String name, Class<?> type)
  {
    Object result = ConstantBootstraps.getStaticFinal(lookup, name, type);
    return result;
  }

}
