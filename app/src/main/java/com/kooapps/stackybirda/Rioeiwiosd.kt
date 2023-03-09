package com.kooapps.stackybirda
import android.view.LayoutInflater
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.android.ext.android.inject
import android.content.SharedPreferences
import androidx.navigation.fragment.findNavController
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import org.koin.core.qualifier.named
import android.content.Context
import android.view.View
import com.kooapps.stackybirda.Opwoiuxycx.nnvcnjnvchuuhcxjijid
import com.kooapps.stackybirda.jsiiauhw.Fwopqoqosd


class Rioeiwiosd : Fragment() {
    lateinit var ixuzgyy: String
    private lateinit var splwplplsokdok: Context
    val vcio by activityViewModel<Fwopqoqosd>(named("MainModel"))
    val fplfpplplcl: SharedPreferences by inject(named("SharedPreferences"))













    override fun onAttach(context: Context) {
        super.onAttach(context)
        splwplplsokdok = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pltog, container, false)
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vcio.rokkekow.observe(viewLifecycleOwner) {
            if (it!=null) {
                ixuzgyy = it.ncvuhbhufd
                fplfpplplcl.edit().putString(nnvcnjnvchuuhcxjijid, ixuzgyy).apply()
                findNavController().navigate(R.id.aposoicuuxvg)
            }
        }
    }



}