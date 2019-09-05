package com.kliknclean.android.base

abstract class BasePresenter<BaseViewT : IBaseView, BaseInteractorT : IBaseInteractor>(
    val view: BaseViewT,
    val interactor: BaseInteractorT
) {
    abstract fun onCreate()
}
