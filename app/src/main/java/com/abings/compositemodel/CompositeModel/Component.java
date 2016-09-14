package com.abings.compositemodel.CompositeModel;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/14.
 */
public abstract class Component {
    public String name;
    public String zhize;
    public int level;

    public Component(String name,int level){
        this.name = name;
        this.level = level;
    }
    public abstract void dispaly(int depth);
    public abstract void LineOfDuty();
    public void show(){
        Log.i("Tag", "第" + level + "层：" + name);
    }
}
