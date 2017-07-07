package com.merapar.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "Sample")
public class Sample {

    @Getter
    @XmlAttribute(name = "value", required = true)
    private String value;

    @Getter
    @XmlAttribute(name = "code")
    private CodeEnum code;

    @XmlEnum
    public enum CodeEnum {
        @XmlEnumValue("1")
        ENUM1(1),
        @XmlEnumValue("2")
        ENUM2(2);

        private int value;

        CodeEnum(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
