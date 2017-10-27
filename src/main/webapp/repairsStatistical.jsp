<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>上海燃气报修类别统计</title>
</head>
<body style="background: #02081b">
<h1 style="color: #fff;text-align: center;">上海燃气报修类别统计</h1>
<div style="margin: 40px auto;width: 1300px;">
    <div id="statistical1" style="width: 600px;height:400px;float: left;"></div>
    <div style="margin-left:100px;float: left;">
        <div id="statistical2" style="width:500px;height:400px;float: left;"></div>
        <div style="margin-top: 30px;width: auto;float:left;">
            <select id="areaSelection">
                <option value="浦东">浦东</option>
                <option value="宝山">宝山</option>
                <option value="长宁">长宁</option>
                <option value="徐汇">徐汇</option>
                <option value="闵行">闵行</option>
                <option value="闸北">闸北</option>
                <option value="杨浦">杨浦</option>
                <option value="虹口">虹口</option>
                <option value="静安">静安</option>
                <option value="嘉定">嘉定</option>
                <option value="黄浦">黄浦</option>
                <option value="卢湾">卢湾</option>
                <option value="金山">金山</option>
                <option value="崇明">崇明</option>
                <option value="松江">松江</option>
                <option value="南汇">南汇</option>
                <option value="青浦">青浦</option>
                <option value="奉贤">奉贤</option>
            </select>
        </div>
    </div>
    <div style="width: 600px;float: left;">
        <div id="statistical3" style="margin-top:50px;width: 500px;height:400px;float: left;"></div>
        <div style="margin-top: 50px;width: auto;float:left;">
            <select id="yearSelection">
                <option value="2012">2012</option>
                <option value="2013">2013</option>
                <option value="2014">2014</option>
                <option value="2015" selected = selected>2015</option>
                <option value="2016">2016</option>
                <option value="2017">2017</option>
            </select>
        </div>
    </div>

    <div id="statistical4" style="margin-top:50px;margin-left: 100px; width: 600px;height:400px;float: left;"></div>
</div>
</body>
<script type="text/javascript" src="resources/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="resources/js/echarts.js"></script>
<script type="text/javascript" src="resources/js/repairStatistical.js"></script>

</html>