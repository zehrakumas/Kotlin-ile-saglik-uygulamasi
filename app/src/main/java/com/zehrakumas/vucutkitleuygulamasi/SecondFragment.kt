package com.zehrakumas.vucutkitleuygulamasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_second.*
import java.lang.Exception


class SecondFragment : Fragment() {


 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button2.setOnClickListener{
            try {
                var boy : Double? //double fakat null olabilir diyoruz
                var kilo : Int? //int fakat null olabilir diyoruz
                boy=editText1.text.toString().toDoubleOrNull()
                kilo=editText2.text.toString().toIntOrNull()

                if(editText1==null || editText2==null){

                    Toast.makeText(getActivity(),"Lütfen geçerli veriler giriniz",Toast.LENGTH_LONG).show()

                }else{
                    var deger1=boy!!*boy!! //burada kesin null olmayacak diyoruz
                    var sonuc=kilo!!/deger1
                    if(sonuc>=0 || sonuc <=18.4 ){
                        var number1digits:Double = String.format("%.1f", sonuc).toDouble()
                        textView5.text="Kitle indeksiniz: ${number1digits}"
                    }
                    else if(sonuc>=18.5 || sonuc<=24.9)
                    {
                        var number1digits:Double = String.format("%.1f", sonuc).toDouble()
                        textView5.text="Kitle indeksiniz: ${number1digits}"
                    }
                    else if(sonuc>=25 || sonuc <=29.9){
                        var number1digits:Double = String.format("%.1f", sonuc).toDouble()
                        textView5.text="Kitle indeksiniz: ${number1digits}"
                    }
                    else if(sonuc>=30 || sonuc<=34.9)
                    {
                        var number1digits:Double = String.format("%.1f", sonuc).toDouble()
                        textView5.text="Kitle indeksiniz: ${number1digits}"
                    }
                    else if(sonuc>=35 || sonuc<=44.9)
                    {
                        var number1digits:Double = String.format("%.1f", sonuc).toDouble()
                        textView5.text="Kitle indeksiniz: ${number1digits}"
                    }
                    else if(sonuc>=45){
                        var number1digits:Double = String.format("%.1f", sonuc).toDouble()
                        textView5.text="Kitle indeksiniz: ${number1digits}"
                    }
                    else{
                        var number1digits:Double = String.format("%.1f", sonuc).toDouble()
                        textView5.text="Lütfen geçerli ifadeler giriniz."
                    }

                }



            }catch (e:Exception){
                e.printStackTrace()
            }
        }
    }





}