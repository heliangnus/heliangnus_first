Feature: using background int common parts

  Background:
    Given open jingdong website

    Scenario: mobile addto shopcart
      When search "xiaomiphone"  1
      Then display  "xiaomi pro"

    Scenario: mobile addto shopcart
      When search "huawei miphone"  2
      Then display  "huawei pro"

   Scenario: mobile add to shopcart using user defined params
     When I have a red ball
     Then display test

