package com.example.android.tflitecamerademo4;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

/** Main {@code Activity} class for the Camera app. */
public class CameraActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);
    if (null == savedInstanceState) {
      getFragmentManager()
          .beginTransaction()
          .replace(R.id.container, Camera2BasicFragment.newInstance())
          .commit();
    }

    if (!OpenCVLoader.initDebug())
      Log.e("OpenCv", "Unable to load OpenCV");
    else
      Log.d("OpenCv", "OpenCV loaded");

  }
}
