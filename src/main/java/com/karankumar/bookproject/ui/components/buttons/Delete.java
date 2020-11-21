package com.karankumar.bookproject.ui.components.buttons;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;

public class Delete extends Button
{
    public Delete(String button_label, ButtonVariant theme)
    {
        this.setText(button_label);
        this.addThemeVariants(theme);
    }
}
