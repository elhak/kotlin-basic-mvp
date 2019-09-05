package kim.marsudi.kotlinbase.base

import android.content.DialogInterface
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.kaopiz.kprogresshud.KProgressHUD
import kim.marsudi.kotlinbase.R
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity
import org.androidannotations.annotations.UiThread

@EActivity
abstract class BaseActivity : AppCompatActivity(){

    private var mKProgressHUD: KProgressHUD? = null

    protected abstract fun afterView()

    @AfterViews
    fun afterViewBase(){
        afterView()
    }

    protected fun hasToolbar(){
        val toolbar = findViewById<Toolbar>(R.id.toolbar);

        setSupportActionBar(toolbar)

        supportActionBar?.title = null
        supportActionBar?.setDisplayShowCustomEnabled(false)
        supportActionBar?.setDisplayUseLogoEnabled(false)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    protected fun hasBackButton(){
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val icon = ContextCompat.getDrawable(this, R.drawable.ic_back)
        supportActionBar?.setHomeAsUpIndicator(icon)
    }

    protected fun setPageTitle(title: String?){
        supportActionBar?.title = title
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if(item?.itemId == android.R.id.home)
            finish()

        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    @UiThread
    fun showLoadingDialog(){
        hideLoadingDialog()
        mKProgressHUD = KProgressHUD.create(this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel("Please wait...")
                .setCancellable(false)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show()
    }

    @UiThread
    fun hideLoadingDialog(){
        mKProgressHUD?.dismiss()
        mKProgressHUD = null
    }

    @UiThread
    fun showNetworkError(){
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle(R.string.error_server_title)
        alertDialogBuilder.setMessage(R.string.error_server_message)
        alertDialogBuilder.setPositiveButton(R.string.error_server_retry, DialogInterface.OnClickListener { dialogInterface, i -> dialogInterface.dismiss() })
        alertDialogBuilder.create().show()
    }
}