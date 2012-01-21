package com.howardlewisship.sj;

import com.intellij.CommonBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.PropertyKey;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ResourceBundle;

/**
 * Access to message values stored in SJBundle.properties.
 */
public class SJBundle {
  private static Reference<ResourceBundle> ourBundle;

  @NonNls
  private static final String BUNDLE = "com.howardlewisship.sj.SJBundle";

  public static String message(
          @PropertyKey(resourceBundle = BUNDLE)
          String key, Object... params) {
    return CommonBundle.message(getBundle(), key, params);
  }

  private synchronized static ResourceBundle getBundle() {
    ResourceBundle bundle = null;
    if (ourBundle != null) {
      bundle = ourBundle.get();
    }

    if (bundle == null) {
      bundle = ResourceBundle.getBundle(BUNDLE);
      ourBundle = new SoftReference<ResourceBundle>(bundle);
    }

    return bundle;
  }

}
