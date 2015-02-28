<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Pagina Basica</title>
	<link rel="stylesheet" href="jquery.mobile/jquery.mobile-1.4.5.css">
	<script src="jquery.mobile/jquery.js"></script>
	<script src="jquery.mobile/jquery.mobile-1.4.5.js"></script>
</head>
<body>
<!--tema con css class="ui-page-theme-b"-->
<div data-role="page"  data-theme="a" id="page1">

	<div data-role="header" >
		<h1>Buttons</h1>

	</div>
	<div></div>


	<div data-role="main">
		<div class="ui-content">
			<a href="#" data-role="button">Link Button</a>
			<button type="button">Simple Boton</button>
			<button type="submit" data-mini="true">Mini Boton</button>
			<button type="button" data-icon="home">Home</button>
			<button type="button" data-icon="home" data-iconpos="top"></button>
			<button type="button" data-icon="home" data-iconpos="notext"></button>
			<button type="button" data-inline="true">button line</button>
			<button type="button" data-inline="true">button inline</button>
			<button type="button" data-theme="b">button theme b</button>
			<button type="button" class="ui-disabled"> btn desactivado</button>

			<div data-role="controlgroup" data-type="horizontal">
				<button type="button" data-icon="info" data-iconpos="notext"> button1</button>
				<button type="button" data-icon="gear" data-iconpos="notext"> button2</button>
				<button type="button" data-icon="location" data-iconpos="notext"> button3</button>

			</div>
		</div>
	</div>

	<div data-role="footer" >
		<div class="ui-content">
			<small>&copy;Tutorial jQuery Mobile</small>
		</div>
	</div>
john me lo chupa
</div>