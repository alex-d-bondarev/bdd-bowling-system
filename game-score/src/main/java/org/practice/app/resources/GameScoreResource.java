package org.practice.app.resources;

import com.codahale.metrics.annotation.Timed;
import org.practice.app.GameScoreConfiguration;
import org.practice.app.api.RollsContent;
import org.practice.app.api.ScoreResponse;
import org.practice.app.core.GameScorer;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/scoreRolls")
@Produces(MediaType.APPLICATION_JSON)
public class GameScoreResource {
    public GameScoreResource(GameScoreConfiguration gameScoreConfiguration) {

    }

    @POST
    @Timed
    @Consumes(MediaType.APPLICATION_JSON)
    public ScoreResponse scoreRolls(RollsContent rolls){
        GameScorer g = new GameScorer();
        rolls.getRolls().forEach(r -> g.roll(r));

        return new ScoreResponse(rolls, g.score());
    }

}
