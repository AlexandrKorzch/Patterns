package com.alex.patterns

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.alex.patterns.adapter.AdapterActivity
import com.alex.patterns.bridge.BridgeActivity
import com.alex.patterns.command.CommandActivity
import com.alex.patterns.composite.CompositeActivity
import com.alex.patterns.decorator.DecoratorActivity
import com.alex.patterns.facade.FacadeActivity
import com.alex.patterns.flyweight.FlyWeightActivity
import com.alex.patterns.mediator.MediatorActivity
import com.alex.patterns.memento.MementoActivityOriginator
import com.alex.patterns.observer.ObserverActivity
import com.alex.patterns.proxy.ProxyActivity
import com.alex.patterns.state.StateActivity
import com.alex.patterns.strategy.StrategyActivity
import com.alex.patterns.visitor.VisitorActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btFlyWeight).setOnClickListener(this)
        findViewById<View>(R.id.btDecorator).setOnClickListener(this)
        findViewById<View>(R.id.btComposite).setOnClickListener(this)
        findViewById<View>(R.id.btMediator).setOnClickListener(this)
        findViewById<View>(R.id.btStrategy).setOnClickListener(this)
        findViewById<View>(R.id.btObserver).setOnClickListener(this)
        findViewById<View>(R.id.btVisitor).setOnClickListener(this)
        findViewById<View>(R.id.btCommand).setOnClickListener(this)
        findViewById<View>(R.id.btMomento).setOnClickListener(this)
        findViewById<View>(R.id.btAdapter).setOnClickListener(this)
        findViewById<View>(R.id.btFacade).setOnClickListener(this)
        findViewById<View>(R.id.btBridge).setOnClickListener(this)
        findViewById<View>(R.id.btProxy).setOnClickListener(this)
        findViewById<View>(R.id.btState).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btMomento -> open(MementoActivityOriginator::class.java)
            R.id.btFlyWeight -> open(FlyWeightActivity::class.java)
            R.id.btComposite -> open(CompositeActivity::class.java)
            R.id.btDecorator -> open(DecoratorActivity::class.java)
            R.id.btMediator -> open(MediatorActivity::class.java)
            R.id.btStrategy -> open(StrategyActivity::class.java)
            R.id.btObserver -> open(ObserverActivity::class.java)
            R.id.btVisitor -> open(VisitorActivity::class.java)
            R.id.btCommand -> open(CommandActivity::class.java)
            R.id.btAdapter -> open(AdapterActivity::class.java)
            R.id.btFacade -> open(FacadeActivity::class.java)
            R.id.btBridge -> open(BridgeActivity::class.java)
            R.id.btProxy -> open(ProxyActivity::class.java)
            R.id.btState -> open(StateActivity::class.java)
        }
    }

    private fun open(clazz: Class<out Activity>) {
        startActivity(Intent(this, clazz))
    }
}

