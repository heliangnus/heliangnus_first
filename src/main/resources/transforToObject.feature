Feature:  convert to object
  Background:
    Given open baidu website
      | firstNa | secNa | birth |
      | Na |  Wang      | 1922-09-01  |
      | Hui |  [blank]      | 1924-08-01  |
      | Ming |  Zhang      | 1923-03-01  |

#      | firstNa | Na |
#      | secNa |  Wang|
#      | birth |  Liu |
# 这里放置的就是@Given对应的方法体中方法的参数List<Autor> autors. 省略了传入各个参数执行的方法体步骤，遍历输出.

  Scenario: pass user defined Object as params
    When search "xiaomiphone"
    Then display  "xiaomi pro"