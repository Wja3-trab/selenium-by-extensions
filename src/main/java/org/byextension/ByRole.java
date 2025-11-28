package org.byextension;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ByRole extends By {
    private final String value;

    public ByRole(String value) {
        this.value = value;
    }

    @Override
    public List<WebElement> findElements(SearchContext context) {
        return context.findElements(By.cssSelector("[role='" + value + "']"));
    }

    @Override
    public String toString() {
        return "By.role: " + value;
    }
}
