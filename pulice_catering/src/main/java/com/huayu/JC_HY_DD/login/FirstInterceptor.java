package com.huayu.JC_HY_DD.login;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        httpServletRequest.getSession().setAttribute("user",null);
        if (httpServletRequest.getRequestURI().indexOf("/jsp/index.jsp")>0){
            return true;
        }
        if (httpServletRequest.getSession().getAttribute("user")==null){
            httpServletRequest.getRequestDispatcher("/jsp/JC_HY_DD/JC/login/login.jsp").forward(httpServletRequest,httpServletResponse);
            return false;
        }
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        if (httpServletRequest.getSession().getAttribute("user")==null){
            httpServletRequest.getRequestDispatcher("/jsp/JC_HY_DD/JC/login/login.jsp").forward(httpServletRequest,httpServletResponse);
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("222222222222222222222221111111");
    }
}
