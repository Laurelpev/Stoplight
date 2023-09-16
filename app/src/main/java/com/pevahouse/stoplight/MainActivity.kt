package com.pevahouse.stoplight

import android.graphics.Color.green
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pevahouse.stoplight.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding
//    private val lights = listOf(
//        stopLight(R.string."stop"),
//        stopLight(R.string."wait"),
//        stopLight(R.string."go"),
//    )
    private var isStop = true;
    private var isGo = false;



//    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val redlight = binding.redlight
        val btn = binding.btn

        val yellowlight = binding.yellowlight

        val greenlight = binding.greenlight



        binding.btn.setOnClickListener {
            if (isStop) {
                btn.setBackgroundColor(resources.getColor(R.color.red))
                btn.text = "STOP"
                redlight.visibility = View.VISIBLE
                yellowlight.visibility = View.INVISIBLE
                greenlight.visibility = View.INVISIBLE
//                updatelight()
                isStop = false;
                isGo= true;

            } else if (isGo) {
                btn.setBackgroundColor(resources.getColor(R.color.green))
                btn.text = "GO"
                redlight.visibility = View.INVISIBLE
                yellowlight.visibility = View.INVISIBLE
                greenlight.visibility = View.VISIBLE
//                updatelight()
                isStop = false;
                isGo = false;

            } else{
                btn.setBackgroundColor(resources.getColor(R.color.yellow))
                btn.text = "WAIT"
                redlight.visibility = View.INVISIBLE
                yellowlight.visibility = View.VISIBLE
                greenlight.visibility = View.INVISIBLE
//                updatelight()
                isStop = true;
            }
        }


    }
//
//    private fun updatelight() {
//        val currentLight = lights[currentIndex].textResId
//        binding.btn.setText(currentLight)
//    }
}