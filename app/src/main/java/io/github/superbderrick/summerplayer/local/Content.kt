package io.github.superbderrick.summerplayer.local

data class Content(
        val title: String = "",
        val streamingType: String = "",
        val fileType: String,
        val withDRM: String = ""
        ) {

    class Builder {
        private var title: String = ""
        private var streamingType: String = ""
        private var fileType: String = ""
        private var withDRM: String = ""

        fun addressLine1(addressLine1: String) = apply { this.title = addressLine1 }
        fun streamingType(streamingType: String) = apply { this.streamingType = streamingType }
        fun city(city: String) = apply { this.fileType = city }
        fun withDRM(withDRM: String) = apply { this.withDRM = withDRM }


        fun build() = Content(
                title,
                streamingType,
                fileType,
                withDRM
        )
    }
}
