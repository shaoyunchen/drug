package com.cec.entity;

public class MedItemWithBLOBs extends MedItem {
    private String descx;

    private String nameOther;

    private String comx;

    private String direct1;

    public String getDescx() {
        return descx;
    }

    public void setDescx(String descx) {
        this.descx = descx == null ? null : descx.trim();
    }

    public String getNameOther() {
        return nameOther;
    }

    public void setNameOther(String nameOther) {
        this.nameOther = nameOther == null ? null : nameOther.trim();
    }

    public String getComx() {
        return comx;
    }

    public void setComx(String comx) {
        this.comx = comx == null ? null : comx.trim();
    }

    public String getDirect1() {
        return direct1;
    }

    public void setDirect1(String direct1) {
        this.direct1 = direct1 == null ? null : direct1.trim();
    }
}