package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        Application.launch(ShanghaiApplication.class);
    }

    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis("Year", 2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis("Ranking", 0, 100, 10);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        XYChart.Series shanghaiData = new XYChart.Series();
        shanghaiData.getData().addAll(new XYChart.Data(2007, 73),new XYChart.Data(2008, 68),new XYChart.Data(2009, 72));
        shanghaiData.getData().addAll(new XYChart.Data(2010, 72),new XYChart.Data(2011, 74),new XYChart.Data(2012, 73));
        shanghaiData.getData().addAll(new XYChart.Data(2013, 76),new XYChart.Data(2014, 73),new XYChart.Data(2015, 67));
        shanghaiData.getData().addAll(new XYChart.Data(2016, 56),new XYChart.Data(2017, 56));
        lineChart.getData().add(shanghaiData);
        Scene scene = new Scene(lineChart, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
