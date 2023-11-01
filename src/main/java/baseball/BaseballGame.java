package baseball;

public class BaseballGame {
    public void start() {
        Output.printGameStart();
        run();
    }

    private void run() {
        Computer computer = new Computer();

        while (true) {
            User user = new User();

            Umpire umpire = new Umpire();
            umpire.compareUserWithComputer(user.getNumbers(), computer.getNumbers());
            if (umpire.isThreeStrike()) {
                break;
            }
        }

        Output.printGameEnd();
        exist();
    }

    private void exist() {
        Mode mode = new Mode();
        if (mode.isRestart(mode.getMode())) {
            run();  // 재시작
        }  // 완전히 종료
    }
}
