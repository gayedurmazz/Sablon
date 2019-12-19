package com.uniyaz.ui.components;

import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class SideBar extends VerticalLayout {
    public SideBar(Content content) {

        MyLabel label = new MyLabel("Sidebar Label");
        label.setStyleName(ValoTheme.TEXTAREA_ALIGN_CENTER);
        addComponent(label);

    }
}

