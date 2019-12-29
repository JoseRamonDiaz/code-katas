package com.jrda.design_patterns.command.remote_save;

public class SaveCommand implements Command {
    private SaveReceiver saveReceiver;
    private String nameToSave;

    public SaveCommand(String nameToSave) {
        saveReceiver = new SaveReceiver();
        this.nameToSave = nameToSave;
    }

    @Override
    public String execute() {
        if(saveReceiver.save(nameToSave)){
            return "Name saved successfully";
        } else {
            return "Can't save the name";
        }
    }
}
