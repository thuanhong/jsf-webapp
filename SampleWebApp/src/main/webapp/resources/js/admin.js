window.onload = function () {
  let dataChartPayment = document.getElementById("adminForm:context");
  var ctx = document.getElementById("myChart").getContext("2d");
  window.line = new Chart(ctx, {
    type: "line",
    data: {
      labels: [
        "Thang 5",
        "Thang 6",
        "Thang 7",
        "Thang 8",
        "Thang 9",
        "Thang 10",
        "Thang 11",
        "Thang 12",
      ],
      datasets: [
        {
          label: "Income",
          data: JSON.parse(dataChartPayment.innerHTML),
          backgroundColor: "rgba(255, 99, 132, 0.2)",
          borderColor: "rgba(255, 99, 132, 1)",
          fill: false,
        },
      ],
    },
    options: {
      responsive: true,
      plugins: {
        title: {
          display: true,
          text: "Chart.js Line Chart",
        },
        tooltip: {
          mode: "index",
          intersect: false,
        },
      },
      hover: {
        mode: "nearest",
        intersect: true,
      },
      scales: {
        yAxes: [{
          ticks: {
              beginAtZero: true
          }
      }],
        x: {
          display: true,
          scaleLabel: {
            display: true,
            labelString: "Value",
          },
        },
        y: {
          display: true,
          scaleLabel: {
            display: true,
            labelString: "Value",
          },
        },
      },
    },
  });
};
