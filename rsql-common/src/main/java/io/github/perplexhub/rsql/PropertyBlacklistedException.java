package io.github.perplexhub.rsql;

/**
 * Thrown to indicate that property in the blacklist.
 */
public class PropertyBlacklistedException extends PropertyAccessControlException {

  private static final long serialVersionUID = -5788163727325735359L;

  public PropertyBlacklistedException(String name, Class<?> type, String message) {
    super(name, type, message);
  }
}
