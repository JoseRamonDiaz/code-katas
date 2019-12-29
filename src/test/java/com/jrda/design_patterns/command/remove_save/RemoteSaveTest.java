package com.jrda.design_patterns.command.remove_save;

import com.jrda.design_patterns.command.remote_save.SaveCommand;
import com.jrda.design_patterns.command.remote_save.SaveSender;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoteSaveTest {
    @Test
    public void saveTestFail(){
        SaveSender saveSender = new SaveSender();
        SaveCommand saveCommand = new SaveCommand("Ricardo Ramon");

        saveSender.setCommand(saveCommand);
        assertEquals("Can't save the name", saveSender.executeCommand());
    }

    @Test
    public void saveTestSuccess(){
        SaveSender saveSender = new SaveSender();
        SaveCommand saveCommand = new SaveCommand("Jose Ramon");

        saveSender.setCommand(saveCommand);
        assertEquals("Name saved successfully", saveSender.executeCommand());
    }
}
