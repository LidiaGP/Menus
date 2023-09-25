package com.example.ejerciciosmenus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.EditText;


public class MiEditText extends androidx.appcompat.widget.AppCompatEditText {
    public MiEditText(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public MiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public MiEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }


    @Override
    protected ContextMenuInfo getContextMenuInfo() {
        return new  AdapterContextMenuInfo(this,0,this.getId());
    }
}
