package kim.marsudi.kotlinbase.domain.init

import kim.marsudi.kotlinbase.R
import kim.marsudi.kotlinbase.base.BaseActivity
import kim.marsudi.kotlinbase.domain.login.LoginActivity_
import org.androidannotations.annotations.EActivity
import org.androidannotations.annotations.UiThread

@EActivity(R.layout.activity_main)
class MainActivity : BaseActivity() {
    override fun afterView() {
        startMain()
    }

    @UiThread(delay = 1000)
    fun startMain(){
        LoginActivity_.intent(this).start()
    }
}
