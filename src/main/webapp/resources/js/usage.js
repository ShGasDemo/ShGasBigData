/**
 * Created by dengcunbin on 17/6/5.
 */
(function(){
    var user_usage = echarts.init(document.getElementById('user_usage'));
    var company_usage = echarts.init(document.getElementById('company_usage'));


    var count = [];
    var data1 = [];
    var data2 = [];
    var data3 = [];

    var option1 = {
        tooltip: {
            trigger: 'axis',
            position: function (pt) {
                return [pt[0], '10%'];
            }
        },
        title : {
            text: '用气量/用户分布图',
            subtext:'2014年用气量为0的用户数为2308\n' +
            '2015年用气量为0的用户数为2197,用气量为1的用户数为324\n'+
                '2016年用气量为0的用户数为2046,用气量为1的用户数为221\n'
        },
        legend: {
            // top:'30px',
            padding:[30,0,30,0],
            data:['2014','2015','2016']
        },
        yAxis: [
            {
                type: 'value',
                name: '',
                min: 0,
                max: 200,
                interval: 40,
                axisLabel: {
                    formatter: '{value}'
                },
                splitLine:{
                    show:false
                }

            }
        ],
        xAxis: [
            {
                type: 'category',
                boundaryGap: false,
                data:count
            }
        ],
        grid:{
            top:'22%'
        },
        series: [//数据
            {
                name:'2014',
                type:'line',
                areaStyle: {
                    normal: {
                        color:'#14a507'
                    }
                },
                itemStyle:{
                    normal:{
                        color:'rgba(0, 0, 0, 0)'
                    }
                },
                smooth:true,
                data:data1
            },
            {
                name:'2015',
                type:'line',
                areaStyle: {
                    normal: {
                        color:'#b8c707'
                    }
                },
                itemStyle:{
                    normal:{
                        color:'rgba(0, 0, 0, 0)'
                    }
                },
                smooth:true,
                data:data2
            },
            {
                name:'2016',
                type:'line',
                areaStyle: {
                    normal: {
                       color:'#587afb'
                    }
                },
                itemStyle:{
                    normal:{
                        color:'rgba(0, 0, 0, 0)'
                    }
                },
                smooth:true,
                data:data3
            }
        ],
        color: ['#c1e271','#ffd074', '#fbabaa', '#3fadd2', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3']
    };
    option1.legend.selected = {};
    option1.legend.selected["2015"] = false;
    option1.legend.selected["2016"] = false;

    user_usage.setOption(option1);



    var company = [ ['鑫益瑞杰-2\n上海宝山华润燃气有限公司\n金兴陶瓷厂'],
        ['上海万事红燃气技术发展有限公司\n金兴陶瓷厂\n上海新格有色金属有限公司'],
        ['帅翼驰-1\n上海宝山华润燃气有限公司\n浦东机场（能源中心）'],
        ['华峰日轻铝业股份有限公司-1\n上汽大众汽车有限公司\n上汽大众汽车有限公司'],
        ['浦东机场（能源中心）\n华峰日轻铝业股份有限公司-1\n上海宝山华润燃气有限公司'],
        ['上汽大众汽车有限公司\n浦东机场（能源中心）\n圣戈班石膏建材（上海）有限公司'],
        ['上海天玮玻纤有限公司\n优时吉博罗石膏系统（上海）有限公司\n优时吉博罗石膏建材(上海)有限公司'],
        ['圣戈班石膏建材（上海）有限公司\n上海天玮玻纤有限公司\n上汽大众汽车有限公司'],
        ['优时吉博罗石膏系统（上海）有限公司\n圣戈班石膏建材（上海）有限公司\n上海华峰超纤材料股份有限公司新厂（锅炉②）'],
        ["上海克虏伯不锈钢有限公司\n上海克虏伯不锈钢有限公司\n上海华峰超纤材料股份有限公司老厂（锅炉①）"],
       ];
    var usage2014 = [];
    var usage2015 = [];
    var usage2016 = [];
    var option2 = {
        tooltip: {
            trigger: 'axis',
            position: function (pt) {
                return [pt[0], '10%'];
            },
            formatter:'{a0}{b}{c}<br/>{a1}{b}{c}<br/>{a2}{b}{c}'
        },
        grid: {//画布预留
            left: '0%',
            right: '5%',
            bottom: '3%',
            containLabel: true
        },
        title : {
            text: '用气量/top10图'
        },
        legend: {//上层选择卡 data与下方的series中name一一对应
            // top:'30px',
            padding:[30,0,30,0],
            data:['2014','2015','2016'],

        },
        yAxis: {
            type: 'category',
            data:company,
            boundaryGap: ['10%','15%'],//数据左右位置预留。
            splitNumber:10,
            // offset: 1
        },
        xAxis: {

            type: 'value',
            name: '',
            min: 0,
            max: 30000000,
            splitNumber : 4,//分割数
            axisLabel: {
                formatter: '{value}'
            },
            splitLine:{
                show:false
            }
        },
        series: [//数据
            {
                name : '2014',
                areaStyle: {
                    normal: {
                        color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                            offset: 0,
                            color: 'rgb(255, 158, 68)'
                        }, {
                            offset: 1,
                            color: 'rgb(255, 158, 68)'
                        }])
                    }
                },
                label: {
                    normal: {
                        show: true,
                        position:'right',
                        textStyle : {
                            color: '#333333'
                        }
                    }
                },

                type:'bar',
                smooth:true,
                symbol: 'none',
                data:usage2014

            },{
                name : '2015',
                areaStyle: {
                    normal: {
                        color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                            offset: 0,
                            color: 'rgb(255, 158, 68)'
                        }, {
                            offset: 1,
                            color: 'rgb(255, 158, 68)'
                        }])
                    }
                },

                type:'bar',
                smooth:true,
                symbol: 'none',
                data:usage2015,
                label: {
                    normal: {
                        show: true,
                        position: 'right',
                        textStyle : {
                            color: '#333333'
                        }
                    }
                },

            },{
                name : '2016',
                areaStyle: {
                    normal: {
                        color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                            offset: 0,
                            color: 'rgb(255, 158, 68)'
                        }, {
                            offset: 1,
                            color: 'rgb(255, 70, 131)'
                        }])
                    }
                },

                type:'bar',
                smooth:true,
                symbol: 'none',
                data:usage2016,
                label: {
                    normal: {
                        show: true,
                        position: 'right',
                        textStyle : {
                            color: '#333333'
                        }
                    }
                }
            }

        ],
        color: ['#c1e271','#ffd074', '#fbabaa', '#3fadd2', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3']
    };

    company_usage.setOption(option2);

    //$.get('resources/js/usage.json',function(resultData){
    //
    //    //请求成功时执行该函数内容，result即为服务器返回的json对象
    //    if (resultData != null && resultData.length > 0) {
    //
    //        count = resultData[1];
    //        data1 = resultData[0][0];
    //
    //        data2 = resultData[0][1];
    //        data3 = resultData[0][2];
    //        usage2014 = resultData[2][0];
    //        usage2015 = resultData[2][1];
    //        usage2016 = resultData[2][2];
    //
    //
    //        user_usage.setOption({
    //            xAxis:{
    //                data:count
    //            },
    //            series: [{
    //                name: '2014',
    //
    //                data: data1
    //            }, {
    //                name: '2015',
    //
    //                data: data2
    //            },
    //                {
    //                    name: '2016',
    //
    //                    data: data3
    //                }]
    //        });
    //
    //        company_usage.setOption({
    //            yAxis:{
    //                data:company
    //            },
    //            series:[{
    //                name:'2014',
    //                data:usage2014
    //            },{
    //                name:'2015',
    //                data:usage2015
    //            },{
    //                name:'2016',
    //                data:usage2016
    //            }]
    //
    //        })
    //        }
    //});

    var usage = {
      url:{
          usageGas:function(){
              return "usage/usageGas"
          }
      }
    };

    $.ajax({
        type:'get',
        async:true,
        url:usage.url.usageGas(),
        datatype:"json",
        success: function (resultData) {
            console.log(resultData);
            //请求成功时执行该函数内容，result即为服务器返回的json对象
            if (resultData) {
                //var resultData = $.parseJSON(result);//json解析
                count = resultData['usageGas'];
                data1 = resultData['usageGasNum'][0];
                data2 = resultData['usageGasNum'][1];
                data3 = resultData['usageGasNum'][2];
                usage2014 = resultData['usageCompanyGasNum'][0];
                usage2015 = resultData['usageCompanyGasNum'][1];
                usage2016 = resultData['usageCompanyGasNum'][2];


                user_usage.setOption({
                    xAxis:{
                        data:count
                    },
                    series: [{
                        name: '2014',

                        data: data1
                    }, {
                        name: '2015',

                        data: data2
                    },
                        {
                            name: '2016',

                            data: data3
                        }]
                });

                company_usage.setOption({
                    yAxis:{
                        data:company
                    },
                series:[{
                    name:'2014',
                    data:usage2014
                },{
                    name:'2015',
                    data:usage2015
                },{
                    name:'2016',
                    data:usage2016
                }]

                });
                //alert(data1);
            }else {
                //返回的数据为空时显示提示信息
                alert("图表请求数据为空，可能服务器暂未录入数据，您可以稍后再试！");
            }
        },
        error:function(errorMsg){
            //请求失败时执行该函数
            alert("图表请求数据失败，可能是服务器开小差了");
        }
    });
})();