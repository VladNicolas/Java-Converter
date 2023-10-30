import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TimeConverter extends ConverterTemplate implements ActionListener {

    static String[] measurements = {"Seconds", "Minutes", "Hours", "Days", "Weeks", "Months", "Years"};

    TimeConverter() {

        super("Time Converter", "img/time.png", measurements);

        titleLabel.setBounds(145, 10, 400, 100);
        convertButton.addActionListener(this);
    }


@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            String selectedMeasurement1 = (String) measurements1.getSelectedItem();
            String selectedMeasurement2 = (String) measurements2.getSelectedItem();

            if (selectedMeasurement1.equals("Seconds")) {
                convertFromSeconds(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Minutes")) {
                convertFromMinutes(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Hours")) {
                convertFromHours(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Days")) {
                convertFromDays(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Weeks")) {
                convertFromWeeks(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Months")) {
                convertFromMonths(selectedMeasurement2);
            } else if (selectedMeasurement1.equals("Years")) {
                convertFromYears(selectedMeasurement2);
            }
        }
    }

    private void convertFromSeconds(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Seconds":
                    result = input;
                    break;
                case "Minutes":
                    result = input / 60;
                    break;
                case "Hours":
                    result = input / 3600;
                    break;
                case "Days":
                    result = input / 86400;
                    break;
                case "Weeks":
                    result = input / 604800;
                    break;
                case "Months":
                    result = input / 2628000;
                    break;
                case "Years":
                    result = input / 31540000;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromMinutes(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Seconds":
                    result = input * 60;
                    break;
                case "Minutes":
                    result = input;
                    break;
                case "Hours":
                    result = input / 60;
                    break;
                case "Days":
                    result = input / 1440;
                    break;
                case "Weeks":
                    result = input / 10080;
                    break;
                case "Months":
                    result = input / 43800;
                    break;
                case "Years":
                    result = input / 525600;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromHours(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Seconds":
                    result = input * 3600;
                    break;
                case "Minutes":
                    result = input * 60;
                    break;
                case "Hours":
                    result = input;
                    break;
                case "Days":
                    result = input / 24;
                    break;
                case "Weeks":
                    result = input / 168;
                    break;
                case "Months":
                    result = input / 730;
                    break;
                case "Years":
                    result = input / 8760;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromDays(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Seconds":
                    result = input * 86400;
                    break;
                case "Minutes":
                    result = input * 1440;
                    break;
                case "Hours":
                    result = input * 24;
                    break;
                case "Days":
                    result = input;
                    break;
                case "Weeks":
                    result = input / 7;
                    break;
                case "Months":
                    result = input / 30.417;
                    break;
                case "Years":
                    result = input / 365;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromWeeks(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Seconds":
                    result = input * 604800;
                    break;
                case "Minutes":
                    result = input * 10080;
                    break;
                case "Hours":
                    result = input * 168;
                    break;
                case "Days":
                    result = input * 7;
                    break;
                case "Weeks":
                    result = input;
                    break;
                case "Months":
                    result = input / 4.345;
                    break;
                case "Years":
                    result = input / 52;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromMonths(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Seconds":
                    result = input * 2628000;
                    break;
                case "Minutes":
                    result = input * 43800;
                    break;
                case "Hours":
                    result = input * 730;
                    break;
                case "Days":
                    result = input * 30.417;
                    break;
                case "Weeks":
                    result = input * 4.345;
                    break;
                case "Months":
                    result = input;
                    break;
                case "Years":
                    result = input / 12;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }

    private void convertFromYears(String selectedMeasurement2) {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = 0;
            switch (selectedMeasurement2) {
                case "Seconds":
                    result = input * 31540000;
                    break;
                case "Minutes":
                    result = input * 525600;
                    break;
                case "Hours":
                    result = input * 8760;
                    break;
                case "Days":
                    result = input * 365;
                    break;
                case "Weeks":
                    result = input * 52;
                    break;
                case "Months":
                    result = input * 12;
                    break;
                case "Years":
                    result = input;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException exception) {
            outputField.setText("Invalid input");
        }
    }
}