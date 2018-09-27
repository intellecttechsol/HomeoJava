<%@ include file="common/header.jsp"%>

<style>
h3:hover {
	color: #4B0082;
	cursor: pointer;
	cursor: hand;
	font-weight: bold;
}
</style>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen-demo.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/datatable/datatable.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/uniform/uniform.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/uniform/uniform-demo.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/datatable/datatable.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/datatable/datatable-bootstrap.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/datatable/datatable-responsive.js"></script>

<script type="text/javascript">

	/* Datatables responsive */

	$(document).ready(function() {
		Table = $('#datatable-responsive').DataTable({
			responsive : true,
			ajax : {
				type : "GET",
				dataType : "json",
				dataSrc : "",
				contentType : "application/x-www-form-urlencoded",
				accept : "application/json",
				url : "http://localhost:8082/Homeo-RestWS/services/staticDataservice/retrieveAllStaticDatas"
			},
			columns : [
				{
					"data" : "type"
				},
				{
					"data" : "code"
				},
				{
					"data" : "value"
				},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"delete\" class=\"btn btn-black-opacity\" data-toggle=\"modal\" data-target=\".bs-example-modal-sm\" href=\"#\"><i class=\"glyph-icon icon-remove-sign\"></i></button>"
				}
			]
		});
		$('.dataTables_filter input').attr("placeholder", "Search...");
		$('#datatable-responsive tbody').on('click', 'button[id^="delete"]', function() {
			var data = Table.row($(this).parents('tr')).data();
			$("#deletestaticData").click(function() {
				deleteStaticData(data.code);
			});
		});
	});
</script>

<div id="page-title">
	<h2>Manage StaticData</h2>
	<p>Easy Search,Edit and Delete for StaticData.</p>
	<div class="row">
		<div class="panel">
			<div class="panel-body">
				<h3 class="title-hero" data-toggle="collapse" data-target="#demo-2"
					aria-expanded="true">StaticData Search Criteria</h3>
				<div class="example-box-wrapper">
					<div id="demo-2" class="collapse in" aria-expanded="true">
						<form class="form-horizontal bordered-row"
							id="searchstaticDataForm" name="searchstaticDataForm">
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
								<input type="button" class="btn btn-primary" value="Search"
									id="searchbuttonid" onclick="searchStaticData();">
							</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="panel">
			<div class="panel-body">

				<div id="datatable-responsive_wrapper"
					class="dataTables_wrapper form-inline">
					<table id="datatable-responsive"
						class="table table-striped table-bordered responsive no-wrap dataTable dtr-inline"
						cellspacing="0" width="100%" role="grid"
						aria-describedby="datatable-responsive_info" style="width: 100%;">
						<thead>
							<tr role="row">
								<th class="sorting_asc" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									aria-label="Position: activate to sort column ascending"
									style="width: 50px;" aria-sort="ascending">StaticData Type</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									aria-label="Office: activate to sort column ascending"
									style="width: 80px;">StaticData Code</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									aria-label="Age: activate to sort column ascending"
									style="width: 200px;">StaticData Value</th>
								<th tabindex="0" rowspan="1" colspan="1" style="width: 5px;">Delete</th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<th rowspan="1" colspan="1">StaticData Type</th>
								<th rowspan="1" colspan="1">StaticData Code</th>
								<th rowspan="1" colspan="1">StaticData Code</th>
								<th rowspan="1" colspan="1">Delete</th>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog"
	aria-labelledby="mySmallModalLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">Remove StaticData</h4>
			</div>
			<div class="modal-body">
				<p>Do you want to Delete the StaticData permanently!</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="closebuttonDeleteDialog">Close</button>
				<button id="deletestaticData" type="button" class="btn btn-primary">Delete</button>
			</div>
		</div>
	</div>
</div>

</div>
<script type="text/javascript">
	$(document).ready(function() {
		$('#searchstaticDataForm').submit(function(event) {
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


	function deleteStaticData(staticDataCode) {
		$.ajax({
			url : "http://localhost:8082/Homeo-RestWS/services/staticDataservice/deleteStaticData/" + staticDataCode,
			method : "POST",
			contentType : "application/x-www-form-urlencoded",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById('closebuttonDeleteDialog').click();
				searchStaticData();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}

	function searchStaticData() {
		var serialized = $("#searchstaticDataForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		$.ajax({
			url : "http://localhost:8082/Homeo-RestWS/services/staticDataservice/retrieveStaticDatasByDifferentParameters",
			method : "POST",
			data : x,
			dataType : "json",
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				Table.clear().draw();
				Table.rows.add(result).draw(); // Add new data
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
</script>


<%@ include file="common/footer.jsp"%>