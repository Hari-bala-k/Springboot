function showCourse() {
    fetch("http://localhost:8080/courses")
        .then((response) => response.json())
        .then((courses) => {
            const dataTable = document.getElementById("coursetable");

            courses.forEach(course => {
                var row = `<tr>
                    <td>${course.courseId}</td>
                    <td>${course.courseName}</td>
                    <td>${course.duration}</td>
                     <td>${course.trainee}</td>
                </tr>`;

                dataTable.innerHTML += row;
            });
        });
}