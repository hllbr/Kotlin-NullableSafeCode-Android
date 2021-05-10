package com.hllbr.nullablesafecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Bir sınıfı nullable olarak tanımlamanın getirdiği ajantajlar == Safe Code
        Nullable(?) değer var mı yok mu belli değil
        !! değer kesin var eminim
         */
        //1)Null Safe =
        var myAge :Int? = null
        if(myAge != null ){
            println(myAge*3)//Burada hata vermemesinin sebebi kotlin burdaa null ifade sorguladığımı anladığı içindir.
        }else{
            println("myAge is null")
        }
        //2)Safe Call ==
        println(myAge?.compareTo(2))
        //3)Elvis (Elvis Operator) ==
        val myResult = myAge?.compareTo(2) ?: -100//eğer işlem sonucum null çıkarsa sonucu -100'e eşitle olarak ifade edebilirim
        println(myResult)

    }
}