package kim.marsudi.kotlinbase.domain.login

import com.kliknclean.android.base.IBaseInteractor
import com.kliknclean.android.base.IBaseView

/* 
    Created by Hakim on 2019-09-05
    Email hakimmarsudi@outlook.com
*/

interface LoginContract {
    interface View : IBaseView{
        fun loginSuccess()
    }

    interface Presenter{
        fun submit()
    }

    interface Interactor : IBaseInteractor{
        fun processLogin()
    }
}