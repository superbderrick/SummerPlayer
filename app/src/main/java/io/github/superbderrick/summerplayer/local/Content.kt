package io.github.superbderrick.summerplayer.local

class Content(contentTitle: String , streamingType : Int , fileType : Int , withDRM : Boolean) {

    var title:String
    var streamingType:Int
    var fileType:Int
    var withDRM:Boolean

    init {
        title = contentTitle
        this.streamingType = streamingType
        this.fileType = fileType
        this.withDRM = withDRM
    }

}
