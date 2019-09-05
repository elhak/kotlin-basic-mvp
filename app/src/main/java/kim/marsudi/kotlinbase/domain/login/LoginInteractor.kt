package kim.marsudi.kotlinbase.domain.login

import android.content.Context
import com.kliknclean.android.base.BaseInteractor
import kim.marsudi.kotlinbase.rest.ApiService

/* 
    Created by Hakim on 2019-09-05
    Email hakimmarsudi@outlook.com
*/

class LoginInteractor(val context: Context) : BaseInteractor(), LoginContract.Interactor{
    override fun processLogin() {
        val apiService = ApiService.create(context)
    }

}