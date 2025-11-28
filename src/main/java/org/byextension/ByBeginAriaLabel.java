package org.byextension;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ByBeginAriaLabel extends By {
    private final String value;

    public ByBeginAriaLabel(String value) {
        this.value = value;
    }

    @Override
    public List<WebElement> findElements(SearchContext context) {
        return context.findElements(By.cssSelector("[aria-label^='" + value + "']"));
    }

    @Override
    public String toString() {
        return "By.beginAriaLabel: " + value;
    }
}
