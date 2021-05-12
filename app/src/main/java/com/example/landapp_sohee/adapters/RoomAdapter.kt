package com.example.landapp_sohee.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.landapp_sohee.R
import com.example.landapp_sohee.datas.Room

class RoomAdapter(val mContext: Context,
                  val resId: Int,
                  val mList: ArrayList<Room>): ArrayAdapter<Room>(mContext,resId,mList) {


    val inflater = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var tempRow = convertView

        if( tempRow == null) {

            tempRow = inflater.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!


        return row

    }
}