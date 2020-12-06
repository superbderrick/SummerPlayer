package superbderrick.github.io.summerplayerview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.exoplayer2.*
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,Player.EventListener  {

    lateinit var simpleExoPlayer : SimpleExoPlayer

    private var BASIC_URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        setupExoPlayer()
    }

    public override fun onPause() {
        super.onPause()
        releasePlayer()
    }

    public override fun onStop() {
        super.onStop()
        releasePlayer()
    }

    private fun setupExoPlayer() {

        simpleExoPlayer = ExoPlayerFactory.newSimpleInstance(this, DefaultRenderersFactory(this),
            DefaultTrackSelector(), DefaultLoadControl()
        )

        playerView.setPlayer(simpleExoPlayer)

        simpleExoPlayer.setPlayWhenReady(true)
        simpleExoPlayer.seekTo(0, 0)

        val uri = Uri.parse(BASIC_URL)
        val mediaSource = buildMediaSource(uri)
        simpleExoPlayer.prepare(mediaSource, true, false)

    }

    private fun buildMediaSource(uri: Uri): MediaSource {
        return ExtractorMediaSource.Factory(
            DefaultHttpDataSourceFactory("exoplayer-codelab")
        ).createMediaSource(uri)
    }

    private fun releasePlayer() {
        if (playerView != null) {
            var playbackPosition = simpleExoPlayer.getCurrentPosition()
            var currentWindow = simpleExoPlayer.getCurrentWindowIndex()
            var playWhenReady = simpleExoPlayer.getPlayWhenReady()

            simpleExoPlayer.release()
        }
    }

    override fun onPlayerError(error: ExoPlaybackException) {
        // handle error
    }

    override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
        if (playbackState == Player.STATE_BUFFERING)
            Log.d("MainActivity","Buffering is working")

        else if (playbackState == Player.STATE_READY || playbackState == Player.STATE_ENDED)
            Log.d("MainActivity","Player is read or ended")
    }
}