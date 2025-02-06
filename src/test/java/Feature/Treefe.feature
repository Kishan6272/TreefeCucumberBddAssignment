Feature: Launch app and navigate to + icon

  Scenario Outline: open treefe app and click on + icon and do some navigation
    Given open treefe app through <capabilities> with <AppPackage> and <AppActivity>
    When open treefe app and click + icon
    Then quit the app driver
    Examples:
      | capabilities                                                                                                                                    | AppPackage         | AppActivity                               |  |
      | deviceName=Pixel 6a,platformName=Android,platformVersion=11,appPackage=com.android.dialer,appActivity=com.android.dialer.main.impl.MainActivity | com.android.dialer | com.android.dialer.main.impl.MainActivity |  |