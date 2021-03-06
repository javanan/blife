package com.blife.controller;

import com.blife.model.ReturnDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/5/8.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 登出的控制器
 */
@RequestMapping(value = "/logout")
@RestController
public class LogoutController {

    /**
     * web 端登出
     *
     * @return
     */
    @RequestMapping(value = "/v1/web", method = RequestMethod.POST)
    public ReturnDTO webLogout() {
        ReturnDTO returnDto = new ReturnDTO();
        return returnDto;
    }

    /**
     * 移动端登出
     * @return
     */
    @RequestMapping(value = "/v1/phone", method = RequestMethod.POST)
    public ReturnDTO phoneLogout() {
        ReturnDTO returnDto = new ReturnDTO();
        return returnDto;
    }

}
