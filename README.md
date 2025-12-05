# Selenium-By-Extensions

This is a utility project for test automation using Java/Selenium. It provides a way to target and locate elements by common industry attributes, such as `data-testid`, `aria-label`, and `role`. More attributes may be added in the future, but for now, it covers the most common ones encountered in the founder's projects.

## Features

The following methods are available to locate elements based on various attributes:

- **`ByExtension.dataTestId(String)`**  
  Locate elements using an exact `data-testid` match.

- **`ByExtension.partialDataTestId(String)`**  
  Locate elements using a partial `data-testid`.

- **`ByExtension.beginDataTestId(String)`**  
  Locate elements using the beginning of a `data-testid`.

- **`ByExtension.endDataTestId(String)`**  
  Locate elements using the end of a `data-testid`.

- **`ByExtension.ariaLabel(String)`**  
  Locate elements using an exact `aria-label` match.

- **`ByExtension.partialAriaLabel(String)`**  
  Locate elements using a partial `aria-label`.

- **`ByExtension.beginAriaLabel(String)`**  
  Locate elements using the beginning of an `aria-label`.

- **`ByExtension.endAriaLabel(String)`**  
  Locate elements using the end of an `aria-label`.

- **`ByExtension.role(String)`**  
  Locate elements using an exact `role` match.

## Requirements

- Java 17
- Stable Selenium version
- Maven

## Example
**`WebElement searchInput = driver.findElement(ByExtension.role("combobox"));`**

## Contributing

Feel free to contribute by making suggestions or reporting any issues. Your feedback and contributions are welcome!
