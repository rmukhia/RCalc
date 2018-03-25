package ui;

import rcalc.Calculator;
import rcalc.parsers.nonterminals.STARTNode;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.text.DecimalFormat;

public class CalculatorUIController {

    private Calculator calculator;

    private enum MODE {
        AUTO,
        INFIX,
        PREFIX,
        POSTFIX,
    }

    ;

    private MODE mode;

    public TextArea txt_input;
    public TextArea txt_infix;
    public TextArea txt_prefix;
    public TextArea txt_postfix;
    public TextArea txt_output;

    public ToggleButton tgl_auto;
    public ToggleButton tgl_infix;
    public ToggleButton tgl_prefix;
    public ToggleButton tgl_postfix;

    public Button btn_delete;
    public Button btn_ac;

    public Button btn_open_bracket;
    public Button btn_close_bracket;

    public Button btn_9;
    public Button btn_8;
    public Button btn_7;
    public Button btn_6;
    public Button btn_5;
    public Button btn_4;
    public Button btn_3;
    public Button btn_2;
    public Button btn_1;
    public Button btn_0;
    public Button btn_point;
    public Button btn_e;

    public Button btn_divide;
    public Button btn_multiply;
    public Button btn_minus;
    public Button btn_plus;

    public Button btn_equal;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    private void appendToInput(String c) {
        String str = txt_input.getText();
        str += c;
        txt_input.setText(str);
    }

    public void onDelete(ActionEvent actionEvent) {
        String str = txt_input.getText();
        if (str.length() == 0) return;
        str = str.substring(0, str.length() - 1);
        txt_input.setText(str);
    }

    private void clearOutputTexts() {
        txt_prefix.setText("");
        txt_infix.setText("");
        txt_postfix.setText("");
        txt_output.setText("");
    }

    private void clearAllText() {
        txt_input.setText("");
        clearOutputTexts();
    }

    public void onAC(ActionEvent actionEvent) {
        clearAllText();
    }

    public void on0(ActionEvent actionEvent) {
        this.appendToInput("0");
    }

    public void on1(ActionEvent actionEvent) {
        this.appendToInput("1");
    }

    public void on2(ActionEvent actionEvent) {
        this.appendToInput("2");
    }

    public void on3(ActionEvent actionEvent) {
        this.appendToInput("3");
    }

    public void on4(ActionEvent actionEvent) {
        this.appendToInput("4");
    }

    public void on5(ActionEvent actionEvent) {
        this.appendToInput("5");
    }

    public void on6(ActionEvent actionEvent) {
        this.appendToInput("6");
    }

    public void on7(ActionEvent actionEvent) {
        this.appendToInput("7");
    }

    public void on8(ActionEvent actionEvent) {
        this.appendToInput("8");
    }

    public void on9(ActionEvent actionEvent) {
        this.appendToInput("9");
    }

    public void onPoint(ActionEvent actionEvent) {
        this.appendToInput(".");
    }

    public void onExponential(ActionEvent actionEvent) {
        this.appendToInput("E");
    }

    public void onOpenBracket(ActionEvent actionEvent) {
        this.appendToInput("(");
    }

    public void onCloseBracket(ActionEvent actionEvent) {
        this.appendToInput(")");
    }

    public void onDivide(ActionEvent actionEvent) {
        this.appendToInput("/");
    }

    public void onMultiply(ActionEvent actionEvent) {
        this.appendToInput("*");
    }

    public void onMinus(ActionEvent actionEvent) {
        this.appendToInput("-");
    }

    public void onPlus(ActionEvent actionEvent) {
        this.appendToInput("+");
    }


    private String formatResult(double result) {
        DecimalFormat dec = new DecimalFormat("#.###########");
        return dec.format(result);
    }

    private void setInvalidError() {
        clearOutputTexts();
        txt_output.setText("Invalid Expression!");
    }

    public void onEqual(ActionEvent actionEvent) {
        String str = txt_input.getText();
        STARTNode start = null;
        switch (this.mode) {
            case AUTO:
                try {
                    start = (STARTNode) calculator.parse(str, Calculator.TYPE.INFIX);
                } catch (Exception einfix) {
                    try {
                        start = (STARTNode) calculator.parse(str, Calculator.TYPE.PREFIX);
                    } catch (Exception eprefix) {
                        try {
                            start = (STARTNode) calculator.parse(str, Calculator.TYPE.POSTFIX);
                        } catch (Exception epostfix) {
                            setInvalidError();
                            return;
                        }
                    }

                }
                break;
            case INFIX:
                try {
                    start = (STARTNode) calculator.parse(str, Calculator.TYPE.INFIX);
                } catch (Exception einfix) {
                    setInvalidError();
                    return;
                }
                break;
            case PREFIX:
                try {
                    start = (STARTNode) calculator.parse(str, Calculator.TYPE.PREFIX);
                } catch (Exception eprefix) {
                    setInvalidError();
                    return;
                }
                break;
            case POSTFIX:
                try {
                    start = (STARTNode) calculator.parse(str, Calculator.TYPE.POSTFIX);
                } catch (Exception epostfix) {
                    setInvalidError();
                    return;
                }
                break;
        }

        try {
            txt_output.setText(formatResult(start.evaluate()));
            txt_prefix.setText(start.toPrefix());
            txt_postfix.setText(start.toPostfix());
            txt_infix.setText(start.toInfix());
        } catch (Exception e) {
            clearOutputTexts();
            txt_output.setText(e.getMessage());
        }
    }

    public EventHandler<KeyEvent> getEventHandler() {
        CalculatorUIController ccontroller = this;
        return new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ev) {
                switch (ev.getCode()) {
                    case ENTER:
                        ccontroller.btn_equal.fire();
                        break;
                    default:
                }
            }
        };
    }

    private void setToggleButton() {
        tgl_auto.setSelected(false);
        tgl_infix.setSelected(false);
        tgl_prefix.setSelected(false);
        tgl_postfix.setSelected(false);

        switch (mode) {
            case AUTO:
                tgl_auto.setSelected(true);
                break;
            case INFIX:
                tgl_infix.setSelected(true);
                break;
            case PREFIX:
                tgl_prefix.setSelected(true);
                break;
            case POSTFIX:
                tgl_postfix.setSelected(true);
        }
    }

    public void onTglAuto(ActionEvent actionEvent) {
        mode = MODE.AUTO;
        setToggleButton();
    }

    public void onTglInfix(ActionEvent actionEvent) {
        mode = MODE.INFIX;
        setToggleButton();
    }

    public void onTglPrefix(ActionEvent actionEvent) {
        mode = MODE.PREFIX;
        setToggleButton();
    }

    public void onTglPostfix(ActionEvent actionEvent) {
        mode = MODE.POSTFIX;
        setToggleButton();
    }

    public void onSpace(ActionEvent actionEvent) {
        this.appendToInput(" ");
    }

    public void onMenuClose(ActionEvent actionEvent) {
        System.exit(0);

    }

    public void onMenuAbout(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("HelpUI.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UTILITY);
            stage.setTitle("About");
            stage.setAlwaysOnTop(true);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
