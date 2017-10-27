/**
 * Created by dengcunbin on 17/6/22.
 */
(function($){

    var chart1 = echarts.init(document.getElementById('statistical1'));
    var option = {
        title : {
            text:'2012-2017年报修类别中报修数前五的类别所占比',
            x:'center',
            textStyle: {
                color:'#B5C334',//'#ef737a',
                fontSize: 18
            }
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 5,
            top:30,
            data: ['一般维修','漏气','安检','连接管','天然气置换'],
            textStyle: {
                fontSize: '10',
                color:'#fff',
                fontWeight: 'bold'
            }
        },
        series : [
            {
                name: '报修类别',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:477594, name:'一般维修'},
                    {value:390334, name:'漏气'},
                    {value:208816, name:'安检'},
                    {value:63520, name:'连接管'},
                    {value:38878, name:'天然气置换'}
                ],
                color: [
                    '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',
                    '#FE8463','#9BCA63'
                ],
                //color: [
                //    '#00f6e3','#4cc3ff','#7b9def','#62ff73','#f3e59c',
                //    '#587afb','#14a507'
                //],
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
            text:'2012-2017年上海各个区报修类别中报修数前五的类别所占比',
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
            left: 5,
            top:30,
            data: ['一般维修','漏气','安检','连接管','其他报修'],
            textStyle: {
                fontSize: '10',
                color:'#fff',
                fontWeight: 'bold'
            }
        },
        series : [
            {
                name: '报修类别',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:77112, name:'一般维修'},
                    {value:99686, name:'漏气'},
                    {value:20961, name:'安检'},
                    {value:12772, name:'连接管'},
                    {value:1627, name:'其他报修'}
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
            text:'2012-2017年每年报修类别中报修数前五的类别',
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
            data:['一般维修','漏气','安检','连接管','其他报修']
        },
        yAxis:{
            type:'value',
            min:1000,
            max:'dataMax',
            splitNumber:5
        },
        series : [{
            name:'报修数',
            type:'bar',
            data:[
                {value:135172, name:'一般维修',itemStyle:{
                    normal:{
                        color:'#C1232B'
                    }
                }},
                {value:95517, name:'漏气',itemStyle:{
                    normal:{
                        color:'#B5C334'
                    }
                }},
                {value:37643, name:'安检',itemStyle:{
                    normal:{
                        color:'#FCCE10'
                    }
                }},
                {value:12766, name:'连接管',itemStyle:{
                    normal:{
                        color:'#E87C25'
                    }
                }},
                {value:4096, name:'其他报修',itemStyle:{
                    normal:{
                        color:'#27727B'
                    }
                }}
            ]
        }]

    };
    chart3.setOption(option);

    var chart4 = echarts.init(document.getElementById('statistical4'));
    option = {
        title : {
            text:'2012~2017年总报修数变化趋势图',
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
            name:'报修数',
            type:'line',
            data:[
                {value:2, name:'2012'},
                {value:242905, name:'2013'},
                {value:276864, name:'2014'},
                {value:272898, name:'2015'},
                {value:287191, name:'2016'},
                {value:122449, name:'2017'}
            ]
        }]

    };
    chart4.setOption(option);


})($);