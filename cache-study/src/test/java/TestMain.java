import com.alibaba.excel.EasyExcel;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 张攀钦
 * @date 2020-05-06-19:17
 */
public class TestMain {
    public static void main(String[] args) {
        final DoorReadListener doorReadListener = new DoorReadListener();
        try (InputStream xlsxIO = TestMain.class.getClassLoader().getResourceAsStream("a.xlsx")) {
            EasyExcel.read(xlsxIO).autoCloseStream(true).head(TestData.class).registerReadListener(doorReadListener).ignoreEmptyRow(true).doReadAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
