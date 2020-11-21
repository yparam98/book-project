package com.karankumar.bookproject.ui.components.buttons;

import com.helger.commons.annotation.VisibleForTesting;
import com.karankumar.bookproject.backend.entity.Book;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;

import java.util.function.Function;
import java.util.logging.Level;

public class Reset extends Button
{
    public Reset(String button_label)
    {
        this.setText(button_label);
    }


}
