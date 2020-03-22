package org.practice.app.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ScoreResponse {
    private RollsContent rolls;
    private int score;

    public ScoreResponse(){
        // Jackson deserialization
    }

    public ScoreResponse(RollsContent rolls, int score) {
        this.rolls = rolls;
        this.score = score;
    }

    @JsonProperty
    public List<Integer> getRolls(){
        return rolls.getRolls();
    }

    @JsonProperty
    public int getId(){
        return rolls.getId();
    }

    @JsonProperty
    public int getScore(){
        return score;
    }
}
