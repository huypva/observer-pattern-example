The example project of Observer Pattern

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── observer-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./observer-pattern/target/observer-pattern-0.0.1-SNAPSHOT.jar
09:39:19.760 [main] INFO io.github.huypva.observerpattern.ConcreteObserverA -- ConcreteObserverA update
09:39:19.762 [main] INFO io.github.huypva.observerpattern.ConcreteObserverB -- ConcreteObserverB update
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!

- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference
- https://en.wikipedia.org/wiki/Observer_pattern
- https://refactoring.guru/design-patterns/observer