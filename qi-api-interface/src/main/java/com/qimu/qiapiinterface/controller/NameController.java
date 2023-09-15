package com.qimu.qiapiinterface.controller;

import com.qimuu.easyweb.common.BaseResponse;
import com.qimuu.easyweb.common.ResultUtils;
import icu.qimuu.qiapisdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: QiMu
 * @Date: 2023年08月16日 11:29
 * @Version: 1.0
 * @Description:
 */
@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping
    public BaseResponse<String> getNameByGet(String name) {
        return ResultUtils.success(name);
    }

    @PostMapping
    public BaseResponse<String> getNameByPost(String name) {
        return ResultUtils.success(name);
    }

    @PostMapping(value = "/json")
    public BaseResponse<User> getNameByJsonPost(@RequestBody User user, HttpServletRequest request) {
        // String body = request.getHeader("body");
        // String accessKey = request.getHeader("accessKey");
        // String timestamp = request.getHeader("timestamp");
        // String sign = request.getHeader("sign");
        //
        // // 防重发XHR
        // final long FIVE_MINUTES = (System.currentTimeMillis()) / 1000;
        // if (Long.parseLong(timestamp) - FIVE_MINUTES <= 0) {
        //     throw new BusinessException(ErrorCode.NOT_LOGIN_ERROR, "会话已过期,请重试！");
        // }
        //
        // if (!accessKey.equals("7052a8594339a519e0ba5eb04a267a60")) {
        //     throw new BusinessException(ErrorCode.NO_AUTH_ERROR);
        // }
        //
        // if (!getSign(body, "d8d6df60ab209385a09ac796f1dfe3e1").equals(sign)) {
        //     throw new BusinessException(ErrorCode.NO_AUTH_ERROR);
        // }
        return ResultUtils.success(user);
    }
}