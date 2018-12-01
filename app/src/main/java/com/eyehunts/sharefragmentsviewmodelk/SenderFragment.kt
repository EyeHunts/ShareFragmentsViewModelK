package com.eyehunts.sharefragmentsviewmodelk


import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class SenderFragment : Fragment() {
    private var model: SharedViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sender, container, false)
        model = ViewModelProviders.of(activity!!).get(SharedViewModel::class.java)

        val button = view.findViewById<View>(R.id.btn_sender) as Button
        // on click button
        button.setOnClickListener { model!!.setMessage("Hello Fragment i am Sender - ViewModel") }
        return view
    }
}// Required empty public constructor
