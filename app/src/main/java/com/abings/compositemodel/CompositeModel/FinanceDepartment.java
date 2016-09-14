package com.abings.compositemodel.CompositeModel;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/14.
 */
public class FinanceDepartment extends Component {

    public FinanceDepartment(String name, int level) {
        super(name, level);
    }

    @Override
    public void dispaly(int depth) {
    }

    @Override
    public void LineOfDuty() {
        Log.i("Tag", this.name + " 公司财务收支管理");
    }
}
