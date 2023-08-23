## Step 1: 로또 당첨번호 생성기 순서도 생성하기
<br>

- 랜덤한 로또 당첨 번호를 생성하는 함수의 **순서도부터** 만들기. 이 함수는 다음과 같은 기능을 갖습니다.
    - 1부터 45 사이의 랜덤한 숫자를 생성합니다.
    - Collection 타입 중 하나의 형태로, 6개의 랜덤한 숫자를 저장합니다.
        - 6개의 숫자는 **'서로 겹치지 않아야'** 합니다.
    - 이 함수는 6개의 랜덤한 숫자를 저장한 Collection 타입 중 하나의 형태로 값을 반환합니다.
<br><br>

---

### 순서도

![Lotto](https://github.com/minsik321/Java-Workspace/assets/141251335/93ca69bc-8a69-44e4-b5ad-655c7841fac2)

<br><br>

---

## Step 2:  내 번호와 맞추어보기!

- Step1의 순서도를 바탕으로 `로또 당첨 번호`를 생성하는 함수를 생성합니다.
- 내가 `찍은 번호` 배열을 `myLottoNumbers` 변수에 할당합니다.
- `찍은 번호`와 `로또 당첨 번호` 의 겹치는 숫자를 확인하는 함수를 생성합니다.

<br>

---

### 출력시 화면

예시 1)

<img width="350" alt="스크린샷 2023-08-16 오후 7 31 23" src="https://github.com/minsik321/Java-Workspace/assets/141251335/5ee3608e-b042-45da-9761-3639070dc81d">

예시 2)

<img width="350" alt="스크린샷 2023-08-16 오후 7 32 03" src="https://github.com/minsik321/Java-Workspace/assets/141251335/1944c56b-f880-4ee5-8885-fd8993616a98">
<br>

---

### 개선점

- 객체들의 네이밍 방식을 통일하여 보다 알아보기 편하게 한다.

---


## Step 3: 로또 당첨 번호를 회차별로 저장하고, 확인하자!

- 회차와 Lotto번호들을 저장하는 Dictionary 타입의 변수를 생성합니다.
  - `"1회차": [1, 2, 3, 4, 5, 6]` 와 같은 `Key`와 `Value`를 가집니다.
- Step 2의 `로또 당첨 번호 생성 함수`를 호출할 때마다, 회차와 로또 번호를 Dictionary에 저장하고자 합니다. 이와 같은 동작을 구현하기 위한 별도의 함수를 만들어봅시다.
  - 새로운 `로또 당첨 번호`를 생성하면, `직전 회차`에 1을 더해 `금번 회차`를 만들어냅니다.
  - `회차`를 Key로, 새로운 `로또 당첨 번호`를 Value로 하는 Dictionary 에 저장합니다.
- `로또 당첨 번호`를 생성한 후 Dictionary에 저장된 로또 당첨 번호를 확인해봅니다.
  - `로또 당첨 번호`를 5번 생성합니다.
  - Dictionary 에서 원하는 회차의 로또 당첨 번호를 찾습니다.
    - Optional 값을 안전하게 추출합니다.


<br>

---

### 출력시 화면

<img width="376" alt="스크린샷 2023-08-23 오후 7 26 10" src="https://github.com/minsik321/Java-Workspace/assets/141251335/870390ed-2e90-4637-b74d-7641c44209f0">

---
