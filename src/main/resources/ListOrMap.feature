Feature:  Map or List as datasource as passing params to Methods
  Background:
    Given open jingdonggggg website
      | firstNa | secNa | birth |
      | Na |  Wang      | 1922-09-01  |
      | Hui |  Liu      | 1924-08-01  |
      | Ming |  Zhang      | 1923-03-01  |


  Scenario: mobile addto shopcart
    When search "xiaomiphone"
    Then display  "xiaomi pro"

