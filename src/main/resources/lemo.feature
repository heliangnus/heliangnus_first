Feature: Using chrome to access BaiDuPage

#  Scenario: Baduitesting
#    Given openBadu Page
#    When "Inputtestgpai"
#    Then output"lemoTesting -test"

  #mapping DDTDiverStep.java
  Scenario Outline:
    Given openBaidu page
    When getput "<input>"
    Then output "<show>"
    Examples:
      |  input  | show  |
      | testpai | lemonClass  |
      | Orange  | Orange      |

