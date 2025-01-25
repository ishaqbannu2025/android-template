
package com.yourcompany.webviewapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

public class MainActivity extends AppCompatActivity {
// AdMob Ad IDs (Replace with your actual IDs)
private static final String ADMOB_APP_ID = "ca-app-pub-XXXXXXXXXXXXXXXX~YYYYYYYYYY";
private static final String ADMOB_APP_OPEN_AD_ID = "ca-app-pub-XXXXXXXXXXXXXXXX/YYYYYYYYYY";
private static final String ADMOB_BANNER_AD_ID = "ca-app-pub-XXXXXXXXXXXXXXXX/YYYYYYYYYY";
private static final String ADMOB_INTERSTITIAL_AD_ID = "ca-app-pub-XXXXXXXXXXXXXXXX/YYYYYYYYYY";
private static final String ADMOB_REWARDED_AD_ID = "ca-app-pub-XXXXXXXXXXXXXXXX/YYYYYYYYYY";

// Unity Ads IDs (Replace with your actual IDs)
private static final String UNITY_GAME_ID = "XXXXXXX";
private static final String UNITY_BANNER_AD_ID = "Banner_Android";
private static final String UNITY_INTERSTITIAL_AD_ID = "Interstitial_Android";
private static final String UNITY_REWARDED_AD_ID = "Rewarded_Android";

private WebView webView;
private AdView bannerAdView;
private InterstitialAd admobInterstitial;
private AppOpenAd appOpenAd;
private RewardedAd rewardedAd;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

// Initialize AdMob and Unity
MobileAds.initialize(this);
UnityAds.initialize(this, UNITY_GAME_ID, false);

// Setup WebView
setupWebView();

// Load Ads
loadAdMobBanner();
loadAdMobInterstitial();
loadAdMobAppOpenAd();
loadAdMobRewardedAd();
loadUnityBanner();
loadUnityInterstitial();
loadUnityRewardedAd();
}

private void setupWebView() {
webView = findViewById(R.id.webView);
WebSettings webSettings = webView.getSettings();
webSettings.setJavaScriptEnabled(true);
webSettings.setDomStorageEnabled(true);

webView.loadUrl("https://example.com");
webView.setWebViewClient(new WebViewClient());
}

private void loadAdMobBanner() {
// Banner Ad implementation
}

private void loadAdMobInterstitial() {
// Interstitial Ad implementation
}

private void loadAdMobAppOpenAd() {
// App Open Ad implementation
}

private void loadAdMobRewardedAd() {
// Rewarded Ad implementation
}

private void loadUnityBanner() {
// Unity Banner Ad implementation
}

private void loadUnityInterstitial() {
// Unity Interstitial Ad implementation
}

private void loadUnityRewardedAd() {
// Unity Rewarded Ad implementation
}

@Override
public void onBackPressed() {
if (webView.canGoBack()) {
webView.goBack();
} else {
super.onBackPressed();
}
}
}
