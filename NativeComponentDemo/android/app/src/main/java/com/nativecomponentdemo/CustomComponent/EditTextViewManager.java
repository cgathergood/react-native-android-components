package com.nativecomponentdemo.CustomComponent;

import android.widget.EditText;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import javax.annotation.Nullable;

public class EditTextViewManager extends SimpleViewManager<EditText> {

    private static final String REACT_CLASS = "EditText";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected EditText createViewInstance(ThemedReactContext reactContext) {
        return new EditText(reactContext);
    }

    @ReactProp(name = "hint")
    public void setTextHint(EditText editText, @Nullable String hint) {
        editText.setHint(hint);
    }

    @ReactProp(name = "singleLine", defaultBoolean = true)
    public void setSingleLine(EditText editText, Boolean isSingleLine) {
        editText.setSingleLine(isSingleLine);
    }
}