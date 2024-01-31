package org.example;

public class BFactory extends UIFactory{
    @Override
    public Button createButton(String text) {
        Button btn = new ButtonB();
        btn.setText(text);
        return btn;
    }

    @Override
    public TextField createTextField(String text) {
        TextField tf = new TextFieldB();
        tf.setText(text);
        return tf;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox cb = new CheckboxB();
        cb.setText(text);
        return cb;
    }
}
