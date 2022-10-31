# JAVA 복습

## 1.introduction to java

#### Intro

- source code란 high-level language로 쓰여진 프로그램을 뜻한다.
- source code는 컴퓨터가 이해할 수 없으며 이해할 수 있는 코드로 바꿔주는 tool을 interpreter 또는 compiler라고 한다.
- interpreter는 source code로 부터 statement를 읽어 machine code로 바꿔 바로 실행한다.
- compiler는 전체 source code를 machine code file로 바꾸고 그 파일이 실행된다.

#### Why Java?

- Java is simple: Java는 C++과 비슷하지만 더 기능적이고 단점은 적다.
- Java is object-oriented: Java는 객체지향적인 언어이다.
- Java is distributed: Java는 networking capability를 가지고 있다.
- Java is interpreted: Source code는 컴파일 시 OS가 인식할 수 없는 bytecode(.class file)로 변환된다. 그리고 JVM이 bytecode를 OS가 인식할 수 있게 해준다. 따라서 OS에 종속적이지 않고 java 파일 하나만 만들면 어느 디바이스에서든 실행할 수 있다.
- Java is robust: Java는 다른 언어에서 나타나는 problem이나 error를 발견할 수 있으며 runtime exception handling 특징을 가지고 있다.
- Java is secure: Java는 잘못된 프로그램으로 인한 피해를 줄이기 위해 여러 보안 메커니즘을 구현했다.
- Java is architecture-neutral: 한 번 써지면 어디서든지 실행 가능하다. (JVM의 특징)
- Java is portable: 바로 위의 특징으로 인해 Java는 portable하다.
- Java is multithreaded
- Java is dynamic: Java는 진화하는 것에 적응하도록 설계되었다. 새로운 기능은 필요할 때마다 쉽게 추가될 수 있다.

#### JVM, JRE, JDK

- JVM은 위에서 설명한 것과 같고 JRE는 JVM을 생성하는 디스크 상의 부분이다. JDK는 개발자들이 JVM과 JRE에 의해 실행되고 구동될 수 있는 자바 프로그램을 생성할 수 있게 도와준다.
