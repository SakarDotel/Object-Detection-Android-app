package com.sudarshan.objectdetection;

import android.app.Activity;
import android.os.Bundle;

public class CameraActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(com.sudarshan.objectdetection.R.layout.activity_camera);
    if (null == savedInstanceState) {
      getFragmentManager()
          .beginTransaction()
          .replace(com.sudarshan.objectdetection.R.id.container, Camera2BasicFragment.newInstance())
          .commit();
    }
  }
}