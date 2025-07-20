package adapter

class MediaAdapter(val audioType: String): MediaPlayer {
    // Has-a and is-a
    private var advancedPlayer: AdvancedMediaPlayer? = null

    init {
        if (audioType.equals("mp4", true))
            advancedPlayer = Mp4Player()
        else
            advancedPlayer = VlcPlayer()
    }

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("mp4", true))
            advancedPlayer?.playMp4("file")
        else
            advancedPlayer?.playVlc("file")
    }
}