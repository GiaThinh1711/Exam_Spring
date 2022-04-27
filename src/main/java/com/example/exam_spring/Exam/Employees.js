document.addEventListener('DOMContentLoaded', function () {
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            var data = JSON.parse(xhr.responseText);
            var table = document.querySelector('#employees-table');
            for (var i = 0; i < data.length; i++) {
                const element = data[i];
                table.innerHTML +=
                    `<tr>
                <td>${element.id}</td>
                <td>${element.name}</td>
                <td>$${element.wage}</td>
              </tr>`
            }
        }
    };
    xhr.open('GET', 'http://localhost:8080/api/v1/employees', false);
    xhr.send();
});
