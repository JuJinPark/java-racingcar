# 자동차 경주 게임
초간단 자동차 경주 게임을 구현한다.

## 기능 요구사항
- 초간단 자동차 경주 게임을 구현한다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

## 기능 구현 현황
- 주사위를 던져서 4이상 숫자가 나오면 자동차 전진
    - 자동차 전진
    - 주사위 던지기
- 스테이지가 종료되면 현재 현재 상황을 출력한다
- 게임 횟수 입력
- 자동차 이름을 쉼표를 기준으로 입력