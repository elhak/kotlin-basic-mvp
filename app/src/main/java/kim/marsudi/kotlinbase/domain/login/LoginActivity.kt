package kim.marsudi.kotlinbase.domain.login

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.annotation.TargetApi
import android.content.pm.PackageManager
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.app.LoaderManager.LoaderCallbacks
import android.content.CursorLoader
import android.content.Loader
import android.database.Cursor
import android.net.Uri
import android.os.AsyncTask
import android.os.Build
import android.os.Bundle
import android.provider.ContactsContract
import android.text.TextUtils
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.ArrayAdapter
import android.widget.TextView

import java.util.ArrayList
import android.Manifest.permission.READ_CONTACTS
import kim.marsudi.kotlinbase.R
import kim.marsudi.kotlinbase.base.BaseActivity

import kotlinx.android.synthetic.main.activity_login.*
import org.androidannotations.annotations.EActivity

/**
 * A login screen that offers login via email/password.
 */
@EActivity(R.layout.activity_login)
class LoginActivity : BaseActivity(), LoginContract.View {
    override fun afterView() {

    }

}
