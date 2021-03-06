package com.github.thibaultbee.srtwrapper.interfaces

import com.github.thibaultbee.srtwrapper.models.Socket
import java.net.InetSocketAddress

interface SocketInterface {
    /**
     * Equivalent of srt_listen_callback_fn
     */
    fun onListen(ns: Socket, hsVersion: Int, peerAddress: InetSocketAddress, streamId: String): Int
}