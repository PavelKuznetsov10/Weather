package com.example.weather

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.fragment_input.*
import kotlinx.android.synthetic.main.fragment_input.view.*

class InputFragment : Fragment() {
    fun onViewCreated(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val inputView: View = inflater.inflate(R.layout.fragment_input, container, false)
//        input_city.text
//        input_latitude.text
//        input_longitude.text
//        btn_add.OnClickListener {}

        return inputView
    }

    companion object {
        fun newInstance() = InputFragment()
    }
}