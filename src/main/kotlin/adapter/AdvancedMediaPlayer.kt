package adapter

interface AdvancedMediaPlayer {
    fun playVlc(file: String)
    fun playMp4(file: String)
}

class VlcPlayer(): AdvancedMediaPlayer{
    override fun playVlc(file: String) {
        println("play vlc")
    }

    override fun playMp4(file: String) {
        TODO("Not yet implemented")
    }
}

class Mp4Player(): AdvancedMediaPlayer{
    override fun playVlc(file: String) {
    }

    override fun playMp4(file: String) {
        println("Mp4 play")
    }
}