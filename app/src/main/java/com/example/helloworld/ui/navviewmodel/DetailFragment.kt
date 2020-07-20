package com.example.helloworld.ui.navviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.helloworld.R
import com.example.helloworld.databinding.FragmentDetail3Binding
import com.example.helloworld.ui.navviewmodel.viewmodel.NavViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {

    companion object {
        fun newInstance() = DetailFragment()
    }

    private lateinit var mBinding: FragmentDetail3Binding
    private val mViewModel: NavViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail3, container,false)
        mBinding.data = mViewModel
        mBinding.lifecycleOwner = activity
        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mBinding.backBtn.setOnClickListener{ view ->
            val controller = Navigation.findNavController(view)
            controller.navigate(R.id.action_detailFragment3_to_homeFragment3)
        }
    }
}