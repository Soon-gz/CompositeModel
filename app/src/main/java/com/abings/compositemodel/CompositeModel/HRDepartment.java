package com.abings.compositemodel.CompositeModel;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/14.
 */
public class HRDepartment extends Component {

    public HRDepartment(String name, int level) {
        super(name, level);
    }

    @Override
    public void dispaly(int depth) {
    }

    @Override
    public void LineOfDuty() {
        Log.i("Tag",this.name+" 员工招聘培训管理");
    }
}
