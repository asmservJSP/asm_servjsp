/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function () {
    $('#imgBanner').change(function () {
            if (this.files && this.files[0]) {
                var reader = new FileReader();
                reader.onload = function (e) {
                    $('#imageShowBanner').attr('src', e.target.result);
                };
                reader.readAsDataURL(this.files[0]);
            }

    });
    $('#imgFilm').change(function () {
            if (this.files && this.files[0]) {
                var reader = new FileReader();
                reader.onload = function (e) {
                    $('#imageShowimgFilm').attr('src', e.target.result);
                };
                reader.readAsDataURL(this.files[0]);
            }

    });
    $('#editCategory').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget); // Button that triggered the modal
  console.log(button);
  var idCategory = button.data('idcategory');
  console.log(idCategory);
  var name=button.data('namecategory');
  console.log(name);
  // Extract info from data-* attributes
  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        var modal = $(this);
        modal.find('.modal-title').text('Category ID:'+ idCategory);
        modal.find('.modal-body #recipient-name').val(idCategory);
});
        
});


