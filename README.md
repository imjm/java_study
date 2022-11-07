# JAVA 복습

<details>

<summary>1.introduction to java</summary>

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

#### Java Program 실행 과정

- .Java 형식으로 파일을 저장한다. file name과 public class 'name'이 반드시 같아야 한다.
- .class file로 Compile 된다. 예시로 javac Welcome.java가 있으며 문법적인 에러가 없다면 Welcome.class라는 파일이 생성된다.
- .class file은 JVM에 의해 실행된다.
</details>

<details>

<summary>2.elementary programming</summary>

## 2.elementary programming

#### Identifiers

- identifier는 letter, digit, undersores, dollar sign으로 이루어진다.
- 숫자로 시작할 수 없다.
- reserved word와 겹치면 안 된다.
- true, false, null도 될 수 없다.
- 길이 제한 없다.

#### Constants

- final datatype CONSTANTNAME = VALUE; 과 같은 식으로 작성

#### Naming Conventions

- 의미 있는 이름을 사용한다.
- variable과 method 이름: 소문자를 사용한다. 다른 단어들이 붙어 있는 경우 대문자로 구분한다.
- class 이름: 대문자로 시작한다.
- 상수: 글자 전부 대문자로 이루어져 있으며 다른 단어들은 밑줄로 구분한다.

#### Floating-point Number

- floating-poing number는 근사치이다.
- 예를 들어, System.out.println(1.0-0.1-0.1-0.1-0.1-0.1); -> 0.5000000000000001, Not 0.5
- 따라서 Integer를 통해 계산하는 것이 정확하다.

#### Exponent Operation

- Math.pow(2, 3); -> 8

#### Literals

- 프로그램에서 직접 표현한 값을 의미한다.

#### Integer Literals

- Integer literal은 정수 변수에 할당될 수 있다.
- 범위가 안 맞으면 컴파일 오류가 날 수 있다.
- 범위는 -2<sup>31</sup> 부터 2<sup>31</sup>-1 까지이다.
- Long type으로 나타내기 위해 뒤에 L을 붙일 수 있다. 예를 들어 2147483548L

#### Floating-Poing Literals

- 기본적으로, floating-point literal은 double type value와 같이 다뤄진다.
- 뒤에 F를 붙이거나 D를 붙여서 float, double로 만들 수 있다.
- Double type과 Float type의 차이점은 Double type이 더 정밀하다는 것이다.

#### Current Time

- currentTimeMillis 메소드는 01-01-1970 부터 지금까지의 시간을 밀리초로 반환한다.

#### Numeric Type Conversion

- 다른 type 끼리 연산을 할 때 한 가지 타입으로 통합돼서 계산된다. 우선순위는 double > float > long > int 이다.

#### Type Casting

- type을 확장할 때는 암시적으로 캐스팅 해주지만 type을 축소할 때는 명시적으로 캐스팅 해준다.

#### Operator ^

- 두 bool 값이 서로 같을 때 false

#### Conditional Expressions

- y = (x>0)?1:-1; ==> 조건문이 참이면 1 거짓이면 -1
</details>

<details>

<summary>3.Mathematical Functions, Characters, Strings, Loops</summary>

## 3.Mathematical Functions, Characters, Strings, Loops

#### Mathematical Function

- Java는 Math 클래스를 통해 유용한 메소드를 제공한다.
- 예를 들어 상수 PI, E가 있고 메소드 min, max, abs 등이 있다.

#### The random Method

- Math.random()
- 랜덤으로 double형의 value를 생성한다. 범위 0.0 ~ 1.0

#### Character Data Type

- char형의 variable도 증감연산이 가능하다.

#### Unicode Format

- Java character는 Unicode를 사용한다.

#### The String Type

- char형은 오직 하나의 문자만 표현한다.
- 문자열을 표현하기 위해서는 String이라는 데이터형을 사용해야 한다.
- String은 몇 Java 라이브러리에 predefined 되어 있지만 primitive type은 아니다.
- 이는 reference type이며 Ch.9에서 다시 볼 예정이다.

#### Instance method and static method

- object 기반의 메소드를 Instance method라고 하고 object 없이 실행될 수 있는 메소드를 static method라고 한다.

#### Conversion between Strings and Numbers

- parseInt를 사용하거나 String s = number + ""; 등과 같은 방법이 있다.

#### Caution when loop

- loop 조건문에서 floating-point value를 사용하면 안된다.
- floating-point value는 근사치이므로, 이들을 사용하면 정확한 결과가 나오지 않는다.

#### do-while loop

- 최소 한 번은 실행한다.

#### 어떤 loop를 쓸까?

- 일반적으로 반복 횟수가 정해져 있을 때 for문을 사용한다.
- while은 반복 횟수가 정해져 있지 않거나 input이 0일때까지 하는 반복 때 사용한다.
- do-while은 while을 사용하고 싶은데 한 번은 실행해야 할 때 사용한다.
</details>

<details>

<summary>4.Method</summary>

## 4.method

### Defining Methods

- Method signature는 method name과 parameter list로 이루어져 있다.
- Method header에 정의된 변수를 formal parameter라고 한다.
- 함수를 정의할 때 static을 사용하면 객체를 생성하지 않고도 사용할 수 있다.
- 함수를 실행할 때 parameter에 넣는 변수를 actual parameter 혹은 argument라고 한다.
- return value type대로 return 해야 한다.

### Reuse Methods from Other Classes

- 같은 패키지에 있으면 import할 필요 없이, ClassName.methodName을 통해 다른 class의 메소드를 사용할 수 있다.
- pass by value: 복사된 데이터를 전달하여 구성함으로써, 값을 수정해도 원본의 데이터에는 영향을 주지 않는다.

### Overloading Methods

- 메소드 이름은 같고 parameter list는 다르다.
- 리턴값만 다른 것은 오버로딩이라고 볼 수 없다.
- 접근 제어자도 자유롭게 지정 가능하다.
- 사용하는 이유는 같은 기능을 하는 메소드를 하나의 이름으로 사용할 수 있고 메소드 이름을 절약할 수 있기 때문이다.


</details>
