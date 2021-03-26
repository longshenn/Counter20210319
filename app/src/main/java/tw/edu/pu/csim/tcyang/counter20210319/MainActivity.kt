package tw.edu.pu.csim.tcyang.counter20210319

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener,View.OnLongClickListener {

    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text = counter.toString()

        txv.setOnClickListener(this)
        txv.setOnLongClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)



        btnHappy.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                counter = (1..100).random()
                txv.text = counter.toString()
            }
        })
    }


    override fun onClick(v: View?) {
        if( v==txv || v==btn1) {
            counter++
        }
        else if(v ==btn2){
            counter += 2
        }else{
            counter = 0
        }
        txv.text = counter.toString()
    }

    override fun onLongClick(p0: View?): Boolean {
        counter+=5
        txv.text = counter.toString()
        return true
    }



}