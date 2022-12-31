package io.github.perplexhub.rsql;

/**
 * Thrown to indicate that property not in the whitelist.
 */
public class PropertyNotWhitelistedException extends PropertyAccessControlException {

  private static final long serialVersionUID = -4348783264841223291L;

  public PropertyNotWhitelistedException(String name, Class<?> type, String message) {
    super(name, type, message);
  }
}
