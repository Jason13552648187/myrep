<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jason | 首页</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="resouces/layui/css/layui.css">
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script src="resouces/layui/layui.all.js" type="text/javascript"></script>
</head>
<body>

<blockquote class="layui-elem-quote layui-text">
    鉴于小伙伴的普遍反馈，先温馨提醒两个常见“问题”,这里可以直接访问我的博客
    <a href="http://lyinginsun.blog.51cto.com">&nbsp;海殇:lyinginsun.blog.51cto.com</a>
</blockquote>

<!--标题头部-->
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>表单集合演示</legend>
    <!--表单开始-->
    <form class="layui-form  layui-form-pane" action="http://lyinginsun.blog.51cto.com" style="width: 900px;">
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input class="layui-input" name="username" lay-verify="required" type="text" autocomplete="off" placeholder="请输入姓名" />
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-inline">
                <input class="layui-input" id="password" name="password" lay-verify="required" type="password" autocomplete="off" placeholder="请输入密码" />
            </div>
            <div class="layui-word-aux layui-form-mid">请至少输入3位密码!</div>
        </div>



        <!--下拉选项-->
        <div class="layui-form-item">
            <label class="layui-form-label">籍贯</label>
            <div  class="layui-input-inline">
                <select name="interst" lay-filter="required">
                    <option vlaue=""></option>
                    <option value="0">北京</option>
                    <option value="1">安徽</option>
                    <option value="2">河南</option>
                    <option value="3">河北</option>
                    <option value="4">广州</option>
                </select>
            </div>
        </div>

        <!--单行下拉-->
        <div class="layui-form-item">
            <label class="layui-form-label">单行选择框</label>
            <div class="layui-input-inline">
                <select name="interest" lay-filter="aihao">
                    <option value=""></option>
                    <option value="0">写作</option>
                    <option value="1">阅读</option>
                    <option value="2">游戏</option>
                    <option value="3">音乐</option>
                    <option value="4">旅行</option>
                </select>
            </div>
        </div>

        <!--复选框-->
        <div class="layui-form-item">
            <label class="layui-form-label">爱好</label>
            <div class="layui-input-inline">
                <input type="checkbox" name="hobby" title="写作" value="write" />
                <input type="checkbox" name="hobby" title="阅读" vlaue="read"  checked />
                <input type="checkbox" name="hobby" title="听音乐" vlaue="music" />
            </div>
        </div>

        <!--单选-->
        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-inline">
                <input  type="radio" name="sex" value="男"  title="男"/>
                <input  type="radio" name="sex" value="女"  title="女"/>
            </div>
        </div>

        <!--开关-->
        <div class="layui-form-item">
            <label class="layui-form-label">传染病史</label>
            <div class="layui-input-inline">
                <input type="checkbox" name="switch" lay-skin="switch" lay-text="有|无"/>
            </div>
        </div>


        <!--建议-->
        <div class="layui-form-item  layui-form-text">
            <label class="layui-form-label">建议</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" lay-verify="required" required></textarea>
            </div>
        </div>
    </form>
</fieldset>


<script>
    layer.msg("可以写任何代码！");
    layui.form.render(); /*用来启动渲染表单的所有特效的*/
    layui.form.render("select","mydiv");
</script>
</body>
</html>