package com.jrda.design_patterns.command.remote_save;

public class SaveReceiver {
    public boolean save(String name){
        if(name.contains("Jose")){
            return true;
        }
        return false;
    }
}
