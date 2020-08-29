package com.example.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_input.*

class InputFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn.setOnClickListener {
            openNextScreen()
        }
    }

    private fun openNextScreen() {
        val city = input_city.text.toString()
        val latitude = input_latitude.text.toString()
        val longitude = input_longitude.text.toString()
        val bundle = Bundle()
        bundle.putString("city", city)
        bundle.putString("latitude", latitude)
        bundle.putString("longitude", longitude)
        val outputFragment = OutputFragment()
        outputFragment.setArguments(bundle)
        fragmentManager?.beginTransaction()
            ?.replace(R.id.container, outputFragment)
            ?.commit()
    }
}