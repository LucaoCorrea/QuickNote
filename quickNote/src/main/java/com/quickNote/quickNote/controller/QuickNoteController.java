package com.quickNote.quickNote.controller;

import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
public class QuickNoteController {
    private TextArea textArea;
    private File currentFile;

    public BorderPane createLayout() {
        textArea = new TextArea();
        textArea.setWrapText(true);

        BorderPane root = new BorderPane();
        root.setCenter(textArea);

        return root;
    }
}
