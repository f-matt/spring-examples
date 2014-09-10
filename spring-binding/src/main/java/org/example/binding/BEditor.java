package org.example.binding;

import java.beans.PropertyEditorSupport;

import org.example.model.B;

public class BEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) {
		
		B b = new B();
		b.setId(Integer.parseInt(text));
		b.setDescription("bbb");
    	
        setValue(b);
    }

}
