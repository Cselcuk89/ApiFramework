Feature: Validating Place API's
  Scenario: Verify is place is being successfully added using AddPlaceApi
    Given Add Place Payload
    When user calls "AddPlaceApi" with post request
    Then Api call is success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"