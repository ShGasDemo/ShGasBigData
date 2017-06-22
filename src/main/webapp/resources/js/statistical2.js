/**
 * Created by dengcunbin on 17/6/22.
 */
(function($){

    var chart1 = echarts.init(document.getElementById('statistical1'));
    var option = {
        title : {
            text:'所有话务的各个反映类别种类所占比',
            x:'center',
            textStyle: {
                color:'#B5C334',
                fontSize: 18
            }
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['其它','业务','燃气费查询','报修','投诉','咨询','表务','问题反映'],
            textStyle: {
                fontSize: '10',
                color:'#fff',
                fontWeight: 'bold'
            }
        },
        series : [
            {
                name: '反应类别种类',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:1, name:'其它'},
                    {value:26621, name:'业务'},
                    {value:2166401, name:'燃气费查询'},
                    {value:1202309, name:'报修'},
                    {value:13059, name:'投诉'},
                    {value:2471000, name:'咨询'},
                    {value:1261824, name:'表务'},
                    {value:96857, name:'问题反映'}
                ],
                color: [
                    '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',
                    '#FE8463','#9BCA63'
                ],
                itemStyle: {

                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    chart1.setOption(option);

    var chart2 = echarts.init(document.getElementById('statistical2'));
    option = {
        title : {
            text:'上海各个区的反映类别种类所占比',
            x:'center',
            textStyle: {
                color:'#B5C334',
                fontSize: 18
            }
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['其它','业务','燃气费查询','报修','投诉','咨询','表务','问题反映'],
            textStyle: {
                fontSize: '10',
                color:'#fff',
                fontWeight: 'bold'
            }
        },
        series : [
            {
                name: '反应类别种类',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:0, name:'其它'},
                    {value:3397, name:'业务'},
                    {value:483243, name:'燃气费查询'},
                    {value:212778, name:'报修'},
                    {value:1919, name:'投诉'},
                    {value:343696, name:'咨询'},
                    {value:289530, name:'表务'},
                    {value:26012, name:'问题反映'}
                ],
                color: [
                    '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',
                    '#FE8463','#9BCA63'
                ],
                itemStyle: {

                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    chart2.setOption(option);

    var chart3 = echarts.init(document.getElementById('statistical3'));
    option = {
        title : {
            text:'2012~2017年的话务总量变化趋势图',
            x:'center',
            textStyle: {
                color:'#B5C334',
                fontSize: 18
            }
        },
        textStyle: {
            fontSize: '10',
            color:'#fff'
        },
        tooltip : {
            trigger: 'axis',
            formatter: "{a} <br/>{b} : {c} "
        },
        xAxis:{
            type:'category',
            data:['2012','2013','2014','2015','2016','2017']
        },
        yAxis:{
            type:'value',
            min:'dataMin',
            max:'dataMax',
            splitNumber:7
        },
        series : [{
            name:'话务总量',
            type:'line',
            data:[
                {value:333, name:'2012'},
                {value:1359777, name:'2013'},
                {value:1577024, name:'2014'},
                {value:1492521, name:'2015'},
                {value:1936651, name:'2016'},
                {value:872917, name:'2017'}
            ]
        }]

    }
    chart3.setOption(option);

    //反映区名的选择事件
    $(document).ready(function(){
        $("#areaSelection").change(function(){
            alert($(this).children('option:selected').val());
            //选中的select的值
            var area = $(this).children('option:selected').val();

            postRequest(area);

        });
    });

    //请求数据
    var postRequest = function(area){
        var area_json = {
            "feedArea":area
        };
        var json_str = JSON.stringify(area_json);
        $.ajax({
            type:'get',
            async:true,
            data:json_str,
            dataType:"json",
            url:'feedType/result',
            success:function(result){
                console.log(result);
                //chart.setOption({
                //    series:[{
                //        name:'2014',
                //        data:usage2014
                //    },{
                //        name:'2015',
                //        data:usage2015
                //    },{
                //        name:'2016',
                //        data:usage2016
                //    }]
                //
                //});
            }

        })
    };

    postRequest("浦东");

})($);