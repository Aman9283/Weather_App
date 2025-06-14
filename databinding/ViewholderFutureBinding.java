// Generated by view binder compiler. Do not edit!
package com.example.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.weatherapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewholderFutureBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView day;

  @NonNull
  public final TextView highTemp;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView lowTemp;

  @NonNull
  public final TextView status;

  private ViewholderFutureBinding(@NonNull LinearLayout rootView, @NonNull TextView day,
      @NonNull TextView highTemp, @NonNull ImageView image, @NonNull TextView lowTemp,
      @NonNull TextView status) {
    this.rootView = rootView;
    this.day = day;
    this.highTemp = highTemp;
    this.image = image;
    this.lowTemp = lowTemp;
    this.status = status;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewholderFutureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewholderFutureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.viewholder_future, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewholderFutureBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.day;
      TextView day = ViewBindings.findChildViewById(rootView, id);
      if (day == null) {
        break missingId;
      }

      id = R.id.highTemp;
      TextView highTemp = ViewBindings.findChildViewById(rootView, id);
      if (highTemp == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.lowTemp;
      TextView lowTemp = ViewBindings.findChildViewById(rootView, id);
      if (lowTemp == null) {
        break missingId;
      }

      id = R.id.status;
      TextView status = ViewBindings.findChildViewById(rootView, id);
      if (status == null) {
        break missingId;
      }

      return new ViewholderFutureBinding((LinearLayout) rootView, day, highTemp, image, lowTemp,
          status);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
