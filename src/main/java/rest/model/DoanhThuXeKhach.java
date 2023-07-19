package rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoanhThuXeKhach {
    private Long xeKhachId;
    private String bienSo;
    private float doanhThu;

}
