package com.rao27.helloworldslice

import android.annotation.SuppressLint
import android.net.Uri
import androidx.slice.Slice
import androidx.slice.SliceProvider
import androidx.slice.builders.ListBuilder

@SuppressLint("Slices")
class HelloWorldSliceProvider : SliceProvider (){
    override fun onBindSlice(sliceUri: Uri?): Slice? {
        return if(sliceUri?.path.equals("/helloWorld")){
            ListBuilder(context,sliceUri!!,ListBuilder.INFINITY)
                .addRow{
                    it.title = "Hello Slice"
                    it.subtitle = "This is first hello world slice"
                }
                .build()
        } else {
            ListBuilder(context,sliceUri!!,ListBuilder.INFINITY)
                .addRow{ it.title = "Hello Slice World URI not found"}
                .build()
        }
    }

    override fun onCreateSliceProvider(): Boolean {
        return true
    }
}