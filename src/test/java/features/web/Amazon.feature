Feature: Amazon

  @Web-UI @SCN-OpenPayd-Amazon-Case
  Scenario: Amazon 1
    * Navigate to url: https://www.amazon.com
    * Add the following cookies:
      | ad-id           | A2fRxyPcYUwxldS2suAkZws                                                                                                                                                                                                                                                                                                                                          |
      | session-id-time | 2082787201l                                                                                                                                                                                                                                                                                                                                                      |
      | session-token   | Ou4nV3whHWCz9ihLRiwcYGhyf6OK5nCTAPH7PzppqlrZBknp8IS7LYtRSF+u+EVHcKjscdyQEN6zLD4Aa8sRwhXi9BRcnoda7J5ddVj10+vnTKNxb4pxb9dcPoDbzGKLT/lkiRCWEhuuwBkiaDFcX56LBvz6Ryd5XGl0ZsiasWuXN+XZMIY0NAYu5VZqGT1BZsuq2UVC1KWQ+KbFR0XYODUrL5PG2Znff5wC3VCNT8z55YxJKWwlIklilK/FMftdwIvkDifyKpA+QEBvVJ42a8O+exEfWIPA32/SzahqupZ0AtpOSlWWMsMHV1WNxJfcO7Ev6Nhnk9iFzH0WWa9DQWC7ZeoXe26M|
    * Refresh the page
    * Wait for element amazonBanner on the LandingPage to be visible
    * Fill input searchBar on the LandingPage with text: laptop
    * Click the searchButton on the LandingPage
    * Click all listed buttons from notDiscountAddtoCartButtons list on the SearchPage
    * Wait for element cartButton on the SearchPage to be visible
    * Add products to context Store
    * Click the cartButton on the SearchPage
    * Wait 2 seconds
    * Verify products in basket