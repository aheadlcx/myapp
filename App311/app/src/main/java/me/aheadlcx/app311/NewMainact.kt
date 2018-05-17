package me.aheadlcx.app311

import android.graphics.Rect
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.act_new_main.*

/**
 * Description:
 * author: aheadlcx
 * Date:2018/4/8 上午10:31
 */
class NewMainact : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_new_main)
        val textView = findViewById<TextView>(R.id.txtShow)
        val person =  Person("bikachao")
        val copy = person.copy(person.name, "haha@sasda.com", 10)
        textView.setOnClickListener { textView.text = "hello click aheadlcx"
            textView.text = person.show() + copy.email + compute(y = 3)
        }
        txtShow.setOnClickListener({
            txtShow.text = "hello world aheadlcx"
        })



    }

    fun compute(x: Int = 1, y: Int = 2) :Int{
        return x + y
    }
}