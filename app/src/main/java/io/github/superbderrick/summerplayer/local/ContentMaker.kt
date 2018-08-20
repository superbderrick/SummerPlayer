package io.github.superbderrick.summerplayer.local

import android.content.Context
import android.content.res.AssetManager
import android.os.AsyncTask
import android.util.EventLog
import java.net.URL

class ContentMaker(private var context:Context) {

    private var mContext : Context
    private var mContentTask : ContentAsyncTask
    private var mAssetManager : AssetManager

    init {
        mContext = context
        mContentTask = ContentAsyncTask()
        mAssetManager = mContext.assets

        startParsing()
    }

    private fun startParsing() {

    }

    private inner class ContentAsyncTask:AsyncTask<URL, Void , EventLog.Event>() {
        override fun onProgressUpdate(vararg values: Void?) {
            super.onProgressUpdate(*values)
        }

        override fun onPostExecute(result: EventLog.Event?) {
            super.onPostExecute(result)
        }

        override fun doInBackground(vararg p0: URL?): EventLog.Event {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onCancelled(result: EventLog.Event?) {
            super.onCancelled(result)
        }

        override fun onCancelled() {
            super.onCancelled()
        }

        override fun onPreExecute() {
            super.onPreExecute()
        }

    }

}

