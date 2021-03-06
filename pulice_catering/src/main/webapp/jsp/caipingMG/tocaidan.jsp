<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend>菜单修改</legend>
</fieldset>

<form class="layui-form" action="/caidan/update.do" enctype="multipart/form-data" method="post">

    <div class="layui-form-item">
        <div class="layui-inline">
            <div class="layui-input-inline">
                <input type="hidden" name="id" value="${list.id}" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">菜单图片</label>
        <div class="layui-input-block">
            <div class="layui-input-block">
                <img src="/img/${list.caidanimg}" style="height:80px;width:80px;border-radius:50%;">
            </div>
            <div class="layui-input-block layui-upload">
                <input type="file" name="file" lay-verify="required" size="100px" autocomplete="off">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">所属菜品</label>
        <div class="layui-input-block">
            <select name="caidanid">
                <c:forEach items="${clist}" var="li">
                <option value="${li.caidanid}" ${li.caidanid eq list.caidanid ? 'selected': ''}>${li.cname}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">菜品名称</label>
        <div class="layui-input-block">
            <input type="text" name="name" value="${list.name}" lay-verify="required" autocomplete="off"
                   class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">门店</label>
        <div class="layui-input-block">
            <input type="text" name="mendian" value="${list.mendian}" lay-verify="required" autocomplete="off"
                   class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">创建日期</label>
        <div class="layui-input-block">
            <input type="text" name="createtime" value="${list.createtime}" id="date1" autocomplete="off"
                   class="layui-input">
        </div>
    </div>



    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-inline">
            <textarea name="test" style="width: 1000px;" maxlength="250" rows="5" class="layui-textarea">${list.test}</textarea>
        </div>
    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" id="f1" lay-filter="demo1">修改</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script src="/layui/jquery-3.3.1.min.js"></script>
<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;

        //日期
        // laydate.render({
        //     elem: '#date1'
        //     ,type:'datetime'
        // });
        //
        // laydate.render({
        //     elem: '#date2'
        //     ,type:'datetime'
        // });


        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        // //自定义验证规则
        // form.verify({
        //     title: function(value){
        //         if(value.length < 5){
        //             return '标题至少得5个字符啊';
        //         }
        //     }
        //     ,pass: [
        //         /^[\S]{6,12}$/
        //         ,'密码必须6到12位，且不能出现空格'
        //     ]
        //     ,content: function(value){
        //         layedit.sync(editIndex);
        //     }
        // });


        // //监听提交
        // form.on('submit(demo1)', function (data) {
        //     layer.alert(JSON.stringify(data.field), {
        //         title: '最终的提交信息'
        //     })
        //     return false;
        // });

        //表单初始赋值
        // form.val('example', {
        //     "username": "贤心" // "name": "value"
        //     , "password": "123456"
        //     , "interest": 1
        //     , "like[write]": true //复选框选中状态
        //     , "close": true //开关状态
        //     , "sex": "女"
        //     , "desc": "我爱 layui"
        // })

    });
    $("#f1").click(function () {
        var index=parent.layer.getFrameIndex(window.name);
        parent.layer.close(index);
    });
</script>

</body>
</html>
