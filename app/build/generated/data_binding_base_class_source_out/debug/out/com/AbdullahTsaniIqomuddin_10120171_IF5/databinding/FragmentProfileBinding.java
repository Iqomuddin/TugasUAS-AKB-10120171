// Generated by view binder compiler. Do not edit!
package com.AbdullahTsaniIqomuddin_10120171_IF5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.AbdullahTsaniIqomuddin_10120171_IF5.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnSignOut;

  @NonNull
  public final CircleImageView foto;

  @NonNull
  public final TextView txtEmail;

  @NonNull
  public final TextView txtKelas;

  @NonNull
  public final TextView txtNama;

  @NonNull
  public final TextView txtNim;

  private FragmentProfileBinding(@NonNull RelativeLayout rootView, @NonNull Button btnSignOut,
      @NonNull CircleImageView foto, @NonNull TextView txtEmail, @NonNull TextView txtKelas,
      @NonNull TextView txtNama, @NonNull TextView txtNim) {
    this.rootView = rootView;
    this.btnSignOut = btnSignOut;
    this.foto = foto;
    this.txtEmail = txtEmail;
    this.txtKelas = txtKelas;
    this.txtNama = txtNama;
    this.txtNim = txtNim;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignOut;
      Button btnSignOut = ViewBindings.findChildViewById(rootView, id);
      if (btnSignOut == null) {
        break missingId;
      }

      id = R.id.foto;
      CircleImageView foto = ViewBindings.findChildViewById(rootView, id);
      if (foto == null) {
        break missingId;
      }

      id = R.id.txt_email;
      TextView txtEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txt_kelas;
      TextView txtKelas = ViewBindings.findChildViewById(rootView, id);
      if (txtKelas == null) {
        break missingId;
      }

      id = R.id.txt_nama;
      TextView txtNama = ViewBindings.findChildViewById(rootView, id);
      if (txtNama == null) {
        break missingId;
      }

      id = R.id.txt_nim;
      TextView txtNim = ViewBindings.findChildViewById(rootView, id);
      if (txtNim == null) {
        break missingId;
      }

      return new FragmentProfileBinding((RelativeLayout) rootView, btnSignOut, foto, txtEmail,
          txtKelas, txtNama, txtNim);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
