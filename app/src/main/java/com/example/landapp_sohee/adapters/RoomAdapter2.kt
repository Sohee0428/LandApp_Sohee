package com.example.landapp_sohee.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.landapp_sohee.R
import com.example.landapp_sohee.datas.Room2

class RoomAdapter2(val mContext: Context, val resId: Int, val List: ArrayList<Room2>) :
    ArrayAdapter<Room2>(mContext, resId, List) {

    val inflate = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView ?: inflate.inflate(R.layout.room_list_item2, null)

        val row = tempRow!!


        val roomData = List[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt2)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt2)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt2)

        addressAndFloorTxt.text = "${roomData.address}, ${roomData.getFormattedFloor()}"



        return row

    }
}