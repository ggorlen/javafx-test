# JavaFX test

Good setup: https://openjfx.io/openjfx-docs/#install-javafx

```
javac --module-path "javafx-sdk-19/lib" --add-modules javafx.controls,javafx.fxml *.java
java --module-path "javafx-sdk-19/lib" --add-modules javafx.controls,javafx.fxml HelloFX
```

Note: if not using FXML can remove `,javafx.fxml`


### Random resources that might not be that useful

- https://stackoverflow.com/questions/32342864/applying-mvc-with-javafx
- https://stackoverflow.com/questions/17228487/javafx-location-is-not-set-error-message
- https://stackoverflow.com/questions/52460567/cannot-import-javafx-fxml-class
- https://www.tutorialspoint.com/javafx/javafx_event_handling.htm
- https://github.com/openjfx/samples/blob/master/CommandLine/Modular/Maven/hellofx/src/main/resources/org/openjfx/scene.fxml
