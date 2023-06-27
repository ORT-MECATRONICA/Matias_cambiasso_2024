package com.example.booksapp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class DescriptionBookFragment : Fragment() {

    companion object {
        fun newInstance() = DescriptionBookFragment()
    }

    private lateinit var viewModel: DescriptionBookViewModel
    private lateinit var v : View
    private lateinit var bookTitle: TextView
    private lateinit var bookDescription: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_description_book, container, false)
        bookDescription = v.findViewById(R.id.description)
        bookTitle = v.findViewById(R.id.titleBook)
        return v;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DescriptionBookViewModel::class.java)
        // TODO: Use the ViewModel
    }

}