import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LengthConverter extends ConverterTemplate implements ActionListener {

    static String[] measurements = {"Centimeters", "Meters", "Kilometers", "Inches", "Feet", "Yards", "Miles"};

    LengthConverter() {

        super("Length Converter", "img/length.png", measurements);
      
        titleLabel.setBounds(140, 0, 400, 70);
        titleLabel.setIconTextGap(-10);
        convertButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            String selectedMeasurement1 = (String) measurements1.getSelectedItem();
            String selectedMeasurement2 = (String) measurements2.getSelectedItem();

            if (selectedMeasurement1.equals("Centimeters")) {
                convertFromCentimeters(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Meters")) {
                convertFromMeters(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Kilometers")) {
                convertFromKilometers(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Inches")) {
                convertFromInches(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Feet")) {
                convertFromFeet(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Yards")) {
                convertFromYards(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Miles")) {
                convertFromMiles(selectedMeasurement2);
            }
        }
    }

    private void convertFromCentimeters(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Centimeters":
                    result = input;
                    break;
                case "Meters":
                    result = input / 100;
                    break;
                case "Kilometers":
                    result = input / 100000;
                    break;
                case "Inches":
                    result = input / 2.54;
                    break;
                case "Feet":
                    result = input / 30.48;
                    break;
                case "Yards":
                    result = input / 91.44;
                    break;
                case "Miles":
                    result = input / 160900;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromMeters(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Centimeters":
                    result = input * 100;
                    break;
                case "Meters":
                    result = input;
                    break;
                case "Kilometers":
                    result = input / 1000;
                    break;
                case "Inches":
                    result = input * 39.37;
                    break;
                case "Feet":
                    result = input * 3.281;
                    break;
                case "Yards":
                    result = input * 1.094;
                    break;
                case "Miles":
                    result = input / 1609;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromKilometers(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Centimeters":
                    result = input * 100000;
                    break;
                case "Meters":
                    result = input * 1000;
                    break;
                case "Kilometers":
                    result = input;
                    break;
                case "Inches":
                    result = input * 39370;
                    break;
                case "Feet":
                    result = input * 3281;
                    break;
                case "Yards":
                    result = input * 1094;
                    break;
                case "Miles":
                    result = input / 1.609;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromInches(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Centimeters":
                    result = input * 2.54;
                    break;
                case "Meters":
                    result = input / 39.37;
                    break;
                case "Kilometers":
                    result = input / 39370;
                    break;
                case "Inches":
                    result = input;
                    break;
                case "Feet":
                    result = input / 12;
                    break;
                case "Yards":
                    result = input / 36;
                    break;
                case "Miles":
                    result = input / 63360;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromFeet(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Centimeters":
                    result = input * 30.48;
                    break;
                case "Meters":
                    result = input / 3.281;
                    break;
                case "Kilometers":
                    result = input / 3281;
                    break;
                case "Inches":
                    result = input * 12;
                    break;
                case "Feet":
                    result = input;
                    break;
                case "Yards":
                    result = input / 3;
                    break;
                case "Miles":
                    result = input / 5280;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromYards(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Centimeters":
                    result = input * 91.44;
                    break;
                case "Meters":
                    result = input / 1.094;
                    break;
                case "Kilometers":
                    result = input / 1094;
                    break;
                case "Inches":
                    result = input * 36;
                    break;
                case "Feet":
                    result = input * 3;
                    break;
                case "Yards":
                    result = input;
                    break;
                case "Miles":
                    result = input / 1760;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromMiles(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Centimeters":
                    result = input * 160900;
                    break;
                case "Meters":
                    result = input * 1609;
                    break;
                case "Kilometers":
                    result = input * 1.609;
                    break;
                case "Inches":
                    result = input * 63360;
                    break;
                case "Feet":
                    result = input * 5280;
                    break;
                case "Yards":
                    result = input * 5280;
                    break;
                case "Miles":
                    result = input;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }
}