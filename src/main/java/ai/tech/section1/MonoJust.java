package ai.tech.section1;

import reactor.core.publisher.Mono;

public class MonoJust {
  public static void main(String[] args) {
    // Publisher:
    Mono<String> stringMono = Mono.just("Hello, Reactor! :D");
    System.out.println(stringMono);
    stringMono.subscribe(data -> System.out.println("Data received: " + data));
  }
}