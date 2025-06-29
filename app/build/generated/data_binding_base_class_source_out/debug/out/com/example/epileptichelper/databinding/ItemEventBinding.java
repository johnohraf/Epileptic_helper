// Generated by view binder compiler. Do not edit!
package com.example.epileptichelper.databinding;

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
import com.example.epileptichelper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemEventBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView dateTimeTextView;

  @NonNull
  public final TextView durationTextView;

  @NonNull
  public final ImageView eventIcon;

  private ItemEventBinding(@NonNull LinearLayout rootView, @NonNull TextView dateTimeTextView,
      @NonNull TextView durationTextView, @NonNull ImageView eventIcon) {
    this.rootView = rootView;
    this.dateTimeTextView = dateTimeTextView;
    this.durationTextView = durationTextView;
    this.eventIcon = eventIcon;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_event, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEventBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dateTimeTextView;
      TextView dateTimeTextView = ViewBindings.findChildViewById(rootView, id);
      if (dateTimeTextView == null) {
        break missingId;
      }

      id = R.id.durationTextView;
      TextView durationTextView = ViewBindings.findChildViewById(rootView, id);
      if (durationTextView == null) {
        break missingId;
      }

      id = R.id.eventIcon;
      ImageView eventIcon = ViewBindings.findChildViewById(rootView, id);
      if (eventIcon == null) {
        break missingId;
      }

      return new ItemEventBinding((LinearLayout) rootView, dateTimeTextView, durationTextView,
          eventIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
