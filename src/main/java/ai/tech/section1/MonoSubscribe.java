package ai.tech.section1;

import ai.tech.util.Util;
import reactor.core.publisher.Mono;

public class MonoSubscribe {
  public static void main(String[] args) {
    Mono<Integer> helloWorldMono = Mono.just("Hello, Reactor! :D")
                                      .map(String::length)
                                      .map(length -> length / 0);
    helloWorldMono.subscribe(
            Util.onNext(),
            Util.onError(),
            Util.onComplete()
    );
  }
}