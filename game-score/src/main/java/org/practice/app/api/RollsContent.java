package org.practice.app.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RollsContent {

    @JsonProperty("id")
    private int id;

    @JsonProperty("rolls")
    private List<Integer> rolls;

    public List<Integer> getRolls(){
        return rolls;
    }

    public int getId(){
        return id;
    }
}
