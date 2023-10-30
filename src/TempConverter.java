import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TempConverter extends ConverterTemplate implements ActionListener {

    static String[] measurements = {"Celsius", "Farenheit", "Kelvin"};

    TempConverter() {

        super("Temperature Converter", "img/temperature.png", measurements);

        titleLabel.setBounds(125, 10, 400, 100);
        convertButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            String selectedMeasurement1 = (String) measurements1.getSelectedItem();
            String selectedMeasurement2 = (String) measurements2.getSelectedItem();

            if (selectedMeasurement1.equals("Celsius")) {
                convertFromCelsius(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Farenheit")) {
                convertFromFarenheit(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Kelvin")) {
                convertFromKelvin(selectedMeasurement2);
            }
        }
    }

    private void convertFromCelsius(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Celsius":
                    result = input;
                    break;
                case "Farenheit":
                    result = (input * 1.8) + 32;
                    break;
                case "Kelvin":
                    result = input + 273.15;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromFarenheit(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Celsius":
                    result = (input - 32) * 0.555;
                    break;
                case "Farenheit":
                    result = input;
                    break;
                case "Kelvin":
                    result = (input - 32) * 0.555 + 273.15;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromKelvin(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Celsius":
                    result = input - 273.15;
                    break;
                case "Farenheit":
                    result = (input - 273.15) * 1.8 + 32;
                    break;
                case "Kelvin":
                    result = input;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }
}