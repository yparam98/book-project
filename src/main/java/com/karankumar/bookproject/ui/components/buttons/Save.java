package com.karankumar.bookproject.ui.components.buttons;

import com.helger.commons.annotation.VisibleForTesting;
import com.karankumar.bookproject.backend.entity.Book;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.data.binder.Binder;

public class Save extends Button
{
    @VisibleForTesting Binder<Book> binder;

    private static String button_label;

    /* 2-arg constructor: receives label for button, and binding */
    public Save(String label, Binder<Book> binding)
    {
        button_label = label;
        binder = binding;

        configure();
    }

    /* configure method: sets the UI elements and functionalities of the button */
    private void configure()
    {
        this.setText(button_label);
        this.setEnabled(binder.isValid());
        this.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        this.setDisableOnClick(true);
    }
}
