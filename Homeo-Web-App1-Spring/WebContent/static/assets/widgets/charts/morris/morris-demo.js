/* Morris color bar */


$(function() {
   

    Morris.Donut({
        element: 'hero-donut',
        data: [{
            label: 'T1',
            value: 25
        }, {
            label: 'T2',
            value: 40
        }, {
            label: 'T3',
            value: 25
        }, {
            label: 'T4',
            value: 10
        }],
        formatter: function(y) {
            return y + "%"
        }
    });

    Morris.Area({
        element: 'hero-area',
        data: [{
            period: '2010 Q1',
            male: 2666,
            female: null
        }, {
            period: '2010 Q2',
            male: 2778,
            female: 2294
        }, {
            period: '2010 Q3',
            male: 4912,
            female: 1969
        }, {
            period: '2010 Q4',
            male: 3767,
            female: 3597
        }, {
            period: '2011 Q1',
            male: 6810,
            female: 1914
        }, {
            period: '2011 Q2',
            male: 5670,
            female: 4293
        }, {
            period: '2011 Q3',
            male: 4820,
            female: 3795
        }, {
            period: '2011 Q4',
            male: 15073,
            female: 5967
        }, {
            period: '2012 Q1',
            male: 10687,
            female: 4460
        }, {
            period: '2012 Q2',
            male: 8432,
            female: 5713
        }],
        xkey: 'period',
        ykeys: ['male', 'female'],
        labels: ['Male', 'Female'],
        pointSize: 2,
        hideHover: 'auto'
    });

    Morris.Bar({
        element: 'hero-bar',
        data: [{
            device: 'Male',
            geekbench: 136
        }, {
            device: 'Female',
            geekbench: 275
        }],
        xkey: 'device',
        ykeys: ['geekbench'],
        labels: ['Medicine'],
        barRatio: 0.4,
        xLabelAngle: 35,
        hideHover: 'auto'
    });

});
