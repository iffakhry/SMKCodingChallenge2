package id.smkcoding.smkcodingchallenge2.util

import android.content.Context
import android.widget.Toast

/**
 * Created by Fakhry on 5/7/20.
 */

fun tampilToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

