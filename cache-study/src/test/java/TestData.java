import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2020-05-06-19:27
 */
@Data
public class TestData implements Serializable {
    private static final long serialVersionUID = 6540633818273158346L;

    @ExcelProperty(value = "序号")
    private String number;

    @ExcelProperty(value = "团队")
    private String tuandui;

    @ExcelProperty(value = "组别")
    private String zubie;

    @ExcelProperty(value = "负责人")
    private String fuzeren;

    @ExcelProperty(value = "保障客户明细")
    private String baozhangkehumingxi;

    @ExcelProperty(value = "姓名")
    private String xingming;

    @ExcelProperty(value = "属性")
    private String shuxing;

    @ExcelProperty(value = "面貌")
    private String mianmao;

    @ExcelProperty(value = "所属单位")
    private String suoshudanwei;

    @ExcelProperty(value = "联系方式")
    private String lianxifangshi;

    @ExcelProperty(value = "800M")
    private String id800M;

    @ExcelProperty(value = "ID")
    private String id;
    @ExcelProperty(value = "APP账号")
    private String appaCount;

    @ExcelProperty("细分专业")
    private String xifenzhuanye;

    @ExcelProperty("保障设备")
    private String baozhangshebei;

    @ExcelProperty("保障级别")
    private String baozhangjibie;

    @ExcelProperty("保障标准")
    private String baozhangbiaozhun;

    @ExcelProperty("备注")
    private String beizhu;
}
