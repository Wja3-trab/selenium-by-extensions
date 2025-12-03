# Selenium-By-Extensions
  This is a utility project for testautomation via Java/Selenium.
  It provides a way to target and locate elements by some common industry attributes (data-testid, aria-label and role).
  More attributes could be added in the future. For now, only attributes that the founder encountered the most in his projects.

## Features
  ByExtension.dataTestId(String) -> Locate elements using an exact data-testid match.
  ByExtension.partialDataTestId(String) -> Locate elements using a partial data-testid.
  ByExtension.beginDataTestId(String) -> Locate elements using the beginning of a data-testid.
  ByExtension.endDataTestId(String) -> Locate elements using the end of a data-testid.
  ByExtension.ariaLabel(String) -> Locate elements using an exact aria-label match.
  ByExtension.partialAriaLabel(String) -> Locate elements using a partial aria-label.
  ByExtension.beginAriaLabel(String) -> Locate elements using the beginning of an aria-label.
  ByExtension.endAriaLabel(String) -> Locate elements using the end of an aria-label.
  ByExtension.role(String) -> Locate elements using an exact role match.

## Requirements
  -Java 17
  -Stable Selenium version
  -Maven

## Contributing
  Feel free to contribute by making suggestions and reporting any issues.
