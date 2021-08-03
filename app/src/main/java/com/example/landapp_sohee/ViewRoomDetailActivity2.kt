package com.example.landapp_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landapp_sohee.datas.Room2
import kotlinx.android.synthetic.main.activity_view_room_detail2.*

class ViewRoomDetailActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail2)

        val roomData = intent.getSerializableExtra("room") as Room2

        priceTxt2.text = roomData.getFormattedPrice()
        descriptionTxt2.text = roomData.description
        addressTxt2.text = roomData.address
        floorTxt2.text = roomData.getFormattedFloor()
    }
}