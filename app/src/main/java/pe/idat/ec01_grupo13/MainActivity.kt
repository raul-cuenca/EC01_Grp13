package pe.idat.ec01_grupo13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.idat.ec01_grupo13.databinding.ActivityMainBinding

//.Ingrese 2 número y si son iguales que los multiplique, si el primero es
//mayor que el segundo que los reste y si no que los sume

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnComparar.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        compararNumeros()
    }

    private fun compararNumeros() {

        var num1 = binding.etNumero1.text.toString().toDouble()
        var num2 = binding.etNumero2.text.toString().toDouble()

        var resultado : Double

        if(num1 == num2){
            resultado = num1 * num2
        }else if(num1 > num2){
            resultado = num1 - num2
        }else{
            resultado = num1 + num2
        }

        binding.tvResultado.text = "Resultado: $resultado"



    }


}