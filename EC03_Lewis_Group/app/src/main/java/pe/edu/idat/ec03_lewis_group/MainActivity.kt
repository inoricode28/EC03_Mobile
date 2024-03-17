package pe.edu.idat.ec03_lewis_group

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.idat.ec03_lewis_group.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}