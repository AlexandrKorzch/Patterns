package com.alex.patterns.strategy

import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.strategy.java.EncryptionJava
import com.alex.patterns.strategy.java.FirstAlgorithmJava
import com.alex.patterns.strategy.java.SecondAlgorithmJava
import com.alex.patterns.strategy.java.ThirdAlgorithmJava
import com.alex.patterns.strategy.kotlin.EncryptionKotlin
import com.alex.patterns.strategy.kotlin.FirstAlgorithmKotlin
import com.alex.patterns.strategy.kotlin.SecondAlgorithmKotlin
import com.alex.patterns.strategy.kotlin.ThirdAlgorithmKotlin
import kotlinx.android.synthetic.main.activity_strategy.*

class StrategyActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.strategy
    override fun layoutId() = R.layout.activity_strategy
    override fun isBackButton() = true

    private lateinit var edText: EditText

    private val encryptionKotlin by lazy { EncryptionKotlin() }
    private val encryptionJava by lazy { EncryptionJava() }

    override fun onCreate() {
        initRadioGroup()
        setClickListener(btCrypt)
        edText = findViewById(R.id.editText)
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.btCrypt -> when (language) {
                Language.KOTLIN -> tvText.text = encryptionKotlin.crypt(edText.text.toString())
                Language.JAVA -> tvText.text = encryptionJava.crypt(edText.text.toString())
            }
        }
    }

    private fun initRadioGroup() {
        findViewById<RadioGroup>(R.id.rgCrypt)?.apply {
            check(R.id.rbCrypt_1)
            setOnCheckedChangeListener { _, checkedId ->
                when (checkedId) {
                    R.id.rbCrypt_1 -> when (language) {
                        Language.KOTLIN -> encryptionKotlin.algorithm = FirstAlgorithmKotlin()
                        Language.JAVA -> encryptionJava.setAlgorithm(FirstAlgorithmJava())
                    }
                    R.id.rbCrypt_2 -> when (language) {
                        Language.KOTLIN -> encryptionKotlin.algorithm = SecondAlgorithmKotlin()
                        Language.JAVA -> encryptionJava.setAlgorithm(SecondAlgorithmJava())
                    }
                    R.id.rbCrypt_3 -> when (language) {
                        Language.KOTLIN -> encryptionKotlin.algorithm = ThirdAlgorithmKotlin()
                        Language.JAVA -> encryptionJava.setAlgorithm(ThirdAlgorithmJava())
                    }
                }
            }
        }
    }
}