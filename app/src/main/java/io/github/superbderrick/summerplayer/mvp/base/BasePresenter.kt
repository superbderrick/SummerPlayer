package io.github.superbderrick.summerplayer.mvp.base


abstract class BasePresenter<out V : BaseView>(protected val view: V) {
    
}