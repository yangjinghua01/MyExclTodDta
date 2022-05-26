package com.example.myexcltoddta;

import com.alibaba.excel.annotation.ExcelProperty;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class DetonatorData {
    @Id(autoincrement = true)
    private long id;
    @NotNull
    private String detonator;
    @NotNull
    private String uid;
    @NotNull
    private String area;
    @NotNull
    private String group;
    @NotNull
    private String line;
    @NotNull
    private String hole;
    @NotNull
    private String position;
    @NotNull
    private String delay;
    @NotNull
    private String reserved1;
    @NotNull
    private String reserved2;
    @NotNull
    private String reserved3;
    @NotNull
    private String reserved4;
    @NotNull
    private String reserved5;
    @NotNull
    private String reserved6;
    @NotNull
    private String reserved7;
    @NotNull
    private String reserved8;
    @NotNull
    private String reserved9;
    @NotNull
    private String reserved10;
    @Generated(hash = 159921057)
    public DetonatorData(long id, @NotNull String detonator, @NotNull String uid,
            @NotNull String area, @NotNull String group, @NotNull String line,
            @NotNull String hole, @NotNull String position, @NotNull String delay,
            @NotNull String reserved1, @NotNull String reserved2,
            @NotNull String reserved3, @NotNull String reserved4,
            @NotNull String reserved5, @NotNull String reserved6,
            @NotNull String reserved7, @NotNull String reserved8,
            @NotNull String reserved9, @NotNull String reserved10) {
        this.id = id;
        this.detonator = detonator;
        this.uid = uid;
        this.area = area;
        this.group = group;
        this.line = line;
        this.hole = hole;
        this.position = position;
        this.delay = delay;
        this.reserved1 = reserved1;
        this.reserved2 = reserved2;
        this.reserved3 = reserved3;
        this.reserved4 = reserved4;
        this.reserved5 = reserved5;
        this.reserved6 = reserved6;
        this.reserved7 = reserved7;
        this.reserved8 = reserved8;
        this.reserved9 = reserved9;
        this.reserved10 = reserved10;
    }
    @Generated(hash = 1958598116)
    public DetonatorData() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDetonator() {
        return this.detonator;
    }
    public void setDetonator(String detonator) {
        this.detonator = detonator;
    }
    public String getUid() {
        return this.uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getArea() {
        return this.area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getGroup() {
        return this.group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getLine() {
        return this.line;
    }
    public void setLine(String line) {
        this.line = line;
    }
    public String getHole() {
        return this.hole;
    }
    public void setHole(String hole) {
        this.hole = hole;
    }
    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDelay() {
        return this.delay;
    }
    public void setDelay(String delay) {
        this.delay = delay;
    }
    public String getReserved1() {
        return this.reserved1;
    }
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }
    public String getReserved2() {
        return this.reserved2;
    }
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }
    public String getReserved3() {
        return this.reserved3;
    }
    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }
    public String getReserved4() {
        return this.reserved4;
    }
    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4;
    }
    public String getReserved5() {
        return this.reserved5;
    }
    public void setReserved5(String reserved5) {
        this.reserved5 = reserved5;
    }
    public String getReserved6() {
        return this.reserved6;
    }
    public void setReserved6(String reserved6) {
        this.reserved6 = reserved6;
    }
    public String getReserved7() {
        return this.reserved7;
    }
    public void setReserved7(String reserved7) {
        this.reserved7 = reserved7;
    }
    public String getReserved8() {
        return this.reserved8;
    }
    public void setReserved8(String reserved8) {
        this.reserved8 = reserved8;
    }
    public String getReserved9() {
        return this.reserved9;
    }
    public void setReserved9(String reserved9) {
        this.reserved9 = reserved9;
    }
    public String getReserved10() {
        return this.reserved10;
    }
    public void setReserved10(String reserved10) {
        this.reserved10 = reserved10;
    }

    @Override
    public String toString() {
        return "DetonatorData{" +
                "id=" + id +
                ", detonator='" + detonator + '\'' +
                ", uid='" + uid + '\'' +
                ", area='" + area + '\'' +
                ", group='" + group + '\'' +
                ", line='" + line + '\'' +
                ", hole='" + hole + '\'' +
                ", position='" + position + '\'' +
                ", delay='" + delay + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                ", reserved4='" + reserved4 + '\'' +
                ", reserved5='" + reserved5 + '\'' +
                ", reserved6='" + reserved6 + '\'' +
                ", reserved7='" + reserved7 + '\'' +
                ", reserved8='" + reserved8 + '\'' +
                ", reserved9='" + reserved9 + '\'' +
                ", reserved10='" + reserved10 + '\'' +
                '}';
    }
}
