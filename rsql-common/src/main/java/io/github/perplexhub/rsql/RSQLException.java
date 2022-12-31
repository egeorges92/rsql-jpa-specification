package io.github.perplexhub.rsql;

/**
 * Thrown to indicate that generic problems within library. It is a superclass for all exceptions defined here.
 */
public class RSQLException extends RuntimeException {

  private static final long serialVersionUID = 8324642779354675125L;

  public RSQLException() {
    super();
  }

  public RSQLException(String message) {
    super(message);
  }

  public RSQLException(String message, Throwable cause) {
    super(message, cause);
  }

  public RSQLException(Throwable cause) {
    super(cause);
  }
}
