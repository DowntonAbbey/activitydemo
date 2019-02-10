package com.hsk.activitydemo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: hsk
 * @Date: 2019/1/2 22:08
 * @Description:
 */

@RestController
@RequestMapping("/activityService")
public interface ActivityConsumerService {
    /**
     * 流程demo
     *
     * @return
     */
    @RequestMapping(value = "/startActivityDemo", method = RequestMethod.GET)
    public boolean startActivityDemo();

}
