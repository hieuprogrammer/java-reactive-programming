package ai.tech.util;

import com.github.javafaker.Faker;

import java.util.function.Consumer;

public class Util {
  private static final Faker FAKER = Faker.instance();

  public static Faker faker() {
    return FAKER;
  }

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