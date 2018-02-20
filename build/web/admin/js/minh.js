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
        
});


