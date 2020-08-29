package com.example.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_output.*

class OutputFragment : Fragment() {

    private var city: String? = null
    private var latitude: String? = null
    private var longitude: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_output, container, false)
        arguments?.let {
            city = it.getString("city")
            latitude = it.getString("latitude")
            longitude = it.getString("longitude")
            tvCity.text = city
            tvLatitude.text = latitude
            tvLongitude.text = longitude
        }
        return view
    }
}