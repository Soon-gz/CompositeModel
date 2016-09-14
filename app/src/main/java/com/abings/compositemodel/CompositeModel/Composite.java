package com.abings.compositemodel.CompositeModel;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HaomingXu on 2016/9/14.
 */
public class Composite extends Component implements Componey {

    private List<Component>cs = new ArrayList<>();

    public Composite(String name, int level) {
        super(name, level);
    }

    @Override
    public void dispaly(int depth) {
        for (int i = 0; i < cs.size(); i++) {
            cs.get(i).show();
            cs.get(i).dispaly(depth);
        }
    }



    @Override
    public void LineOfDuty() {
        Log.i("Tag", this.name+"\n");
    }

    @Override
    public void add(Component c) {
        cs.add(c);
    }

    @Override
    public void remove(Component c) {
        cs.remove(c);
    }
}
