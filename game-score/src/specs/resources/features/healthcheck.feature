Feature: Health-check response

Scenario: Application is healthy
When I request healthcheck endpoint from admin port
Then response should contain healthy = true