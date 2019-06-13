package com.huayu.JC_HY_DD.member_management.controller;

import com.github.pagehelper.PageHelper;
import com.huayu.JC_HY_DD.member_management.entity.DataMessage;
import com.huayu.JC_HY_DD.member_management.entity.Member_management;
import com.huayu.JC_HY_DD.member_management.service.impl.Member_managementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-06-12
 */
@Controller
@RequestMapping("/member_management/member-management")
public class Member_managementController {
    @Autowired
    private Member_managementServiceImpl managementService;

    @RequestMapping("/queryVip.do")
    @ResponseBody
    public DataMessage queryAll(Member_management management, Integer page, Integer limit){
        DataMessage dataMessage = new DataMessage();
        dataMessage.setCode(0);
        dataMessage.setMsg("");
        dataMessage.setCount(managementService.queryAll(management).size());
        PageHelper.startPage(page, limit, true);
        List<Member_management> list = managementService.queryAll(management);
        dataMessage.setData(list);
        return dataMessage;
    }

    @RequestMapping("/delete/{id}.do")
    @ResponseBody
    public boolean delete(@PathVariable(value = "id") int id) {
        boolean b = managementService.removeById(id);
        return b;
    }


}
