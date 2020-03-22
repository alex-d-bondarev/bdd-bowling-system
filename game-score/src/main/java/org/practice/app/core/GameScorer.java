package org.practice.app.core;

public class GameScorer {
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int firstInRound = 0;
        for (int round = 0; round < 10; round++) {
            if (isStrike(rolls[firstInRound])) {
                score += 10 + nextTwoBallsForStrike(firstInRound);
                firstInRound++;
            } else if (isSpare(firstInRound)) {
                score += 10 + nextBallForSpare(firstInRound);
                firstInRound += 2;
            } else {
                score += twoBallsInRound(firstInRound);
                firstInRound += 2;
            }
        }
        return score;
    }

    private int twoBallsInRound(int firstInRound) {
        return rolls[firstInRound] + rolls[firstInRound + 1];
    }

    private int nextBallForSpare(int firstInRound) {
        return rolls[firstInRound + 2];
    }

    private int nextTwoBallsForStrike(int firstInRound) {
        return rolls[firstInRound + 1] + rolls[firstInRound + 2];
    }

    private boolean isStrike(int roll) {
        return roll == 10;
    }

    private boolean isSpare(int firstInRound) {
        return rolls[firstInRound] + rolls[firstInRound + 1] == 10;
    }
}
