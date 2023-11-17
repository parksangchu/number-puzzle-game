## 기능 구현 목록

- [x] '간단 숫자 퍼즐'을 출력한다. <OutputView.printStartMessage()>
- [x] 1-15까지 중복되지 않은 숫자로 이루어진 무작위 순서의 2차원 리스트를 생성한다. <NumbersGenerator.generateNumbers()>
    - 리스트의 크기는 4 x 4이다.
- [x] 'Turn %d'을 출력한다. <OutputView.printTurn()>
- [x] 만들어진 리스트를 출력한다. <OutputView.printNumbers()>
- [x] '숫자 입력>'을 출력하고 사용자에게 입력을 받는다. <InputView.readExchangeNumber()>
    - 공백 및 ','을 제외하고 문자는 입력 불가하다. <Number.validateType()>
    - 1-15의 하나의 숫자만 입력 가능하다. <Number.validateRange()>
- [x] 교환 번호로 지정된 두 수의 위치를 바꾼다. <Numbers.swapNumbers()>
- [x] 턴을 증가시킨다. <Turn.increaseTurn()>
- [x] 만약 모든 수가 오름차순으로 정렬되었는지 확인한다. <Numbers.isAnswer()>
- [x] 정렬이 되지 않았다면 세 번째 과정부터 반복한다. <Controller.repeatProcess()>
- [x] 정렬이 되었다면 축하 메시지를 출력하고 프로그램을 종료한다. <OutputView.printEnd()>

