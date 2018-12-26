package abstract_factory.example.factories;

import abstract_factory.example.buttons.Button;
import abstract_factory.example.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
