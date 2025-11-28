package org.byextension;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ByPartialDataTestId extends By {
    private final String value;

    public ByPartialDataTestId(String value) {
        this.value = value;
    }

    @Override
    public List<WebElement> findElements(SearchContext context) {
        return context.findElements(By.cssSelector("[data-testid*='" + value + "']"));
    }

    @Override
    public String toString() {
        return "By.partialDataTestId: " + value;
    }
}
