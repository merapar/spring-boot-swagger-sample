package com.merapar.controller;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Sample")
public class Sample {

    @XmlAttribute(name = "value", required = true)
    private String value;

    @XmlAttribute(name = "code")
    private ValueEnum valueEnum;

    @XmlEnum
    public enum ValueEnum {
        @XmlEnumValue("1")
        ENUM1(1),
        @XmlEnumValue("2")
        ENUM2(2);

        private int value;

        ValueEnum(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public Sample(){

    }

    public Sample(String value, ValueEnum valueEnum) {
        this.value = value;
        this.valueEnum = valueEnum;
    }

    public String getValue() {
        return value;
    }

    public ValueEnum getValueEnum() {
        return valueEnum;
    }
}
