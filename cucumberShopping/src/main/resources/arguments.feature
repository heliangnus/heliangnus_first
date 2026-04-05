Feature:

  Background:
    Given open jingdong website

    Scenario: mobile xiaomiaddto shopcart
      When search xiaomiphone
      Then display xiaomi pro

    Scenario: mobile huaweiaddto shopcart
      When search huawei miphone
      Then display huawei pro

    Scenario: mobile xiaomi-param shopcart01
      When search "xiaomiphone"
      Then display "xiaomi pro"


    Scenario Outline: mobile outline_params shopcart02
      When search_outline "<input>"
      Then display_outline "<show>"

      Examples:
      |input | show |
      |xiaomi|xiaomi pro|
      |xiaomi02|xiaomi pro02|
      |huawei  |huawei pro  |
      |huawei02|huawei pro02|


