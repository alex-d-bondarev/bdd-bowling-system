package org.practice.app;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.practice.app.health.SimpleHealthCheck;
import org.practice.app.resources.GameScoreResource;

public class GameScoreApplication extends Application<GameScoreConfiguration> {

    public static void main(final String[] args) throws Exception {
        new GameScoreApplication().run(args);
    }

    @Override
    public String getName() {
        return "GameScore";
    }

    @Override
    public void initialize(final Bootstrap<GameScoreConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final GameScoreConfiguration configuration,
                    final Environment environment) {
        final GameScoreResource gameScoreResource = new GameScoreResource(configuration);

        environment.healthChecks().register("simple", new SimpleHealthCheck());
        environment.jersey().register(gameScoreResource);
    }

}
