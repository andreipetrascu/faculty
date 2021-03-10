package CurrencyConverter;

import java.awt.event.*;

public class ConvController {

    private ConvModel model;
    private ConvView view;


    public ConvController(ConvModel model, ConvView view) {
        this.model = model;
        this.view = view;

        view.addConvertListener(new ConvertListener());
    }

    class ConvertListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            model.setValue(view.getAmount());
            String m = model.getValue();
            String s1 = view.getFirstCurrency();
            String s2 = view.getSecondCurrency();

            switch (s1) {
                case "RON": {

                    switch (s2) {
                        case "RON": {
                            view.setConvertedValue(m);
                            view.setLabel3("1 RON = 1 RON");
                        }
                        break;
                        case "EUR": {

                            model.divideBy("4.78");
                            view.setConvertedValue(model.getValue());
                            view.setLabel3("1 RON = 0.21 EUR");
                        }
                        break;
                        case "USD": {
                            model.multiplyBy("0.23");
                            view.setConvertedValue(model.getValue());
                            view.setLabel3("1 RON = 0.23 USD");
                        }
                        break;
                    }
                }
                break;

                case "EUR": {
                    switch (s2) {
                        case "RON": {
                            model.multiplyBy("4.78");
                            view.setConvertedValue(model.getValue());
                            view.setLabel3("1 EUR = 4.78 RON");
                        }
                        break;
                        case "EUR": {
                            view.setConvertedValue(m);
                            view.setLabel3("1 EUR = 1 EUR");
                        }
                        break;
                        case "USD": {
                            model.multiplyBy("1.11");
                            view.setConvertedValue(model.getValue());
                            view.setLabel3("1 EUR = 1.11 USD");
                        }
                        break;
                    }
                }
                break;

                case "USD": {
                    switch (s2) {
                        case "RON": {
                            model.multiplyBy("4.30");
                            view.setConvertedValue(model.getValue());
                            view.setLabel3("1 UDS = 4.30 RON");
                        }
                        break;
                        case "EUR": {
                            model.multiplyBy("0.90");
                            view.setConvertedValue(model.getValue());
                            view.setLabel3("1 USD = 0.90 EUR");
                        }
                        break;
                        case "USD": {
                            view.setConvertedValue(model.getValue());
                            view.setLabel3("1 USD = 1 USD");
                        }
                        break;
                    }
                    break;
                }
            }
        }
    }
}
