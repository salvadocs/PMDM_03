package com.example.pmdm_03

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_fragment1, container, false)

        val boton = v.findViewById<Button>(R.id.button)
        val boton2 = v.findViewById<Button>(R.id.button2)
        val boton3 = v.findViewById<Button>(R.id.button3)

        boton.setOnClickListener {

            Toast.makeText(activity, "Bienvenida", Toast.LENGTH_LONG).show()

            val fragmento = fragment2()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        boton2.setOnClickListener {
            Toast.makeText(activity, "Calendario", Toast.LENGTH_LONG).show()

            val fragmento = fragment3()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        boton3.setOnClickListener {

            Toast.makeText(activity, "GitHub", Toast.LENGTH_LONG).show()

            val fragmento = fragment4()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)
            transaction.addToBackStack(null)
            transaction.commit()
        }


        return  v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}