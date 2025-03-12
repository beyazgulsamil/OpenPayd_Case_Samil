Feature: OpenPayd-API-Case

  @API-Test @SCN-OpenPayd-API-Case
  Scenario: Reqres 1
    * Create user with parameter:
      | name       | Şamo    |
      | job        | Babo    |
    * Update user with parameters:
      | name       | Şamil      |
      | job        | Beyazgül   |
    * Delete user with id CONTEXT-userID

  Scenario: Reqres 2
    * Create and verify user with parameter after 5 seconds:
      | name       | Şamo    |
      | job        | Babo    |

