package org.test.spring.postarray.form;

import org.test.spring.postarray.model.TestModel;

public class FormDto {

    private TestModel testModel;

    private String newValue;

    public TestModel getTestModel() {
        return testModel;
    }

    public void setTestModel(TestModel testModel) {
        this.testModel = testModel;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

}
