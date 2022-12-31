package io.github.perplexhub.rsql;

/**
 * Thrown indicate that property blacklisted/not whitelisted, in other words forbidden to use.
 */
public class PropertyAccessControlException extends PropertyException {

  private static final long serialVersionUID = -7250223389702651901L;

  public PropertyAccessControlException(String name, Class<?> type, String message) {
    super(name, type, message);
  }
}
