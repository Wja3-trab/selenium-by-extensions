package org.byextension;

import org.openqa.selenium.By;

public final class ByExtension {
    private ByExtension() {
    }

    public static By dataTestId(String value) {
        return new ByDataTestId(value);
    }

    public static By partialDataTestId(String value) {
        return new ByPartialDataTestId(value);
    }

    public static By beginDataTestId(String value) {
        return new ByBeginDataTestId(value);
    }

    public static By endDataTestId(String value) {
        return new ByEndDataTestId(value);
    }

    public static By ariaLabel(String value) {
        return new ByAriaLabel(value);
    }

    public static By partialAriaLabel(String value) {
        return new ByPartialAriaLabel(value);
    }

    public static By beginAriaLabel(String value) {
        return new ByBeginAriaLabel(value);
    }

    public static By endAriaLabel(String value) {
        return new ByEndAriaLabel(value);
    }

    public static By role(String value) {
        return new ByRole(value);
    }

}
