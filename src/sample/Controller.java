package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.text.NumberFormat;


public class Controller {

    @FXML private Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider alphaSlider;
    @FXML private TextField redTextField;
    @FXML private TextField greenTextField;
    @FXML private TextField blueTextField;
    @FXML private TextField alphaTextField;
    @FXML private Rectangle colorRectangle;

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;

    public void initialize(){
        redSlider.setValue(red);
        redTextField.setText(Integer.toString(red));
        redTextField.textProperty().bindBidirectional(redSlider.valueProperty(), NumberFormat.getNumberInstance());

        greenSlider.setValue(green);
        greenTextField.setText(Integer.toString(green));
        greenTextField.textProperty().bindBidirectional(greenSlider.valueProperty(), NumberFormat.getNumberInstance());

        blueSlider.setValue(blue);
        blueTextField.setText(Integer.toString(blue));
        blueTextField.textProperty().bindBidirectional(blueSlider.valueProperty(), NumberFormat.getNumberInstance());

        alphaSlider.setValue(alpha);
        alphaTextField.setText(Double.toString(alpha));
        alphaTextField.textProperty().bindBidirectional(alphaSlider.valueProperty(), NumberFormat.getNumberInstance());

        redSlider.valueProperty().addListener(new ChangeListener<Number>() {
                                                  @Override
                                                  public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                                                      red = newValue.intValue();
                                                      colorRectangle.setFill(Color.rgb(red, green, blue,alpha));
                                                  }
                                              }
        );

        greenSlider.valueProperty().addListener(new ChangeListener<Number>() {
                                                    @Override
                                                    public void changed(ObservableValue<? extends Number> ov,Number oldValue, Number newValue) {
                                                        green = newValue.intValue();
                                                        colorRectangle.setFill(Color.rgb(red, green, blue,alpha));
                                                    }
                                                }
        );

        blueSlider.valueProperty().addListener(new ChangeListener<Number>() {
                                                   @Override
                                                   public void changed(ObservableValue<? extends Number>ov, Number oldValue, Number newValue) {
                                                       blue = newValue.intValue();
                                                       colorRectangle.setFill(Color.rgb(red, green, blue,alpha));
                                                   }
                                               }
        );

        alphaSlider.valueProperty().addListener(new ChangeListener<Number>() {
                                                    @Override
                                                    public void changed(ObservableValue<? extends Number>ov, Number oldValue, Number newValue) {
                                                        alpha = newValue.doubleValue();
                                                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                                                    }
                                                }
        );
    }
}
