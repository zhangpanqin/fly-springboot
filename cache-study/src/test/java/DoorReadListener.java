import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

public class DoorReadListener extends AnalysisEventListener<TestData> {

    private int count = 0;

    private List list = new ArrayList(16);


    @Override
    public void invoke(TestData data, AnalysisContext context) {
        list.add(data);
        count++;
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println("读取了" + count + "数据");
        System.out.println(list);
    }

}