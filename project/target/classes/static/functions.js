function d(id) {
    swal({
            title: "Are you sure?",
            text: "Once deleted, you will not be able to recover this imaginary file!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url: "/delete/" + id,
                    success: function(res) {
                        console.log(res);
                    },
                });
                swal("Poof! Your imaginary file has been deleted!", {
                    icon: "success",
                }).then((ok) => {
                    if (ok) {
                        location.href = "/product";
                    }
                });
            } else {
                swal("Your imaginary file is safe!");
            }
        });
}

function gpdf(id) {
    swal({
            title: "Do you want to generate a PDF?",
            icon: "info",
            buttons: true,
            dangerMode: true,
        })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url: "/genPDF/" + id,
                    success: function(res) {
                        console.log(res);
                    },
                });
                swal("Your file have been generated!", {
                    icon: "success",
                }).then((ok) => {
                    if (ok) {
                        location.href = "/product";
                    }
                });
            } else {
                swal("Do not generated :c!");
            }
        });
}