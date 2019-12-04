package com.jrda.design_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class NameList {
    private List<String> nameList;

    public NameList(){
        nameList = new ArrayList<>();
    }

    public NameList(NameList nameList){
        if(nameList != null){
            this.nameList = nameList.nameList;
        }
    }

    public abstract NameList clone();

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }
}
