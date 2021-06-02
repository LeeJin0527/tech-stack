
# 기본 프로그래밍 구조

1. 자바는 모든 **메서드**를 **클래스** 안에 선언한다 . **비정적(nonstatic) 메서드**는 메서드가 속한 클래스의 객체로 호출한다. 
2. **정적 메서드**는 객체로 호출하지 않는다. 프로그램 실행은 정적 메서드인 main에서 시작한다.
3. 자바의 기본 타입은 총 여덟 가지 ( **정수타입 네가지** , **부동소수점 타입 두가지**,  **char**, **boolean** 다. )
5. .자바의 **연산자와 제어 구조**는 C나 자바스크립트와 아주 비슷하다.
6. **Math 클래스**는 일반적인 수학함수를 제공한다.
7. **String 객체**는 **문자** (더 엄밀히 말하면 UTF - 16 으로 인코드된 유니코드의 코드 포인트) 의 **연속**이다.
8. **System.out** 객체로 터미널에 **결과를 표시**할 수 있다. **System.in 에 Scanner를 연결** 하면 터미널에 **입력 한 것을 읽을 수 있다.**
9. **배열과 컬렉션**은 타입이 같은 요소를 모으는 데 사용한다.
 


## 메서드(정적 / 비정적) , 클래스 , 기본타입 , 객체,  배열,  컬렉션 

**메서드**
[정적 / 비정적 메소드](https://m.blog.naver.com/ndb796/221203398703)

정적 : "공유하는" 이라고 이해하면 됨 공통적으로 사용되는 부분에 선언하여 사용

~~~java
                
   public class Util {
          private int UtilID;
          public static int fps = 20;
          
          public Util(int utilID){
          this.UtilID = utilID;
          }
          public static void setFps(int fps){
          Util.fps = fps;
          }
          public static int getFps(){
          return fps;
          }
          public void showFps(){
          System.out.println("유틸 번호: " +utilID);
          Sysyem.out.println("현재 게임 속도는"+getFps() + "입니다");
      }
    }
~~~
**비정적 멤버**는 특정한 객체마다 별도로 존재한다.

그러한 측면에서 인스턴스 멤버라고 부른다.
객체가 생성되는 시점에서 멤버가 생성되고 , 객체를 생성해야만 해당멤버를 사용할 수 있다.
객체가 사라지면 멤버도 사라진다.

**정적 멤버** 는 클래스당 하나씩 생성된다

멤버는 객체 내부가 아니라 별도의 공간에서 생성되어 메모리 형태로 관리된다.
그래서 클래스 멤버라고 불린다.
클래스가 로딩되는 순간에 멤버가 생성되고 , 객체를 생성하기도 전부터 이미 메모리 상에 존재하게 된다.
객체가 사라져도 해당 멤버는 사라지지 않고 모든 동일 클래스의 객체 사이에서 공유된다.

~~~ java 
  public class Util {
          private int utilID;
          public static int fps = 20;
          public Util(int utilID){
              this.utilID = utilID;
          }
          public static void setFps(int fps){
          Util.fps = fps;
          utilID = 1; //error
          //정적 메소드인 setFps() 에서 비정적 멤버인 utilID의 값을 바꾸려 하면 오류가 남. 
          이유는 클래스마나 공유되는 메소드가 특정 객체의 멤버 값을 바꾸는 것 자체가 모순
          }
  ~~~
![enter image description here](https://user-images.githubusercontent.com/64263694/120460831-6df22180-c3d4-11eb-8787-513bcbb13786.png)

util1, util2, util3 객체는 모두 개별적인 비 정적 멤버인 utilID를 가지고 있고 정적 멤버로 fps 공유하는 것임 

[enter link description here](https://gyuni.tistory.com/63)
**클래스 / 객체 /메소드 /인스턴스**
**1.객체와 클래스**
클래스란 유사한 특징을 지닌 객체들의 속성을 묶어놓은 집합체
하나의 클래스를 정의하고 그 클래스로부터 하나의 실례를 만드는 것을 
"객체 또는 인스턴스를 생성한다" 라고 한다
다시말해 클래스는 객체를 만드는 기능을 한다 
구조체와 다른 점은 구조체는 값만 저장하는 저장값 정의만 하지만 
클래스는 저장값 뿐만 아니라 setName 같은 행동정의도 할 수 있음.
- **객체와 인스턴스의 차이**
Animal cat = new Animal()
cat이라는 객체는  Animal의 instance
즉 인스턴스는 특정 객체가 어떤 클래스의 객체 인지를 관계위주로 설명 할 때 사용됨 
    - cat은 객체 
    - cat 은 Animal의 instance
~~~ java
Soldier 라이언 = new Soldier();
Soldier 맥아더 = new Soldier();
Soldier 이순신 = new Soldier();
~~~
Soldier 클래스에 라이언이라는 객체를 생성
라이언은 Soldier의 인스턴스이다.

**2.인스턴스 변수**
객체들에게 이름을 부여하고 싶다!

~~~ java 
    public class Soldier{                
            String name;
    }
   ~~~
클래스에 변수 추가 이런 변수를 인스턴스 변수라고 부름.
또는 멤버 변수, 속성이라고 함

ryan.name 으로 접근하여 사용 가능
~~~ java
  public class Soldier {
              String name;
              public static void main(String[] args){
              Soldier ryan = new Soldier();
              System.out.println(ryan.name);
  }
   ~~~
**3. 메소드**
메소드는 클래스 내에 구현된 함수를 의미하는데 보통 함수라고 말하지 않고 메소드라고 한다.
변수가 정적인 의미라면 메소드는 동적인 의미가 강하다 
~~~ java
    public class Soldier {
        String name;
        public void setName(String name){
        this.name = name;
        }
        public static void main(String[] args){
        Soldier ryan = new Soldier();
        ryan.setName ("Lee-jin");
        System.out.println(ryan.name);
        }
    }
 ~~~               
                
                
**기본 타입**
**배열 / 컬렉션**

[배열과 컬렉션](https://sabarada.tistory.com/123)



[enter link description here](http://tcpschool.com/java/java_generic_concept)

컬렉션이란?
컬렉션 객체는 여러 원소들을 담을 수 있는 자료구조를 뜻한다
배열이 가장 기본적인 자료구조이며 DTO또한 자료를 담는 하나의 방식이라고 볼 수 있다.

자바에서의 자료구조 유형은 다음과 같다.
 -  순서가 있는 목록인 List형
 - 순서가 중요하지 않은 목록인 Set형
 - 먼저 들어온 것이 먼저 나가는 Queue형
 - key- value 형태로 저장되는 Map형
배열과의 차이점은 정적 메모리 할당이 아닌 동적 메모리 할당을 하게 된다
컬렉션은 인터페이스고 아래에서 구현부들이 받아 구현하고 있음.

![enter image description here](https://user-images.githubusercontent.com/64263694/120466392-faeba980-c3d9-11eb-897f-75dd7f0dd578.png)

**Collection 인터페이스에 선언된 주요 메소드**

![enter image description here](https://user-images.githubusercontent.com/64263694/120466396-fc1cd680-c3d9-11eb-8571-d31b0eef496f.png)


