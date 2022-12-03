package ru.mirea.task22.task2;

//import ru.mirea.task22.task1.Calculator;

import ru.mirea.task22.task1.DivisionByZeroException;
import ru.mirea.task22.task1.EmptyStackException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController extends JFrame {

    public CalculatorController() {
        super("calc");
        setSize(200, 300);

        CalculatorView view = new CalculatorView((JPanel) getContentPane());

        CalculatorModel model = new CalculatorModel();

        ActionListener btnActionListenter = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().charAt(0) == '=') {
                    model.setUserInput(view.getUserInput());
                    try {
                        model.fromPoland();
                    } catch (EmptyStackException ex) {
                        clear(model, view);
                        view.showAlertDialog(ex.getMessage());
                    } catch (DivisionByZeroException ex) {
                        clear(model, view);
                        view.showAlertDialog(ex.getMessage());
                    } catch (EmptyStringException ex) {
                        clear(model, view);
                        view.showAlertDialog(ex.getMessage());
                    } catch (DoubleParseException ex) {
                        clear(model, view);
                        view.showAlertDialog(ex.getMessage());
                    }

                    view.setTextInField(model.getResult());
                } else if (e.getActionCommand().charAt(0) == 'C') {
                    clear(model, view);
                } else if (e.getActionCommand().charAt(0) == '.') {
                    if (view.getUserInput().length() != 0 && model.isop(((Character) view.getUserInput().charAt(view.getUserInput().length() - 1)).toString())) {
                        view.showAlertDialog("?");
                        clear(model, view);
                    }
                    view.setTextInField(view.getUserInput() + e.getActionCommand());
                } else if (view.getUserInput().length() == 0 && e.getActionCommand().charAt(0) == '.') {
                    view.showAlertDialog("?");
                } else if (view.getUserInput().length() != 0 && view.getUserInput().charAt(view.getUserInput().length() - 1) == '.') {
                    view.setTextInField(view.getUserInput() + e.getActionCommand());
                } else {
                    view.setTextInField(view.getUserInput() + " " + e.getActionCommand());
                }
            }
        };

        view.setActionListener(btnActionListenter);

        setVisible(true);

    }

    private void clear(CalculatorModel model, CalculatorView view) {
        model.setResult("");
        model.setUserInput("");
        view.setTextInField("");
    }
}
