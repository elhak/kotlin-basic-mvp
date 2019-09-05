package com.kliknclean.android.base

interface IBaseView {

    /**
     * Show Loading Dialog
     */
    fun showLoadingDialog()

    /**
     * Hide Loading Dialog
     */
    fun hideLoadingDialog()

    /**
     *
     */
    fun showNetworkError()

    /**
     *
     */
    fun checkThrowableError(it: Throwable)
}