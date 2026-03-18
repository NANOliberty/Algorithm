# 알고리즘 문제 풀이
> Platform: 백준 & 프로그래머스 <p>
> Language: Python, Java <p>
> 직접 작성한 velog: https://velog.io/@nano_o/series/Algorithm

<br>

# 일정
## [week 1]_3/5
- 도전 문제 2개

## [week_2]_3/12
- 기초 복습 (입출력, 반복, 조건, 함수, 배열)

## [week_3]_3/19
- 자료구조 Part1 (스택, 큐, 덱, 연결리스트)

<br>

---

<br>

### 스택 / 큐
```java
Deque<Integer> stack = new ArrayDeque<>();
```
- **스택**: `push()`, `pop()`, `peek()`
- **큐**: `offer()`, `poll()`, `peek()`
- **덱**: `addFirst()/addLast()`, `removeFirst(), removeLast()`, `peekFirst(), peekLast()`

<br>

### 우선순위 큐
```java
// 최소 힙 (기본)
PriorityQueue<Integer> minPq = new PriorityQueue<>(); 

// 최대 힙
PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder()); 
```
- `offer()`, `poll()`, `peek()`

<br>

### `LinkedList` vs `ArrayList`
삽입 및 수정이 용이, 조회가 용이

