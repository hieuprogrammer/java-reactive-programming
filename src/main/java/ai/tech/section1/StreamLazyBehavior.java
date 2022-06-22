package ai.tech.section1;

import java.util.stream.Stream;

public class StreamLazyBehavior {
  public static void main(String[] args) {
    Stream<Integer> integerStream = Stream.of(1).map(integer -> {
                                                        try {
                                                          Thread.sleep(1000);
                                                        } catch (InterruptedException e) {
                                                          throw new RuntimeException(e);
                                                        }
                                                        return integer * 2;
                                                      });
    System.out.println(integerStream);
    integerStream.forEach(System.out::println);
  }
}