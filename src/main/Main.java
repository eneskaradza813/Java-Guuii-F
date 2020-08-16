package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        Label headerLabel = new Label("HEADER");
        Label footerLabel = new Label("FOOTER");
        Label leftNavLabel = new Label("LEFT_NAV");
        Label rigthNavLabel = new Label("RIGHT_NAV");
        Label centerLabel = new Label("CENTER");
        
        headerLabel.setTextFill(Color.WHITE);
        headerLabel.setFont(new Font(100));
        
        footerLabel.setTextFill(Color.WHITE);
        footerLabel.setFont(new Font(100));
        
        leftNavLabel.setTextFill(Color.WHITE);
        leftNavLabel.setFont(new Font(30));
        
        rigthNavLabel.setTextFill(Color.WHITE);
        rigthNavLabel.setFont(new Font(30));
        
        centerLabel.setTextFill(Color.BLACK);
        centerLabel.setFont(new Font(30));
        
        StackPane header = new StackPane(headerLabel);
        StackPane footer = new StackPane(footerLabel);
        StackPane leftNav = new StackPane(leftNavLabel);
        StackPane rigthNav = new StackPane(rigthNavLabel);
        
        header.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(0, 0, 10, 0), new Insets(0, 0, 0, 0))));
        footer.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(10, 0, 0, 0), new Insets(0, 0, 0, 0))));
        leftNav.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(0, 10, 0, 0), new Insets(0, 0, 0, 0))));
        rigthNav.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(0, 0, 0, 10), new Insets(0, 0, 0, 0))));
        
        BorderPane root = new BorderPane();
        root.setBackground(Background.EMPTY);
        
        Circle centerCircle = new Circle(100);
        
        Circle leftTopCircle = new Circle(30);
        Circle leftBottomCircle = new Circle(30);
        Circle rightTopCircle = new Circle(30);
        Circle rightBottomCircle = new Circle(30);
        
        leftTopCircle.setFill(Color.WHITE);
        leftBottomCircle.setFill(Color.WHITE);
        rightTopCircle.setFill(Color.WHITE);
        rightBottomCircle.setFill(Color.WHITE);
        centerCircle.setFill(Color.WHITE);
        
        StackPane content = new StackPane(centerCircle, centerLabel, leftTopCircle, leftBottomCircle, rightTopCircle, rightBottomCircle);
        
        StackPane.setAlignment(leftTopCircle, Pos.TOP_LEFT);
        StackPane.setAlignment(leftBottomCircle, Pos.BOTTOM_LEFT);
        StackPane.setAlignment(rightTopCircle, Pos.TOP_RIGHT);
        StackPane.setAlignment(rightBottomCircle, Pos.BOTTOM_RIGHT);
        
        StackPane.setMargin(leftTopCircle, new Insets(5, 0, 0, 5));
        StackPane.setMargin(leftBottomCircle, new Insets(0, 0, 5, 5));
        StackPane.setMargin(rightTopCircle, new Insets(5, 5, 0, 0));
        StackPane.setMargin(rightBottomCircle, new Insets(0, 5, 5, 0));
        
        root.setTop(header);
        root.setCenter(content);
        root.setBottom(footer);
        root.setLeft(leftNav);
        root.setRight(rigthNav);
        
        Scene scene = new Scene(root, 800, 600);
        
        scene.setFill(new Color(0.3, 0.1, 0.3, 0.1));
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
