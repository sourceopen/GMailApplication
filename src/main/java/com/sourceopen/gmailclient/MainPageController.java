package com.sourceopen.gmailclient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FxmlView("main-page.fxml")
public class MainPageController {

    private WeatherService weatherService;

    @FXML
    private Label weatherLabel;

    @FXML
    private Label weatherLabel1;

    @Autowired
    public MainPageController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public void loadWeatherForecast(ActionEvent actionEvent) {
        this.weatherLabel.setText(weatherService.getWeatherForecast());
    }

    public void loadWeatherForecastSet(ActionEvent actionEvent) {
        this.weatherLabel1.setText(weatherService.getWeatherForecast());
    }
}