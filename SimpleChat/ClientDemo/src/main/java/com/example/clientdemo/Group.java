package com.example.clientdemo;

public class Group {
    private String nameGroup = null;

    private int idGroup;

    public String getNameGroup(){
        return nameGroup.toString();
    }

    public void setNameGroup(String nameGroup){
        this.nameGroup = nameGroup;
    }

    public String getStringIdGroup(){
        return  "" + idGroup;
    }

    public int getIdGroup(){
        return  idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
}
