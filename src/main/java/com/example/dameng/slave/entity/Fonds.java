package com.example.dameng.slave.entity;

public class Fonds {
    private int id; //主键id
    private String fondscode; //全宗号
    private String fondsname; //全宗名称
    private String unitperson; //单位联系人
    private String unittel; //单位联系方式
    private String unitaddr; //单位地址
    private String unitname; //单位名称
    private String description; // 单位描述
    private int dataFlag; //数据标识

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFondscode() {
        return fondscode;
    }

    public void setFondscode(String fondscode) {
        this.fondscode = fondscode;
    }

    public String getFondsname() {
        return fondsname;
    }

    public void setFondsname(String fondsname) {
        this.fondsname = fondsname;
    }

    public String getUnitperson() {
        return unitperson;
    }

    public void setUnitperson(String unitperson) {
        this.unitperson = unitperson;
    }

    public String getUnittel() {
        return unittel;
    }

    public void setUnittel(String unittel) {
        this.unittel = unittel;
    }

    public String getUnitaddr() {
        return unitaddr;
    }

    public void setUnitaddr(String unitaddr) {
        this.unitaddr = unitaddr;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(int dataFlag) {
        this.dataFlag = dataFlag;
    }
}
