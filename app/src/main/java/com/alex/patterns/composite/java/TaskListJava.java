package com.alex.patterns.composite.java;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;

import com.alex.patterns.R;

import java.util.ArrayList;
import java.util.List;

public class TaskListJava extends TaskJava {

    private final Runnable runnable;
    private List<ComponentJava> components = new ArrayList<>();
    private LinearLayout linearLayout = new LinearLayout(context);

    public TaskListJava(int count, String name, final Context context, Runnable runnable) {
        super(count, name, context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        initClickListeners(context);
        this.runnable = runnable;
    }

    private void initClickListeners(final Context context) {
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addComponent(new TaskJava(1, name + " Task", context));
            }
        });
        tvName.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                addComponent(new TaskListJava(0, name + " Tasks", context, runnable));
                return false;
            }
        });
    }

    @Override
    Drawable getBackground() {
        return context.getDrawable(R.drawable.background_tasks);
    }

    @Override
    public View getMainView() {
        return linearLayout;
    }

    @Override
    public int getSum() {
        int count = 0;
        for (ComponentJava comgonent : components) {
            count+=comgonent.count;
        }
        return super.getSum() + count;
    }

    private Drawable getTaskNameBackground(){
        return context.getDrawable(R.drawable.background_tasks_name);
    }

    private void  addComponent(ComponentJava component){
        components.add(component);
        if(component instanceof TaskListJava){
            component.tvName.setBackground(getTaskNameBackground());
            ((LinearLayout) component.getMainView()).addView(component.tvName);

        }
        component.getMainView().setBackground(component.getBackground());
        ((LinearLayout) getMainView()).addView(component.getMainView());
        runnable.run();
    }
}