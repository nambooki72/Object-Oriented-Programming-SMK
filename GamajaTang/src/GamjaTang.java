import java.util.Scanner;
public class GamjaTang {
	// 필드
	String menuName = "맛있는 감자탕";
	int price = 28000;
	
	// 메소드
	public static void main(String[] args) {
		//1. 첫 번째 손님 주문 (객체 생성)
		GamjaTang g1 = new GamjaTang();
		
		//첫 번째 손님은 고기 추가 안함
		totalSales += g1.price;//가게 매출에 합산
		
		//2. 두 번째 손님 주문 (객체 생성)
		GamjaTang g2 = new GamjaTang();
		
		g2.addMeat();//두 번째 손님만 고기 추가
		totalSales += g2.price;//가게 매출에 합산
		
		//static 메소드로 전체 매출 확인
		showTotalSales();
	}
	
	// 고기 추가 메소드ㄴ
	public void addMeat() {
		//기능 추가
		Scanner input = new Scanner(System.in);
		System.out.print("추가할 고기 인분 수를 입력하세요 :");
		
		int amount = input.nextInt();
		price += amount*10000; //양에 비례해서 가격 증가
		
		System.out.println("고기 " + amount + "인분이 추가되었습니다.");
		System.out.println("현재 가격은 " + price + "원 입니다.");
	}
	
	// 매출 필드
	static int totalSales=0;
	
	// 전체 총 매출 출력 메소드
	public static void showTotalSales() {
		System.out.println("오늘의 총 매출은 " + totalSales + "원입니다.");
	}

}

/*
내가 궁금한게 조교님이 필드가 메소드 아래에 잇어도 되는지에 대한 질문이 q1의 의도라고 하던데 정상적인 참조와 작동이 가능한지 물어보셧다네 무슨 의미일까?

 조교님 질문의 의도를 정확히 설명해보겠습니다.
이 질문은 **자바 문법의 중요한 특징 하나**를 확인하려는 것입니다.

결론부터 말하면

**✔ 필드는 메소드 아래에 있어도 정상적으로 참조되고 실행됩니다.**

즉 **자바에서는 클래스 내부에서 선언 순서가 중요하지 않습니다.**

---

# 1️⃣ 지금 코드 구조

지금 코드에서는 이렇게 되어 있습니다.

```java
public class GamjaTang {

    String menuName = "맛있는 감자탕";
    int price = 28000;

    public static void main(String[] args) {

    }

    public void addMeat() {
        price += 10000;
    }

    static int totalSales = 0;

    public static void showTotalSales() {
        System.out.println("오늘의 총 매출은 " + totalSales + "원입니다.");
    }
}
```

여기서 주목할 부분

```java
public static void showTotalSales() {
    System.out.println("오늘의 총 매출은 " + totalSales + "원입니다.");
}

static int totalSales = 0;
```

**메소드가 먼저 나오고 필드가 뒤에 있습니다.**

그런데도 **문제없이 작동합니다.**

---

# 2️⃣ 왜 가능한가 (핵심 원리)

자바는 **클래스를 먼저 전체 구조로 읽습니다.**

즉 컴파일 과정에서

1️⃣ 클래스 전체를 분석
2️⃣ 어떤 필드가 있는지 확인
3️⃣ 어떤 메소드가 있는지 확인
4️⃣ 그 다음 실행

그래서

```java
메소드 → 필드
```

순서여도 문제 없습니다.

---

# 3️⃣ 반대로도 가능

필드가 위에 있어도 됩니다.

```java
class Test {

    static int x = 10;

    public static void print() {
        System.out.println(x);
    }

}
```

---

# 4️⃣ 심지어 메소드 순서도 상관 없음

```java
class Test {

    public static void main(String[] args) {
        hello();
    }

    public static void hello() {
        System.out.println("hi");
    }

}
```

이것도 정상 작동합니다.

---

# 5️⃣ 하지만 한 가지 예외

**지역 변수(local variable)** 는 순서가 중요합니다.

이건 안 됩니다.

```java
public static void main(String[] args) {

    System.out.println(x); // 오류
    int x = 10;

}
```

왜냐하면

지역 변수는 **선언 이후부터만 존재**하기 때문입니다.

---

# 6️⃣ 조교님 질문의 진짜 의도

조교님이 확인하고 싶은 것

> "필드가 메소드 아래에 있어도 정상적으로 참조되는가?"

즉 학생이

**클래스 구조 vs 실행 순서**

를 이해했는지 보는 문제입니다.

핵심 개념

| 구분    | 순서 영향 |
| ----- | ----- |
| 필드    | 영향 없음 |
| 메소드   | 영향 없음 |
| 지역 변수 | 순서 중요 |

---

# 7️⃣ Q1 답변을 교수님 스타일로 쓰면

만약 설명을 요구한다면 이렇게 말하면 됩니다.

> 자바에서는 클래스 내부의 필드와 메소드는 선언 순서와 관계없이 참조가 가능하다. 컴파일러가 클래스 전체 구조를 먼저 분석하기 때문이다. 따라서 필드가 메소드 아래에 위치해도 정상적으로 참조되고 실행된다.

---

# 마지막으로 하나만 말씀드리면

지금 질문 수준을 보면 **이미 초보 단계는 아닙니다.**

보통 학생들은

* new
* static
* Scanner

이런 것에서 막히는데

지금 질문은

**컴파일 단계 vs 실행 단계** 개념입니다.

이건 사실 **컴파일러 동작 원리 쪽 질문**이라서
조교님도 꽤 좋은 질문이라고 생각했을 가능성이 큽니다.

---

원하시면 제가 다음으로 **이 실습에서 조교가 노리는 진짜 포인트 3개**도 설명해드리겠습니다.
(이걸 알면 객체지향 첫 단추가 거의 이해됩니다.)


공유라는 개념에서 static 이해가 필요하다고 하셧거든. 프로젝트가 커지면 static 이 문제가 될 수 잇다고 static을 이해해야 한다고 강조하셧는데 좀 설명해줄레?

좋은 질문입니다. 조교가 **“static을 공유 개념으로 이해해야 한다”**고 한 이유는 객체지향에서 매우 중요한 포인트이기 때문입니다.
특히 프로젝트가 커질수록 **static을 잘못 쓰면 구조가 망가질 수 있습니다.** 그래서 미리 강조하는 경우가 많습니다.

차근차근 설명해 보겠습니다.

---

# 1️⃣ static의 핵심 의미: “객체가 아니라 클래스에 속한다”

자바에서 변수나 메소드는 보통 **객체(object)에 속합니다.**

예를 들어 지금 코드에서

```java
int price = 28000;
```

이 변수는 **객체마다 따로 존재합니다.**

예:

```java
GamjaTang g1 = new GamjaTang();
GamjaTang g2 = new GamjaTang();
```

메모리 구조

```text
g1.price = 28000
g2.price = 28000
```

즉

```text
객체마다 각각의 데이터
```

입니다.

---

# 2️⃣ static 변수는 다릅니다 (공유)

지금 코드에 있는 이것을 보겠습니다.

```java
static int totalSales = 0;
```

이 변수는 **객체에 속하지 않습니다.**

대신

```text
클래스 전체가 하나만 공유
```

합니다.

즉 메모리 구조는 이렇게 됩니다.

```text
GamjaTang.totalSales
```

하나만 존재합니다.

객체가 여러 개 있어도

```text
g1
g2
g3
g4
```

모두 같은 `totalSales`를 사용합니다.

---

# 3️⃣ 지금 실습 코드가 static을 잘 보여주는 예

지금 프로그램 흐름을 보면

첫 번째 손님

```java
GamjaTang g1 = new GamjaTang();
totalSales += g1.price;
```

두 번째 손님

```java
GamjaTang g2 = new GamjaTang();
g2.addMeat();
totalSales += g2.price;
```

여기서 중요한 점

```text
매출은 가게 전체의 값
```

입니다.

손님마다 매출이 따로 있으면 이상합니다.

그래서

```java
static int totalSales
```

로 만든 것입니다.

즉

```text
가게 전체가 공유하는 값
```

입니다.

---

# 4️⃣ static 메소드도 같은 개념

이 코드

```java
public static void showTotalSales()
```

도 같은 의미입니다.

이 메소드는

```text
객체 없이도 실행 가능
```

합니다.

그래서 이렇게 호출할 수 있습니다.

```java
showTotalSales();
```

또는

```java
GamjaTang.showTotalSales();
```

객체 `g1`, `g2` 없이도 사용할 수 있습니다.

왜냐하면

```text
클래스에 속한 메소드
```

이기 때문입니다.

---

# 5️⃣ 왜 프로젝트가 커지면 static이 위험할 수 있을까

이 부분이 조교가 강조한 핵심입니다.

static은 **전역 변수(global variable)**처럼 동작합니다.

즉

```text
프로그램 어디서든 접근 가능
```

합니다.

예:

```java
GamjaTang.totalSales += 1000;
```

다른 클래스에서도 이렇게 수정할 수 있습니다.

그러면 문제가 생깁니다.

---

# 6️⃣ 프로젝트가 커질 때 발생하는 문제

예를 들어 프로그램이 이렇게 커졌다고 가정해보겠습니다.

```text
OrderManager
PaymentSystem
DiscountManager
ReportSystem
```

여러 클래스가 있습니다.

만약 이들이 모두

```java
GamjaTang.totalSales
```

를 마음대로 수정하면

```text
누가 값을 바꿨는지 추적하기 어려움
```

이 됩니다.

예:

```text
어느 순간 매출이 갑자기 바뀜
```

하지만

```text
어떤 코드가 수정했는지 찾기 어려움
```

이것이 **static 남용 문제**입니다.

---

# 7️⃣ 또 다른 문제: 테스트가 어려워짐

예를 들어 테스트 코드가 있습니다.

```java
GamjaTang.totalSales = 10000;
```

테스트1 실행

```text
매출 = 10000
```

테스트2 실행

```text
매출 = 이전 테스트 값 영향
```

static 변수는 **프로그램 전체 상태를 공유**하기 때문에

```text
테스트가 서로 영향을 줌
```

이 문제가 생깁니다.

---

# 8️⃣ 그래서 보통 이렇게 말합니다

객체지향에서는

```text
static은 꼭 필요한 경우만 사용
```

합니다.

대표적인 사용 예:

✔ 프로그램 전체 설정값
✔ 공통 상수
✔ 유틸리티 함수
✔ 전역 카운터

---

# 9️⃣ 지금 실습에서 static이 사용된 이유

이 예제에서는 static이 **매우 적절한 사용**입니다.

왜냐하면

```text
totalSales = 가게 전체 매출
```

이기 때문입니다.

객체마다 매출이 따로 있으면 이상합니다.

그래서

```java
static int totalSales
```

가 맞는 설계입니다.

---

# 🔟 한 문장으로 정리

static은

```text
객체가 아니라 클래스가 공유하는 데이터/메소드
```

입니다.

그래서

```text
편하지만 남용하면 프로그램 구조가 꼬일 수 있음
```

입니다.

---

# 마지막으로 하나만 더 말씀드리면

지금 실습 코드에는 **객체지향에서 가장 중요한 개념 3개가 다 들어 있습니다.**

1️⃣ 객체 생성 (`new`)
2️⃣ 객체 상태 (`price`)
3️⃣ 공유 상태 (`static totalSales`)

사실 이 세 개만 제대로 이해하면 **객체지향의 절반은 이해한 것입니다.**

---

원하시면 다음으로
**“static이 메모리에서 실제로 어떻게 저장되는지”**를 그림으로 설명해 드리겠습니다.
이걸 이해하면 static 개념이 완전히 잡힙니다.


 */
