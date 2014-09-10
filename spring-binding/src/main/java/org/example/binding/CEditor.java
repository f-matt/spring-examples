package org.example.binding;

import java.beans.PropertyEditorSupport;

import org.example.model.C;

public class CEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) {
		
		C c = new C();
		c.setId(Integer.parseInt(text));
		c.setDescription("ccc");
    	
        setValue(c);
    }

}
