# OpenPayd Case Samil

## Run

- Go to project directory in terminal

- Run:
    ```yml
    mvn clean test
    ```

- To run a specific scenario use the special scenario tags:
    ```yml
    mvn clean test -q -Dcucumber.filter.tags="@SCN-OpenPayd-API-Case"
    ```
- Deafult driver type is Chrome. To select a driver type, add a driver tag in scenarios.

- Tests can be run headless by modifying the headless property in _test.properties_.