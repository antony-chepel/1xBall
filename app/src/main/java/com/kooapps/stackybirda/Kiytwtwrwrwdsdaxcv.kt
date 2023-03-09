package com.kooapps.stackybirda
import android.view.View
import androidx.navigation.fragment.findNavController
import org.koin.android.ext.android.inject
import android.content.Context
import android.os.Bundle
import com.kooapps.stackybirda.Opwoiuxycx.rpllpelpplspl
import com.kooapps.stackybirda.jsiiauhw.Fwopqoqosd
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import android.view.LayoutInflater
import org.koin.core.qualifier.named
import android.view.ViewGroup
import android.content.SharedPreferences



class Kiytwtwrwrwdsdaxcv : Fragment() {
    lateinit var dplslple: String
    val fokkodg: SharedPreferences by inject(named("SharedPreferences"))
    val osidji by activityViewModel<Fwopqoqosd>(named("MainModel"))
    private lateinit var bovnko: Context




    override fun onAttach(context: Context) {
        super.onAttach(context)
        bovnko = context
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val oxzkcko = fokkodg.getString(rpllpelpplspl, null)
        val saidjwjiijdjiijajixi = fokkodg.getString("appCamp", null)

        if (oxzkcko=="1" &&saidjwjiijdjiijajixi == null) {
            osidji.rplpelplplppplkosd(bovnko)
            osidji.gcv.observe(viewLifecycleOwner) {
                if (it != null) {
                    dplslple = it.toString()
                    fokkodg.edit().putString("appCamp", dplslple).apply()
                    findNavController().navigate(R.id.bcixiixudf)
                }
            }
        } else {
            findNavController().navigate(R.id.bcixiixudf)
        }
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.qpqpwodduc, container, false)
    }










}