package com.hang.oj.model.enums;

import com.sun.jna.Memory;
import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;
import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 判题信息消息枚举
 *
 */
public enum JudgeInfoMessageEnum {

    Accepted("Accepted", "成功"),
    Wrong_Answer("Wrong Answer", "答案错误"),
    Compile_Error("Compile Error", "编译错误"),
    Memory_Limit_Exceeded("Memory Limit Exceeded", "内存溢出"),
    Time_Limit_Exceeded("Time Limit Exceeded", "超时"),
    Presentation_Error("Presentation Error", "展示错误"),
    Output_Limit_Exceeded("Output Limit Exceeded", "输出溢出"),
    Waiting("Waiting", "等待中"),
    Dangerous_Operation("Dangerous Operation", "危险操作"),
    Runtime_Error("Runtime Error", "运行错误"),
    System_Error("System Error", "系统错误");


    private final String text;

    private final String value;

    JudgeInfoMessageEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<String> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static JudgeInfoMessageEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (JudgeInfoMessageEnum anEnum : JudgeInfoMessageEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
