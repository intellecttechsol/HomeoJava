<%@ include file="common/header.jsp"%>


<!-- jQueryUI Autocomplete -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/assets/widgets/autocomplete/autocomplete.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/assets/widgets/autocomplete/menu.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/assets/widgets/autocomplete/autocomplete-demo.js"></script>

<div class="row">
	<div class="col-md-6">
		<div class="panel">
			<div class="panel-body">
				<h3 class="title-hero">Patient's Gender vs Drug</h3>
				<input type="text" name=""
					placeholder="Start typing to see Medicine Names..."
					class="form-control autocomplete-input ui-autocomplete-input"
					autocomplete="on">
				<div class="example-box-wrapper">
					<div id="hero-bar" class="graph"></div>
				</div>
			</div>
		</div>
	</div>

	<div class="col-md-6">
		<div class="panel">
			<div class="panel-body">
				<h3 class="title-hero">Trend Analysis Of Diseases</h3>
				<input type="text" name=""
					placeholder="Start typing to see Diseases..."
					class="form-control autocomplete-input ui-autocomplete-input"
					autocomplete="on">
				<div class="example-box-wrapper">
					<div id="hero-area" class="graph"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-md-6">
		<div class="panel">
			<div class="panel-body">
				<h3 class="title-hero">Miasmatic Interpretation of a Patient's
					Symptoms</h3>
				<input type="text" name=""
					placeholder="Start typing to see Patient..."
					class="form-control autocomplete-input ui-autocomplete-input"
					autocomplete="on">
				<div class="example-box-wrapper">
					<div id="hero-donut" class="graph"></div>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Morris charts -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/assets/js-core/raphael.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/assets/widgets/charts/morris/morris.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/assets/widgets/charts/morris/morris.js"></script>
<!-- Morris charts demo -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/assets/widgets/charts/morris/morris-demo.js"></script>

<%@ include file="common/footer.jsp"%>