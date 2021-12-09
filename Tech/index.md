## 인덱스가 무엇인가?

## Clustered Index, Non - Clustered Index

## 예시

인덱스란? 검색을 위해 임의로 규칙대로 부여된, 임의의 대상을 가르키는 무언가

ex) List<Object> objects =~~

objects.get(index)

**주민번호, 반 번호, 주소** 

### Index in Database

- 데이터 베이스는 내가 원하는 데이터를 어떻게 찾아오는 것일까?
- 왜 데이터가 많아질 수록 점점 느려질까?
- 왜 조인만 하면 느릴까?
- 왜 쿼리가 느릴까?

### Clustered Index , Non-Clustered Index

Cluster : 군집

Clustered : 군집화 

Clustered Index :군집화된 인덱스 

뭐가 군집? **인덱스와 데이터가 군집** 

**Clustered Index(PK)**

**이미 데이터가 정렬 되어 있는 상태**이므로 새로운 데이터가 들어오려면 밀어내고 들어와야 함

예시로 1~5등 까지 인덱스와 값으로 저장되어 있다고 했을 때 , 새로 온 데이터가 3등이라면 

기존 3~5등을 하나씩 밀어내고 비어있는 자리에 3등 인덱스와 이름이 들어가야 한다.

**범위 검색을 할 때 아주 강력하나 삽입 할 때는 비효율 적이다.**

- 순서대로
- 하나의 테이블에 하나만
- 범위 검색 시 좋음
- 존재 하는 PK 에 INSERT 하면 불리

**Non-Clustered Index(INDEX) → PK 찾아서 → PK 검색**

데이터와 연결 되어 있는 것이 아니라 인덱스와 연결 되어 간접 참조 되어 있다.

4등을 123번지에 있다. 123번지 가면 해당 사람의 이름이 있음.

해시 테이블 방식이라서 굉장히 빠르게 찾을 수 있다.

- **순서 상관 없음**
- 한 테이블에 여러개
- 추가 저장시 공간 필요
- INSERT시 추가 작업 필요(인덱스 생성)
- 카디널리티 : 인덱스를 평가하는데 사용되는 요소

**왜 인덱스를 써야하는가?**

ex) 이메일을 PK 로 가져갈 경우 성능 이슈가 있을 수 있다.

왜? 새로 들어온 이메일이 a로 시작하면 모두 다 이동해야함 

클러스터드 인덱스가 즉 PK 가 이메일로 되어 있어서 성능 이슈가 있음

유니크 키 , PK 는 다른 값으로 하는게 좋음 

따라서 별도 시퀀스를 PK 로 가져가야 한다.

인덱스는 많이 참조되는 항목에만 걸어야 한다. 

왜냐하면 미리 만들어야 하기 때문이다.