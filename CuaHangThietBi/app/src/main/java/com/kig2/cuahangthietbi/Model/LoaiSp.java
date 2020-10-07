package com.kig2.cuahangthietbi.Model;

public class LoaiSp {
    public int Id;
    public String Tenloaisp;
    public String Hinhanhtenloaisp;

    public LoaiSp(int id, String tenloaisp, String hinhanhtenloaisp) {
        Id = id;
        Tenloaisp = tenloaisp;
        Hinhanhtenloaisp = hinhanhtenloaisp;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTenloaisp() {
        return Tenloaisp;
    }

    public void setTenloaisp(String tenloaisp) {
        Tenloaisp = tenloaisp;
    }

    public String getHinhanhtenloaisp() {
        return Hinhanhtenloaisp;
    }

    public void setHinhanhtenloaisp(String hinhanhtenloaisp) {
        Hinhanhtenloaisp = hinhanhtenloaisp;
    }
}
