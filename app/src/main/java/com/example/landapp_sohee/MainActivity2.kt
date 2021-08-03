package com.example.landapp_sohee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landapp_sohee.adapters.RoomAdapter2
import com.example.landapp_sohee.datas.Room2
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    val roomList = ArrayList<Room2>()

    lateinit var adapter: RoomAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        roomList.add(Room2(7500, "서울시 동대문구", 8, "동대문구의 8층 7500만원 방입니다."))
        roomList.add(Room2(24500, "서울시 서대문구", 0, "서대문구의 반지하 2억 4500만원 방입니다."))
        roomList.add(Room2(8500, "서울시 동작구", 0, "동작구의 반지하 8500만원 방입니다."))
        roomList.add(Room2(4500, "서울시 은평구", -2, "은평구의 지하 2층 4500만원 방입니다."))
        roomList.add(Room2(182500, "서울시 중랑구", 5, "중랑구의 5층 1억 18억 2500만원 방입니다."))
        roomList.add(Room2(235000, "서울시 도봉구", 7, "도봉구의 7층 1억 23억 5000만원 방입니다."))
        roomList.add(Room2(24000, "서울시 강남구", 19, "강남구의 19층 2억 4000만원 방입니다."))
        roomList.add(Room2(3700, "서울시 서초구", -1, "서초구의 지하 1층 3700만원 방입니다."))

        adapter = RoomAdapter2(this, R.layout.room_list_item2, roomList)
        roomListView2.adapter = adapter

        roomListView2.setOnItemClickListener { parent, view, position, id ->
            val clickedRoom = roomList[position]
            val intent = Intent(this, ViewRoomDetailActivity2::class.java)
            intent.putExtra("room", clickedRoom)
            startActivity(intent)
        }
    }
}
