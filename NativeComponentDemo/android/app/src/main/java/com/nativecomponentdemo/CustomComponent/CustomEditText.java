package com.nativecomponentdemo.CustomComponent;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.LinearLayout;

import com.nativecomponentdemo.R;

public class CustomEditText extends LinearLayout {


    private TextInputLayout textInputLayout;
    private TextInputEditText textInputEditText;

    public CustomEditText(Context context) {
        super(context);

        View view = inflate(context, R.layout.custom_edit_text_layout, this);
        textInputEditText = (TextInputEditText) view.findViewById(R.id.editText);
        textInputLayout = (TextInputLayout) view.findViewById(R.id.textInputLayout);
    }

    public void setHint(String hint) {
        textInputLayout.setHint(hint);
    }

    public void setFontSize(float fontSize) {
        textInputEditText.setTextSize(fontSize);
    }
}
