package com.example.msptask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.msptask2.operation.Addition
import com.example.msptask2.operation.Divide
import com.example.msptask2.operation.Modelse
import com.example.msptask2.operation.Multiplicatioin
import com.example.msptask2.operation.Subtraction

class MainActivity : AppCompatActivity() {
    lateinit var tv1:TextView
    lateinit var b1:Button
    lateinit var b2:Button
    lateinit var b3:Button
    lateinit var b4:Button
    lateinit var b5:Button
    lateinit var b6:Button
    lateinit var b7:Button
    lateinit var b8:Button
    lateinit var b9:Button
    lateinit var b10:Button
    lateinit var b11:Button
    lateinit var b12:Button
    lateinit var b13:Button
    lateinit var b14:Button
    lateinit var b15:Button
    lateinit var b16:Button
    lateinit var b17:Button
    lateinit var b18:Button
    lateinit var b19:Button
    lateinit var b20:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1:Float = 0.0f
        var num2:Float = 0.0f
        var eq = ""
        tv1=findViewById(R.id.tv1)
        b1=findViewById(R.id.b1)
        b2=findViewById(R.id.b2)
        b3=findViewById(R.id.b3)
        b4=findViewById(R.id.b4)
        b5=findViewById(R.id.b5)
        b6=findViewById(R.id.b6)
        b7=findViewById(R.id.b7)
        b8=findViewById(R.id.b8)
        b9=findViewById(R.id.b9)
        b10=findViewById(R.id.b10)
        b11=findViewById(R.id.b11)
        b12=findViewById(R.id.b12)
        b13=findViewById(R.id.b13)
        b14=findViewById(R.id.b14)
        b15=findViewById(R.id.b15)
        b16=findViewById(R.id.b16)
        b17=findViewById(R.id.b17)
        b18=findViewById(R.id.b18)
        b19=findViewById(R.id.b19)
        b20=findViewById(R.id.b20)
        b1.setOnClickListener{
          tv1.text=""
        }
        b2.setOnClickListener{
            var res:String = tv1.text.toString()
            num1 = res.toFloat()
            tv1.text = ""
            eq="%"
        }
        b3.setOnClickListener{
            var i = 0
            var res:String = ""
            while(i < tv1.text.length - 1){
                res += tv1.text[i]
                i++
            }
            tv1.text=res
        }
        b4.setOnClickListener{
            var res:String = tv1.text.toString()
            num1 = res.toFloat()
            tv1.text = ""
            eq="/"
        }
        b5.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "7"
            tv1.text = res

        }
        b6.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "8"
            tv1.text = res


        }
        b7.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "9"
            tv1.text = res


        }
        b8.setOnClickListener{
            eq="*"
            var res:String = tv1.text.toString()
            num1 = res.toFloat()
            tv1.text = ""


        }
        b9.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "4"
            tv1.text = res


        }
        b10.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "5"
            tv1.text = res




        }
        b11.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "6"
            tv1.text = res



        }
        b12.setOnClickListener{
            var res:String = tv1.text.toString()
            num1 = res.toFloat()
            tv1.text = ""
            eq="-"


        }
        b13.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "1"
            tv1.text = res




        }
        b14.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "2"
            tv1.text = res



        }
        b15.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "3"
            tv1.text = res




        }
        b16.setOnClickListener{
            var res:String = tv1.text.toString()
            num1 = res.toFloat()
            tv1.text = ""
            eq="+"




        }
        b17.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "00"
            tv1.text = res




        }
        b18.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "0"
            tv1.text = res




        }
        b19.setOnClickListener{
            var res:String = tv1.text.toString()
            res += "."
            tv1.text = res




        }
        b20.setOnClickListener{
            var res:String = tv1.text.toString()
            num2 = res.toFloat()
            tv1.text = ""
            if (eq=="+"){
                var add:Addition = Addition()
                tv1.text = add.add(num1,num2).toString()

            }
           else if(eq=="*"){
             var mul : Multiplicatioin= Multiplicatioin()
                tv1.text=mul.mul(num1,num2).toString()
            }
            else if (eq=="/"){
                var div:Divide=Divide()
                tv1.text=div.div(num1,num2).toString()
            }else if (eq=="-"){
                var sub:Subtraction=Subtraction()
                tv1.text=sub.sub(num1,num2).toString()
            }else if (eq=="%")
            {
                var mod: Modelse =Modelse()
                tv1.text=mod.mod(num1,num2).toString()
            }



        }



    }
}