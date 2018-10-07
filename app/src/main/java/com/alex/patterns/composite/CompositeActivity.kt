package com.alex.patterns.composite

import android.widget.LinearLayout
import android.widget.RadioGroup
import com.alex.patterns.BaseActivity
import com.alex.patterns.R
import com.alex.patterns.composite.java.TaskListJava
import com.alex.patterns.composite.kotlin.TaskListKotlin
import kotlinx.android.synthetic.main.activity_composite.*

class CompositeActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.composite
    override fun layoutId() = R.layout.activity_composite
    override fun isBackButton() = true

    private var rootListKotlin: TaskListKotlin? = null
    private var rootListJava: TaskListJava? = null

    override fun onCreate() {
        initRadioGroup()
    }

    private fun initRadioGroup() {
        findViewById<RadioGroup>(R.id.rgLanguage)?.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbKotlin -> initKotlinCode()
                R.id.rbJava -> initJavaCode()
            }
        }
    }

    private fun initKotlinCode() {
        container.removeAllViews()
        rootListKotlin = TaskListKotlin("TASKS", this) { showKotlinSum() }
                .apply {
                    getMainView().apply {
                        background = context.getDrawable(R.drawable.background_tasks)
                        addView(tvName.apply {
                            background = context.getDrawable(R.drawable.background_tasks_name)
                        })
                        container.addView(this)
                    }
                }
    }

    private fun initJavaCode() {
        container.removeAllViews()
        rootListJava = TaskListJava(0, "TASKS", this) { showJavaSum() }
                .apply {
                    (this.mainView as LinearLayout).apply {
                        background = context.getDrawable(R.drawable.background_tasks)
                        addView(tvName.apply {
                            background = context.getDrawable(R.drawable.background_tasks_name)
                        })
                        container.addView(this)
                    }
                }
    }

    private fun showKotlinSum() {
        tvSum.text = rootListKotlin?.getSum().toString()
    }

    private fun showJavaSum() {
        tvSum.text = rootListJava?.sum.toString()
    }
}
