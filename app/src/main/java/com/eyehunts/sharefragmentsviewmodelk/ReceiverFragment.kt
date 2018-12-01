package com.eyehunts.sharefragmentsviewmodelk


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ReceiverFragment : Fragment() {

    internal lateinit var tv_msg: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_receiver, container, false)

        val model = ViewModelProviders.of(activity!!).get(SharedViewModel::class.java)
        tv_msg = view.findViewById<View>(R.id.tv_receiver) as TextView

        model.message.observe(this, object : Observer<Any> {
            override fun onChanged(o: Any?) {
                tv_msg.text = o!!.toString()
            }
        })
        return view
    }
}// Required empty public constructor
