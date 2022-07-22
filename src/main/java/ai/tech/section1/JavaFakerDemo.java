package ai.tech.section1;

import com.github.javafaker.Faker;

public class JavaFakerDemo {
  public static void main(String[] args) {
    for (int index = 0; index < 10; index++) {
      System.out.println(Faker.instance().name().fullName());
    }
  }
}