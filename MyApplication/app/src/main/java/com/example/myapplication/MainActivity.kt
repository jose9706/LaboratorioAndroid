package com.example.myapplication


import android.graphics.Color
import android.media.MediaActionSound
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        var counter = 0
        var counter2 = 0
        var counter3 = 0
        var counter4 = 0
        var counter5 = 0
        var counter6 = 0
        val soundList: MutableList<Int> = ArrayList()
        soundList.add(R.raw.sound1)
        soundList.add(R.raw.sound2)
        soundList.add(R.raw.sound3)
        soundList.add(R.raw.sound4)
        soundList.add(R.raw.sound5)
        soundList.add(R.raw.sound6)
        soundList.add(R.raw.sound7)

        button.setOnClickListener(View.OnClickListener { view ->
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()

            applyColor(counter, button)
            playRandomSound(soundList);
            if(counter>= 5) {
                counter = 0
            } else {
                counter += 1
            }
        })

        button2.setOnClickListener(View.OnClickListener { view ->
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            applyColor(counter2, button2)
            playRandomSound(soundList);
            if(counter2>= 5) {
                counter2 = 0
            } else {
                counter2 += 1
            }
        })
        button3.setOnClickListener(View.OnClickListener { view ->
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            applyColor(counter3, button3)
            playRandomSound(soundList);
            if(counter3>= 5) {
                counter3 = 0
            } else {
                counter3 += 1
            }
        })
        button4.setOnClickListener(View.OnClickListener { view ->
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            applyColor(counter4, button4)
            playRandomSound(soundList);
            if(counter4>= 5) {
                counter4 = 0
            } else {
                counter4 += 1
            }
        })
        button5.setOnClickListener(View.OnClickListener { view ->
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            applyColor(counter5, button5)
            playRandomSound(soundList);
            if(counter5>= 5) {
                counter5 = 0
            } else {
                counter5 += 1
            }
        })
        button6.setOnClickListener(View.OnClickListener { view ->
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            applyColor(counter6, button6)
            playRandomSound(soundList);
            if(counter6>= 5) {
                counter6 = 0
            } else {
                counter6 += 1
            }
        })


    }

    private fun playRandomSound(soundList: MutableList<Int>) {
        val randomInt: Int = Random.nextInt(soundList.size)
        val sound: Int = soundList[randomInt]
        val mp = MediaPlayer.create(this, sound)
        mp.start()
    }
    private fun applyColor(counter: Int, button: Button) {
        if(counter==0) {
            button.setBackgroundColor(Color.YELLOW);
            button.setTextColor(Color.BLACK);
        }
        if(counter==1) {
            button.setBackgroundColor(Color.WHITE);
            button.setTextColor(Color.BLACK);
        }
        if(counter==2) {
            button.setBackgroundColor(Color.CYAN);
            button.setTextColor(Color.BLACK);
        }
        if(counter==3) {
            button.setBackgroundColor(Color.RED);
            button.setTextColor(Color.BLACK);
        }
        if(counter==4) {
            button.setBackgroundColor(Color.BLUE);
            button.setTextColor(Color.WHITE);
        }
        if(counter==5) {
            button.setBackgroundColor(Color.TRANSPARENT);
            button.setTextColor(Color.BLACK);
        }
    }

    fun playBeepSound(view : View) {
        val sound = MediaActionSound()
        sound.play(MediaActionSound.START_VIDEO_RECORDING)
    }


}


