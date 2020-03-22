package org.practice.app.health;

import com.codahale.metrics.health.HealthCheck;

public class SimpleHealthCheck extends HealthCheck {
    @Override
    protected Result check() {
        return Result.healthy();
    }
}
