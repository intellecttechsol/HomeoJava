<%@ include file="common/header.jsp"%>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen-demo.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/uniform/uniform.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/uniform/uniform-demo.js"></script>

<div id="page-title">
	<h2>Add a New StaticData</h2>
	<p>Easy Addition for a New StaticData.</p>
	<div class="row">
		<div class="panel">
			<div class="panel-body">
				<h3 class="title-hero">StaticData Details</h3>
				<div class="example-box-wrapper">
					<form class="form-horizontal bordered-row" id="addStaticDataForm"
						name="addStaticDataForm" onsubmit="saveStaticData();">
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">StaticData Type</label>
									<div class="col-sm-6">
										<select name="type" id="type"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">
											<option value="Diagnosis">Diagnosis</option>
										</select>
									</div>
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label class="col-sm-3 control-label">StaticData Code</label>
									<div class="col-sm-6">
										<input type="text" name="code" id="code"
											placeholder="Required Field" required class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">StaticData Value</label>
									<div class="col-sm-6">
										<textarea name="value" id="value" rows="3"
											placeholder="Required Field"
											class="form-control textarea-no-resize" required></textarea>
									</div>
								</div>
							</div>
						</div>
						<div class="bg-default text-center">
							<input type="submit" class="btn btn-primary" value="Save"
								id="savebuttonid">
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
		$('#addStaticDataForm').submit(function(event) {
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

	function saveStaticData() {
		var serialized = $("#addStaticDataForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		alert(x);

		 $.ajax({
			url : "http://localhost:8082/Homeo-RestWS/services/staticDataservice/addStaticData",
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("addStaticDataForm").reset();
			}, 
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		}); 
		return true;
	}
</script>


<%@ include file="common/footer.jsp"%>