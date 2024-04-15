package com.example.mergesortvisual;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Visualizer {
    private final GraphicsContext gc;

    public Visualizer(GraphicsContext gc) {
        this.gc = gc;
    }

    public void visualizeArray(int[] array, int... swappingIndices){
        double width = gc.getCanvas().getWidth();
        double height = gc.getCanvas().getHeight();
        double barWidth = 40;

        gc.clearRect(0, 0, width, height);

        for (int i = 0; i < array.length; i++) {
            double x = i * (barWidth + 5);
            double y = height - array[i] * 10;
            double barHeight = array[i] * 10;

            if(i == swappingIndices[0] || i == swappingIndices[1]){
                gc.setFill(Color.BLUE);
            }
            else{
                gc.setFill(Color.GRAY);
            }

            gc.fillRect(x, y, barWidth, barHeight);
        }
    }


}
