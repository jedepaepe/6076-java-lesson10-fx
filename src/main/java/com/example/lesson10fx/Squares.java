package com.example.lesson10fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Squares extends Application {
    @Override
    public void start(Stage stage) {
        int nr = 6;
        int size = 50;
        GridPane pane = new GridPane();
        for (int i = 0; i < nr; ++i) {
            for (int j = 0; j < nr; ++j) {
                Canvas canvas = new Canvas(nr * size, nr * size);
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.setFill(Color.BLACK);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                canvas.setOnMouseMoved(event -> {
                    GraphicsContext gce = canvas.getGraphicsContext2D();
                    for (int z = 0; z < 10; ++z) {
                        double delta = z * canvas.getWidth() / 10;
                        gce.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
                        gce.strokeRect(delta / 2, delta / 2, canvas.getWidth() - delta, canvas.getHeight() - delta);
                    }
                });
                pane.add(canvas, i, j);
            }
        }
        stage.setScene(new Scene(pane));
        stage.setTitle("squares");
        stage.show();
    }
}
