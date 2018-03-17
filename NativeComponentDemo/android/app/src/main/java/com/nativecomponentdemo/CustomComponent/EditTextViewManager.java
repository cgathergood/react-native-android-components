package com.nativecomponentdemo.CustomComponent;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import javax.annotation.Nullable;

public class EditTextViewManager extends SimpleViewManager<CustomEditText> {

    private static final String REACT_CLASS = "EditText";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected CustomEditText createViewInstance(ThemedReactContext reactContext) {
        return new CustomEditText(reactContext);
    }

    @ReactProp(name = "hint")
    public void setTextHint(CustomEditText customEditText, @Nullable String hint) {
        customEditText.setHint(hint);
    }

    @ReactProp(name = "fontSize", defaultFloat = 14f)
    public void setFontSize(CustomEditText customEditText, float fontSize) {
        customEditText.setFontSize(fontSize);
    }
}