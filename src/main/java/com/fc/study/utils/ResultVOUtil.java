package com.fc.study.utils;

import com.fc.study.vo.ResultVO;

public class ResultVOUtil {

    public static ResultVO successResult(Object o) {
        ResultVO resultVO = new ResultVO();
        //……
        resultVO.setId(1);
        resultVO.setName("tom");
        return resultVO;
    }
}
