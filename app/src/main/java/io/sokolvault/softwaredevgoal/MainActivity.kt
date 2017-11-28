package io.sokolvault.softwaredevgoal

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.sokolvault.softwaredevgoal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//  Step 01
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
//      Step 02
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}
