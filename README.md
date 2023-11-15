## 기능 구현 목록

- [x] '간단 숫자 퍼즐'을 출력한다. <OutputView.printStartMessage()>
- [x] 1-8까지 중복되지 않은 숫자로 이루어진 무작위 순서의 배열을 생성한다. <NumbersGenerator.generateNumbers()>
    - 배열의 크기는 8이다. <Numbers.validateSize()>
- [x] 'Turn 1'을 출력한다. <OutputView.printTurn()>
- [x] 만들어진 배열을 출력한다. <OutputView.printNumbers()>
- [x] '교환할 두 숫자를 입력>'을 출력하고 사용자에게 입력을 받는다. <InputView.readExchangeNumber()>
    - 공백 및 ','을 제외하고 문자는 입력 불가하다. <Number.validateType()>
    - 1-8의 숫자만 입력 가능하다. <Number.validateRange()>
    - 두 개의 숫자만 입력 가능하다. <Convertor.validateSize()>
    - 중복된 숫자를 입력할 수 없다. <Convertor.validateDuplicated()>
- [x] 입력 받은 번호를 교환 번호 리스트로 저장한다. <Convertor.convertToExchangeNumbers()>
- [x] 교환 번호로 지정된 두 수의 위치를 바꾼다. <Numbers.swapNumbers()>
- [x] 턴을 증가시킨다. <Turn.increaseTurn()>
- [x] 만약 모든 수가 오름차순으로 정렬되었는지 확인한다. <Numbers.isAnswer()>
- [x] 정렬이 되지 않았다면 세 번째 과정부터 반복한다. <Controller.repeatProcess()>
- [x] 정렬이 되었다면 축하 메시지를 출력하고 프로그램을 종료한다. <OutputView.printEnd()>

***

## 실행 결과

간단 숫자 퍼즐

Turn 1<br>
[8, 7, 2, 5, 6, 1, 3, 4]

교환할 두 숫자를 입력><br>
1,1

중복된 숫자는 입력 불가능합니다.

교환할 두 숫자를 입력><br>
1,8

Turn 2<br>
[1, 7, 2, 5, 6, 8, 3, 4]

교환할 두 숫자를 입력><br>
2,7

Turn 3<br>
[1, 2, 7, 5, 6, 8, 3, 4]

교환할 두 숫자를 입력><br>
3,7

Turn 4<br>
[1, 2, 3, 5, 6, 8, 7, 4]

교환할 두 숫자를 입력><br>
4,7

Turn 5<br>
[1, 2, 3, 5, 6, 8, 4, 7]

교환할 두 숫자를 입력><br>
4,5

Turn 6<br>
[1, 2, 3, 4, 6, 8, 5, 7]

교환할 두 숫자를 입력><br>
5,6

Turn 7<br>
[1, 2, 3, 4, 5, 8, 6, 7]

교환할 두 숫자를 입력><br>
8,6

Turn 8<br>
[1, 2, 3, 4, 5, 6, 8, 7]

교환할 두 숫자를 입력><br>
7,8

Turn 9<br>
[1, 2, 3, 4, 5, 6, 7, 8]

축하합니다! 9턴만에 퍼즐을 완성하셨습니다!

