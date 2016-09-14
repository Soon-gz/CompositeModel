package com.abings.compositemodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abings.compositemodel.CompositeModel.Composite;
import com.abings.compositemodel.CompositeModel.FinanceDepartment;
import com.abings.compositemodel.CompositeModel.HRDepartment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Composite root = new Composite("北京总公司",0);
        root.add(new HRDepartment("北京总公司人力资源部",1));
        root.add(new FinanceDepartment("北京总公司财务部",1));

        Composite comp_1 = new Composite("上海华东分公司",1);
        comp_1.add(new HRDepartment("华东分公司人力资源部",2));
        comp_1.add(new FinanceDepartment("华东分公司财务部",2));
        root.add(comp_1);

        Composite comp_2 = new Composite("南京办事处",2);
        comp_2.add(new FinanceDepartment("南京办事处财务部",3));
        comp_2.add(new HRDepartment("南京办事处人力资源部",3));
        comp_1.add(comp_2);

        Composite comp_3 = new Composite("杭州办事处",2);
        comp_3.add(new HRDepartment("杭州办事处人力资源部",3));
        comp_3.add(new FinanceDepartment("杭州办事处财务部",3));
        comp_1.add(comp_3);

        //显示结构
        root.show();
        root.dispaly(0);

    }
}
