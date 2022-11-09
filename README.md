# JAVA 복습

<details>

<summary>1.introduction to java</summary>

## 1.introduction to java

#### Intro

- source code 란 high-level language 로 쓰여진 프로그램을 뜻한다.
- source code 는 컴퓨터가 이해할 수 없으며 이해할 수 있는 코드로 바꿔주는 tool 을 interpreter 또는 compiler라고 한다.
- interpreter 는 source code 로 부터 statement 를 읽어 machine code 로 바꿔 바로 실행한다.
- compiler 는 전체 source code 를 machine code file 로 바꾸고 그 파일이 실행된다.

#### Why Java?

- Java is simple: Java 는 C++과 비슷하지만 더 기능적이고 단점은 적다.
- Java is object-oriented: Java 는 객체지향적인 언어이다.
- Java is distributed: Java 는 networking capability 를 가지고 있다.
- Java is interpreted: Source code 는 컴파일 시 OS가 인식할 수 없는 bytecode(.class file)로 변환된다. 그리고 JVM이 bytecode를 OS가 인식할 수 있게 해준다. 따라서 OS에 종속적이지 않고 java 파일 하나만 만들면 어느 디바이스에서든 실행할 수 있다.
- Java is robust: Java 는 다른 언어에서 나타나는 problem 이나 error 를 발견할 수 있으며 runtime exception handling 특징을 가지고 있다.
- Java is secure: Java 는 잘못된 프로그램으로 인한 피해를 줄이기 위해 여러 보안 메커니즘을 구현했다.
- Java is architecture-neutral: 한 번 써지면 어디서든지 실행 가능하다. (JVM 의 특징)
- Java is portable: 바로 위의 특징으로 인해 Java 는 portable 하다.
- Java is multithreaded
- Java is dynamic: Java 는 진화하는 것에 적응하도록 설계되었다. 새로운 기능은 필요할 때마다 쉽게 추가될 수 있다.

#### JVM, JRE, JDK

- JVM 은 위에서 설명한 것과 같고 JRE 는 JVM 을 생성하는 디스크 상의 부분이다. JDK 는 개발자들이 JVM 과 JRE 에 의해 실행되고 구동될 수 있는 자바 프로그램을 생성할 수 있게 도와준다.

#### Java Program 실행 과정

- .Java 형식으로 파일을 저장한다. file name 과 public class 'name' 이 반드시 같아야 한다.
- .class file 로 Compile 된다. 예시로 javac Welcome.java 가 있으며 문법적인 에러가 없다면 Welcome.class 라는 파일이 생성된다.
- .class file 은 JVM 에 의해 실행된다.
</details>

<details>

<summary>2.elementary programming</summary>

## 2.elementary programming

#### Identifiers

- identifier 는 letter, digit, undersores, dollar sign 으로 이루어진다.
- 숫자로 시작할 수 없다.
- reserved word 와 겹치면 안 된다.
- true, false, null 도 될 수 없다.
- 길이 제한 없다.

#### Constants

- final datatype CONSTANTNAME = VALUE; 과 같은 식으로 작성

#### Naming Conventions

- 의미 있는 이름을 사용한다.
- variable 과 method 이름: 소문자를 사용한다. 다른 단어들이 붙어 있는 경우 대문자로 구분한다.
- class 이름: 대문자로 시작한다.
- 상수: 글자 전부 대문자로 이루어져 있으며 다른 단어들은 밑줄로 구분한다.

#### Floating-point Number

- floating-point number 는 근사치이다.
- 예를 들어, System.out.println(1.0-0.1-0.1-0.1-0.1-0.1); -> 0.5000000000000001, Not 0.5
- 따라서 Integer 를 통해 계산하는 것이 정확하다.

#### Exponent Operation

- Math.pow(2, 3); -> 8

#### Literals

- 프로그램에서 직접 표현한 값을 의미한다.

#### Integer Literals

- Integer literal 은 정수 변수에 할당될 수 있다.
- 범위가 안 맞으면 컴파일 오류가 날 수 있다.
- 범위는 -2<sup>31</sup> 부터 2<sup>31</sup>-1 까지이다.
- Long type 으로 나타내기 위해 뒤에 L을 붙일 수 있다. 예를 들어 2147483548L

#### Floating-Point Literals

- 기본적으로, floating-point literal 은 double type value 와 같이 다뤄진다.
- 뒤에 F를 붙이거나 D를 붙여서 float, double 로 만들 수 있다.
- Double type 과 Float type 의 차이점은 Double type 이 더 정밀하다는 것이다.

#### Current Time

- currentTimeMillis 메소드는 01-01-1970 부터 지금까지의 시간을 밀리초로 반환한다.

#### Numeric Type Conversion

- 다른 type 끼리 연산을 할 때 한 가지 타입으로 통합돼서 계산된다. 우선순위는 double > float > long > int 이다.

#### Type Casting

- type 을 확장할 때는 암시적으로 캐스팅 해주지만 type 을 축소할 때는 명시적으로 캐스팅 해준다.

#### Operator ^

- 두 bool 값이 서로 같을 때 false

#### Conditional Expressions

- y = (x>0)?1:-1; ==> 조건문이 참이면 1 거짓이면 -1
</details>

<details>

<summary>3.Mathematical Functions, Characters, Strings, Loops</summary>

## 3.Mathematical Functions, Characters, Strings, Loops

#### Mathematical Function

- Java 는 Math 클래스를 통해 유용한 메소드를 제공한다.
- 예를 들어 상수 PI, E가 있고 메소드 min, max, abs 등이 있다.

#### The random Method

- Math.random()
- 랜덤으로 double 형의 value 를 생성한다. 범위 0.0 ~ 1.0

#### Character Data Type

- char 형의 variable 도 증감연산이 가능하다.

#### Unicode Format

- Java character 는 Unicode 를 사용한다.

#### The String Type

- char 형은 오직 하나의 문자만 표현한다.
- 문자열을 표현하기 위해서는 String 이라는 데이터형을 사용해야 한다.
- String 은 몇 Java 라이브러리에 predefined 되어 있지만 primitive type 은 아니다.
- 이는 reference type 이며 Ch.9에서 다시 볼 예정이다.

#### Instance method and static method

- object 기반의 메소드를 Instance method 라고 하고 object 없이 실행될 수 있는 메소드를 static method라고 한다.

#### Conversion between Strings and Numbers

- parseInt 를 사용하거나 String s = number + ""; 등과 같은 방법이 있다.

#### Caution when loop

- loop 조건문에서 floating-point value를 사용하면 안된다.
- floating-point value는 근사치이므로, 이들을 사용하면 정확한 결과가 나오지 않는다.

#### do-while loop

- 최소 한 번은 실행한다.

#### 어떤 loop 를 쓸까?

- 일반적으로 반복 횟수가 정해져 있을 때 for 문을 사용한다.
- while 은 반복 횟수가 정해져 있지 않거나 input 이 0일때까지 하는 반복 때 사용한다.
- do-while 은 while 을 사용하고 싶은데 한 번은 실행해야 할 때 사용한다.
</details>

<details>

<summary>4.Method</summary>

## 4.method

### Defining Methods

- Method signature 는 method name 과 parameter list 로 이루어져 있다.
- Method header 에 정의된 변수를 formal parameter 라고 한다.
- 함수를 정의할 때 static 을 사용하면 객체를 생성하지 않고도 사용할 수 있다.
- 함수를 실행할 때 parameter 에 넣는 변수를 actual parameter 혹은 argument 라고 한다.
- return value type 대로 return 해야 한다.

### Reuse Methods from Other Classes

- 같은 패키지에 있으면 import 할 필요 없이, ClassName.methodName을 통해 다른 class의 메소드를 사용할 수 있다.
- pass by value: 복사된 데이터를 전달하여 구성함으로써, 값을 수정해도 원본의 데이터에는 영향을 주지 않는다.

### Overloading Methods

- 메소드 이름은 같고 parameter list 는 다르다.
- 리턴값만 다른 것은 오버로딩이라고 볼 수 없다.
- 접근 제어자도 자유롭게 지정 가능하다.
- 사용하는 이유는 같은 기능을 하는 메소드를 하나의 이름으로 사용할 수 있고 메소드 이름을 절약할 수 있기 때문이다.


</details>

<details>

<summary>5.Array</summary>

## 5.Array

#### Introducing Arrays

- double[] myList = new double[10]; 과 같은 형태로 정의한다.
- 배열의 크기는 변수로도 지정 가능하다.
- datatype arrayRefVar[]; 같은 형태도 허용은 되나 비추천한다.
- 한번 배열이 생성되면 그 크기는 고정이다.
- arrayRefVar.length 를 통해 배열의 크기를 알 수 있다.

#### Default Values

- numeric primitive data type 에는 0
- char type 에는 '\u0000'
- boolean type 에는 false


#### Array Initializers

- 선언, 생성, 초기화를 한 번에 하는 방법: double[] myList = {1.9, 2.9, 3.4, 3.5};
- double[] myList; myList = {1.9, 2.9, 3.4, 3.5};와 같이 따로 하면 오류가 생긴다.

#### Copying Arrays

- list2 = list1 과 같이 '='을 통해 복사를  list1에서 list2로 reference value 를 복사한다.
- 그러면 복사된 배열과 원본의 배열이 변경될 때 서로 간의 값이 변경된다.
- pass by value 를 하려면 for 문을 통해 요소를 일일이 넣어주면 된다.
- System.arraycopy 메소드 이용
<pre><code>
System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
// src : 원본 배열
// srcPos : 원본 배열에서 복사할 항목의 시작 인덱스
// dest : 새 배열
// destPos : 새 배열에서 붙여넣을 시작 인덱스
// length: 복사할 개수
</code></pre>

#### Passing Arrays to Methods

- 메소드에 배열을 넘겨줄 때, 배열의 reference 가 넘어간다.

#### Pass by Value

- Pass by Value 란 복사된 데이터를 전달하여 구성함으로써, 값을 수정하여도 원본의 데이터에는 영향을 주지 않도록 하는 방식이다.
- 매개 변수의 type 이 primitive type 일 때와 배열일 때의 차이점: 원시값이 매개변수일 때 메소드 내부의 매개변수 값을 변경하여도 메소드 외부의 변수 값에 영향을 미치지 않는다. 배열이 매개변수 type 일 때, 배열에 대한 참조가 메소드에 전달된다. 따라서 메소드 내에서 발생하는 배열의 변경 사항은 원래 배열에 영향을 준다.

#### Array Class

- 정렬은 프로그래밍에서 자주 사용되므로, 자바는 정렬 메소드를 지원한다. java.util.Arrays.sort(array);
- Java8 부터 Arrays.parallelSort(list) 또한 지원하지만 이는 큰 데이터 처리할 때만 사용할 것을 추천한다.
- Array.equals(list1, list2) : 두 배열이 같은지 검사한다.
- Array.fill(list, 5) : 배열을 5로 채워 넣음, Array.fill(list, 1, 5, 8) : 1번 부터 5번까지 8로 채워 넣는다.
- Array.toString(list) : 배열의 요소들을 string 으로 return 한다.
</details>