package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
    
import java.util.ArrayList;
    
public class UndoCommand implements Command {
    private final String text;
    private final int lineNumber;
    
    public UndoCommand(String text, int lineNumber) {
        this.text = text;
        this.lineNumber = lineNumber;
    }

    //originator.restaurarMemento( caretaker.getMemento() );
    
    @Override
    public void execute(ArrayList<String> documentLines) {
        if (documentLines.size() > lineNumber)
            documentLines.set(lineNumber, text);
        else
            documentLines.add(text);
    }
}