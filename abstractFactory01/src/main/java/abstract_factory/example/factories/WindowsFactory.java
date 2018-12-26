package abstract_factory.example.factories;

import abstract_factory.example.buttons.Button;
import abstract_factory.example.buttons.WindowsButton;
import abstract_factory.example.checkboxes.Checkbox;
import abstract_factory.example.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
