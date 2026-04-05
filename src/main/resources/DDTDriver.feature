Feature: Using DDTDriver to iterator the data


  #mapping DDTDiverStep.java
  Scenario Outline:
  Given openBaidu page
  When getput "<input>"
  Then output "<show>"
  Examples:
  |  input  | show  |
  | testpai123 | lemonClass123  |
  | Orangesss123  | Orangedddd123      |