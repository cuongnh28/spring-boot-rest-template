package rest.model;

import lombok.Data;

import java.sql.Date;

@Data
public class ChuyenXe {

    private Long chuyenXeId;
    private int soKhach;
    private float giaVe;
    private Date ngayDi;
    private Long phuXeId;
    private Long laiXeId;
    private Long xeKhachId;
    private Long tuyenXeId;
    private String tenLaiXe;
    private String tenPhuXe;
    private String bienSoXe;

    public ChuyenXe() {
    }

    public ChuyenXe(Long chuyenXeId, int soKhach, float giaVe, Date ngayDi, Long phuXeId, Long laiXeId, Long xeKhachId, Long tuyenXeId, String tenLaiXe, String tenPhuXe, String bienSoXe) {
        this.chuyenXeId = chuyenXeId;
        this.soKhach = soKhach;
        this.giaVe = giaVe;
        this.ngayDi = ngayDi;
        this.phuXeId = phuXeId;
        this.laiXeId = laiXeId;
        this.xeKhachId = xeKhachId;
        this.tuyenXeId = tuyenXeId;
        this.tenLaiXe = tenLaiXe;
        this.tenPhuXe = tenPhuXe;
        this.bienSoXe = bienSoXe;
    }

    public ChuyenXe(float giaVe, int soKhach, Date ngayDi, Long laiXeId, Long phuXeId, Long tuyenXeId, Long xeKhachId) {
        this.giaVe = giaVe;
        this.soKhach = soKhach;
        this.ngayDi = ngayDi;
        this.laiXeId = laiXeId;
        this.phuXeId = phuXeId;
        this.tuyenXeId = tuyenXeId;
        this.xeKhachId = xeKhachId;
    }

}
