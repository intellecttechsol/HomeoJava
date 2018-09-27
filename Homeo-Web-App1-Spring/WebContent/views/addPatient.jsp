<%@ include file="common/header.jsp"%>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/wizard/wizard.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/wizard/wizard-demo.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/tabs/tabs.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/accordion-ui/accordion.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/inputmask/inputmask.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/datepicker/datepicker.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/textarea/textarea.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen-demo.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/datatable/datatable.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/datatable/datatable.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/datatable/datatable-bootstrap.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/widgets/datatable/datatable-responsive.js"></script>

<!-- The Templates plugin is included to render the upload/download listings -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/ tmpl.min.js"></script>
<!-- The Load Image plugin is included for the preview images and image resizing functionality -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/load-image.all.min.js"></script>
<!-- The Canvas to Blob plugin is included for image resizing functionality -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/canvas-to-blob.min.js"></script>
<!-- Bootstrap JS is not required, but included for the responsive demo navigation
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> -->
<!-- blueimp Gallery script -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.blueimp-gallery.min.js"></script>
<!-- The Iframe Transport is required for browsers without support for XHR file uploads -->

<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.iframe-transport.js"></script>
<!-- The basic File Upload plugin -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.fileupload.js"></script>
<!-- The File Upload processing plugin -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.fileupload-process.js"></script>
<!-- The File Upload image preview & resize plugin -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.fileupload-image.js"></script>
<!-- The File Upload audio preview plugin -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.fileupload-audio.js"></script>
<!-- The File Upload video preview plugin -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.fileupload-video.js"></script>
<!-- The File Upload validation plugin -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.fileupload-validate.js"></script>
<!-- The File Upload user interface plugin -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/jquery.fileupload-ui.js"></script>
<!-- The main application script -->
<script
	src="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/main.js"></script>
<!-- The XDomainRequest Transport is included for cross-domain file deletion for IE 8 and IE 9 -->
<!--[if (gte IE 8)&(lt IE 10)]>
<script src="../../assets/widgets/multi-upload/cors/jquery.xdr-transport.js"></script>
<![endif]-->	
	
	
<script type="text/javascript">
/* jQuery UI Accordion */

	$(function() {
		"use strict";
		$(".accordion").accordion({
			heightStyle : "content"
		});
		$('.bootstrap-datepicker').bsdatepicker({
			format : 'mm-dd-yyyy'
		});
		$('.textarea-autosize').autosize();
	});
</script>
<style>
h3:hover {
	color: #4B0082;
	cursor: pointer;
	cursor: hand;
	font-weight: bold;
}
</style>
<div class="row">
	<div class="panel">
		<div class="panel-body" style="padding-left: 0px; padding-right: 0px;">
			<h3 class="title-hero">&nbsp;&nbsp;Patient tabs</h3>
			<div class="example-box-wrapper">
				<ul class="nav-responsive nav nav-tabs" style="margin-bottom: 0px;">
					<li class="active"><a href="#tab1" data-toggle="tab" onload="alert('aaa');">Introduction</br>&nbsp;
					</a></li>
					<li><a href="#tab2" onClick="loadAllComplaintsForPatient();"
						data-toggle="tab">History</br>&nbsp;
					</a></li>
					<li><a href="#tab3" onClick="loadHomeoGeneralities();" data-toggle="tab">Homeopathic </br>Generalities
					</a></li>
					<li><a href="#tab4" onClick="loadParticularHeadtoFoot();" data-toggle="tab">Particular </br>Head to
							Foot
					</a></li>
					<li><a href="#tab5" onClick="loadExaminationOfPat();" data-toggle="tab">Examination </br>of
							Patient
					</a></li>
					<li><a href="#tab6" data-toggle="tab">Laboratory </br>Investigation
					</a></li>
					<li><a href="#tab7" onClick="loadAllProvisionalDiagnosis();"
						data-toggle="tab">Provisional </br>Diagnosis
					</a></li>
					<li><a href="#tab8" onClick="loadAllMiasmatic();" data-toggle="tab">Miasmatic </br>Diagnosis
					</a></li>
					<li><a href="#tab9" onClick="loadSelectionOfRemedy();" data-toggle="tab">Selection Of <br>Remedy</br>&nbsp;
					</a></li>
					<li><a href="#tab10" data-toggle="tab">Prescription</br>&nbsp;
					</a></li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="tab1">
						<div class="content-box">
							<div class="scrollable-content" style="height: 600px;">
								<div class="form-horizontal bordered-row">
									<form class="form-horizontal bordered-row"
										id="saveIntroPatientForm" name="saveIntroPatientForm"
										onsubmit="savePatientIntro();">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Name</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" id="name"
													name="name" required placeholder="Enter Patient's Name...">
											</div>
										</div>
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Patient's File
												Number</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" id="patfileno"
													name="patfileno"
													placeholder="Enter Patient's File Number...">
											</div>
										</div>
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Address</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" id="address"
													name="address" placeholder="Enter Patient's Address...">
											</div>
										</div>
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">PinCode</label>
											<div class="col-sm-6">
												<input type="text" pattern="\d*" maxlength="10"
													class="form-control" id="pincode" name="pincode"
													placeholder="Enter Patient's Pincode..."
													onkeypress="return isNumber(event)">
											</div>
										</div>
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Date Of Birth</label>
											<div class="col-sm-6">
												<div class="input-prepend input-group">
													<span class="add-on input-group-addon"> <i
														class="glyph-icon icon-calendar"></i>
													</span> <input type="text" id="dob" name="dob"
														class="bootstrap-datepicker form-control"
														data-date-format="mm/dd/yy"> <input type="number"
														class="form-control" id="age"
														placeholder="Enter Patient's Age In Months..."
														onfocus="ageonfocus();" onblur="ageonblur();">
												</div>
											</div>
										</div>
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Gender</label>
											<div class="col-sm-6">
												<label class="radio-inline"> <input type="radio"
													id="sex" name="sex" value="M"> Male
												</label> <label class="radio-inline"> <input type="radio"
													id="sex" name="sex" value="F"> Female
												</label> <label class="radio-inline"> <input type="radio"
													id="sex" name="sex" value="O"> Trans Gender
												</label>
											</div>
										</div>
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Religion</label>
											<div class="col-sm-6">
												<select name="religion" class="form-control">
													<option value="H">Hindu</option>
													<option value="I">Islam</option>
													<option value="C">Christan</option>
													<option value="O">Others</option>
												</select>
											</div>
										</div>
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Occupation</label>
											<div class="col-sm-6">
												<select name="occupation" id="occupation" class="form-control">
													<option value="Service">Service</option>
													<option value="Business">Business</option>
													<option value="Housewife">Housewife</option>
													<option value="Agriculture">Agriculture</option>
													<option value="Professional">Professional</option>
													<option value="Professional">Other</option>
												</select>
											</div>
										</div>
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Ref. No.</label>
											<div class="col-sm-6">
												<input type="text" class="form-control" disabled
													name="patrefnum" id="patrefnum"
													placeholder="Reference Number...">
											</div>
										</div>
										<!--<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Date of
												Admission</label>
											<div class="col-sm-6">
												<div class="input-prepend input-group">
													<span class="add-on input-group-addon"> <i
														class="glyph-icon icon-calendar"></i>
													</span> <input type="text" id="dateOfAdmission"
														name="dateOfAdmission"
														class="bootstrap-datepicker form-control"
														data-date-format="mm/dd/yy">
												</div>
											</div>
										</div>-->
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Date of
												Examination</label>
											<div class="col-sm-6">
												<div class="input-prepend input-group">
													<span class="add-on input-group-addon"> <i
														class="glyph-icon icon-calendar"></i>
													</span> <input type="text" id="dateOfExamination"
														name="dateOfExamination"
														class="bootstrap-datepicker form-control"
														data-date-format="mm/dd/yy">
												</div>
											</div>
										</div>
										<div class="bg-default text-center">
											<input type="Submit" class="btn btn-primary" value="Save"
												id="savepatpersonalbuttonid">
										</div>
										<input type="hidden" name="${_csrf.parameterName}"
											value="${_csrf.token}" />
									</form>
								</div>
							</div>
						</div>
					</div>
					<div class="tab-pane" id="tab2">


						<div class="panel">
							<div class="panel-body">
								<div class="example-box-wrapper">
									<ul
										class="list-group list-group-separator row list-group-icons"
										style="margin-bottom: 0px;">
										<li class="col-md-3 active" style="margin-bottom: 0px;"><a
											href="#tab-example-1" data-toggle="tab"
											class="list-group-item"
											style="padding-bottom: 2px; margin-bottom: 2px; margin-top: 2px; padding-top: 2px;">
												Complaints & FollowUp Sheet </a></li>
										<li class="col-md-3" style="margin-bottom: 0px;"><a
											href="#tab-example-2" data-toggle="tab"
											class="list-group-item"
											style="padding-bottom: 2px; margin-bottom: 2px; margin-top: 2px; padding-top: 2px;">
												History Of Past Illness </a></li>
										<li class="col-md-3" style="margin-bottom: 0px;"><a
											href="#tab-example-3" onClick="loadfamilyhistory();"
											data-toggle="tab" class="list-group-item"
											style="padding-bottom: 2px; margin-bottom: 2px; margin-top: 2px; padding-top: 2px;">
												Family History </a></li>
										<li class="col-md-3" style="margin-bottom: 0px;"><a
											href="#tab-example-4" data-toggle="tab"
											class="list-group-item"
											style="padding-bottom: 2px; margin-bottom: 2px; margin-top: 2px; padding-top: 2px;">
												Personal History </a></li>
									</ul>
									<div class="tab-content">
										<div class="tab-pane fade active in" id="tab-example-1">
											<div class="panel">
												<div class="panel-body">
													<h3 id="amncmplnt" class="title-hero"
														data-toggle="collapse" data-target="#demo-2"
														aria-expanded="false">Add/Modify New Complaint</h3>
													<div class="example-box-wrapper">
														<div id="demo-2" class="collapse out"
															aria-expanded="false">
															<form class="form-horizontal bordered-row"
																id="saveNewComplaintForm" name="saveNewComplaintForm">
																<div class="row">
																	<div class="col-md-4">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Complaint
																				Session Id</label>
																			<div class="col-sm-6">
																				<input type="text" name="sessionid" id="sessionid"
																					placeholder="Complaint Session Id" readonly
																					class="form-control">
																			</div>
																		</div>
																	</div>
																	<div class="col-md-4">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Status</label>
																			<div class="col-sm-6">
																				<div class="input-prepend input-group">
																					<select name="overallstatus" id="overallstatus"
																						class="form-control">
																						<option value="New">New</option>
																						<option value="UnderObservation">Under Observation</option>
																						<option value="Cured">Cured</option>
																					</select>
																				</div>
																			</div>
																		</div>
																	</div>
																	<div class="col-md-4">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Complaint
																				Since</label>
																			<div class="col-sm-6">
																				<div class="input-prepend input-group">
																					<span class="add-on input-group-addon"> <i
																						class="glyph-icon icon-calendar"></i>
																					</span> <input type="text" id="complaintsincedate"
																						name="complaintsincedate"
																						class="bootstrap-datepicker form-control"
																						data-date-format="mm/dd/yy"><input
																						type="number" class="form-control" id="cmplntFor"
																						placeholder="Enter Duration(Months)"
																						onfocus="cmplntForonfocus();"
																						onblur="cmplntForonblur();">
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-md-12">
																		<div class="form-group">
																			<label class="col-sm-1 control-label">History
																				Of Complaint</label>
																			<div class="col-sm-11">
																				<div class="input-prepend input-group">
																					<textarea name="complaintDescription"
																						id="complaintDescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-md-12">
																		<div class="form-group">
																			<label class="col-sm-1 control-label">Complaint
																				Description</label>
																			<div class="col-sm-11">
																				<div class="input-prepend input-group">
																					<textarea name="historyOfComplaint"
																						id="historyOfComplaint" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="bg-default text-center">
																	<input type="button" class="btn btn-primary"
																		value="Save" id="saveNewComplaintButtonId"
																		onclick="saveNewComplaint(this);">
																</div>
																<input type="hidden" name="${_csrf.parameterName}"
																	value="${_csrf.token}" /> <input type="hidden"
																	name="patrefnum" value="" /> <input type="hidden"
																	name="createdby" value="1234" /> <input type="hidden"
																	name="updatedby" value="1234" />
															</form>
														</div>
													</div>


													<h3 id="seecmplnt" class="title-hero"
														data-toggle="collapse" data-target="#demo-3"
														aria-expanded="false">Search-Edit Existing Complaint</h3>
													<div class="example-box-wrapper">
														<div id="demo-3" class="collapse out"
															aria-expanded="false">
															<div class="panel">
																<div class="panel-body">

																	<div id="datatable-responsive_wrapper"
																		class="dataTables_wrapper form-inline">
																		<table id="datatable-responsive"
																			class="table table-striped table-bordered responsive no-wrap dataTable dtr-inline"
																			cellspacing="0" width="100%" role="grid"
																			aria-describedby="datatable-responsive_info"
																			style="width: 100%;">
																			<thead>
																				<tr role="row">
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Name: activate to sort column ascending">Complaint
																						ID</th>
																					<th class="sorting_asc" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Position: activate to sort column ascending"
																						aria-sort="ascending">Complaint Date</th>
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Office: activate to sort column ascending">Status</th>
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Age: activate to sort column ascending">Complaint
																						Description</th>
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Age: activate to sort column ascending">History
																						Of Complaint</th>
																					<th tabindex="0" rowspan="1" colspan="1">Edit</th>
																					<th tabindex="0" rowspan="1" colspan="1">FollowUp</th>
																				</tr>
																			</thead>
																			<tfoot>
																				<tr>
																					<th rowspan="1" colspan="1">Complaint ID</th>
																					<th rowspan="1" colspan="1">Complaint Date</th>
																					<th rowspan="1" colspan="1">Status</th>
																					<th rowspan="1" colspan="1">Complaint
																						Description</th>
																					<th rowspan="1" colspan="1">History Of
																						Complaint</th>
																					<th rowspan="1" colspan="1">Edit</th>
																					<th rowspan="1" colspan="1">FollowUp</th>
																				</tr>
																			</tfoot>
																		</table>
																	</div>
																</div>
															</div>

														</div>
													</div>





													<h3 id="amnfllwp" class="title-hero" data-toggle="collapse"
														data-target="#demo-4" aria-expanded="false">Add/Modify
														New FollowUp Of a Complaint</h3>
													<div class="example-box-wrapper">
														<div id="demo-4" class="collapse out"
															aria-expanded="false">
															<form class="form-horizontal bordered-row"
																id="saveNewFollowUpForm" name="saveNewFollowUpForm">
																<div class="row">
																	<div class="col-md-6">
																		<div class="form-group">
																			<label class="col-sm-2 control-label">FollowUp
																				Id</label>
																			<div class="col-sm-6">
																				<input type="text" name="complaintFollowupDtlsId"
																					id="complaintFollowupDtlsId"
																					placeholder="Complaint FollowUp Id" readonly
																					class="form-control">
																			</div>
																		</div>
																	</div>
																	<div class="col-md-6">
																		<div class="form-group">
																			<label class="col-sm-2 control-label">Visit
																				Date</label>
																			<div class="col-sm-6">
																				<div class="input-prepend input-group">
																					<span class="add-on input-group-addon"> <i
																						class="glyph-icon icon-calendar"></i>
																					</span> <input type="text" id="visitdate" name="visitdate"
																						class="bootstrap-datepicker form-control"
																						data-date-format="mm/dd/yy">
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-md-12">
																		<div class="form-group">
																			<label class="col-sm-1 control-label">Treatment</label>
																			<div class="col-sm-11">
																				<div class="input-prepend input-group">
																					<textarea name="treatment" id="treatment" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-md-12">
																		<div class="form-group">
																			<label class="col-sm-1 control-label">Remarks
																				Description</label>
																			<div class="col-sm-11">
																				<div class="input-prepend input-group">
																					<textarea name="remarks" id="remarks" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="bg-default text-center">
																	<input type="button" class="btn btn-primary"
																		value="Save" id="saveNewComplaintFllupButtonId"
																		onclick="saveNewComplaintFollowup(this);">
																</div>
																<input type="hidden" name="${_csrf.parameterName}"
																	value="${_csrf.token}" /> <input type="hidden"
																	name="patrefnum" value="" /><input type="hidden"
																	name="sessionid" value="" /> <input type="hidden"
																	name="createdby" value="1234" /> <input type="hidden"
																	name="updatedby" value="1234" />
															</form>
														</div>
													</div>


													<h3 id="seefllwp" class="title-hero" data-toggle="collapse"
														data-target="#demo-5" aria-expanded="false">Search-Edit
														Existing FollowUp</h3>
													<div class="example-box-wrapper">
														<div id="demo-5" class="collapse out"
															aria-expanded="false">
															<div class="panel">
																<div class="panel-body">

																	<div id="datatable-responsive_wrapper1"
																		class="dataTables_wrapper form-inline">
																		<table id="datatable-responsive1"
																			class="table table-striped table-bordered responsive no-wrap dataTable dtr-inline"
																			cellspacing="0" width="100%" role="grid"
																			aria-describedby="datatable-responsive_info"
																			style="width: 100%;">
																			<thead>
																				<tr role="row">
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Name: activate to sort column ascending">FollowUp
																						ID</th>
																					<th class="sorting_asc" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Position: activate to sort column ascending"
																						aria-sort="ascending">Visit Date</th>
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Age: activate to sort column ascending">Treatment</th>
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable-responsive" rowspan="1"
																						colspan="1"
																						aria-label="Age: activate to sort column ascending">Remarks</th>
																					<th tabindex="0" rowspan="1" colspan="1">Edit</th>
																				</tr>
																			</thead>
																			<tfoot>
																				<tr>
																					<th rowspan="1" colspan="1">FollowUp ID</th>
																					<th rowspan="1" colspan="1">Visit Date</th>
																					<th rowspan="1" colspan="1">Treatment</th>
																					<th rowspan="1" colspan="1">Remarks</th>
																					<th rowspan="1" colspan="1">Edit</th>
																				</tr>
																			</tfoot>
																		</table>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
										<!-- History of Past Illness Start-->
										<div class="tab-pane fade" id="tab-example-2">
											<div class="panel">
												<div class="panel-body">
													<form class="form-horizontal bordered-row"
														id="saveHistoryOfPastIllnessForm" name="saveHistoryOfPastIllnessForm">
														<h3 id="hstryOfPastIllness" class="title-hero"
															data-toggle="collapse"
															data-target="#demo-2hstryOfPastIllness" aria-expanded="false">Intra Uterine Life</h3>
														<div class="example-box-wrapper">
															<div id="demo-2hstryOfPastIllness" class="collapse out"
																aria-expanded="false">
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Vomiting Throughout the Pregnancy 
																			</label>
																			<div class="col-sm-8">	
																				<input type="text" class="form-control"
																					id="vomitingmonths" name="vomitingmonths"
																					placeholder="Enter Month's">
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Vomiting Severity</label>
																			<div class="col-sm-8">
																				<select id="vomitingseverity" name="vomitingseverity" 
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="high">High</option>
																					<option value="moderate">Moderate</option>
																					<option value="severe">Severe</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Movement of Foetus</label>
																			<div class="col-sm-8">
																				<select id="movementoffoetus" name="movementoffoetus" 
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="normal">Normal</option>
																					<option value="less">Less</option>
																					<option value="excessive">Excessive</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Thyroid</label>
																			<div class="col-sm-8">
																				<select id="thyroid" name="thyroid"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="hypo">Hypo</option>
																					<option value="hyper">Hyper</option>
																					<option value="no">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Hypertension</label>
																			<div class="col-sm-8">
																				<select id="hypertension" name="hypertension"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Asthma</label>
																			<div class="col-sm-8">
																				<select id="asthma" name="asthma"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Any Skin Disease</label>
																			<div class="col-sm-8">
																				<select id="anyskindisease" name="anyskindisease"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																	<div class="form-group" >
																			<label class="col-sm-3 control-label">Description</label>
																			<div class="col-sm-8">
																				<div class="input-prepend input-group">
																					<textarea name="skindiseasedescription"
																						id="skindiseasedescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Any Mental Grief/Shock</label>
																			<div class="col-sm-8">
																				<select id="anymentalgrieforshock" name="anymentalgrieforshock"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group" >
																			<label class="col-sm-3 control-label">Description</label>
																			<div class="col-sm-8">
																				<div class="input-prepend input-group">
																					<textarea name="mentalgriefshockdescription"
																						id="mentalgriefshockdescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																	</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Any injury/accident</label>
																			<div class="col-sm-8">
																				<select id="anyinjuryoraccident" name="anyinjuryoraccident" 
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																	<div class="form-group" >
																			<label class="col-sm-3 control-label">Description</label>
																			<div class="col-sm-8">
																				<div class="input-prepend input-group">
																					<textarea name="injuryaccidentdescription"
																						id="injuryaccidentdescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																		</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Any operation</label>
																			<div class="col-sm-8">
																				<select id="anyoperation" name="anyoperation"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group" >
																			<label class="col-sm-3 control-label">Description</label>
																			<div class="col-sm-8">
																				<div class="input-prepend input-group">
																					<textarea name="anyoperationdescription"
																						id="anyoperationdescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																		</div>
																	</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Venereal Disease</label>
																			<div class="col-sm-8">
																				<select id="venerealdisease" name="venerealdisease"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																	<div class="form-group" >
																			<label class="col-sm-3 control-label">Description</label>
																			<div class="col-sm-8">
																				<div class="input-prepend input-group">
																					<textarea name="venerealdiseasedescription"
																						id="venerealdiseasedescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Diabetes mellitus</label>
																			<div class="col-sm-8">
																				<select id="diabetesmellitus" name="diabetesmellitus"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>




													<h3 id="hstryOfPastIllnessOtherDiease" class="title-hero"
															data-toggle="collapse"
															data-target="#demo-3hstryOfPastIllnessOtherDiease">Any Other Diseases</h3>
														<div class="example-box-wrapper">
															<div id="demo-3hstryOfPastIllnessOtherDiease" class="collapse in"
																aria-expanded="false">
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Birth History
																			</label>
																			<div class="col-sm-8">
																				<select name="birthhistory"
																					id="birthhistory"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Normal delivery">Normal delivery</option>
																					<option value="Caesarean section">Caesarean section</option>
																					<option value="Forceps delivery">Forceps delivery</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Birth
																				Weight</label>
																			<div class="col-sm-8">
																				<select name="birthweight"
																					id="birthweight"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Low">Low</option>
																					<option value="Normal">Normal</option>
																					<option value="Over Weight">Over Weight</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Birth Rash</label>
																			<div class="col-sm-8">
																				<select name="birthrash"
																					id="birthrash"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group" >
																			<label class="col-sm-3 control-label">Description</label>
																			<div class="col-sm-8">
																				<div class="input-prepend input-group">
																					<textarea name="birthrashdescription"
																						id="birthrashdescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Vaccination</label>
																			<div class="col-sm-8">
																				<select name="vaccination"
																					id="vaccination"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Description</label>
																			<div class="col-sm-8">
																				<div class="input-prepend input-group">
																					<textarea name="vaccinationdescription"
																						id="vaccinationdescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Teeth Milestone</label>
																			<div class="col-sm-8">
																				<select name="teethmilestone"
																					id="teethmilestone"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Normal</option>
																					<option value="No">Delay</option>
																					<option value="No">Early</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Walk Milestone</label>
																			<div class="col-sm-8">
																				<select name="walkmilestone"
																					id="walkmilestone"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Normal</option>
																					<option value="No">Delay</option>
																					<option value="No">Early</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Talk Milestone</label>
																			<div class="col-sm-8">
																				<select name="talkmilestone"
																					id="talkmilestone"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Normal</option>
																					<option value="No">Delay</option>
																					<option value="No">Early</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Any green stool during dentition</label>
																			<div class="col-sm-8">
																				<select name="greenstoolduringdentation"
																					id="greenstoolduringdentation"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="" selected>Click to see ...</option>
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Description</label>
																			<div class="col-sm-8">
																				<div class="input-prepend input-group">
																					<textarea name="stooldescription"
																						id="stooldescription" rows="3"
																						placeholder="Required Field" required
																						class="form-control textarea-autosize"
																						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Other Diseases</label>
																			<div class="col-sm-8">
																				<select name="otherdiseaseslist" id="otherdiseaseslist" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option value="Tuberculosis">Tuberculosis</option>
																						<option value="Typhoid">Typhoid</option>
																						<option value="Malaria">Malaria</option>
																						<option value="Dengu">Dengu</option>
																						<option value="Rheumatic fever">Rheumatic fever</option>
																						<option value="Measles">Measles</option>
																						<option value="Jaundice">Jaundice</option>
																						<option value="Mumps">Mumps</option>
																						<option value="Ch. Pox">Ch. Pox</option>
																						<option value="Diptheria">Diptheria</option>
																						<option value="Diarrhoea">Diarrhoea</option>
																						<option value="Tumours">Tumours</option>
																						<option value="Warts Removed">Warts Removed</option>
																						<option value="UTI">UTI</option>
																						<option value="Head injury">Head injury</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														
														<div class="bg-default text-center">
															<input type="button" class="btn btn-primary" value="Save"
																id="saveHistoryOfPastIllnessButtonId"
																onclick="saveHistoryOfPastIllness(this);">
														</div>
														<input type="hidden" name="${_csrf.parameterName}"
															value="${_csrf.token}" /> <input type="hidden"
															name="patrefnum" value="" /> <input type="hidden"
															name="createdby" value="1234" /> <input type="hidden"
															name="updatedby" value="1234" />
													</form>
												</div>
											</div>
										</div>
										<!-- History of Past Illness End-->

										<!-- Family History Start-->
										<div class="tab-pane fade" id="tab-example-3">
											<div class="panel">
												<div class="panel-body">
													<form class="form-horizontal bordered-row"
														id="saveFamilyHistoryForm" name="saveFamilyHistoryForm">
														<h3 id="fmlyptrnlhstry" class="title-hero"
															data-toggle="collapse"
															data-target="#demo-2fmlyptrnlhstry" aria-expanded="false">Paternal
															Side</h3>
														<div class="example-box-wrapper">
															<div id="demo-2fmlyptrnlhstry" class="collapse out"
																aria-expanded="false">
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Father
																			</label>
																			<div class="col-sm-8">
																				<select name="fmlyhstryfthr" id="fmlyhstryfthr"
																					multiple data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Grand
																				Father </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Grand
																				Mother </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Paternal
																				Uncle </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Paternal
																				Aunt </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														<h3 id="fmlymtrnlhstry" class="title-hero"
															data-toggle="collapse"
															data-target="#demo-2fmlymtrnlhstry" aria-expanded="false">Maternal
															Side</h3>
														<div class="example-box-wrapper">
															<div id="demo-2fmlymtrnlhstry" class="collapse out"
																aria-expanded="false">
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Mother
																			</label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																					<optgroup label="Option group 2">
																						<option>Option 5</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Grand
																				Father </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Grand
																				Mother </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Maternal
																				Uncle </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Maternal
																				Aunt </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														<h3 id="fmlyownhstry" class="title-hero"
															data-toggle="collapse" data-target="#demo-2fmlyownhstry"
															aria-expanded="false">Own Side</h3>
														<div class="example-box-wrapper">
															<div id="demo-2fmlyownhstry" class="collapse out"
																aria-expanded="false">
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Wife </label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																					<optgroup label="Option group 2">
																						<option>Option 5</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Husband
																			</label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Children
																			</label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														<h3 id="fmlyothrshstry" class="title-hero"
															data-toggle="collapse"
															data-target="#demo-2fmlyothrshstry" aria-expanded="false">Others</h3>
														<div class="example-box-wrapper">
															<div id="demo-2fmlyothrshstry" class="collapse out"
																aria-expanded="false">
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Brothers
																			</label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																					<optgroup label="Option group 2">
																						<option>Option 5</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Sisters
																			</label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Others
																			</label>
																			<div class="col-sm-8">
																				<select name="" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option>Option 1</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														<div class="bg-default text-center">
															<input type="button" class="btn btn-primary" value="Save"
																id="saveNewComplaintButtonId"
																onclick="saveNewComplaint(this);">
														</div>
														<input type="hidden" name="${_csrf.parameterName}"
															value="${_csrf.token}" /> <input type="hidden"
															name="patrefnum" value="" /> <input type="hidden"
															name="createdby" value="1234" /> <input type="hidden"
															name="updatedby" value="1234" />
													</form>
												</div>
											</div>
										</div>
										<!-- Family History End-->


										<!-- Personal History Start-->
										<div class="tab-pane fade" id="tab-example-4">
											<div class="panel">
												<div class="panel-body">
													<form class="form-horizontal bordered-row"
														id="savePersonalHistoryForm"
														name="savePersonalHistoryForm">
														<h3 id="prsnlintrohstry" class="title-hero"
															data-toggle="collapse"
															data-target="#demo-2prsnlintrohstry"
															aria-expanded="false">Introduction</h3>
														<div class="example-box-wrapper">
															<div id="demo-2prsnlintrohstry" class="collapse out"
																aria-expanded="false">
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Addiction</label>
																			<div class="col-sm-8">
																				<select name="addiction" id="addiction" multiple
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Tobacco">Tobacco</option>
																					<option value="Smoking">Smoking</option>
																					<option value="Drinking Alcohol">Drinking Alcohol</option>
																					<option value="Tea">Tea</option>
																					<option value="Cofee">Cofee</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Accommodation</label>
																			<div class="col-sm-8">
																				<select name="accommodation" id="accommodation"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Well Ventilated Room">Well Ventilated Room</option>
																					<option value="Damp Room">Damp Room</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Occupation</label>
																			<div class="col-sm-8">
																				<input type="text" class="form-control"
																					id="occupation" name="occupation"
																					placeholder="Enter Patient's Occupation">
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Diet</label>
																			<div class="col-sm-8">
																				<select name="diet" id="diet"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option id="Regular">Regular</option>
																						<option id="Irregular">Irregular</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Habits-Hobbies</label>
																			<div class="col-sm-8">
																				<textarea name="habithobbies" id="habithobbies"
																					rows="3" placeholder="Required Field" required
																					class="form-control textarea-autosize"
																					style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Marital
																				Status</label>
																			<div class="col-sm-8">
																				<select name="maritalstatus" id="maritalstatus"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option id="Single">Single</option>
																					<option id="Married">Married</option>
																					<option id="Widow">Widow</option>
																					<option id="Divorced">Divorced</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														<h3 id="prsnlsxlhstry" class="title-hero"
															data-toggle="collapse" data-target="#demo-2prsnlsxlhstry"
															aria-expanded="false">Sexual History Male Patient</h3>
														<div class="example-box-wrapper">
															<div id="demo-2prsnlsxlhstry" class="collapse out"
																aria-expanded="false">
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Sexual
																				Contact </label>
																			<div class="col-sm-8">
																				<select name="sexcontact" id="sexcontact"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Polygamy">Polygamy</option>
																					<option value="Monogamy">Monogamy</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Is
																				Satisfied</label>
																			<div class="col-sm-8">
																				<select name="issatisfied" id="issatisfied"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Sexual
																				Desire</label>
																			<div class="col-sm-8">
																				<select name="sexdesire" id="sexdesire"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Normal">Normal</option>
																					<option value="Excess">Excess</option>
																					<option value="Less">Less</option>
																					<option value="Suppressed">Suppressed</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Ejaculation</label>
																			<div class="col-sm-8">
																				<select name="ejaculation" id="ejaculation"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Premature">Premature</option>
																					<option value="Normal">Normal</option>
																					<option value="Too Late">Too Late</option>
																					<option value="No Emission">No Emission</option>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Erection</label>
																			<div class="col-sm-8">
																				<select name="erection" id="erection"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<optgroup label="Option group 1">
																						<option value="Normal">Normal</option>
																						<option value="Poor">Poor</option>
																					</optgroup>
																				</select>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Any
																				ulceration over glance penis</label>
																			<div class="col-sm-8">
																				<select name="ulceration" id="ulceration"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Any
																				ulceration over glance penis description</label>
																			<div class="col-sm-8">
																				<textarea name="ulcerationdesc" id="ulcerationdesc"
																					rows="3" placeholder="Required Field" required
																					class="form-control textarea-autosize"
																					style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Discharge
																				of pus from penis</label>
																			<div class="col-sm-8">
																				<select name="dischargepuspenis"
																					id="dischargepuspenis"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Discharge
																				of pus from penis Description</label>
																			<div class="col-sm-8">
																				<textarea name="dischargepuspenisdesc"
																					id="dischargepuspenisdesc" rows="3"
																					placeholder="Required Field" required
																					class="form-control textarea-autosize"
																					style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Itching
																				eruption in vagina</label>
																			<div class="col-sm-8">
																				<select name="itchingeruptioninvagina"
																					id="itchingeruptioninvagina"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Itching
																				eruption in vagina Description</label>
																			<div class="col-sm-8">
																				<textarea name="itchingeruptioninvaginadesc"
																					id="itchingeruptioninvaginadesc" rows="3"
																					placeholder="Required Field" required
																					class="form-control textarea-autosize"
																					style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Dysperunia</label>
																			<div class="col-sm-8">
																				<select name="dysperunia" id="dysperunia"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Dysperunia
																				Description</label>
																			<div class="col-sm-8">
																				<textarea name="dysperuniadesc" id="dysperuniadesc"
																					rows="3" placeholder="Required Field" required
																					class="form-control textarea-autosize"
																					style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Dryness
																				of vagina</label>
																			<div class="col-sm-8">
																				<select name="drynessofvagina" id="drynessofvagina"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Dryness
																				of vagina Description</label>
																			<div class="col-sm-8">
																				<textarea name="drynessofvaginadesc"
																					id="drynessofvaginadesc" rows="3"
																					placeholder="Required Field" required
																					class="form-control textarea-autosize"
																					style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Honeymoon
																				cystitis</label>
																			<div class="col-sm-8">
																				<select name="honeymooncystitis"
																					id="honeymooncystitis"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Honeymoon
																				cystitis Description</label>
																			<div class="col-sm-8">
																				<textarea name="honeymooncystitisdesc"
																					id="honeymooncystitisdesc" rows="3"
																					placeholder="Required Field" required
																					class="form-control textarea-autosize"
																					style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Abnormal
																				discharge from vagina</label>
																			<div class="col-sm-8">
																				<select name="abnormaldischargefromvagina"
																					id="abnormaldischargefromvagina"
																					data-placeholder="Click to see ..."
																					class="chosen-select" style="display: none;">
																					<option value="Yes">Yes</option>
																					<option value="No">No</option>
																				</select>
																			</div>
																		</div>
																	</div>
																	<div class="col-sm-6">
																		<div class="form-group">
																			<label class="col-sm-3 control-label">Abnormal
																				discharge from vagina Description</label>
																			<div class="col-sm-8">
																				<textarea name="abnormaldischargefromvaginadesc"
																					id="abnormaldischargefromvaginadesc" rows="3"
																					placeholder="Required Field" required
																					class="form-control textarea-autosize"
																					style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>

														<div class="bg-default text-center">
															<input type="button" class="btn btn-primary" value="Save"
																id="saveNewComplaintButtonId"
																onclick="savePersonalHistory(this);">
														</div>
														<input type="hidden" name="${_csrf.parameterName}"
															value="${_csrf.token}" /> <input type="hidden"
															name="patrefnum" value="" /> <input type="hidden"
															name="createdby" value="1234" /> <input type="hidden"
															name="updatedby" value="1234" />
													</form>
												</div>
											</div>
										</div>
										<!-- Personal History End-->




									</div>
								</div>
							</div>
						</div>
					</div>
										
					<!-- Homeopathic Generalities starts-->
					<div class="tab-pane" id="tab3">
						<form class="form-horizontal bordered-row" id="homeopathyGenForm"
										name="homeopathyGenForm" onsubmit="saveHomeopathyGen();">
							
							<!-- DESIRE PPPPP-->
							
							<div class="row">
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Desire 1</label>
									<div class="col-sm-8">
									<select name="desire1" id="desire1"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Meat">Meat</option>
										<option value="Egg-Fried">Egg-Fried</option>
										<option value="Egg-Boiled">Egg-Boiled</option>
										<option value="Fish">Fish</option>
										<option value="Veg">Veg</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Desire Taste</label>
									<div class="col-sm-8">
									<select name="desireTaste" id="desireTaste"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Sour">Sour</option>
										<option value="Pepper">Pepper</option>
										<option value="Sweet">Sweet</option>
										<option value="Salty">Salty</option>
										<option value="Bitter">Bitter</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Desire 2</label>
									<div class="col-sm-8">
									<select name="desire2" id="desire2"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Rice">Rice</option>
										<option value="Bread">Bread</option>
									</select>
								</div>
								</div>
							</div>
							
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Desire 3</label>
									<div class="col-sm-8">
									<select name="desire3" id="desire3"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Hot Food">Hot Food</option>
										<option value="LeakWark">LeakWark</option>
										<option value="Cold Food">Cold Food</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Extra Salt</label>
									<div class="col-sm-8">
									<select name="extraSalt" id="extraSalt"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Milk</label>
									<div class="col-sm-8">
									<select name="milk" id="milk"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Ice Cream</label>
									<div class="col-sm-8">
									<select name="iceCream" id="iceCream"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Cold Drink</label>
									<div class="col-sm-8">
									<select name="coldDrink" id="coldDrink"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Chocolate</label>
									<div class="col-sm-8">
									<select name="chocolate" id="chocolate"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Fatty Food</label>
									<div class="col-sm-8">
									<select name="fattyfood" id="fattyfood"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>
								</div>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Indigestable thing</label>
									<div class="col-sm-8">
									<select name="indigestableThing" id="indigestableThing"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="" selected>Click to see ...</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>
								</div>
								</div>
							</div>
							</div>
							<hr>
							
							<div class="row">
							<div class="col-sm-6">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Aversion</label>
									<div class="col-sm-8">
										<textarea name="aversion" id="aversion"
										rows="3" placeholder="Aversion" 
										class="form-control textarea-autosize"
										style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
									</div>
								</div>
							</div>
							
							<div class="col-sm-6">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Intolerance</label>
									<div class="col-sm-8">
										<textarea name="intolerance" id="intolerance"
										rows="3" placeholder="Required Field" 
										class="form-control textarea-autosize"
										style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
									</div>
								</div>
							</div>
							</div>
							<hr>
							
							<div class="row">
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Appetite</label>
										<div class="col-sm-8">
										<select name="appetite" id="appetite"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">	
											<option value="" selected>Click to see ...</option>
											<option value="Good">Good</option>
											<option value="Excessive">Excessive</option>
											<option value="Less">Less</option>
										</select>
									</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Appetite Tolerance</label>
										<div class="col-sm-8">
										<select name="appetiteTolerance" id="appetiteTolerance"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">
											<option value="" selected>Click to see ...</option>
											<option value="Can Tolerate">Can Tolerate</option>
											<option value="Can not Tolerate">Can not Tolerate</option>
										</select>
									</div>
									</div>
								</div>
							</div>
							
							<hr>
							<div class="row">
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Reaction to heat and cold</label>
										<div class="col-sm-8">
										<select name="reactiontoheatncold" id="reactiontoheatncold"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">	
											<option value="" selected>Click to see ...</option>
											<option value="Hot">Hot</option>
											<option value="Chilly">Chilly</option>
											<option value="Ampithermal">Ampithermal</option>
										</select>
									</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Worse Weather Reaction</label>
										<div class="col-sm-8">
										<select name="worseweatherreaction" id="worseweatherreaction"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">
											<option value="" selected>Click to see ...</option>
											<option value="Wet weather">Wet weather</option>
											<option value="Winter">Winter</option>
											<option value="Summer">Summer</option>
										</select>
									</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Better Weather Reaction</label>
										<div class="col-sm-8">
										<select name="betterweatherreaction" id="betterweatherreaction"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">
											<option value="" selected>Click to see ...</option>
											<option value="Wet weather">Wet weather</option>
											<option value="Winter">Winter</option>
											<option value="Summer">Summer</option>
										</select>
									</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Hyper Susceptibility</label>
										<div class="col-sm-8">
										<select name="hypersusceptibility" id="hypersusceptibility"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">	
											<option value="" selected>Click to see ...</option>
										</select>
										</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Thirst</label>
										<div class="col-sm-8">
										<select name="thirst" id="thirst"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">
											<option value="" selected>Click to see ...</option>
											<option value="Excessive">Excessive</option>
											<option value="Good">Good</option>
											<option value="Less">Less</option>
										</select>
									</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Preferred Water</label>
										<div class="col-sm-8">
										<select name="preferredwater" id="preferredwater"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">	
											<option value="" selected>Click to see ...</option>
											<option value="Chilled">Chilled</option>
											<option value="Cold">Cold</option>
											<option value="Normal Water">Normal Water</option>
										</select>
									</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Sleep</label>
										<div class="col-sm-8">
										<select name="sleep" id="sleep"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">
											<option value="" selected>Click to see ...</option>
											<option value="Good">Good</option>
											<option value="Disturbed">Disturbed</option>
											<option value="Less">Less</option>
										</select>
									</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Position of Sleep</label>
										<div class="col-sm-8">
										<select name="positionofsleep" id="positionofsleep"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">	
											<option value="" selected>Click to see ...</option>
											<option value="On Back">On Back</option>
											<option value="Left Side">Left Side</option>
											<option value="Right Side">Right Side</option>
											<option value="On Abdomen">On Abdomen</option>
											<option value="Sretching Limbs">Sretching Limbs</option>
											
										</select>
									</div>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Dream</label>
										<div class="col-sm-8">
										<select name="dream" id="dream"
											data-placeholder="Click to see ..." class="chosen-select"
											style="display: none;">
											<option value="" selected>Click to see ...</option>
											<option value="Of Falling">Of Falling</option>
											<option value="Snake">Snake</option>
											<option value="Death Persons">Death Persons</option>
											<option value="Sexual Dreams">Sexual Dreams</option>
											<option value="Religious">Religious</option>
											<option value="Ghosts">Ghosts</option>
											<option value="Dreams Exactly Happens In Real Life">Dreams Exactly Happens In Real Life</option>
											<option value="Fear">Fear</option>
										</select>
									</div>
									</div>
								</div>	
							</div>
										
							<hr>
							
							
							<h3 id="homeopathicgeneralitiesstool" class="title-hero"
											data-toggle="collapse"
											data-target="#demo-2stool" aria-expanded="false">Stool</h3>
							<div class="example-box-wrapper">
								<div id="demo-2stool" class="collapse out"
									aria-expanded="false">

								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Consistency</label>
											<div class="col-sm-8">
												<select name="stoolconsistency"
													id="stoolconsistency"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Hard">Hard</option>
													<option value="Semi Solid 	">Semi Solid</option>
													<option value="Soft">Soft</option>
													<option value="Liquid">Liquid</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Tolerance</label>
											<div class="col-sm-8">
												<select name="stooltolerance"
													id="stooltolerance"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Can Hold">Can Hold</option>
													<option value="Can't Hold">Can't Hold</option>
												</select>
											</div>
										</div>
									</div>
								</div>

							<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Ineffectual Urging</label>
											<div class="col-sm-8">
												<select name="stoolineffectualurging"
													id="stoolineffectualurging"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Yes">Yes</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Mucous</label>
											<div class="col-sm-8">
												<select name="stoolmucous"
													id="stoolmucous"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Can Hold">Can Hold</option>
													<option value="Can't Hold">Can't Hold</option>
												</select>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Bleeding comes with stool</label>
											<div class="col-sm-8">
												<select name="stoolbleeding"
													id="stoolbleeding"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Hard">Hard</option>
													<option value="Soft">Soft</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Regularity</label>
											<div class="col-sm-8">
												<select name="stoolregularity"
													id="stoolregularity"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Regular">Regular</option>
													<option value="Irregular">Irregular</option>
												</select>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Pain</label>
											<div class="col-sm-8">
												<select name="stoolpain"
													id="stoolpain"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="No">No</option>
													<option value="Before">Before</option>
													<option value="During">During</option>
													<option value="After">After</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Colour</label>
											<div class="col-sm-8">
												<select name="stoolcolour"
													id="stoolcolour"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Normal">Normal</option>
													<option value="Clay">Clay</option>
													<option value="White">White</option>
													<option value="Blackish">Blackish</option>
													<option value="Green">Green</option>
												</select>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Offensiveness</label>
											<div class="col-sm-8">
												<select name="stooloffensiveness"
													id="stooloffensiveness"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Yes">Yes</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Satisfaction</label>
											<div class="col-sm-8">
												<select name="stoolsatisfaction"
													id="stoolsatisfaction"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Yes">Yes</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Frequency</label>
											<div class="col-sm-8">
												<select name="stoolfrequency"
													id="stoolfrequency"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Once">Once</option>
													<option value="Twice">Twice</option>
													<option value="More than that">More than that</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Timing</label>
											<div class="col-sm-8">
												<select name="stooltiming"
													id="stooltiming"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Early Morning">Early Morning</option>
													<option value="After Breakfast">After Breakfast</option>
													<option value="After Meal">After Meal</option>
												</select>
											</div>
										</div>
									</div>
								</div>

								</div>
							</div>

							
							<h3 id="homeopathicgeneralitiesurine" class="title-hero"
								data-toggle="collapse"
								data-target="#demo-3urine">Urine</h3>
							<div class="example-box-wrapper">
								<div id="demo-3urine" class="collapse out"
									aria-expanded="false">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Frequency</label>
											<div class="col-sm-8">
												<select name="urinefrequency"
													id="urinefrequency"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Normal">Normal</option>
													<option value="Frequent-Night">Frequent-Night</option>
													<option value="Frequent-Day">Frequent-Day</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Burning Urination</label>
											<div class="col-sm-8">
												<select name="burningurination"
													id="burningurination"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="No">No</option>
													<option value="Before">Before</option>
													<option value="Doing">Doing</option>
													<option value="After">After</option>
												</select>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Urine Tolerance</label>
											<div class="col-sm-8">
												<select name="urinetolerance"
													id="urinetolerance"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Can Tolerate">Can Tolerate</option>
													<option value="Can't Tolerate">Can't Tolerate</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Stream</label>
											<div class="col-sm-8">
												<select name="urinestream"
													id="urinestream"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Single">Single</option>
													<option value="Bifercated">Bifercated</option>
												</select>
											</div>
										</div>
									</div>
								</div>


								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Flow</label>
											<div class="col-sm-8">
												<select name="urineflow"
													id="urineflow"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Retarted">Retarted</option>
													<option value="Dropping">Dropping</option>
													<option value="Normal">Normal</option>
													<option value="Intermitent">Intermitent</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Pain</label>
											<div class="col-sm-8">
												<select name="urinepain"
													id="urinepain"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Before">Before</option>
													<option value="Doing">Doing</option>
													<option value="After">After</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
								</div>


								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Character of pain</label>
											<div class="col-sm-8">
												<select name="urinecharacterofpain"
													id="urinefrequency"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="From forward to backward">From forward to backward</option>
													<option value="From backward to genetelia">From backward to genetelia</option>
													<option value="Loin to groin">Loin to groin</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Bleeding with urine</label>
											<div class="col-sm-8">
												<select name="urinebleeding"
													id="urinebleeding"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Yes">Yes</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Pus</label>
											<div class="col-sm-8">
												<select name="urinepus"
													id="urinepus"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Yes">Yes</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Odour</label>
											<div class="col-sm-8">
												<select name="urineodour"
													id="urineodour"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Offensive">Offensive</option>
													<option value="Normal">Normal</option>
												</select>
											</div>
										</div>
									</div>
								</div>

									
								</div>
							</div>
 
														
							<h3 id="homeopathicgeneralitiessweat" class="title-hero"
								data-toggle="collapse"
								data-target="#demo-3sweat">Sweat</h3>
								<div class="example-box-wrapper">
									<div id="demo-3sweat" class="collapse out"
										aria-expanded="false">
										<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Quantity</label>
												<div class="col-sm-8">
													<select name="sweatquantity"
														id="sweatquantity"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Profuse">Profuse</option>
														<option value="Medium">Medium</option>
														<option value="Less">Less</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Body Part</label>
												<div class="col-sm-8">
													<select name="sweatbodypart"
														id="sweatbodypart" multiple
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="Head">Head</option>
														<option value="Face">Face</option>
														<option value="Neck">Neck</option>
														<option value="Trunk">Trunk</option>
														<option value="Chest">Chest</option>
														<option value="Back">Back</option>
														<option value="Abdomen">Abdomen</option>
														<option value="Upper Limbs">Upper Limbs</option>
														<option value="Lower Limbs">Lower Limbs</option>
													</select>
												</div>
											</div>
										</div>
									</div>

								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Offensive odour</label>
											<div class="col-sm-8">
												<select name="sweatoffensiveodour"
													id="sweatoffensiveodour"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Yes">Yes</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Stain</label>
											<div class="col-sm-8">
												<select name="sweatstain"
													id="sweatstain"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Yellow">Yellow</option>
													<option value="Red">Red</option>
													<option value="White">White</option>
													<option value="Black">Black</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
								</div>

								<!--
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Weakness</label>
											<div class="col-sm-8">
												<select name="sweatweakness"
													id="sweatweakness"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Prostrated">Prostrated</option>
													<option value="Fresh">Fresh</option>
												</select>
											</div>
										</div>
									</div>
								</div>-->
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Relief</label>
											<div class="col-sm-8">
												<select name="sweatrelief"
													id="sweatrelief"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Yes">Yes</option>
													<option value="No">No</option>
												</select>
											</div>
										</div>
									</div>
								</div>
									
								</div>
							</div>

							
							<h3 id="homeopathicgeneralitiesmenstruation" class="title-hero"
								data-toggle="collapse"
								data-target="#demo-3menstruation">Menstruation</h3>
							<div class="example-box-wrapper">
								<div id="demo-3menstruation" class="collapse out"
									aria-expanded="false">

									<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Menarche</label>
												<div class="col-sm-8">
													<select name="menstruationmenarche"
														id="menstruationmenarche"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Early">Early</option>
														<option value="Normal">Normal</option>
														<option value="Late">Late</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Cycle</label>
												<div class="col-sm-8">
													<select name="menstruationcycle"
														id="menstruationcycle"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Early">Early</option>
														<option value="Normal">Normal</option>
														<option value="Late">Late</option>
													</select>
												</div>
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Frequency</label>
												<div class="col-sm-8">
													<select name="menstruationfrequency"
														id="menstruationfrequency"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Regular">Regular</option>
														<option value="Irregular">Irregular</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Duration</label>
												<div class="col-sm-8">
													<select name="menstruationduration"
														id="menstruationduration"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Normal">Normal</option>
														<option value="Less">Less</option>
														<option value="Moderate">Moderate</option>
														<option value="Excessive">Excessive</option>
													</select>
												</div>
											</div>
										</div>
									</div>


									<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Type of flow</label>
												<div class="col-sm-8">
													<select name="menstruationtypeofflow"
														id="menstruationtypeofflow"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Heavy">Heavy</option>
														<option value="Medium">Medium</option>
														<option value="Scanty">Scanty</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Pain</label>
												<div class="col-sm-8">
													<select name="menstruationpain"
														id="menstruationpain"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Yes">Yes</option>
													<option value="No">No</option>
													</select>
												</div>
											</div>
										</div>
									</div>


								<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Clot</label>
												<div class="col-sm-8">
													<select name="menstruationclot"
														id="menstruationclot"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Yes">Yes</option>
														<option value="No">No</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Clot Colour</label>
												<div class="col-sm-8">
													<select name="menstruationclotcolour"
														id="menstruationclotcolour"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Reddish">Reddish</option>
														<option value="Blackish">Blackish</option>
													</select>
												</div>
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Colour of flow</label>
												<div class="col-sm-8">
													<select name="menstruationcolourofflow"
														id="menstruationcolourofflow"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="Reddish">Reddish</option>
														<option value="Blackish">Blackish</option>
														<option value="Pale">Pale</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Odour</label>
												<div class="col-sm-8">
													<select name="menstruationodour"
														id="menstruationodour"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Offensive">Offensive</option>
													<option value="Normal">Normal</option>
													</select>
												</div>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
											<label class="col-sm-3 control-label">LMP</label>
												<div class="col-sm-8">
														<div class="input-prepend input-group">
															<span class="add-on input-group-addon"> <i
																class="glyph-icon icon-calendar"></i>
															</span> <input type="text" id="menstrucomplaintsincedate"
																name="menstrucomplaintsincedate"
																class="bootstrap-datepicker form-control"
																data-date-format="mm/dd/yy"><input
																type="number" class="form-control" id="cmplntFor"
																placeholder="Enter Duration(Months)"
																onfocus="dateInputOnFocus('menstrucomplaintsincedate','cmplntFor');"
																onblur="dateInputOnBlur('menstrucomplaintsincedate','cmplntFor');">
														</div>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Age of menopause</label>
												<div class="col-sm-8">
													<select name="menstruationagemenopause"
														id="menstruationagemenopause"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Early">Early</option>
														<option value="Normal">Normal</option>
														<option value="Late">Late</option>
													</select>
												</div>
											</div>
										</div>
									</div>


									<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Leucorrhoea</label>
												<div class="col-sm-8">
													<select name="menstruationleucorrhoea"
														id="menstruationleucorrhoea"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Yes">Yes</option>
														<option value="No">No</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Consistency</label>
												<div class="col-sm-8">
													<select name="menstruleucorrhconsistency"
														id="menstruleucorrhconsistency"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Watery">Watery</option>
													<option value="Thick Sticky">Thick Sticky</option>
													</select>
												</div>
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Colour</label>
												<div class="col-sm-8">
													<select name="menstruleucorrhcolour"
														id="menstruleucorrhcolour"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Yes">White</option>
														<option value="No">Clay</option>
														<option value="No">White of egg</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Itching</label>
												<div class="col-sm-8">
													<select name="menstruleucorrhitching"
														id="menstruleucorrhitching"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Yes">Yes</option>
														<option value="No">No</option>
													</select>
												</div>
											</div>
										</div>
									</div>


									<div class="row">
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Excoriation</label>
												<div class="col-sm-8">
													<select name="menstruleucorrhexcoriation"
														id="menstruleucorrhexcoriation"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Yes">Yes</option>
														<option value="No">No</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-sm-6">
											<div class="form-group">
												<label class="col-sm-3 control-label">Smell</label>
												<div class="col-sm-8">
													<select name="menstruleucorrhsmell"
														id="menstruleucorrhsmell"
														data-placeholder="Click to see ..."
														class="chosen-select" style="display: none;">
														<option value="" selected>Click to see ...</option>
														<option value="Fishy">Fishy</option>
														<option value="Putrid">Putrid</option>
														<option value="Offensive">Offensive</option>
													</select>
												</div>
											</div>
										</div>
									</div>	
									
									
								</div>
							</div>
							
							<h3 id="homeopathicgeneralitiesphysical" class="title-hero"
											data-toggle="collapse"
											data-target="#demo-3phygeneralities">Physical Generalities
							</h3>
							<div class="example-box-wrapper">
								<div id="demo-3phygeneralities" class="collapse out"
									aria-expanded="false">
									<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Leucorrhoea</label>
											<div class="col-sm-8">
												<select name="phygenleucorrhoea"
													id="phygenleucorrhoea"
													data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Present">Present</option>
													<option value="Absent">Absent</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label class="col-sm-3 control-label">Consistency</label>
											<div class="col-sm-8">
												<select name="phygenconsistency"
													id="phygenconsistency" data-placeholder="Click to see ..."
													class="chosen-select" style="display: none;">
													<option value="" selected>Click to see ...</option>
													<option value="Watery">Watery</option>
													<option value="Thick Sticky">Thick Sticky</option>
												</select>
											</div>
										</div>
									</div>
								</div>

							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Colour</label>
										<div class="col-sm-8">
											<select name="phygencolour"
												id="phygencolour"
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="White">White</option>
												<option value="Clay">Clay</option>
												<option value="White of Egg">White of Egg</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Any Itching</label>
										<div class="col-sm-8">
											<select name="phygenitching"
												id="phygenitching"
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Yes">Yes</option>
												<option value="No">No</option>
											</select>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Any Excoriation</label>
										<div class="col-sm-8">
											<select name="phygenexcoriation"
												id="phygenexcoriation"
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Yes">Yes</option>
												<option value="No">No</option>
											</select>
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Any Smell</label>
										<div class="col-sm-8">
											<select name="phygensmell"
												id="phygensmell"
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Yes">Yes</option>
												<option value="No">No</option>
											</select>
										</div>
									</div>
								</div>
							</div>	
							
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Alternation</label>
										<div class="col-sm-8">
											<input type="text" class="form-control"
												id="phygenalternation" name="phygenalternation"
												placeholder="Enter Alternation">
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Sides of Body</label>
										<div class="col-sm-8">
											<input type="text" class="form-control"
												id="phygensidesofbody" name="phygensidesofbody"
												placeholder="Enter Sides of Body">
										</div>
									</div>
								</div>
							</div>	
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Periodicity</label>
										<div class="col-sm-8">
											<input type="text" class="form-control"
												id="phygenperiodicity" name="phygenperiodicity"
												placeholder="Enter Periodicity">
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">General Modality</label>
										<div class="col-sm-8">
											<input type="text" class="form-control"
												id="phygengeneralmodality" name="phygengeneralmodality"
												placeholder="Enter General Modality">
										</div>
									</div>
								</div>
							</div>	
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Constitution</label>
										<div class="col-sm-8">
											<input type="text" class="form-control"
												id="phygenconstitution" name="phygenconstitution"
												placeholder="Enter Constitution">
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Other General</label>
										<div class="col-sm-8">
											<input type="text" class="form-control"
												id="phygenothergeneral" name="phygenothergeneral"
												placeholder="Enter Other General">
										</div>
									</div>
								</div>
							</div>	
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Characteristics</label>
										<div class="col-sm-8">
											<input type="text" class="form-control"
												id="phygencharacterstics" name="phygencharacterstics"
												placeholder="Enter Characteristics">
										</div>
									</div>
								</div>
							</div>	
						</div>	
					</div>
					
					<h3 id="homeopathicgeneralitiesmental" class="title-hero"
					data-toggle="collapse"
					data-target="#demo-3mentgeneralities">Mental Generalities</h3>
					<div class="example-box-wrapper">
						<div id="demo-3mentgeneralities" class="collapse out"
							aria-expanded="false">
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Company</label>
										<div class="col-sm-8">
											<select name="mengencompany"
												id="mengencompany"
												data-placeholder="Click to see ..."
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Prefers Company">Prefers Company</option>
												<option value="Wants To Be Alone">Wants To Be Alone</option>
											</select>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Grief</label>
										<div class="col-sm-8">
											<select name="mengengrief"
												id="mengengrief"
												class="chosen-select" style="display: none;">
												<option value="">Click to see ...</option>
												<option value="Yes">Yes</option>
												<option value="No">No</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Description</label>
										<div class="col-sm-8">
											<textarea name="mengengriefdesc"
											id="mengengriefdesc" rows="3"
											placeholder="Enter Grief description" 
											class="form-control textarea-autosize"
											style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
										</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Dislove</label>
										<div class="col-sm-8">
											<select name="mengendislove"
												id="mengendislove"
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Yes">Yes</option>
												<option value="No">No</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Description</label>
										<div class="col-sm-8">
											<textarea name="mengendislovedesc"
											id="mengendislovedesc" rows="3"
											placeholder="Enter Dislove description"
											class="form-control textarea-autosize"
											style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
										</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Indignation</label>
										<div class="col-sm-8">
											<select name="mengendindignation"
												id="mengendindignation"
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Yes">Yes</option>
												<option value="No">No</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Description</label>
										<div class="col-sm-8">
											<textarea name="mengendindignationdesc"
											id="mengendindignationdesc" rows="3"
											placeholder="Enter Indignation description" 
											class="form-control textarea-autosize"
											style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
										</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Consolation</label>
										<div class="col-sm-8">
											<select name="mengenconsolation"
												id="mengenconsolation"
												data-placeholder="Click to see ..."
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Aggravates">Aggravates</option>
												<option value="Ameliorates">Ameliorates</option>
											</select>
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Contradiction</label>
										<div class="col-sm-8">
											<select name="mengencontradiction"
												id="mengencontradiction"
												data-placeholder="Click to see ..."
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Can Bear">Can Bear</option>
												<option value="Can't Bear">Can't Bear</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Anger</label>
										<div class="col-sm-8">
											<select name="mengenanger"
												id="mengenanger"
												data-placeholder="Click to see ..."
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Excessive">Excessive</option>
												<option value="Less">Less</option>
											</select>
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Description</label>
										<div class="col-sm-8">
											<textarea name="mengenangerdesc"
											id="mengenangerdesc" rows="3"
											placeholder="Enter Anger description"
											class="form-control textarea-autosize"
											style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
										</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Animal</label>
										<div class="col-sm-8">
											<select name="mengenanimal"
												id="mengenanimal"
												data-placeholder="Click to see ..."
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Fond">Fond</option>
												<option value="Fear">Fear</option>
											</select>
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Fastideousness</label>
										<div class="col-sm-8">
											<select name="mengenfastideousness"
												id="mengenfastideousness"
												data-placeholder="Click to see ..."
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Yes">Yes</option>
												<option value="No">No</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Misery</label>
										<div class="col-sm-8">
											<select name="mengenmisery"
												id="mengenmisery"
												data-placeholder="Click to see ..."
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Yes">Yes</option>
												<option value="No">Fear</option>
											</select>
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Weeping Disposition</label>
										<div class="col-sm-8">
											<select name="mengenweepingdisposition"
												id="mengenweepingdisposition"
												data-placeholder="Click to see ..."
												class="chosen-select" style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="No">No</option>
												<option value="Alone">Alone</option>
												<option value="Infront of people">Infront of peopleo</option>
											</select>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
							<!------------------------------------------>
							
							<div class="row">
								<div class="bg-default text-center">
									<input type="Submit" class="btn btn-primary" value="Save"
										id="saveHomeopathyGenId">
								</div>
							</div>
							<div class="row">&nbsp;</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
							<input type="hidden" name="patrefnum" id="patrefnum" />
							
						</form>
					</div>
					<!-- Homeopathic Generalities end -->
					
					<!-- Particular starts-->
					<div class="tab-pane" id="tab4">
						<form class="form-horizontal bordered-row" id="particularForm"
										name="particularForm" onsubmit="saveParticular();">
							<div class="row">
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Vertigo</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="vertigo"
												name="vertigo"  placeholder="Enter Vertigo...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Head</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="head"
												name="head"  placeholder="Enter Patient's Name...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Eye & Vision</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="eyevision"
												name="eyevision"  placeholder="Enter Eye & Vision...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Ear & Hearing</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="earhearing"
												name="earhearing"  placeholder="Enter Ear & Hearing...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Nose & Smell</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="nosesmell"
												name="nosesmell"  placeholder="Enter Nose & Smell...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Face</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="face"
												name="face" placeholder="Enter Face...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Mouth</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="mouth"
												name="mouth"  placeholder="Enter Mouth...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Teeth</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="teeth"
												name="teeth"  placeholder="Enter Teeth...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Tongue</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="tongue"
												name="tongue" placeholder="Enter Tongue...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Throat & tonsil</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="throattonsil"
												name="throattonsil" placeholder="Enter Throat & Tonsil...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Stomach</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="stomach"
												name="stomach" placeholder="Enter Stomach...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Abdomen</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="abdomen"
												name="abdomen" placeholder="Enter Abdomen...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Bowel & Rectum</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="bowelrectum"
												name="bowelrectum" placeholder="Enter Bowel & Rectum...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Urinary Organ</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="urinaryorgan"
												name="urinaryorgan" placeholder="Enter Urinary Organ...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Genetalia</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="genetalia"
												name="genetalia" placeholder="Enter Genetalia...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Particular Male</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="particularmale"
												name="particularmale" placeholder="Enter Male...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Particular Female</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="particularfemale"
												name="particularfemale" placeholder="Enter Female...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Respiratory</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="respiratory"
												name="respiratory" placeholder="Enter Respiratory...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Chest</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="chest"
												name="chest" placeholder="Enter Chest...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Heart</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="heart"
												name="heart" placeholder="Enter Heart...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Nech/Back</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="neckback"
												name="neckback"  placeholder="Enter Nech/Back...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Extremities</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="extremities"
												name="extremities"  placeholder="Enter Extremities...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Fever</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="fever"
												name="fever"  placeholder="Enter Fever...">
										</div>
									</div>
								</div>
								
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Skin</label>
										<div class="col-sm-8">
											<input type="text" class="form-control" id="skin"
												name="skin"  placeholder="Enter Skin...">
										</div>
									</div>
								</div>
								
							</div>
							
							<div class="row">
								<div class="bg-default text-center">
									<input type="Submit" class="btn btn-primary" value="Save"
										id="saveParticularId">
								</div>
							</div>
							<div class="row">&nbsp;</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
							<input type="hidden" name="patrefnum" id="patrefnum" />
						</form>
					</div>
					<!-- Particular end -->
					
					
					<!-- EXAMINATION OF PATIENT start -->
					<div class="tab-pane" id="tab5">
					<div class="panel">
						<div class="panel-body">
						<form class="form-horizontal bordered-row"
							id="examinationofpatientForm" name="examinationofpatientForm"
							onsubmit="saveexaminationofpatientdetails();">
							<h3 id="generalsurvey" class="title-hero"
								data-toggle="collapse"
								data-target="#demo-generalsurvey" aria-expanded="false">General Survey</h3>
							<div class="example-box-wrapper">
							<div id="demo-generalsurvey" class="collapse out"
									aria-expanded="false">
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Decubitus</label>
										<div class="col-sm-8">
											<input type="text" id="decubitus"
												name="decubitus" class="form-control" placeholder="Enter Decubitus Report">
										</div>
									</div>
								</div>
							  <div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Description</label>
										<div class="col-sm-8">
											<div class="input-prepend input-group">
												<textarea name="decubitusdescription"
													id="decubitusdescription" rows="3"
													placeholder="Required Field" required
													class="form-control textarea-autosize"
													style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
											</div>
										</div>
									</div>
								</div>
							  </div>
							  <div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Facies</label>
										<div class="col-sm-8">
											<input type="text" id="facies"
												name="facies" class="form-control" placeholder="Enter Facies Report">
										</div>
									</div>
								</div>
							  <div class="col-sm-6">
									<div class="form-group">
										<label class="col-sm-3 control-label">Description</label>
										<div class="col-sm-8">
											<div class="input-prepend input-group">
												<textarea name="faciesdescription"
													id="faciesdescription" rows="3"
													placeholder="Required Field" required
													class="form-control textarea-autosize"
													style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
											</div>
										</div>
									</div>
								</div>
							  </div>
							  <div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Anaemia</label>
										<div class="col-sm-8">
											<select name="anaemia" id="anaemia"
												data-placeholder="Click to see ..." class="chosen-select"
												style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Absent">Absent</option>
												<option value="Mild">Mild</option>
												<option value="Moderate">Moderate</option>
												<option value="Severe">Severe</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Cyanosis</label>
										<div class="col-sm-8">
											<select name="cyanosis" id="cyanosis"
												data-placeholder="Click to see ..." class="chosen-select"
												style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Absent">Absent</option>
												<option value="Peripheral">Peripheral</option>
												<option value="Central">Central</option>
											</select>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Jaundice</label>
										<div class="col-sm-8">
											<select name="jaundice" id="jaundice"
												data-placeholder="Click to see ..." class="chosen-select"
												style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Absent">Absent</option>
												<option value="Present">Present</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Oedema</label>
										<div class="col-sm-8">
											<select name="oedema" id="oedema"
												data-placeholder="Click to see ..." class="chosen-select"
												style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Absent">Absent</option>
												<option value="Pitting">Pitting</option>
												<option value="Non Pitting">Non Pitting</option>
											</select>
									</div>
								</div>
							</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Clubbing</label>
										<div class="col-sm-8">
											<select name="clubbing" id="clubbing"
												data-placeholder="Click to see ..." class="chosen-select"
												style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Absent">Absent</option>
												<option value="Present">Present</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Nutrition</label>
										<div class="col-sm-8">
											<select name="nutrition" id="nutrition"
												data-placeholder="Click to see ..." class="chosen-select"
												style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Normal">Normal</option>
												<option value="Malnurished">Malnurished</option>
											</select>
									</div>
								</div>
							</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Height</label>
										<div class="col-sm-8">
											<input type="text" id="height"
												name="height" class="form-control" placeholder="Enter Height Report">
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Weight</label>
										<div class="col-sm-8">
											<input type="text" id="weight"
												name="weight" class="form-control" placeholder="Enter Weight Report">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Built</label>
										<div class="col-sm-8">
											<input type="text" id="built"
												name="built" class="form-control" placeholder="Enter Built Report">
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Pulse</label>
										<div class="col-sm-8">
											<input type="text" id="pulse"
												name="pulse" class="form-control" placeholder="Enter Pulse Report">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">B.P</label>
										<div class="col-sm-8">
											<input type="text" id="bp"
												name="bp" class="form-control" placeholder="Enter B.P Report">
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Respiration</label>
										<div class="col-sm-8">
											<input type="text" id="respiration"
												name="respiration" class="form-control" placeholder="Enter Respiration Report">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Neck Vein</label>
										<div class="col-sm-8">
											<select name="neckvein" id="neckvein"
												data-placeholder="Click to see ..." class="chosen-select"
												style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Engorged">Engorged</option>
												<option value="Non Engorged">Non Engorged</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Neck Gland</label>
										<div class="col-sm-8">
											<select name="neckgland" id="neckgland"
												data-placeholder="Click to see ..." class="chosen-select"
												style="display: none;">
												<option value="" selected>Click to see ...</option>
												<option value="Palpable">Palpable</option>
												<option value="Non  Palpable">Non  Palpable</option>
											</select>
									</div>
								</div>
							</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Temperature</label>
										<div class="col-sm-8">
											<input type="text" id="temperature"
												name="temperature" class="form-control" placeholder="Enter Temperature Report">
										</div>
									</div>
								</div>
							</div>
							</div>
							</div>
						</div>


						<div class="row">&nbsp;</div>
						<h3 id="generalsurvey" class="title-hero"
								data-toggle="collapse"
								data-target="#demo-systematicexamination" aria-expanded="false">Systematic Examination</h3>
							<div class="example-box-wrapper">
								<div id="demo-systematicexamination" class="collapse out"
									aria-expanded="false">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Respiratory System Inspection</label>
											<div class="col-sm-8">
												<input type="text" id="respiratorysysteminspection"
													name="respiratorysysteminspection" class="form-control" placeholder="Enter Respiratory System Inspection">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Respiratory System Palpitation</label>
											<div class="col-sm-8">
												<input type="text" id="respiratorysystempalpitation"
													name="respiratorysystempalpitation" class="form-control" placeholder="Enter Respiratory System Palpitation">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Respiratory System Percussion</label>
											<div class="col-sm-8">
												<input type="text" id="respiratorysystempercussion"
													name="respiratorysystempercussion" class="form-control" placeholder="Enter Respiratory System Percussion">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Respiratory System Auscultation</label>
											<div class="col-sm-8">
												<input type="text" id="respiratorysystemauscultation"
													name="respiratorysystemauscultation" class="form-control" placeholder="Enter Respiratory System Auscultation">
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Cardio Vascular System Inspection</label>
											<div class="col-sm-8">
												<input type="text" id="cardiovascularsysteminspection"
													name="cardiovascularsysteminspection" class="form-control" placeholder="Enter Cardio Vascular System Inspection">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Cardio Vascular System Palpitation</label>
											<div class="col-sm-8">
												<input type="text" id="cardiovascularsystempalpitation"
													name="cardiovascularsystempalpitation" class="form-control" placeholder="Enter Cardio Vascular System Palpitation">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Cardio Vascular System Percussion</label>
											<div class="col-sm-8">
												<input type="text" id="cardiovascularsystempercussion"
													name="cardiovascularsystempercussion" class="form-control" placeholder="Enter Cardio Vascular System Percussion">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Cardio Vascular System Auscultation</label>
											<div class="col-sm-8">
												<input type="text" id="cardiovascularsystemauscultation"
													name="cardiovascularsystemauscultation" class="form-control" placeholder="Enter Cardio Vascular System Auscultation">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Alimentary System Inspection</label>
											<div class="col-sm-8">
												<input type="text" id="alimenatarysysteminspection"
													name="alimenatarysysteminspection" class="form-control" placeholder="Enter Alimentary System Inspection">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Alimentary System Palpitation</label>
											<div class="col-sm-8">
												<input type="text" id="alimenatarysystempalpitation"
													name="alimenatarysystempalpitation" class="form-control" placeholder="Enter Alimentary System Palpitation">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Alimentary System Percussion</label>
											<div class="col-sm-8">
												<input type="text" id="alimenatarysystempercussion"
													name="alimenatarysystempercussion" class="form-control" placeholder="Enter Alimentary System Percussion">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Alimentary System Auscultation</label>
											<div class="col-sm-8">
												<input type="text" id="alimenatarysystemauscultation"
													name="alimenatarysystemauscultation" class="form-control" placeholder="Enter Alimentary System Auscultation">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Nervous System Inspection</label>
											<div class="col-sm-8">
												<input type="text" id="nervoussysteminspection"
													name="nervoussysteminspection" class="form-control" placeholder="Enter Nervous System Inspection">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Nervous System Palpitation</label>
											<div class="col-sm-8">
												<input type="text" id="nervoussystempalpitation"
													name="nervoussystempalpitation" class="form-control" placeholder="Enter Nervous System Palpitation">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Nervous System Percussion</label>
											<div class="col-sm-8">
												<input type="text" id="nervoussystempercussion"
													name="nervoussystempercussion" class="form-control" placeholder="Enter Nervous System Percussion">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Nervous System Auscultation</label>
											<div class="col-sm-8">
												<input type="text" id="nervoussystemauscultation"
													name="nervoussystemauscultation" class="form-control" placeholder="Enter Nervous System Auscultation">
											</div>
										</div>
									</div>
								</div>
								
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Other Inspection</label>
											<div class="col-sm-8">
												<input type="text" id="otherinspection"
													name="otherinspection" class="form-control" placeholder="Enter Other Inspection">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Other Palpitation</label>
											<div class="col-sm-8">
												<input type="text" id="otherpalpitation"
													name="otherpalpitation" class="form-control" placeholder="Enter Other Palpitation">
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Other Percussion</label>
											<div class="col-sm-8">
												<input type="text" id="otherpercussion"
													name="otherpercussion" class="form-control" placeholder="Enter Other Percussion">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group" style="padding: 7px 0;">
											<label class="col-sm-3 control-label">Other Auscultation</label>
											<div class="col-sm-8">
												<input type="text" id="otherauscultation"
													name="otherauscultation" class="form-control" placeholder="Enter Other Auscultation">
											</div>
										</div>
									</div>
								</div>
								</div>
							</div>

							<div class="row">&nbsp;</div>
							<div class="row">
								<div class="bg-default text-center">
									<input type="button" class="btn btn-primary" value="Save"
											id="saveexaminationofpatientdetailsbuttonid"
											onclick="saveexaminationofpatientdetails(this);">
								</div>
							</div>
							

							<div class="row">&nbsp;</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
							<input type="hidden" name="patrefnum" id="patrefnum" />	
						</form>
					</div>
					</div>
					</div>
					<!-- EXAMINATION OF PATIENT end -->
					
					
					
					<!--  lab investigation -->
					<div class="tab-pane" id="tab6">
						<form method="POST" enctype="multipart/form-data"
							id="fileUploadForm">
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Lab
											Investigation Name</label>
										<div class="col-sm-8">
											<input type="text" name="labreportname" id="lareportname"
												placeholder="Enter Lab Investigation Name"
												class="form-control">
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Lab
											Investigation Date</label>
										<div class="col-sm-8">
											<input type="text" id="labreportdate" name="labreportdate"
												class="bootstrap-datepicker form-control"
												data-date-format="mm/dd/yy">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Remarks</label>
										<div class="col-sm-8">
											<textarea name="labreportremarks" id="labreportremarks"
												rows="3" placeholder="Required Field" required
												class="form-control textarea-autosize"
												style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group" style="padding: 7px 0;">
										<label class="col-sm-3 control-label">Complaint ID</label>
										<div class="col-sm-8">
											<input type="text" name="labInvcomplaintid" id="labInvcomplaintid"
												placeholder="Enter Lab Investigation Name"
												class="form-control">
										</div>
									</div>
								</div>
							</div>
							<div class="row">
							&nbsp;
							</div>
							<div class="row">
								<div class="fileupload-buttonbar">
									<div class="col-lg-6">
										<div class="float-left">
											<span class="btn btn-md btn-success fileinput-button">
												<i class="glyph-icon icon-plus"></i> Add file <input
												type="file" name="files[]">
											</span>
											 <button type="submit" class="btn btn-md btn-default start" id="btnSubmitfileupld">
												<i class="glyph-icon icon-upload"></i> Start upload
											</button>
											<button type="reset" class="btn btn-md btn-warning cancel">
												<i class="glyph-icon icon-ban"></i> Cancel upload
											</button>
											<!--<button type="button" class="btn btn-md btn-danger delete">
												<i class="glyph-icon icon-trash-o"></i> Delete
											</button> -->
										</div>
										<!--<input type="checkbox" class="toggle width-reset float-left">
										 The global file processing state -->
										<span class="fileupload-process"></span>
									</div>
									<!-- The global progress state -->
									<div class="col-lg-6 fileupload-progress fade">
										<!-- The global progress bar -->

										<div class="progress progress-striped active"
											role="progressbar" aria-valuemin="0" aria-valuemax="100"
											aria-valuenow="0">
											<div class="progress-bar progress-bar-success bg-green"
												style="width: 0%;">
												<div class="progressbar-overlay"></div>
											</div>
										</div>
										<!-- The extended global progress state -->
										<div class="progress-extended">&nbsp;</div>
									</div>
								</div>
								<!-- The table listing the files available for upload/download -->
								<table role="presentation" class="table table-striped">
									<tbody class="files"></tbody>
								</table>
							</div>
							


							<!--<input type="text" name="extraField" /><br />
							<br /> <input type="file" name="files" /><br />
							<br /> <input type="submit" value="Submit" id="btnSubmitfileupld" />-->
							<input type="hidden" name="${_csrf.parameterName}"	value="${_csrf.token}" /> 
							<input type="hidden" name="patrefnum" 	id="patrefnum" />
						</form>
						
						<!-- The template to display files available for upload -->
						<script id="template-upload" type="text/x-tmpl">
              {% for (var i=0, file; file=o.files[i]; i++) { %}
                  <tr class="template-upload fade">
                      <td>
                          <span class="preview"></span>
                      </td>
                      <td>
                          <p class="name">{%=file.name%}</p>
                          <strong class="error text-danger"></strong>
                      </td>
                      <td>
                          <p class="size">Processing...</p>
                          <div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0"><div class="progress-bar progress-bar-success bg-green" style="width:0%;"></div></div>
                      </td>
                      <td>
                          {% if (!i && !o.options.autoUpload) { %}
                              <button class="btn btn-md btn-default start" disabled>
                                <span class="button-content">
                                  <i class="glyph-icon icon-upload"></i>
                                  Start
                                </span>
                              </button>
                          {% } %}
                          {% if (!i) { %}
                              <button class="btn btn-md btn-warning cancel" id="cnclupld">
                                  <span class="button-content">
                                    <i class="glyph-icon icon-ban-circle"></i>
                                    Cancel
                                  </span>
                              </button>
                          {% } %}
                      </td>
                  </tr>
              {% } %}
              </script>
		<!-- The template to display files available for download -->
		<script id="template-download" type="text/x-tmpl">
var k=o;
alert(k);
              {% for (var i=0, file; file=o.files[i]; i++) { %}
                  <tr class="template-download fade">
					  <td>
                          LabReport Name: {%=file.labreportname%}
                      </td>
					  <td>
                          LabReport Date: {%=file.labreportdate%}
                      </td>
 					  <td>
                          Remarks: {%=file.labreportremarks%}
                      </td>
					  <td>
                          ComplaintID: {%=file.labInvcomplaintid%}
                      </td>
                      <td>
                          <span class="preview">
                              {% if (file.thumbnailUrl) { %}
                                  <a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" data-gallery><img width="80" height="45" src="{%=file.thumbnailUrl%}"></a>
                              {% } %}
                          </span>
                      </td>
                      <td>
                          <p class="name">
                              {% if (file.url) { %}
                                  <a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" {%=file.thumbnailUrl?'data-gallery':''%}>{%=file.name%}</a>
                              {% } else { %}
                                  <span>{%=file.name%}</span>
                              {% } %}
                          </p>
                          {% if (file.error) { %}
                              <div><span class="label label-danger">Error</span> {%=file.error%}</div>
                          {% } %}
{% if (file.success) { %}
                              <div><span class="label label-success">Success</span> {%=file.success%}</div>
                          {% } %}
                      </td>
                      <td>
                          <span class="size">{%=o.formatFileSize(file.size)%}</span>
                      </td>
                      <td>
                          {% if (file.deleteUrl) { %}
                              <button class="btn btn-md btn-danger delete" data-type="{%=file.deleteType%}" data-url="{%=file.deleteUrl%}"{% if (file.deleteWithCredentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>
                                  <span class="button-content">
                                    <i class="glyph-icon icon-trash"></i>
                                    Delete
                                  </span>
                              </button>
                              <input type="checkbox" name="delete" value="1" class="toggle width-reset float-left">
                          {% } else { %}
                              <button class="btn btn-md btn-warning cancel">
                                  <span class="button-content">
                                    <i class="glyph-icon icon-ban-circle"></i>
                                    Cancel
                                  </span> 
                              </button>
                          {% } %}
                      </td>
                  </tr>
              {% } %}
              </script>
					</div>


					<!-- PROVISIONAL DIAGNOSIS start -->
					<div class="tab-pane" id="tab7">
									<form class="form-horizontal bordered-row"
										id="provisionaldiagnosisForm" name="provisionaldiagnosisForm"
										onsubmit="saveprovisionaldiagnosis();">
										<div class="row">
											<div class="col-sm-6">
												<div class="form-group" style="padding: 7px 0;">
													<label class="col-sm-3 control-label">Diagnosis</label>
													<div class="col-sm-8">
														<select name="provDiagnosis"
															id="provDiagnosis"
															data-placeholder="Click to see ..." class="chosen-select"
															style="display: none;">
														</select>
													</div>
												</div>
											</div>
											<div class="col-sm-6">
												<div class="form-group" style="padding: 7px 0;">
													<label class="col-sm-3 control-label">Diagnosis
														Date</label>
													<div class="col-sm-8">
														<input type="text" id="provDiagDate"
															name="provDiagDate"
															class="bootstrap-datepicker form-control"
															data-date-format="mm/dd/yy">
													</div>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-sm-6">
												<div class="form-group" style="padding: 7px 0;">
													<label class="col-sm-3 control-label">Remarks</label>
													<div class="col-sm-8">
														<textarea name="remarks" id="remarks"
														rows="3" placeholder="Required Field" required
														class="form-control textarea-autosize"
														style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
													</div>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="bg-default text-center">
												<input type="Submit" class="btn btn-primary" value="Save"
													id="saveprovisionalDiagnosisbuttonid">
											</div>
										</div>
										<div class="row">&nbsp;</div>
										<input type="hidden" name="${_csrf.parameterName}"
											value="${_csrf.token}" />
										<input type="hidden" name="patrefnum" id="patrefnum" />	
									</form>

						<div class="example-box-wrapper">
							<div class="panel">
								<div class="panel-body">
									<div id="datatable-responsive_wrapper3"
										class="dataTables_wrapper form-inline">
										<table id="datatable-responsive3"
											class="table table-striped table-bordered responsive no-wrap dataTable dtr-inline"
											cellspacing="0" width="100%" role="grid"
											aria-describedby="datatable-responsive_info"
											style="width: 100%;">
											<thead>
												<tr role="row">
													<th class="sorting" tabindex="0"
														aria-controls="datatable-responsive" rowspan="1"
														colspan="1"
														aria-label="Name: activate to sort column ascending">Diagnosis
														Date</th>
													<th class="sorting_asc" tabindex="0"
														aria-controls="datatable-responsive" rowspan="1"
														colspan="1"
														aria-label="Position: activate to sort column ascending"
														aria-sort="ascending">Provisional Diagnosis</th>
													<th class="sorting_asc" tabindex="0"
														aria-controls="datatable-responsive" rowspan="1"
														colspan="1"
														aria-label="Position: activate to sort column ascending"
														aria-sort="ascending">Remarks</th>
													<th tabindex="0" rowspan="1" colspan="1">Delete</th>
												</tr>
											</thead>
											<tfoot>
												<tr>
													<th rowspan="1" colspan="1">Diagnosis Date</th>
													<th rowspan="1" colspan="1">Provisional Diagnosis</th>
													<th rowspan="1" colspan="1">Remarks</th>
													<th rowspan="1" colspan="1">Delete</th>
												</tr>
											</tfoot>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- Provisional Diagosis end -->



					<!-- miasmatic start -->
					<div class="tab-pane" id="tab8">
									<form class="form-horizontal bordered-row" id="miasmaticForm"
										name="miasmaticForm" onsubmit="saveMiasmatic();">
										<div class="row">
											<div class="col-sm-6">
												<div class="form-group" style="padding: 7px 0;">
													<label class="col-sm-3 control-label">Miasmatic</label>
													<div class="col-sm-8">
														<select name="miasmatic" id="miasmatic"
															data-placeholder="Click to see ..." class="chosen-select"
															style="display: none;">
															<option value="" selected>Click to see ...</option>
															<option value="Psora">Psora</option>
															<option value="Syphilis">Syphilis</option>
															<option value="Sycosis">Sycosis</option>
															<option value="Mixed">Mixed</option>
														</select>
													</div>
												</div>
											</div>
											<div class="col-sm-6">
												<div class="form-group" style="padding: 7px 0;">
													<label class="col-sm-3 control-label">Miasmatic
														Date</label>
													<div class="col-sm-8">
														<input type="text" id="dateofMiasmatic"
															name="dateofMiasmatic"
															class="bootstrap-datepicker form-control"
															data-date-format="mm/dd/yy">
													</div>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="bg-default text-center">
												<input type="Submit" class="btn btn-primary" value="Save"
													id="saveMiasmaticbuttonid">
											</div>
										</div>
										<div class="row">&nbsp;</div>
										<input type="hidden" name="${_csrf.parameterName}"
											value="${_csrf.token}" />
										<input type="hidden" name="patrefnum" id="patrefnum" />
									</form>
						
						<div class="example-box-wrapper">
							<div class="panel">
								<div class="panel-body">
									<div id="datatable-responsive_wrapper4"
										class="dataTables_wrapper form-inline">
										<table id="datatable-responsive4"
											class="table table-striped table-bordered responsive no-wrap dataTable dtr-inline"
											cellspacing="0" width="100%" role="grid"
											aria-describedby="datatable-responsive_info"
											style="width: 100%;">
											<thead>
												<tr role="row">
													<th class="sorting" tabindex="0"
														aria-controls="datatable-responsive" rowspan="1"
														colspan="1"
														aria-label="Name: activate to sort column ascending">Miasmatic
														Date</th>
													<th class="sorting_asc" tabindex="0"
														aria-controls="datatable-responsive" rowspan="1"
														colspan="1"
														aria-label="Position: activate to sort column ascending"
														aria-sort="ascending">Miasmatic</th>
													<th tabindex="0" rowspan="1" colspan="1">Delete</th>
												</tr>
											</thead>
											<tfoot>
												<tr>
													<th rowspan="1" colspan="1">Miasmatic Date</th>
													<th rowspan="1" colspan="1">Miasmatic</th>
													<th rowspan="1" colspan="1">Delete</th>
												</tr>
											</tfoot>
										</table>
									</div>
								</div>
							</div>
						</div>

					</div>
					<!-- miasmetic end -->



					<!-- Remedy starts-->
					<div class="tab-pane" id="tab9">
						<form class="form-horizontal bordered-row" id="remedyForm"
										name="remedyForm" onsubmit="saveRemedy();">
							<div class="row">
							<div class="col-sm-6">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Finding of Characteristics </label>
									<div class="col-sm-8">
										<textarea name="findCharacteristics" id="findCharacteristics"
										rows="3" placeholder="Required Field" 
										class="form-control textarea-autosize"
										style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
									</div>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Evaluation symptoms</label>
									<div class="col-sm-8">
										<textarea name="evaluationSympt" id="evaluationSympt"
										rows="3" placeholder="Required Field" 
										class="form-control textarea-autosize"
										style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
									</div>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Analysis of case</label>
									<div class="col-sm-8">
										<textarea name="caseAnalysis" id="caseAnalysis"
										rows="3" placeholder="Required Field" 
										class="form-control textarea-autosize"
										style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
									</div>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Repertorisation</label>
									<div class="col-sm-8">
										<textarea name="repertorisation" id="repertorisation"
										rows="3" placeholder="Required Field" 
										class="form-control textarea-autosize"
										style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
									</div>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group" style="padding: 7px 0;">
									<label class="col-sm-3 control-label">Final Selection of remedy</label>
									<div class="col-sm-8">
										<textarea name="finalRemedySel" id="finalRemedySel"
										rows="3" placeholder="Required Field" 
										class="form-control textarea-autosize"
										style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 81px;"></textarea>
									</div>
								</div>
							</div>
							</div>
							
							<div class="row">
								<div class="bg-default text-center">
									<input type="Submit" class="btn btn-primary" value="Save"
										id="saveRemedyId">
								</div>
							</div>
							<div class="row">&nbsp;</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
							<input type="hidden" name="patrefnum" id="patrefnum" />
							
						</form>
					</div>
					<!-- Remedy end -->
					
					<!-- Prescription starts -->
					<div class="tab-pane" id="tab10">
						<form class="form-horizontal bordered-row" id="prescriptionForm"
							name="prescriptionForm" onsubmit="savePrescription();">
							
							<div class="form-group" style="padding: 7px 0;">
								<label class="col-sm-3 control-label">Medicine</label>
								<div class="col-sm-3">
									<select name="medicine" id="medicine"
										data-placeholder="Click to see ..." class="chosen-select"
										style="display: none;">
										<option value="Psora">Phosphoras</option>
										<option value="Syphilis">Thuja</option>
										<option value="Sycosis">Medicine 3</option>
										<option value="Mixed">Medicine 4</option>
									</select>
								</div>
							</div>
							<div class="form-group" style="padding: 7px 0;">
								<label class="col-sm-3 control-label">Potency</label>
								<div class="col-sm-2">
									<input type="text" class="form-control" id="potency"
										name="potency"
										placeholder="Enter Potency...">
								</div>
							</div>
							
							<div class="form-group" style="padding: 7px 0;">
								<label class="col-sm-3 control-label">Dose</label>
								<div class="col-sm-2">
									<input type="text" class="form-control" id="dose"
										name="dose"
										placeholder="Enter Dose...">
								</div>
							</div>
										
							<div class="row">
								<div class="bg-default text-center">
									<input type="Submit" class="btn btn-primary" value="Save"
										id="savePrescriptionId">
								</div>
							</div>
							<div class="row">&nbsp;</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
							<input type="hidden" name="patrefnum" id="patrefnum" />
							<input type="hidden" name="actionfrom" id="actionfrom" value="Prescription" />
						</form>
					</div>
					<!-- Prescription end -->
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		$('#saveIntroPatientForm').submit(function(event) {
			event.preventDefault();
		});
		$('#saveNewComplaintForm').submit(function(event) {
			event.preventDefault();
		});
		$('#saveNewFollowUpForm').submit(function(event) {
			event.preventDefault();
		});
		$('#saveFamilyHistoryForm').submit(function(event) {
			event.preventDefault();
		});
		$('#savePersonalHistoryForm').submit(function(event) {
			event.preventDefault();
		});
		$('#provisionaldiagnosisForm').submit(function(event) {
			event.preventDefault();
		});
		$('#miasmaticForm').submit(function(event) {
			event.preventDefault();
		});
		$('#saveHistoryOfPastIllnessForm').submit(function(event) {
			event.preventDefault();
		});
		$('#remedyForm').submit(function(event) {
			event.preventDefault();
		});
		$('#particularForm').submit(function(event) {
			event.preventDefault();
		});
		$('#prescriptionForm').submit(function(event) {
			event.preventDefault();
		});
		$('#homeopathyGenForm').submit(function(event) {
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

	function isNumber(evt) {
		evt = (evt) ? evt : window.event;
		var charCode = (evt.which) ? evt.which : evt.keyCode;
		if (charCode > 31 && (charCode < 48 || charCode > 57)) {
			return false;
		}
		return true;
	}

	
	
	function savePatientIntro() {
	alert('sex>>'+$("input[name='sex']:checked").val());
	
		if(!($("input:radio[name='sex']").is(":checked")))
		{
			alertMX('Sex can not be blank');
			return;
		}
		var serialized = $("#saveIntroPatientForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		alert(x);
		$.ajax({
			url : "http://localhost:8080/Homeo-RestWS/services/patientservice/createPatPersonal",
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("patrefnum").value = result.substr(result.indexOf("(") + 1, result.indexOf(")") - result.indexOf("(") - 1);
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
	function ageonfocus() {
			if (document.getElementById('dob').value != '') {
			var d2 = new Date();
			var d1 = new Date(document.getElementById('dob').value.substring(6, 10), document.getElementById('dob').value.substring(0, 2), document.getElementById('dob').value.substring(3, 5));
			var months;
			months = (d2.getFullYear() - d1.getFullYear()) * 12;
			months -= d1.getMonth() + 1;
			months += d2.getMonth();
			document.getElementById('age').value = months <= 0 ? 0 : months + 1;
		}
	}
	function ageonblur() {
		var d = new Date();
		d.setMonth(d.getMonth() - Number(document.getElementById("age").value));
		var dd = d.getDate();
		var mm = d.getMonth() + 1; //January is 0!
		var yyyy = d.getFullYear();
		var dt = ('0' + d.getMonth()).slice(-2) + '-'
		+ ('0' + (d.getDate() + 1)).slice(-2) + '-'
		+ d.getFullYear();
		document.getElementById('dob').value = dt;
	}
	/////////////////////////Patient History Complaint///////////////////
	function cmplntForonfocus() {
		if (document.getElementById('complaintsincedate').value != '') {
			var d2 = new Date();
			var d1 = new Date(document.getElementById('complaintsincedate').value.substring(6, 10), document.getElementById('complaintsincedate').value.substring(0, 2), document.getElementById('complaintsincedate').value.substring(3, 5));
			var months;
			months = (d2.getFullYear() - d1.getFullYear()) * 12;
			months -= d1.getMonth() + 1;
			months += d2.getMonth();
			document.getElementById('cmplntFor').value = months <= 0 ? 0 : months + 1;
		}
	}
	function cmplntForonblur() {
		var d = new Date();
		d.setMonth(d.getMonth() - Number(document.getElementById("cmplntFor").value));
		var dd = d.getDate();
		var mm = d.getMonth() + 1; //January is 0!
		var yyyy = d.getFullYear();
		var dt = ('0' + d.getMonth()).slice(-2) + '-'
		+ ('0' + (d.getDate() + 1)).slice(-2) + '-'
		+ d.getFullYear();
		document.getElementById('complaintsincedate').value = dt;
	}
	
	function dateInputOnFocus(inputDate,inputDuration) {
		if (document.getElementById(inputDate).value != '') {
			var d2 = new Date();
			var d1 = new Date(document.getElementById(inputDate).value.substring(6, 10), document.getElementById(inputDate).value.substring(0, 2), document.getElementById(inputDate).value.substring(3, 5));
			var months;
			months = (d2.getFullYear() - d1.getFullYear()) * 12;
			months -= d1.getMonth() + 1;
			months += d2.getMonth();
			document.getElementById(inputDuration).value = months <= 0 ? 0 : months + 1;
		}
	}
	function dateInputOnBlur(inputDate,inputDuration) {
		var d = new Date();
		d.setMonth(d.getMonth() - Number(document.getElementById(inputDuration).value));
		var dd = d.getDate();
		var mm = d.getMonth() + 1; //January is 0!
		var yyyy = d.getFullYear();
		var dt = ('0' + d.getMonth()).slice(-2) + '-'
		+ ('0' + (d.getDate() + 1)).slice(-2) + '-'
		+ d.getFullYear();
		document.getElementById(inputDate).value = dt;
	}
	
	
	function loadAllComplaintsForPatient() {
		if ($('#seecmplnt').attr('aria-expanded') == 'false')
			$('#seecmplnt').trigger('click');
			//alert(document.getElementById("patrefnum").value);
		var patrefnum = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "XXX";
		document.saveNewFollowUpForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "XXX";
		
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllComplaintsByPatRefNum/" + document.saveNewFollowUpForm.patrefnum.value;
		//var urlreq="http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllComplaintsByPatRefNum/PAT18";

		Table1 = $('#datatable-responsive').DataTable({
			destroy : true,
			responsive : true,
			ajax : {
				type : "GET",
				dataType : "json",
				dataSrc : "",
				contentType : "application/x-www-form-urlencoded",
				accept : "application/json",
				url : urlreq
			},
			columnDefs : [
				{
					width : 10,
					targets : 0
				},
				{
					width : 10,
					targets : 1
				},
				{
					width : 10,
					targets : 2
				},
				{
					width : 30,
					targets : 3
				},
				{
					width : 30,
					targets : 4
				},
				{
					width : 5,
					targets : 5
				},
				{
					width : 5,
					targets : 6
				}
			],
			fixedColumns : true,
			columns : [
				{
					"data" : "sessionid"
				},
				{
					"data" : "complaintsincedate"
				},
				{
					"data" : "overallstatus"
				},
				{
					"data" : "complaintDescription"
				},
				{
					"data" : "historyOfComplaint"
				},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"edit\" class=\"btn btn-black-opacity\" href=\"#\"><i class=\"glyph-icon icon-edit-sign\"></i></button>"
				},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"followupbuttonid\" class=\"btn btn-black-opacity\" data-toggle=\"modal\" data-target=\".bs-example-modal-sm\" href=\"#\"><i class=\"glyph-icon icon-paper-clip\"></i></button>"
				}
			]
		});
		$('.dataTables_filter input').attr("placeholder", "Search...");
		$('#datatable-responsive tbody').on('click', 'button[id^="edit"]', function() {
			var data = Table1.row($(this).parents('tr')).data();
			document.getElementById('sessionid').value = data.sessionid;
			var year = data.complaintsincedate.substring(0, 4);
			var month = data.complaintsincedate.substring(5, 7);
			var day = data.complaintsincedate.substring(8, 10);
			document.getElementById('complaintsincedate').value = month + '-' + day + '-' + year;
			document.getElementById('overallstatus').value = data.overallstatus;
			document.getElementById('complaintDescription').value = data.complaintDescription;
			document.getElementById('historyOfComplaint').value = data.historyOfComplaint;
			document.getElementById('saveNewComplaintButtonId').value = 'Update';
			if ($('#amncmplnt').attr('aria-expanded') == 'false')
				$('#amncmplnt').trigger('click');
		});
		$('#datatable-responsive tbody').on('click', 'button[id^="followupbuttonid"]', function() {
			var data = Table1.row($(this).parents('tr')).data();
			if ($('#amncmplnt').attr('aria-expanded') == 'true')
				$('#amncmplnt').trigger('click');
			if ($('#seecmplnt').attr('aria-expanded') == 'true')
				$('#seecmplnt').trigger('click');
			if ($('#seefllwp').attr('aria-expanded') == 'false')
				$('#seefllwp').trigger('click');
			//document.saveNewFollowUpForm.patrefnum.value = document.getElementById("patrefnum").value;
			document.saveNewFollowUpForm.sessionid.value = data.sessionid;
		});
	}

	function saveNewComplaint(obj) {
		document.saveNewComplaintForm.patrefnum.value = document.getElementById("patrefnum").value;
		var cmplnturl = '';
		if (obj.value == 'Save')
			cmplnturl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createComplaintDetails";
		else if (obj.value == 'Update')
			cmplnturl = "http://localhost:8080/Homeo-RestWS/services/patientservice/updateComplaintDetails";
		var serialized = $("#saveNewComplaintForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		$.ajax({
			url : cmplnturl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("sessionid").value = result.substr(result.indexOf("(") + 1, result.indexOf(")") - result.indexOf("(") - 1);
				document.getElementById("saveNewComplaintForm").reset();
				loadAllComplaintsForPatient();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}

	function saveHistoryOfPastIllness(obj) {
		document.saveHistoryOfPastIllnessForm.patrefnum.value = document.getElementById("patrefnum").value;
		var cmplnturl = '';
		if (obj.value == 'Save')
			cmplnturl = "http://localhost:8080/Homeo-RestWS/services/patientservice/saveHistoryOfPastIllness";
		else if (obj.value == 'Update')
			cmplnturl = "http://localhost:8082/Homeo-RestWS/services/patientservice/updateHistoryOfPastIllness";
		var serialized = $("#saveHistoryOfPastIllnessForm").serializeArray();
		var s = '';
		var data = {};
		var otherdisease='';
		for (s in serialized) {
			
			if(serialized[s]['name']=='otherdiseaseslist'){
				//alert(serialized[s]['value']);
				otherdisease=otherdisease+',"'+serialized[s]['value']+'"';
			}
			else
				data[serialized[s]['name']] = serialized[s]['value']
		}
		otherdisease='['+otherdisease.substring(1,otherdisease.length)+']';

		var x = JSON.stringify(data);
		
		x=x.substring(0,x.length-1)+',"otherdiseaseslist":'+otherdisease+'}';
		alert(x);
		$.ajax({
			url : cmplnturl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("sessionid").value = result.substr(result.indexOf("(") + 1, result.indexOf(")") - result.indexOf("(") - 1);
				document.getElementById("saveHistoryOfPastIllnessForm").reset();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
	///////////////////////////////complaintfollowupdetails///////////////////////////////////////
	function loadAllFollowUpForSession(sessionid) {
		if ($('#seefllwp').attr('aria-expanded') == 'false')
			$('#seefllwp').trigger('click');
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllFollowUpsByComplaintSessionId/" + document.saveNewFollowUpForm.sessionid.value;
		//var urlreq="http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllFollowUpsByComplaintSessionId/PAT18";

		Table2 = $('#datatable-responsive1').DataTable({
			destroy : true,
			responsive : true,
			language : {
				search : "_INPUT_",
				searchPlaceholder : "Search..."
			},
			ajax : {
				type : "GET",
				dataType : "json",
				dataSrc : "",
				contentType : "application/x-www-form-urlencoded",
				accept : "application/json",
				url : urlreq
			},
			columnDefs : [
				{
					width : 10,
					targets : 0
				},
				{
					width : 10,
					targets : 1
				},
				{
					width : 35,
					targets : 2
				},
				{
					width : 35,
					targets : 3
				},
				{
					width : 10,
					targets : 4
				}
			],
			fixedColumns : true,
			columns : [
				{
					"data" : "complaintFollowupDtlsId"
				},
				{
					"data" : "visitdate"
				},
				{
					"data" : "treatment"
				},
				{
					"data" : "remarks"
				},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"editfollowup\" class=\"btn btn-black-opacity\" href=\"#\"><i class=\"glyph-icon icon-edit-sign\"></i></button>"
				}
			]
		});
		$('#datatable-responsive1 tbody').on('click', 'button[id^="editfollowup"]', function() {
			var data = Table2.row($(this).parents('tr')).data();
			document.getElementById('complaintFollowupDtlsId').value = data.complaintFollowupDtlsId;
			var year = data.visitdate.substring(0, 4);
			var month = data.visitdate.substring(5, 7);
			var day = data.visitdate.substring(8, 10);
			document.getElementById('visitdate').value = month + '-' + day + '-' + year;
			document.getElementById('treatment').value = data.treatment;
			document.getElementById('remarks').value = data.remarks;
			document.getElementById('saveNewComplaintFllupButtonId').value = 'Update';
			if ($('#amnfllwp').attr('aria-expanded') == 'false')
				$('#amnfllwp').trigger('click');
		});
	}

	function saveNewComplaintFollowup(obj) {
		var cmplnturl = '';
		if (obj.value == 'Save')
			cmplnturl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createComplaintFollowUpDetails";
		else if (obj.value == 'Update')
			cmplnturl = "http://localhost:8080/Homeo-RestWS/services/patientservice/updateComplaintFollowUpDetails";
		var serialized = $("#saveNewFollowUpForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		//alert(x);
		$.ajax({
			url : cmplnturl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("complaintFollowupDtlsId").value = result.substr(result.indexOf("(") + 1, result.indexOf(")") - result.indexOf("(") - 1);
				document.getElementById("saveNewFollowUpForm").reset();
				loadAllFollowUpForSession(sessionid);
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}

	//////////////family history start//////////////////////////
	function loadfamilyhistory() {
		$.ajax({
			type : "GET",
			url : "http://localhost:8080/Homeo-RestWS/services/diseaseservice/retrieveDiseasesByGender/Male",
			dataType : "json",
			success : function(data) {
				var div_data = '';
				var gndr = '';
				$.each(data, function(i, obj) {
					if (i == 0)
						div_data = div_data + "<optgroup label=\"" + obj.diseasegender + "\">";
					else if (gndr != obj.diseasegender)
						div_data = div_data + "</optgroup><optgroup label=\"" + obj.diseasegender + "\">";
					gndr = obj.diseasegender;
					div_data = div_data + "<option>" + obj.diseasename + "</option>";
				});
				div_data = div_data + '</optgroup>';
				$(div_data).appendTo('#fmlyhstryfthr');
				$("#fmlyhstryfthr").data("placeholder", "Select").trigger('chosen:updated');
			}
		});
	}
	//////////////family history end//////////////////////////////

	//////////////personal history start/////////////////////////
	function savePersonalHistory() {
		var cmplnturl = 'http://localhost:8080/Homeo-RestWS/services/patientservice/test';
		/* if (obj.value == 'Save')
		cmplnturl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createComplaintFollowUpDetails";
		else if (obj.value == 'Update')
		cmplnturl = "http://localhost:8080/Homeo-RestWS/services/patientservice/updateComplaintFollowUpDetails"; */
		var serialized = $("#savePersonalHistoryForm").serializeArray();
		var s = '';
		var data = {};
		//alert($("#addiction").val());
		for (s in serialized) {
			if (serialized[s]['name'] == 'addiction')
				data[serialized[s]['name']] = $("#addiction").val();
			else
				data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		//alert(x);
		$.ajax({
			url : cmplnturl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);

			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}


	/////////Provisional Diagnosis Start////////
	var Table3;
	function loadAllProvisionalDiagnosis() {
		$.ajax({
			type : "GET",
			url : "http://localhost:8080/Homeo-RestWS/services/staticDataservice/retrieveStaticDataByStaticDataType/Diagnosis",
			dataType : "json",
			success : function(data) {
				//alert(data);
				var div_data = '';
				if (data && data.length != 0) {
					$.each(data, function(i, obj) {
						//alert(obj.code);
						div_data = div_data + '<option value='+obj.value+'>' + obj.code + '</option>';
					});	
					$(div_data).appendTo('#provDiagnosis');
					$("#provDiagnosis").data("placeholder", "Select").trigger('chosen:updated');
				}
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		document.provisionaldiagnosisForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "XXX";;
		   
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllProvDiagnosisByPatRefNum/" + document.provisionaldiagnosisForm.patrefnum.value;

		Table3 = $('#datatable-responsive3').DataTable({
			destroy : true,
			responsive : true,
			language : {
				search : "_INPUT_",
				searchPlaceholder : "Search...",
				emptyTable: "No data available in table"
			},
			ajax : {
				type : "GET",
				dataType : "json",
				dataSrc : "",
				contentType : "application/x-www-form-urlencoded",
				accept : "application/json",
				url : urlreq
			},
			columnDefs : [
				{
					width : "30%",
					targets : 0
				},
				{
					width : "30%",
					targets : 1
				},
				{
					width : "30%",
					targets : 2
				},
				{
					width : "10%",
					targets : 3
				}
			],
			fixedColumns : true,
			columns : [
				{
					"data" : "provDiagDate"
				},
				{
					"data" : "provDiagnosis"
				},
				{
					"data" : "remarks"
	     			},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"deleteprovisionaldiagnosis\" class=\"btn btn-black-opacity\" href=\"#\"><i class=\"glyph-icon icon-remove-circle\"></i></button>"
				}
			]
		});
		$('#datatable-responsive3 tbody').on('click', 'button[id^="deleteprovisionaldiagnosis"]', function() {
			var data = Table3.row($(this).parents('tr')).data();
			var array = data.provDiagnosis.split(',');
			$("#provDiagnosis").val(array).trigger("chosen:updated");
			var year = data.provDiagDate.substring(0, 4);
			var month = data.provDiagDate.substring(5, 7);
			var day = data.provDiagDate.substring(8, 10);
			document.getElementById('provDiagDate').value = month + '-' + day + '-' + year;
			//alert(data.remarks);
			document.provisionaldiagnosisForm.remarks.value = data.remarks;
			
			document.provisionaldiagnosisForm.patrefnum.value = document.getElementById("patrefnum").value;
			var dlmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/deleteProvDiagnosisPat";
			var serialized = $("#provisionaldiagnosisForm").serializeArray();
			var s = '';
			var data = {};
			for (s in serialized) {
				data[serialized[s]['name']] = serialized[s]['value'];
			}
			var x = JSON.stringify(data);
			//alert(x);
			$.ajax({
				url : dlmsmtcurl,
				method : "POST",
				data : x,
				contentType : "application/json",
				success : function(result, status, jqXHR) {
					alertMX(result);
					document.getElementById("provisionaldiagnosisForm").reset();
					searchProvisionalDiagnosis();
				},
				error (jqXHR, textStatus, errorThrown) {
					alertMX(errorThrown);
				}
			});
			return true;
		});
	}
	
	function searchProvisionalDiagnosis(){
		$.ajax({
			url : "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllProvDiagnosisByPatRefNum/" + document.provisionaldiagnosisForm.patrefnum.value,
			method : "GET",
			dataType : "json",
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				Table3.clear().draw();
				Table3.rows.add(result).draw(); // Add new data
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
	
	function saveprovisionaldiagnosis(){
		document.miasmaticForm.patrefnum.value = document.getElementById("patrefnum").value;
		var svmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createProvDiagnosisPat";
		var serialized = $("#provisionaldiagnosisForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		//alert(x);
		$.ajax({
			url : svmsmtcurl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("provisionaldiagnosisForm").reset();
				loadAllProvisionalDiagnosis();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
	

	///////Miasmatic start////////////
	var Table4;
	function loadAllMiasmatic() {
		//document.miasmaticForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "PAT54";
		document.miasmaticForm.patrefnum.value = document.getElementById("patrefnum").value;
		if(document.miasmaticForm.patrefnum.value=='')
		{
			return true;
		}
		//alert(document.miasmaticForm.patrefnum.value);
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllMiasmaticByPatRefNum/" + document.miasmaticForm.patrefnum.value;
		//alert(urlreq);
		Table4 = $('#datatable-responsive4').DataTable({
			destroy : true,
			responsive : true,
			language : {
				search : "_INPUT_", 
				searchPlaceholder : "Search...",
				emptyTable: "No data available in table"
			},
			ajax : {
				type : "GET",
				dataType : "json",
				dataSrc : "",
				contentType : "application/x-www-form-urlencoded",
				accept : "application/json",
				url : urlreq
			},
			columnDefs : [
				{
					width : "40%",
					targets : 0
				},
				{
					width : "40%",
					targets : 1
				},
				{
					width : "20%",
					targets : 2
				}
			],
			fixedColumns : true,
			columns : [
				{
					"data" : "dateofMiasmatic"
				},
				{
					"data" : "miasmatic"
				},
				{
					"data" : null,
					"orderable" : false,
					"defaultContent" : "<button id=\"deleteMiasmatic\" class=\"btn btn-black-opacity\" href=\"#\"><i class=\"glyph-icon icon-remove-circle\"></i></button>"
				}
			]
		});
		$('#datatable-responsive4 tbody').on('click', 'button[id^="deleteMiasmatic"]', function() {
			var data = Table4.row($(this).parents('tr')).data();
			var array = data.miasmatic.split(',');
			$("#miasmatic").val(array).trigger("chosen:updated");
			var year = data.dateofMiasmatic.substring(0, 4);
			var month = data.dateofMiasmatic.substring(5, 7);
			var day = data.dateofMiasmatic.substring(8, 10);
			document.getElementById('dateofMiasmatic').value = month + '-' + day + '-' + year;
			
			document.miasmaticForm.patrefnum.value = document.getElementById("patrefnum").value;
			var dlmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/deleteMiasmaticPat";
			var serialized = $("#miasmaticForm").serializeArray();
			var s = '';
			var data = {};
			for (s in serialized) {
				data[serialized[s]['name']] = serialized[s]['value'];
			}
			var x = JSON.stringify(data);
			//alert(x);
			$.ajax({
				url : dlmsmtcurl,
				method : "POST",
				data : x,
				contentType : "application/json",
				success : function(result, status, jqXHR) {
					alertMX(result);
					document.getElementById("miasmaticForm").reset();
					searchAllMiasmatic();
				},
				error (jqXHR, textStatus, errorThrown) {
					alertMX(errorThrown);
				}
			});
			return true;
		});
	}
	    
	function searchAllMiasmatic(){
		$.ajax({
			url : "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveAllMiasmaticByPatRefNum/" + document.miasmaticForm.patrefnum.value,
			method : "GET",
			dataType : "json",
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				Table4.clear().draw();
				Table4.rows.add(result).draw(); // Add new data
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
	
	function saveMiasmatic(){
		document.miasmaticForm.patrefnum.value = document.getElementById("patrefnum").value;
		
		if(document.miasmaticForm.patrefnum.value=='')
		{
			alertMX("Create Introduction data before entering data in this...");
			return true;
		}
		
		var svmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createMiasmaticForPat";
		var serialized = $("#miasmaticForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		//alert(x);
		$.ajax({
			url : svmsmtcurl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("miasmaticForm").reset();
				loadAllMiasmatic();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
	
	function savePrescription(){
		document.prescriptionForm.patrefnum.value = document.getElementById("patrefnum").value;
		
		if(document.prescriptionForm.patrefnum.value=='')
		{
			alertMX("Create Introduction data before entering data in this...");
			return true;
		}
		
		var svmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createPrescription";
		var serialized = $("#prescriptionForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);

		$.ajax({
			url : svmsmtcurl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
	
	function saveRemedy(){
		document.remedyForm.patrefnum.value = document.getElementById("patrefnum").value;
		
		if(document.remedyForm.patrefnum.value=='')
		{
			alertMX("Create Introduction data before entering data in this...");
			return true;
		}
		
		var svmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createRemedySelection";
		var serialized = $("#remedyForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		//alert(x);
		
		$.ajax({
			url : svmsmtcurl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		
		
		return true;
	}
	
	
	/***** This is previous method of storing Patient Particular data
	function saveParticularOld(){
		document.particularForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "PAT60";
		alert(document.particularForm.patrefnum.value);
		if(document.particularForm.patrefnum.value=='')
		{
			alertMX("Create Introduction data before entering data in this...");
			return true;
		}
		
		var svmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createPatParticular";
		var serialized = $("#particularForm").serializeArray();
		var s = '';
		var particular='[';
		var data = {};
		for (s in serialized) {
			if(serialized[s]['name']!='patrefnum' && serialized[s]['name']!='_csrf'){
				if(serialized[s]['value']!="")
					particular=particular+'{"bodyPart":"'+serialized[s]['name']+'","illnessDesc":"'+serialized[s]['value']+'"},';
			}
			else
				data[serialized[s]['name']] = serialized[s]['value'];
		}
		
		particular=particular.substring(0 ,particular.length-1);
		particular=particular+"]";
		
		var x = JSON.stringify(data);
		x=x.substring(0 ,x.length-1)+',"particularList":'+particular+"}";
		alert(x);
		
		$.ajax({
			url : svmsmtcurl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
//				document.getElementById("particularForm").reset();
		
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		
		
		return true;
	}
	*****/
	
	function saveParticular(){
		document.particularForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "PAT60";
		
		if(document.particularForm.patrefnum.value=='')
		{
			alertMX("Create Introduction data before entering data in this...");
			return true;
		}
		
		var svmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/createPatParticular";
		var serialized = $("#particularForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		
		
		$.ajax({
			url : svmsmtcurl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}	
	
	//Generalities Stars
	
	function saveHomeopathyGen11() {
	
		document.homeopathyGenForm.patrefnum.value = document.getElementById("patrefnum").value;
		document.homeopathyGenForm.patrefnum.value='PAT60';
		if(document.homeopathyGenForm.patrefnum.value=='')
		{
			alertMX("Create Introduction data before entering data in this...");
			return true;
		}
		
		var svmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/saveHomeoGeneralities";
		var serialized = $("#homeopathyGenForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		alert(x);
		//return;
		$.ajax({
			url : svmsmtcurl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
				document.getElementById("homeopathyGenForm").reset();
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	
	}
	
	function saveHomeopathyGen(){
		document.homeopathyGenForm.patrefnum.value = 'PAT60';
		
		if(document.homeopathyGenForm.patrefnum.value=='')
		{
			alertMX("Create Introduction data before entering data in this...");
			return true;
		}
		
		var svmsmtcurl = "http://localhost:8080/Homeo-RestWS/services/patientservice/saveHomeoGeneralities";
		var serialized = $("#homeopathyGenForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		alert(x);
		//return;
		$.ajax({
			url : svmsmtcurl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		
		
		return true;
	}
	//Generalities Ends
	
	///////loadHomeoGeneralities start////////////
	
	function loadHomeoGeneralities() {
		
		//document.homeopathyGenForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "PAT60";
		//document.getElementById("patrefnum").value="PAT60";
		document.homeopathyGenForm.patrefnum.value = document.getElementById("patrefnum").value;
		if(document.homeopathyGenForm.patrefnum.value=='')
		{
			return;
		}
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveHomeoGeneralitiesByPatRefNum/" + document.homeopathyGenForm.patrefnum.value;
		
		$.ajax({ 
			   type: "GET",
			   dataType: "json",
			   url: urlreq,
			   success: function(data){ 
					var test='';
					for (x in data) {
						//test = test+ "{" +x+ ":" + data[x] +"}";
						if(x!='createdby' && x!='updatedby' && x!='_csrf' && data[x]!=null && data[x]!='')
						{
							//alert(x+">>"+data[x]);
							document.getElementById(x).value = data[x];
							$("#"+x).val(data[x]).trigger("chosen:updated");
						}
					}
			   }
			});
	}
	
	
	///////loadExaminationOfPat start////////////
	
	function loadExaminationOfPat() {
		document.examinationofpatientForm.patrefnum.value = document.getElementById("patrefnum").value;
		//document.examinationofpatientForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "PAT60";
		//document.getElementById("patrefnum").value="PAT60";
		if(document.examinationofpatientForm.patrefnum.value=='')
		{
			return;
		}
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveExaminationOfPatByPatRefNum/" + document.examinationofpatientForm.patrefnum.value;
		
		$.ajax({ 
			   type: "GET",
			   dataType: "json",
			   url: urlreq,
			   success: function(data){ 
					var test='';
					for (x in data) {
						test = test+ "{" +x+ ":" + data[x] +"}";
						if(x!='createdby' && x!='updatedby' && x!='_csrf' && data[x]!=null && data[x]!='')
						{
							//alert(x+">>"+data[x]);
							document.getElementById(x).value = data[x];
							$("#"+x).val(data[x]).trigger("chosen:updated");
						}
					}
					alert(test);
			   }
			});
	}
	///////Selection Of Remedy start////////////
	
	function loadSelectionOfRemedy() {
	
		//document.remedyForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "PAT51";
		document.remedyForm.patrefnum.value = document.getElementById("patrefnum").value;
		//alert(document.miasmaticForm.patrefnum.value);
		if(document.remedyForm.patrefnum.value=='')
		{
			return;
		}
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveSelectionOfRemedyByPatRefNum/" + document.remedyForm.patrefnum.value;
		
		$.ajax({ 
			   type: "GET",
			   dataType: "json",
			   url: urlreq,
			   success: function(data){ 
					var test='';
					for (x in data) {
						//test = test+ "{" +x+ ":" + data[x] +"}";
						if(x!='createdby' && x!='updatedby' && x!='_csrf')
						{
							document.getElementById(x).value = data[x];
						}
					}
			   }
			});
	}
	
	
	
	//Need to be updated properly
	function loadParticularHeadtoFoot() {
		//return;
		//document.particularForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "PAT60";
		document.particularForm.patrefnum.value = document.getElementById("patrefnum").value;
		//alert("check..."+document.particularForm.patrefnum.value);
		if(document.particularForm.patrefnum.value=='')
		{
			return;
		}
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveParticularHeadToFootByPatRefNum/" + document.particularForm.patrefnum.value;
		
		$.ajax({ 
			   type: "GET",
			   dataType: "json",
			   url: urlreq,
			   success: function(data){ 
					var test='';
					for (x in data) {
						test = test+ "{" +x+ ":" + data[x] +"}";
						if(x!='createdby' && x!='updatedby' && x!='_csrf' && data[x]!=null && data[x]!='')
						{
							//alert(x+">>"+data[x]);
							document.getElementById(x).value = data[x];
							$("#"+x).val(data[x]).trigger("chosen:updated");
						}
					}
					//alert(test);
			   }
			});
	}
	
	//////////////Examination start/////////////////////////
	function saveexaminationofpatientdetails() {
		document.examinationofpatientForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "PAT60";
		var cmplnturl = 'http://localhost:8080/Homeo-RestWS/services/patientservice/saveexaminationofpatientdetails';
		var serialized = $("#examinationofpatientForm").serializeArray();
		var s = '';
		var data = {};
		for (s in serialized) {
			data[serialized[s]['name']] = serialized[s]['value']
		}
		var x = JSON.stringify(data);
		alert(x);
		$.ajax({
			url : cmplnturl,
			method : "POST",
			data : x,
			contentType : "application/json",
			success : function(result, status, jqXHR) {
				alertMX(result);
			},
			error (jqXHR, textStatus, errorThrown) {
				alertMX(errorThrown);
			}
		});
		return true;
	}
	
	function loadIntroductionDetails() {
		
		document.saveIntroPatientForm.patrefnum.value = document.getElementById("patrefnum").value!="" ? document.getElementById("patrefnum").value : "";
		if(document.saveIntroPatientForm.patrefnum.value=='')
		{
			alert('patref not found')
			return;
		}
		var urlreq = "http://localhost:8080/Homeo-RestWS/services/patientservice/retrieveIntroductionByPatRefNum/" + document.saveIntroPatientForm.patrefnum.value;
		
		$.ajax({ 
			   type: "GET",
			   dataType: "json",
			   url: urlreq,
			   success: function(data){        
			     document.getElementById("name").value = data.name;
			     document.getElementById("address").value = data.address;
			     document.getElementById("pincode").value = data.pincode;
			     document.getElementById("occupation").value = data.occupation;
			     document.getElementById("sex").value = data.sex;
			     document.getElementById("religion").value = data.religion;
			     document.getElementById("patfileno").value = data.patfileno;
			     document.getElementById("dob").value = data.dob;
			     document.getElementById("dateOfAdmission").value = data.dateOfAdmission;
			     document.getElementById("dateOfExamination").value = data.dateOfExamination;
			
			   }
			});
	}
	
	loadIntroductionDetails();
</script>
<%@ include file="common/footer.jsp"%>