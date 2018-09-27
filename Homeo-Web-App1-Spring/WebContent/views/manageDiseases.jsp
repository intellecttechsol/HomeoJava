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
				url : "http://localhost:8080/Homeo-RestWS/services/diseaseservice/retrieveAllDiseases"
			},
			columns : [
				{
					"data" : "diseasename"
				},
				{
					"data" : "diseasedescription"
				},
				{
					"data" : "diseasegender"
				},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"edit\" class=\"btn btn-black-opacity\" data-toggle=\"modal\" data-target=\".bs-example-modal-lg\" href=\"#\"><i class=\"glyph-icon icon-edit-sign\"></i></button>"
				},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"delete\" class=\"btn btn-black-opacity\" data-toggle=\"modal\" data-target=\".bs-example-modal-sm\" href=\"#\"><i class=\"glyph-icon icon-remove-sign\"></i></button>"
				}
			]
		});
		$('.dataTables_filter input').attr("placeholder", "Search...");
		$('#datatable-responsive tbody').on('click', 'button[id^="edit"]', function() {
			var data = Table.row($(this).parents('tr')).data();
			document.getElementById('diseasenamemodal').value = data.diseasename;
			alert(data.diseasegender);
			if(data.diseasegender == 'Male'){
				document.getElementById("maleDiseaseradioIDmodal").checked = true;
				document.getElementById("maleDiseaseradioIDmodal").parentElement.classList.add('checked');
			}
			if(data.diseasegender == 'Female'){
				document.getElementById("femaleDiseaseradioIDmodal").checked = true;
				document.getElementById("femaleDiseaseradioIDmodal").parentElement.classList.add('checked');
			}
			if(data.diseasegender == 'Both'){
				document.getElementById("bothDiseaseradioIDmodal").checked = true;
				document.getElementById("bothDiseaseradioIDmodal").parentElement.classList.add('checked');
			}
			document.getElementById('diseasedescriptionmodal').value = data.diseasedescription;
		});
		$('#datatable-responsive tbody').on('click', 'button[id^="delete"]', function() {
			var data = Table.row($(this).parents('tr')).data();
			$("#deletedisease").click(function() {
				deleteDisease(data.diseasename);
			});
		});
	});
</script>

<div id="page-title">
	<h2>Manage Disease</h2>
	<p>Easy Search,Edit and Delete for Disease.</p>
	<div class="row">
		<div class="panel">
			<div class="panel-body">
				<h3 class="title-hero" data-toggle="collapse" data-target="#demo-2"
					aria-expanded="true">Disease Search Criteria</h3>
				<div class="example-box-wrapper">
					<div id="demo-2" class="collapse in" aria-expanded="true">
						<form class="form-horizontal bordered-row" id="searchdiseaseForm"
							name="searchdiseaseForm">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Disease Name</label>
										<div class="col-sm-6">
											<input type="text" name="diseasename" id="diseasename"
												placeholder="Required Field" class="form-control">
										</div>
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Gender</label>
										<div class="col-sm-6">
											<div class="radio-primary">
												<label>
													<div class="radio" id="maleDiseaseIDM">
														<input type="radio" id="maleDiseaseradioID"
															name="diseasegender" class="custom-radio" value="Male">Male
														Disease
													</div>
												</label>
											</div>
											<div class="radio-primary">
												<label>
													<div class="radio" id="femaleDiseaseIDF">
														<input type="radio" id="femaleDiseaseradioID"
															name="diseasegender" class="custom-radio" value="Female">Female
														Disease
													</div>
												</label>
											</div>
											<div class="radio-primary">
												<label>
													<div class="radio" id="femaleDiseaseIDA">
														<input type="radio" id="bothDiseaseradioID"
															name="diseasegender" class="custom-radio" value="Both">Both Gender's Disease
													</div>
												</label>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="bg-default text-center">
								<input type="button" class="btn btn-primary" value="Search"
									id="searchbuttonid" onclick="searchDisease();">
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
									style="width: 50px;" aria-sort="ascending">Disease Name</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									aria-label="Office: activate to sort column ascending"
									style="width: 80px;">Disease Description</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									aria-label="Age: activate to sort column ascending"
									style="width: 200px;">Gender</th>
								<th tabindex="0" rowspan="1" colspan="1" style="width: 5px;">Edit</th>
								<th tabindex="0" rowspan="1" colspan="1" style="width: 5px;">Delete</th>
							</tr>
						</thead>
						<!-- Footer not required
						<tfoot>
							<tr>
								<th rowspan="1" colspan="1">Disease Name</th>
								<th rowspan="1" colspan="1">Disease Description</th>
								<th rowspan="1" colspan="1">Gender</th>
								<th rowspan="1" colspan="1">Edit</th>
								<th rowspan="1" colspan="1">Delete</th>
							</tr>
						</tfoot>
						 -->
					</table>
				</div>
			</div>
		</div>
	</div>

</div>

<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
	aria-labelledby="myLargeModalLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">Edit Disease</h4>
			</div>
			<form class="form-horizontal bordered-row" id="edit-form"
				name="edit-form" onsubmit="updateDisease();">
				<div class="modal-body">
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<label class="col-sm-3 control-label">Disease Name</label>
								<div class="col-sm-6">
									<input type="text" placeholder="Required Field" readonly
										class="form-control" id="diseasenamemodal" name="diseasename">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label">Disease
									Description</label>
								<div class="col-sm-6">
									<textarea name="diseasedescription" id="diseasedescriptionmodal"
										rows="3" placeholder="Required Field"
										class="form-control textarea-no-resize" required></textarea>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<label class="col-sm-3 control-label">Gender</label>
								<div class="col-sm-6">
									<div class="radio-primary">
										<label>
											<div class="radio" id="maleDiseaseIDM">
												<input type="radio" id="maleDiseaseradioIDmodal"
													name="diseasegender" class="custom-radio" value="Male">Male
												Disease
											</div>
										</label>
									</div>
									<div class="radio-primary">
										<label>
											<div class="radio" id="femaleDiseaseIDF">
												<input type="radio" id="femaleDiseaseradioIDmodal"
													name="diseasegender" class="custom-radio" value="Female">Female
												Disease
											</div>
										</label>
									</div>
									<div class="radio-primary">
										<label>
											<div class="radio" id="femaleDiseaseIDA">
												<input type="radio" id="bothDiseaseradioIDmodal"
													name="diseasegender" class="custom-radio" value="Both">Both Gender's	Disease
											</div>
										</label>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" id="closebuttonUpdateDialog"
						class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Save changes</button>
				</div>
			</form>
		</div>
	</div>
</div>

<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog"
	aria-labelledby="mySmallModalLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">Remove Disease</h4>
			</div>
			<div class="modal-body">
				<p>Do you want to Delete the Disease permanently!</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="closebuttonDeleteDialog">Close</button>
				<button id="deletedisease" type="button" class="btn btn-primary">Delete</button>
			</div>
		</div>
	</div>
</div>

</div>
<script type="text/javascript">
	$(document).ready(function() {
		$('#searchdiseaseForm').submit(function(event) {
			event.preventDefault();
		});
		$('#edit-form').submit(function(event) {
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

	function updateDisease() {
		var serialized = $("#edit-form").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		alert(x);
		$.ajax({
			url : "http://localhost:8080/Homeo-RestWS/services/diseaseservice/updateDisease",
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById('closebuttonUpdateDialog').click();
				searchDisease();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}

	function deleteDisease(diseasename) {
		$.ajax({
			url : "http://localhost:8080/Homeo-RestWS/services/diseaseservice/deleteDisease/" + diseasename,
			method : "POST",
			contentType : "application/x-www-form-urlencoded",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById('closebuttonDeleteDialog').click();
				searchDisease();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}

	function searchDisease() {
		var serialized = $("#searchdiseaseForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);

		$.ajax({
			url : "http://localhost:8080/Homeo-RestWS/services/diseaseservice/retrieveDiseasesByDifferentParameters",
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