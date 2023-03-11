package com.alizamani.mylibrary

import android.content.Context
import android.util.Log
import android.widget.Toast

const val TAG = "Helper"
fun String.log(){
    Log.e(TAG,this.toString())
}
fun Int.log(){
    Log.e(TAG,this.toString())
}

fun Float.log(){
    Log.e(TAG,this.toString())
}

fun toast(ctx:Context,msg:String){
    Toast.makeText(ctx, msg.toString(), Toast.LENGTH_SHORT).show()
}