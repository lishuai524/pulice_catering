<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
Created by IntelliJ IDEA.
User: Administrator
Date: 2019/05/13
Time: 17:02
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <legend>桌台信息添加</legend>
</fieldset>
<form class="layui-form layui-form-pane" action="/queuing_management/queuing-management/add.do"  method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">队列类型</label>
        <div class="layui-input-inline">
            <select name="queue_type" lay-filter="aihao">
                <option value="">选择容量</option>
                <c:forEach items="${que}" var="q">
                    <option value="${q.qid}">${q.type}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <%--<div class="layui-form-item">--%>
        <%--<label class="layui-form-label">排队号码</label>--%>
        <%--<div class="layui-input-inline">--%>
            <%--<input type="text" name="number"  placeholder="请输入" autocomplete="off" class="layui-input">--%>
        <%--</div>--%>
    <%--</div>--%>
    <div class="layui-form-item">
        <label class="layui-form-label">就餐人姓名</label>
        <div class="layui-input-inline">
            <input type="text" name="name" lay-verify="required"  placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">就餐人数</label>
        <div class="layui-input-inline">
            <input type="text" name="people" lay-verify="number" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">桌台容量</label>
        <div class="layui-input-inline">
            <select name="capacity" lay-filter="aihao">
                <option value="">选择容量</option>
                <c:forEach items="${cap}" var="c">
                    <option value="${c.cid}">${c.cname}</option>
                </c:forEach>
            </select>
        </div>
    </div>


    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">桌台类型</label>
            <div class="layui-input-block">
                <select name="Desk_type" lay-filter="aihao">
                    <option value="">选择类型</option>
                    <c:forEach items="${type}" var="t">
                        <option value="${t.zid}">${t.zname}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">取号时间</label>
        <div class="layui-input-inline">
            <input type="text" name="data" id="date1" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">等待桌数</label>
        <div class="layui-input-inline">
            <input type="text" name="await_number" lay-verify="number" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">预计等待时间</label>
        <div class="layui-input-inline">
            <input type="text" name="latency_time" id="date" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">状态</label>
        <div class="layui-input-inline">
            <select name="qsid" lay-filter="aihao">
                <option value="">选择状态</option>
                <c:forEach items="${state}" var="s">
                    <option value="${s.qsid}">${s.name}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-block">
            <textarea name="remark" placeholder="请输入内容" class="layui-textarea"></textarea>
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
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
            ,type:'datetime'
        });
        laydate.render({
            elem: '#date1'
            ,type:'datetime'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');
        //监听提交
        form.on('submit(demo2)', function(data){
            // layer.alert(JSON.stringify(data.field), {
            //     title: '最终的提交信息'
            // })
            // return false;
            layer.msg("添加成功",5000)
        });



    });
</script>

</body>
</html>

