package com.example.viewpager2_tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.net.toUri
import com.google.android.material.tabs.TabLayoutMediator


class Fragment_1 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_1, container, false) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val webview = view.findViewById<WebView>(R.id.webview)
        webview?.webViewClient = WebViewClient()
        val web = arguments?.getSerializable("key") as Page
         webview.loadUrl(web.uri)
    }


}