package com.uniyaz.ui.components;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class Header extends HorizontalLayout {

    public Header() {
        MyLabel label = new MyLabel("Header Label");
        label.setStyleName(ValoTheme.TEXTFIELD_ALIGN_CENTER);
        addComponent(label);
    }
}
