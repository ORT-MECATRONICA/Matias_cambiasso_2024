package com.example.booksapp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar

class CreateUserFragment : Fragment() {

    companion object {
        fun newInstance() = CreateUserFragment()
    }

    private lateinit var viewModel: CreateUserViewModel
    private lateinit var v : View
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var createButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_create_user, container, false)
        username = v.findViewById(R.id.createUsername)
        password = v.findViewById(R.id.createPassword)
        createButton = v.findViewById(R.id.createButton)
        return v;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreateUserViewModel::class.java)

        createButton.setOnClickListener {
            val myUser: String = username.text.toString()
            val myPassword: String = password.text.toString()

            if (myUser.isEmpty() || myPassword.isEmpty()) {
                Snackbar.make(v, "Please insert your Username and Password", Snackbar.LENGTH_SHORT)
                    .show()
            }
            else {
                //HAY QUE VER COMO HACER PARA SUMAR ESTO A LA LISTA DE USUARIOS
                Snackbar.make(v, "Insert username", Snackbar.LENGTH_SHORT).show()
                view?.findNavController()?.navigate(R.id.action_createUserFragment_to_bookListFragment)
            }
        }
    }


}