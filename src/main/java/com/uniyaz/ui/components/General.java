package com.uniyaz.ui.components;

import com.vaadin.ui.VerticalLayout;

public class General extends VerticalLayout {

    public General(){

        setWidth(100, Unit.PERCENTAGE);

        Header header = new Header();
        addComponent(header);

        Container container = new Container();
        addComponent(container);

        Footer footer = new Footer();
        addComponent(footer);
    }
}
