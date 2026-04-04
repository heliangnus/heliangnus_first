Feature:  convert to object
  Background:
    Given open baidu website
    """json
    {
        "firstNa":"liang",
        "secNa":"He",
        "birth":"1995-09-09"
    }
    """

  Scenario: pass user defined Object as params
    When search-json "xiaomiphone"
    Then display-json  "xiaomi pro"