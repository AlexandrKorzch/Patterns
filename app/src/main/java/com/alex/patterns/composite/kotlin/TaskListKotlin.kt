package com.alex.patterns.composite.kotlin

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import com.alex.patterns.R

class TaskListKotlin(name: String, context: Context, val function: () -> Unit) : TaskKotlin(name, context) {

    private val components = mutableListOf<ComponentKotlin>()

    private val linearLayout = LinearLayout(context).apply {
        orientation = VERTICAL
    }

    init {
        tvName.setOnClickListener { addComponent(TaskKotlin("$name Task", context, 1)) }
        tvName.setOnLongClickListener {
            addComponent(TaskListKotlin("$name Tasks", context, function))
            true
        }
    }

    override fun getMainView() = linearLayout

    override fun getBackground(): Drawable = context.getDrawable(R.drawable.background_tasks)

    override fun getSum() = super.getSum().plus(components.sumBy { it.getSum() })

    private fun getTaskNameBackground(): Drawable = context.getDrawable(R.drawable.background_tasks_name)

    private fun addComponent(component: ComponentKotlin) {
        components.add(component)
        takeIf { component is TaskListKotlin }?.apply {
            component.tvName.apply {
                background = getTaskNameBackground()
                (component as? TaskListKotlin)?.getMainView()?.addView(this)
            }
        }
        component.getMainView().background = component.getBackground()
        getMainView().addView(component.getMainView())
        function()
    }
}