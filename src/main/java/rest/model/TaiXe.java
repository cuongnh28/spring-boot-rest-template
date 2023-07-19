package rest.model;
import lombok.Data;

import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.List;


@Data
public class TaiXe {
	private Long taiXeId;
	private String ten;
	@Size(min=6, message="Cmt phải có từ 6 số trở lên")
//	@NotBlank(message = "Lỗi")
	private String cmt;
	private String maSoBangLai;
	private String loaiBang;
	private String diaChi;
	private Date ngaySinh;
	private int thamNien;
	private List<ChuyenXe> listChuyenXePhu;
	private List<ChuyenXe> listChuyenXeLai;
	private float salary;

	public TaiXe(){}

	public TaiXe(String ten, String cmt, String maSoBangLai, String loaiBang, String diaChi, Date ngaySinh, int thamNien){
		this.ten = ten;
		this.cmt = cmt;
		this.maSoBangLai = maSoBangLai;
		this.loaiBang = loaiBang;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.thamNien = thamNien;
	}

	public TaiXe(Long taiXeId, String ten, String cmt, String maSoBangLai, String loaiBang, String diaChi, Date ngaySinh, int thamNien){
		this.taiXeId = taiXeId;
		this.ten = ten;
		this.cmt = cmt;
		this.maSoBangLai = maSoBangLai;
		this.loaiBang = loaiBang;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.thamNien = thamNien;
	}

}
