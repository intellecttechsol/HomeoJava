<%@ include file="common/header.jsp"%>


<script type="text/javascript">

</script>

<div id="page-title">
	<h2>Add a New Medicine</h2>
	<p>Easy Addition for a New Medicine.</p>
	<div class="row">
		<div class="panel">
			<div class="panel-body">
				<h3 class="title-hero">Medicine Details</h3>
				<div class="example-box-wrapper">
					<form class="form-horizontal bordered-row" id="addMedForm"
						name="addMedForm" onsubmit="saveMedicine();">
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">Medicine Name</label>
									<div class="col-sm-6">
										<input type="text" name="medname" id="medname"
											placeholder="Required Field" required class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Medicine Details</label>
									<div class="col-sm-6">
										<textarea name="meddescription" id="meddescription" rows="3"
											placeholder="Required Field"
											class="form-control textarea-no-resize"
											required></textarea>
									</div>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">Medicine Code</label>
									<div class="col-sm-6">
										<input type="text" name="medcode" id="medcode"
											placeholder="Auto Generated after save" disabled
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Company Name</label>
									<div class="col-sm-6">
										<input type="text" name="medcompname" id="medcompname"
											maxlength="50" minlength="2" required
											placeholder="Between 2 and 50 characters"
											class="form-control">
									</div>
								</div>
							</div>
						</div>
						<div class="bg-default text-center">
							<input type="submit" class="btn btn-primary" value="Save" id="savebuttonid">
						</div>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		$('#addMedForm').submit(function(event) {
			event.preventDefault();
		});
	});

	$("<style type='text/css'>#boxMX{display:none;background: #333;padding: 10px;border: 2px solid #ddd;float: left;font-size: 1.2em;position: fixed;top: 10%; left: 50%;z-index: 99999;box-shadow: 0px 0px 20px #999; -moz-box-shadow: 0px 0px 20px #999; -webkit-box-shadow: 0px 0px 20px #999; border-radius:6px 6px 6px 6px; -moz-border-radius: 6px; -webkit-border-radius: 6px; font:13px Arial, Helvetica, sans-serif; padding:6px 6px 4px;width:300px; color: white;}</style>").appendTo("head");

	function alertMX(t) {
		$("body").append($("<div id='boxMX'><p class='msgMX'></p></div>"));
		$('.msgMX').text(t); var popMargTop = ($('#boxMX').height() + 24) / 2,
			popMargLeft = ($('#boxMX').width() + 24) / 2;
		$('#boxMX').css({
			'margin-top' : -popMargTop,
			'margin-left' : -popMargLeft
		}).fadeIn(600);
		$("#boxMX").click(function() {
			$(this).remove();
		});
	}
	;

	function saveMedicine() {
		var serialized = $("#addMedForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		//alert(x);

		$.ajax({
			url : "http://localhost:8080/Homeo-RestWS/services/medicineservice/addMedicine",
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("medcode").value = result.substr(result.indexOf("(")+1, result.indexOf(")")-result.indexOf("(")-1);
				document.getElementById("addMedForm").reset();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
</script>


<%@ include file="common/footer.jsp"%>