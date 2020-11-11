package racingGame;

import java.util.List;
import javafx.util.Pair;
import racingGame.View.InputView;
import racingGame.View.ResultView;
import racingGame.racingGameException.IllegalNumRoundException;

public class GameClient {

  private static void runGame(RacingOperator racingOperator, int numRound) {
    int currentRound = 1;

    if (numRound < 1) {
      throw new IllegalNumRoundException();
    }

    ResultView.printResultMessage();

    for (; !isFinished(currentRound, numRound); currentRound += 1) {
      racingOperator.moves();
      // Step3의 로직. 어떻게 하면 코드를 예쁘게 바꿨을 지 검토해보기
      // List<Integer> status = carOperator.getPositions();
      // ResultView.printCurrentStatus(status);
      List<Pair<String, Integer>> status = racingOperator.getCurrentCarsStatus();
      ResultView.printCurrentStatusWithName(status);
    }

    ResultView.printWinner(racingOperator.extractWinners());
  }

  private static boolean isFinished(int currentRound, int numRound) {
    return currentRound > numRound;
  }

  public static void main(String[] args) {
    String names;
    int numRound;
    Cars cars;
    RacingOperator racingOperator;

    names = InputView.askUserNames();
    numRound = InputView.askNumRound();

    cars = Cars.of(names);
    racingOperator = RacingOperator.of(cars);

    runGame(racingOperator, numRound);
  }
}