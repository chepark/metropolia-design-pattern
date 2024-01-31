package org.example;

public class AFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        Button btn = new ButtonA();
        btn.setText(text);
        return btn;
    }

    @Override
    public TextField createTextField(String text) {
        TextField tf = new TextFieldA();
        tf.setText(text);
        return tf;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox cb = new CheckboxA();
        cb.setText(text);
        return cb;
    }
}
