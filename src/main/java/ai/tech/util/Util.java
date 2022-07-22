package ai.tech.util;

import java.util.function.Consumer;

public class Util {
  public static Consumer<Object> onNext() {
    return object -> System.out.println("Data received: " + object);
  }

  public static Consumer<Throwable> onError() {
    return error -> System.out.println("Data received: " + error.getMessage());
  }

  public static Runnable onComplete() {
    return () -> System.out.println("Completed.");
  }
}