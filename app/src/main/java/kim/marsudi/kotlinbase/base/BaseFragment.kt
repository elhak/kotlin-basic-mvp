package kim.marsudi.kotlinbase.base

import android.support.v4.app.Fragment
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EFragment


@EFragment
abstract class BaseFragment : Fragment() {

    //region lifecyle
    @AfterViews
    fun afterViewsBase() {
        //On Create
        afterView()
    }

    protected abstract fun afterView()

    fun showLoadingDialog() {
        if (activity is BaseActivity && isAdded) {
            (activity as BaseActivity).showLoadingDialog()
        }
    }

    fun hideLoadingDialog() {
        if (activity is BaseActivity && isAdded) {
            (activity as BaseActivity).hideLoadingDialog()
        }
    }

    fun showNetworkError() {
        if (activity is BaseActivity && isAdded) {
            (activity as BaseActivity).showNetworkError()
        }
    }
}