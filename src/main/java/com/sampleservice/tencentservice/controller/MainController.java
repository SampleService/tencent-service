package com.sampleservice.tencentservice.controller;

import com.septemberhx.common.base.MResponse;
import com.septemberhx.mclient.annotation.MApiFunction;
import com.septemberhx.mclient.annotation.MRestApiType;
import com.septemberhx.mclient.base.MObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/11/25
 */
@RestController
public class MainController extends MObject {
    @ResponseBody
    @RequestMapping(value = "/game", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse gameFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/game");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/chat", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse chatFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/chat");
        return result;
    }
}
