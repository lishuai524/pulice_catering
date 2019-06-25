<%--
Created by IntelliJ IDEA.
User: Administrator
Date: 2019/05/13
Time: 17:02
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
</blockquote>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>堂口信息添加</legend>
</fieldset>
<form class="layui-form layui-form-pane" action="/tangkou_information/tangkou-information/add.do"  method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">堂口名称</label>
        <div class="layui-input-inline">
            <input type="text" name="name" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" >
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">打印机名称</label>
        <div class="layui-input-inline">
            <input type="text" name="printer" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" >
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">总厨</label>
        <div class="layui-input-inline">
            <input type="text" name="executive_chef" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" >
        </div>
    </div>


    <div class="layui-form
    -item">
        <label class="layui-form-label">菜品类别</label>
        <div class="layui-input-inline">
            <select name="category" lay-filter="aihao">
                <option value="">选择状态</option>
                <c:forEach items="${list}" var="i">
                    <option value="${i.fcid}">${i.name}</option>
                </c:forEach>
            </select>
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-block">
            <textarea name="remarks" placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>

    <div class="layui-form-item">
        <button class="layui-btn" lay-submit lay-filter="demo2">提交</button>
    </div>
</form>
<script src="/layui/layui.js" charset="utf-8"></script>
<script src="/layui/jquery-3.3.1.min.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form','table'], function(){
        var form = layui.form;
        var layer = layui.layer;
        var table = layui.table;

        //监听提交
        form.on('submit(demo2)', function(data){
            layer.msg("添加成功")
        });

    });
</script>
</body>
</html>
