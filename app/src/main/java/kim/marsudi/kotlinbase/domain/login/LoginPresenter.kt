package kim.marsudi.kotlinbase.domain.login

import com.kliknclean.android.base.BasePresenter

/* 
    Created by Hakim on 2019-09-05
    Email hakimmarsudi@outlook.com
*/

class LoginPresenter(view: LoginContract.View, interactor: LoginContract.Interactor) : BasePresenter<LoginContract.View, LoginContract.Interactor>(view, interactor), LoginContract.Presenter {
    override fun onCreate() {

    }

    override fun submit() {
        view.loginSuccess()
    }
}