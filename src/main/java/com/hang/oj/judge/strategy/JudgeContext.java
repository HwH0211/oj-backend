package com.hang.oj.judge.strategy;

import com.hang.oj.model.entity.dto.question.JudgeCase;
import com.hang.oj.judge.codesandbox.model.JudgeInfo;
import com.hang.oj.model.entity.Question;
import com.hang.oj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
