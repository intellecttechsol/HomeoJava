/*
 * jQuery File Upload Plugin JS Example 8.9.1
 * https://github.com/blueimp/jQuery-File-Upload
 *
 * Copyright 2010, Sebastian Tschan
 * https://blueimp.net
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 */

/* global $, window */

$(function () {
    'use strict';

    // Initialize the jQuery File Upload widget:
    $('#fileUploadForm').fileupload({
        // Uncomment the following to send cross-domain cookies:
        //xhrFields: {withCredentials: true},
    	//maxNumberOfFiles :2,
        url: 'http://localhost:8080/Homeo-RestWS/services/patientservice/uploadFile'/*,
        done: function (e, data) {
			$(this).removeClass('fileupload-processing');
			aler(data);
            $.each(data.result.files, function (index, file) {
            	
                $('<p/>').text(file.name).appendTo('#files');
            });
        }*/
    });
    
});
