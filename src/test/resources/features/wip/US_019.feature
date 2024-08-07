Feature:US_019 : As a restaurant manager,I can access the Merchant panel to access information about my restaurant.

  Scenario: TC_1901 : The text "Merchant Login" should be appear .
    Given The user opens the browser.
    Then  Enters the URL.
    And Verify correctness the url of page.
    And Verify the presence of the "Merchant Login" text.
    Then The user closes the page.

   Scenario: TC_1902 : The username, password boxes and the sign up button should be visible.
   Given The user opens the browser.
   And  Enters the URL.
   When Verify the presence of the username box.
   And Verify the presence of the password box.
   Then Verify the presence of the sign in button.
   And The user closes the page.

  Scenario: TC_1903 : The related background text "Username" should be visible in the box.
    Given The user opens the browser.
    When Enters the URL.
    Then Verify the presence of the "Username" text in the username box background.
    And enter a text in the username box.
    Then Verify the presence of the "Username" text in the username box background.
    And Delete the written letters from the username box.
    Then Verify absence the written lettrs from the username box.
    Then Verify the presence of the "Passweord" text in the password box in the background.
    When Enter a text in the password box
    Then Verify the presence of the "Password" text in the password box in the background.
    And Delete the written letters from the password box.
    Then Verify absence the written lettrs from the password box.
    And The user closes the page.

  Scenario: TC_1904 The " eye asign " in the password box should be visible .
    When The user opens the browser.
    Then Enters the URL.
    And Verify the presence of the eyeAsign in the password box.
    Given Enter a text in the password box
    And Verify the presence of the eyeAsign in the password box.
    Then Verify the letters are shown by dotes.
    And Click on the eyeAsign.
    Then Verify the presence of the eyeAsign with a Line on it in the password box.
    Then Verify visibility of the written letters in the password box.
    Then Verify correctness of password.
    And The user closes the page.

  Scenario: TC_1905 :The "App Store" icon should be visible and related to page .
    Given The user opens the browser.
    And Enters the URL.
    When Verify the presence of the "App Store" icon.
    Then Click on the "App Store" icon.
    Then Verify the Url address contains "App Store" .
    And The user closes the page.

  Scenario: TC_1906 :The "Google Play" icon should be visible and related to page .
    Given The user opens the browser.
    Then Enters the URL.
    And Verify the presence of the "Google Play" icon.
    Then Click on "Google Play" icon.
    And Verify the Url address contains "Google Play".
    Then The user closes the page.

  Scenario: TC_1907 :Remember me" radio box visibility and functionality test .
    Given The user opens the browser.
    And Enters the URL.
    Then Verify the presence of the "Remember me" text .
    And enter the correct username in usename box
    When enter the correct pssword in password box
    Then click the radio box of "Remember me".
    Then click the "sign in" button.
    Then Verify the url of entrance page contains "merchant/dashboard".
    And Click merchant name dropdown .
    And Click the "log out" item the secound index from this dropdown.
    Given Verify the url is equal to first url.
    When Verify the presence of the "Merchant Login" text.
    And enter the correct username in usename box
    Then Click the password box.
    And Verify the presence of the  correct password in the box.
    Then The user closes the page.

  Scenario: TC_1908 :The "forget password" link visibility and functionality test .
    Given The user opens the browser.
    When Enters the URL.
    Then Verify the presence of the "forget password?" text .
    And click the link of 'forget password?".
    When Verify the presence of the  "Request E-mail"button.
    And The user closes the page.

  Scenario: TC_1909 :Verify visibility of warning text in without input condition .
    Given The user opens the browser.
    Then Enters the URL.
    And click the sign in button.
    When Verify the presence of the"This field is required" text under username box.
    And Verify the presence of the "This field is required" text under password box.
    Then Verify position stability of the eye asign .
    Then The user closes the page.

  Scenario: TC_1910 : Verify the incorrect input for username and password
    Given The user opens the browser.
    And Enters the URL.
    Then enter the incorrect username in usename box
    When enter the incorrect pssword in password box
    And click the sign in button.
    When Verify the url address is equel to url of merchant login page.
    Then Verify the presence of the"Incorrect username or password"text.
    And Verify position stability of the eye sign .
    And The user closes the page.

  Scenario: TC_1911 :Incorrect username - correct password visibility test .
    Given The user opens the browser.
    Then Enters the URL.
    When enter the incorrect username in usename box
    And enter the correct pssword in password box
    And click the sign in button.
    When Verify the url of page has not contain "Merchant".
    Then Verify the presence of the"Incorrect username or password"text.
    And Verify position stability of the eye sign .
    And The user closes the page.

  Scenario: TC_1912 :Incorrect password - correct username visibility test .
    Given The user opens the browser.
    Then Enters the URL.
    When enter the correct username in usename box
    When enter the incorrect pssword in password box
    Then click the sign in button.
    And Verify the url of page contains "Merchant".
    Then Verify the presence of the"Incorrect username or password"text.
    And Verify position stability of the eye sign .
    And The user closes the page.

  Scenario: TC_1913 :Verify correct username - password visibility test .
    Given The user opens the browser.
    When Enters the URL.
    And enter the correct username in usename box
    When enter the correct pssword in password box
    Then click the sign in button.
    And Verify the url of entrance page contains "merchant/dashboard".
    And The user closes the page.
