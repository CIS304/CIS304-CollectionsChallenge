package collections.ui;

import collections.data.Stock;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.util.LinkedList;
import java.util.Map;

/**
 * Validates data entered in Swing GUIs and displays error messages in dialog
 * boxes
 *
 * @author JAM - modified from code provided with the textbook.
 * @version 141006
 */
public class SwingValidator {

    /**
     * Creates a SwingValidator object
     */
    public SwingValidator() {
        // Currently there are not constructor actions.
    }

    /**
     * Tests a GUI field to determine if anything was entered in that field.
     *
     * @param component the component containing the GUI field to be tested
     * @param fieldName the name of the GUI field to be tested
     * @return True if there is data entered in the GUI field, otherwise false.
     */
    public boolean isPresent(JTextComponent component, String fieldName) {
        if (component.getText().length() == 0) {
            showMessage(component, fieldName + " is a required field.");
            component.requestFocusInWindow();
            return false;
        }
        return true;
    }

    /**
     * Tests text entered in a GUI field to determine if it represents a valid
     * integer
     *
     * @param component the component containing the GUI field to be validated
     * @param fieldName the name of the GUI field to be validated
     * @return True if field value is a valid integer, otherwise false.
     */
    public boolean isInteger(JTextComponent component, String fieldName) {
        try {
            int i = Integer.parseInt(component.getText());
            return true;
        } catch (NumberFormatException e) {
            showMessage(component, fieldName + " must be an integer.");
            component.requestFocusInWindow();
            return false;
        }
    }

    /**
     * Tests text entered in a GUI field to determine if it represents a valid
     * double
     *
     * @param component the component containing the GUI field to be validated
     * @param fieldName the name of the GUI field to be validated
     * @return True if field value is a valid double, otherwise false.
     */
    public boolean isDouble(JTextComponent component, String fieldName) {
        try {
            double d = Double.parseDouble(component.getText());
            return true;
        } catch (NumberFormatException e) {
            showMessage(component, fieldName + " must be a valid number.");
            component.requestFocusInWindow();
            return false;
        }
    }

    /**
     * Tests text entered in a GUI field to determine if it represents a valid
     * double that is greater than zero.
     *
     * @param component the component containing the GUI field to be validated
     * @param fieldName the name of the GUI field to be validated
     * @return True if the field value is a valid double greater than zero,
     * otherwise false.
     */
    public boolean isDoubleGreaterThanZero(JTextComponent component,
            String fieldName) {
        boolean valid = true;
        String message = " must be a valid number greater than zero.";
        try {
            double d = Double.parseDouble(component.getText());
            if (d <= 0) {
                valid = false;
                showMessage(component, fieldName + message);
                component.requestFocusInWindow();
            }
            return valid;
        } catch (NumberFormatException e) {
            showMessage(component, fieldName + message);
            component.requestFocusInWindow();
            return false;
        }
    }

    /**
     * Tests text entered in a GUI field to determine if it represents a valid
     * double that is positive (i.e., greater than or equal to zero).
     *
     * @param component the component containing the GUI field to be validated
     * @param fieldName the name of the GUI field to be validated
     * @return True if field value is a valid positive double, otherwise false.
     */
    public boolean isDoublePositive(JTextComponent component,
            String fieldName) {
        boolean valid = true;
        String message = " must be a valid number greater than or equal to zero.";
        try {
            double d = Double.parseDouble(component.getText());
            if (d < 0) {
                valid = false;
                showMessage(component, fieldName + message);
                component.requestFocusInWindow();
            }
            return valid;
        } catch (NumberFormatException e) {
            showMessage(component, fieldName + message);
            component.requestFocusInWindow();
            return false;
        }
    }

    /**
     * Check Ticker to make sure it does not have any number values
     *
     * @return True is field is a valid Sting with no numeric values, otherwise
     * return false.
     */
    public boolean isTickerValid(JTextComponent component, String ticker) {
        String message = " must be a string with no numeric values: example ABC or DEF";
        for (char c : ticker.toString().toCharArray()) {
            if (Character.isDigit(c)) {
                showMessage(component, ticker + message);
                return false;
            }
        }
        return true;
    }

    /**
     * checks to see if the value user is trying to delete is in the map.
     *
     * @return true if the ticker is found in map, otherwise return
     * false
     */
    public boolean isDeleteMapValid(Map<String, String> map, JTextField ticker, JTextField price) {
        Stock newStock = new Stock(ticker.getText(), price.getText());
        for (int i = 0; i < map.size(); i++) {
            map.containsValue(newStock.ticker);
            return true;
        }
        showMessage(ticker,newStock.ticker + "is not located in the map. Please try a different value");
        return false;
    }

    // Display the error message in a dialog box with "Invalid Entry" as the
    // dialog box title.
    private void showMessage(JTextComponent component, String message) {
        JOptionPane.showMessageDialog(component, message, "Invalid Entry",
                JOptionPane.ERROR_MESSAGE);
    }
}
