package com.alex.patterns.observer

import android.view.View
import android.widget.EditText
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.observer.java.ConcreteObservableJava
import com.alex.patterns.observer.java.ConcreteObserverJava
import com.alex.patterns.observer.kotlin.ConcreteObservableKotlin
import com.alex.patterns.observer.kotlin.ConcreteObserverKotlin
import kotlinx.android.synthetic.main.activity_observer.*

class ObserverActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.observer
    override fun layoutId() = R.layout.activity_observer
    override fun isBackButton() = true

    private lateinit var edText: EditText

    private val kotlinObservable = ConcreteObservableKotlin()
    private val javaObservable = ConcreteObservableJava()

    private lateinit var firstKotlinObserver: ConcreteObserverKotlin
    private lateinit var secondKotlinObserver: ConcreteObserverKotlin
    private lateinit var thirdKotlinObserver: ConcreteObserverKotlin

    private lateinit var firstJavaObserver: ConcreteObserverJava
    private lateinit var secondJavaObserver: ConcreteObserverJava
    private lateinit var thirdJavaObserver: ConcreteObserverJava

    override fun onCreate() {
        setClickListener(btSend, tvOne, tvTwo, tvThree)
        edText = findViewById(R.id.editText)
        initObservables()
    }

    private fun initObservables() {
        firstKotlinObserver = ConcreteObserverKotlin { tvOne.text = it }
        secondKotlinObserver = ConcreteObserverKotlin { tvTwo.text = it }
        thirdKotlinObserver = ConcreteObserverKotlin { tvThree.text = it }
        firstJavaObserver = ConcreteObserverJava(ConcreteObserverJava.NotifyWithMessage { tvOne.text = it })
        secondJavaObserver = ConcreteObserverJava(ConcreteObserverJava.NotifyWithMessage { tvTwo.text = it })
        thirdJavaObserver = ConcreteObserverJava(ConcreteObserverJava.NotifyWithMessage { tvThree.text = it })
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.tvOne -> addOrRemoveObservable(R.id.tvOne)
            R.id.tvTwo -> addOrRemoveObservable(R.id.tvTwo)
            R.id.tvThree -> addOrRemoveObservable(R.id.tvThree)
            R.id.btSend -> send()
        }
    }

    private fun send() {
        when (language) {
            Language.JAVA -> javaObservable.notifyObservers(edText.text.toString())
            Language.KOTLIN -> kotlinObservable.notifyObservers(edText.text.toString())
        }
    }

    private fun addOrRemoveObservable(viewId: Int) {
        when (language) {
            Language.JAVA -> when (viewId) {
                R.id.tvOne -> javaObservable.addOrRemoveObservable(firstJavaObserver)
                R.id.tvTwo -> javaObservable.addOrRemoveObservable(secondJavaObserver)
                R.id.tvThree -> javaObservable.addOrRemoveObservable(thirdJavaObserver)
            }
            Language.KOTLIN -> when (viewId) {
                R.id.tvOne -> kotlinObservable.addOrRemoveObservable(firstKotlinObserver)
                R.id.tvTwo -> kotlinObservable.addOrRemoveObservable(secondKotlinObserver)
                R.id.tvThree -> kotlinObservable.addOrRemoveObservable(thirdKotlinObserver)
            }
        }
    }
}