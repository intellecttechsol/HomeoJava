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
				url : "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllPatientDetails"
			},
			columns : [
				{
					"data" : "name"
				},
				{
					"data" : "patfileno"
				},
				{
					"data" : "patide"
				},
				{
					"data" : "address"
				},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"edit\" class=\"btn btn-black-opacity\" data-toggle=\"modal\" data-target=\"#\" href=\"#\"><i class=\"glyph-icon icon-edit-sign\"></i></button>"
				},
			]
		});
		$('.dataTables_filter input').attr("placeholder", "Search...");
		$('#datatable-responsive tbody').on('click', 'button[id^="edit"]', function() {
			var data = Table.row($(this).parents('tr')).data();
			alert(data.patide);
			location.href="addPatient?${_csrf.parameterName}=${_csrf.token}"+"&patrefnum="+data.patide;
			alert(location.href);
		});
	});
</script>

<div id="page-title">
	<h2>Search Patient</h2>
	<p>Easy Search for Patient.</p>
	<div class="row">
		<div class="panel">
			<div class="panel-body">
				<h3 class="title-hero" data-toggle="collapse" data-target="#demo-2"
					aria-expanded="true">Patient Search Criteria</h3>
				<div class="example-box-wrapper">
					<div id="demo-2" class="collapse in" aria-expanded="true">
						<form class="form-horizontal bordered-row" id="searchpatientForm"
							name="searchpatientForm">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Patient Name</label>
										<div class="col-sm-6">
											<input type="text" name="name" id="name"
												placeholder="Required Field" class="form-control">
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Patient's File Number</label>
										<div class="col-sm-6">
											<input type="text" name="patfileno" id="patfileno"
												placeholder="Required Field" class="form-control">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Patient Ref. No.</label>
										<div class="col-sm-6">
											<input type="text" name="patide" id="patide"
												placeholder="Required Field" class="form-control">
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Patient Address</label>
										<div class="col-sm-6">
											<input type="text" name="address" id="address"
												placeholder="Required Field" class="form-control">
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="bg-default text-center">
						<input type="button" class="btn btn-primary" value="Search"
							id="searchbuttonid" onclick="searchPatient();">
					</div>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
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
									style="width: 200px;" aria-sort="ascending">Patient Name</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									aria-label="Office: activate to sort column ascending"
									style="width: 200px;">Patient's File Number</th>
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									aria-label="Age: activate to sort column ascending"
									style="width: 200px;">Patient's Ref. No.</th>		
								<th class="sorting" tabindex="0"
									aria-controls="datatable-responsive" rowspan="1" colspan="1"
									aria-label="Age: activate to sort column ascending"
									style="width: 200px;">Patient's Address</th>
								<th tabindex="0" rowspan="1" colspan="1" style="width: 5px;">Edit</th>
							</tr>
						</thead>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>


<script type="text/javascript">
	$(document).ready(function() {
		$('#searchpatientForm').submit(function(event) {
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
	
	function searchPatient() {
		var serialized = $("#searchpatientForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);

		$.ajax({
			url : "http://localhost:8080/Homeo-RestWS/services/patientservice/retrievePatientDetailsByDifferentParameters",
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