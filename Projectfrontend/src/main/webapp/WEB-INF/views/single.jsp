<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="Spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<c:url value="/resources/css" var="css" />
<c:url value="/resources/images" var="images" />
<c:url value="/resources/js" var="js" />
<title>Pendent Store a Ecommerce Online Shopping Category Flat
	Bootstarp Resposive Website</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Pendent Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- //for-mobile-apps -->
<link href="${css}/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="${css}/style.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- js -->
<script src="${js}/jquery-1.11.1.min.js"></script>
<!-- //js -->
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="${js}/move-top.js"></script>
<script type="text/javascript" src="${js}/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- start menu -->
<link href="${css}/megamenu.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="${js}/megamenu.js"></script>
<script>
	$(document).ready(function() {
		$(".megamenu").megamenu();
	});
</script>
<script src="${js}/menu_jquery.js"></script>
<script src="${js}/simpleCart.min.js">
	
</script>
<link href='http://fonts.googleapis.com/css?family=Monda:400,700'
	rel='stylesheet' type='text/css'>
</head>

<body>
	<!-- header -->

	<!-- //header -->
	<!-- top-header -->
	<div class="top_bg">
		<div class="container">
			<div class="header_top-sec">
				<div class="top_right">
					<ul>
						<li><a href="<c:url value="/contact"></c:url>">Contact</a></li>|
						<li><a>Welcome ${pageContext.request.userPrincipal.name}</a></li>
					<li><a href="<c:url value="/j_spring_security_logout"></c:url>">logout</a></li> 
					</ul>
				</div>
				<div class="top_left">
					<ul>
						<li class="top_link">Email:<a href="open">pendentjwellery@yahoo.com</a></li>|
						 <c1:if test=" ${pageContext.request.userPrincipal.name==null}"> 
						<li class="top_link"><a href="<c:url value="/login"></c:url>">My Account</a></li>
						</c1:if>
						</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- top-header -->
	<!-- logo-cart -->
	<div class="header_top">
		<div class="container">
			<div class="logo">
				<a href="index">Pendent Store</a>
			</div>
			<div class="header_right">
				<div class="cart box_1">
					<a href="Checkout">
						<h3>
							<div class="total">
								<span class="simpleCart_total"></span> (<span
									id="simpleCart_quantity" class="simpleCart_quantity"></span>
								items)
							</div>
							<img src="${images}/cart1.png" alt="" />
						</h3>
					</a>
					<p>
						<a href="javascript:;" class="simpleCart_empty">Empty Cart</a>
					</p>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //logo-cart -->
	<!------>
	<div class="mega_nav">
		<div class="container">
			<div class="menu_sec">
				<!-- start header menu -->
				<ul class="megamenu skyblue">
					<li class="active grid"><a class="color1" href="<c:url value="/index"></c:url>">Home</a></li>
					<li class="grid"><a class="color1" href="#">jewellery</a>
						<div class="megapanel">
							<div class="row">
								<div class="col1">
									<div class="h_nav">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="products">Slave Bracelets</a></li>
											<li><a href="products">Rings</a></li>
											<li><a href="products">Necklaces</a></li>
											<li><a href="products">Chokers</a></li>
											<li><a href="products">Cuff Links</a></li>
											<li><a href="products">Bangles</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="products">Men</a></li>
											<li><a href="products">Women</a></li>
											<li><a href="products">Brands</a></li>
											<li><a href="products">Kids</a></li>
											<li><a href="products">Accessories</a></li>
											<li><a href="products">Style Videos</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>All Jewellery</h4>
										<ul>
											<li><a href="products">Soulmate</a></li>
											<li><a href="products">his& her</a></li>
											<li><a href="products">ancient secret</a></li>
											<li><a href="products">baby princess</a></li>
											<li><a href="products">solitaire</a></li>
											<li><a href="products">mili</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>Collections</h4>
										<ul>
											<li><a href="products">bridal</a></li>
											<li><a href="products">antique</a></li>
											<li><a href="products">fussion</a></li>
											<li><a href="products">classic</a></li>
											<li><a href="products">kundan</a></li>
											<li><a href="products">temple</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col2"></div>
								<div class="col1"></div>
								<div class="col1"></div>
								<div class="col1"></div>
								<div class="col1"></div>
							</div>
						</div></li>
					<li><a class="color1" href="#">catalog</a>
						<div class="megapanel">
							<div class="row">
								<div class="col1">
									<div class="h_nav">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="products">Slave Bracelets</a></li>
											<li><a href="products">Rings</a></li>
											<li><a href="products">Necklaces</a></li>
											<li><a href="products">Chokers</a></li>
											<li><a href="products">Cuff Links</a></li>
											<li><a href="products">Bangles</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="products">Men</a></li>
											<li><a href="products">Women</a></li>
											<li><a href="products">Brands</a></li>
											<li><a href="products">Kids</a></li>
											<li><a href="products">Accessories</a></li>
											<li><a href="products">Style Videos</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>All Jewellery</h4>
										<ul>
											<li><a href="products">Soulmate</a></li>
											<li><a href="products">his&her</a></li>
											<li><a href="products">ancient secret</a></li>
											<li><a href="products">baby princess</a></li>
											<li><a href="products">solitaire</a></li>
											<li><a href="products">mili</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>Collections</h4>
										<ul>
											<li><a href="products">bridal</a></li>
											<li><a href="products">antique</a></li>
											<li><a href="products">fussion</a></li>
											<li><a href="products">classic</a></li>
											<li><a href="products">kundan</a></li>
											<li><a href="products">temple</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col2"></div>
								<div class="col1"></div>
								<div class="col1"></div>
								<div class="col1"></div>
								<div class="col1"></div>
							</div>
						</div></li>
					<li><a class="color1" href="#">Sale</a>
						<div class="megapanel">
							<div class="row">
								<div class="col1">
									<div class="h_nav">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="products">Slave Bracelets</a></li>
											<li><a href="products">Rings</a></li>
											<li><a href="products">Necklaces</a></li>
											<li><a href="products">Chokers</a></li>
											<li><a href="products">Cuff Links</a></li>
											<li><a href="products">Bangles</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="products">Men</a></li>
											<li><a href="products">Women</a></li>
											<li><a href="products">Brands</a></li>
											<li><a href="products">Kids</a></li>
											<li><a href="products">Accessories</a></li>
											<li><a href="products">Style Videos</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>All Jewellery</h4>
										<ul>
											<li><a href="products">Soulmate</a></li>
											<li><a href="products">his& her</a></li>
											<li><a href="products">ancient secret</a></li>
											<li><a href="products">baby princess</a></li>
											<li><a href="products">solitaire</a></li>
											<li><a href="products">mili</a></li>
										</ul>
									</div>
								</div>
								<div class="col1">
									<div class="h_nav">
										<h4>Collections</h4>
										<ul>
											<li><a href="products">bridal</a></li>
											<li><a href="products">antique</a></li>
											<li><a href="products">fussion</a></li>
											<li><a href="products">classic</a></li>
											<li><a href="products">kundan</a></li>
											<li><a href="products">temple</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col2"></div>
								<div class="col1"></div>
								<div class="col1"></div>
								<div class="col1"></div>
								<div class="col1"></div>
							</div>
						</div></li>
				</ul>
				<div class="search">
					<form>
						<input type="text" value="" placeholder="Search..."> <input
							type="submit" value="">
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!---->
	<!-- single-page -->
	<div class="single">
		<div class="container">
			<div class="single-page">
				<div class="flexslider details-lft-inf">
					<ul class="slides">
						<li data-thumb="${images}/${pro.getImage()}"><img src="${images}/${pro.getImage()}" />
						</li>
						<%-- <li data-thumb="${images}/s2.jpg"><img src="${images}/s2.jpg" />
						</li>
						<li data-thumb="${images}/s3.jpg"><img src="${images}/s3.jpg" />
						</li>
						<li data-thumb="${images}/s4.jpg"><img src="${images}/s4.jpg" />
						</li>
 --%>					</ul>
				</div>
				<!-- FlexSlider -->
				<script defer src="${js}/jquery.flexslider.js"></script>
				<link rel="stylesheet" href="${css}/flexslider.css" type="text/css"
					media="screen" />

				<script>
					// Can also be used with $(document).ready()
					$(window).load(function() {
						$('.flexslider').flexslider({
							animation : "slide",
							controlNav : "thumbnails"
						});
					});
				</script>
				<div class="details-left-info">
					<h3>Descripted Product</h3>
					<h4>Platinum!Gold!Diamonds!</h4>
					<div class="simpleCart_shelfItem">
						<p>
							<span class="item_price qwe">Rs.${pro.getP_price()}</span> 
						</p>
						<div class="col-rad">
							<div class="col-rad-left">
								<select class="arrival">
									<option>Color</option>
									<option>Green</option>
									<option>Violet</option>
									<option>Pink</option>
								</select>
							</div>
							<div class="col-rad-right">
								<section>
									<div class="row">
										<div class="colr ert">
											<label class="radio"><input type="radio" name="radio"
												checked=""><i></i>14Kt</label>
										</div>
										<div class="colr">
											<label class="radio"><input type="radio" name="radio"><i></i>10Kt</label>
										</div>
									</div>
								</section>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="col-rad tyy">
							<div class="col-rad-left">
								<p>Diamond</p>
							</div>
							<div class="col-rad-right">
								<section>
									<div class="row">
										<div class="colr ert">
											<label class="radio"><input type="radio"
												name="radio1" checked=""><i></i>SI GH</label>
										</div>
										<div class="colr">
											<label class="radio"><input type="radio"
												name="radio1"><i></i>VS GH</label>
										</div>
										<div class="colr">
											<label class="radio"><input type="radio"
												name="radio1"><i></i>VVS EF</label>
										</div>
									</div>
								</section>
							</div>
							<div class="clearfix"></div>
						</div>
						<p class="qty">Qty ::</p>
						<input min="1" type="number" id="quantity" name="quantity"
							value="1" class="form-control input-small">
						<div class="single-but item_add">
							<input type="submit" value="add to cart">
						</div>
						<div class="single-but item_add">
							<a href="<c:url value="/buy/${pro.getP_id()}"/>">Buy</a>
						</div>

					</div>
					<div class="flower-type">
						<p>
							Model ::<a href="#">Gem Stone</a>
						</p>
						<p>
							Carrets ::<a href="#">22</a>
						</p>
					</div>
				<p class="desc">A pearl is a hard object produced within the soft tissue (specifically the mantle) of a living shelled mollusk. 
					Just like the shell of a clam, a pearl is composed of calcium carbonate in minute crystalline form, which has been deposited in concentric layers. 
					The ideal pearl is perfectly round and smooth, but many other shapes (baroque pearls) occur. 
					The finest quality natural pearls have been highly valued as gemstones and objects of beauty for many centuries. 
					Because of this, pearl has become a metaphor for something rare, fine, admirable and valuable.</p>
				</div>
				<div class="clearfix"></div>
			</div>

			<!-- collapse -->
			<div class="panel-group collpse" id="accordion" role="tablist"
				aria-multiselectable="true">
				<div class="panel panel-default">
					<div class="panel-heading" role="tab" id="headingOne">
						<h4 class="panel-title">
							<a role="button" data-toggle="collapse" data-parent="#accordion"
								href="#collapseOne" aria-expanded="true"
								aria-controls="collapseOne"> Description </a>
						</h4>
					</div>
					<div id="collapseOne" class="panel-collapse collapse in"
						role="tabpanel" aria-labelledby="headingOne">
						<div class="panel-body">Jewellery consists of small decorative items worn for personal adornment, such as brooches, rings, necklaces, earrings, and bracelets. 
						                        Jewellery may be attached to the body or the clothes, and the term is restricted to durable ornaments, excluding flowers 
						                        for example. For many centuries metal, often combined with gemstones, has been the normal material for jewellery, but other materials such as shells and other plant materials may be used. 
						                        It is one of the oldest type of archaeological artefact  with 100,000-year-old beads made from Nassarius shells thought to be the oldest known jewellery.
						                        The basic forms of jewellery vary between cultures but are often extremely long-lived; in European cultures the most common forms of jewellery listed above have persisted since ancient times, while other forms such as adornments for the nose or ankle, important in other cultures, are much less common. 
						                        Historically, the most widespread influence on jewellery in terms of design and style have come from Asia.
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading" role="tab" id="headingTwo">
						<h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse"
								data-parent="#accordion" href="#collapseTwo"
								aria-expanded="false" aria-controls="collapseTwo">
								additional information </a>
						</h4>
					</div>
					<div id="collapseTwo" class="panel-collapse collapse"
						role="tabpanel" aria-labelledby="headingTwo">
						<div class="panel-body">Jewellery consists of small decorative items worn for personal adornment, such as brooches, rings, necklaces, earrings, and bracelets. 
						                        Jewellery may be attached to the body or the clothes, and the term is restricted to durable ornaments, excluding flowers 
						                        for example. For many centuries metal, often combined with gemstones, has been the normal material for jewellery, but other materials such as shells and other plant materials may be used. 
						                        It is one of the oldest type of archaeological artefact  with 100,000-year-old beads made from Nassarius shells thought to be the oldest known jewellery.
						                        The basic forms of jewellery vary between cultures but are often extremely long-lived; in European cultures the most common forms of jewellery listed above have persisted since ancient times, while other forms such as adornments for the nose or ankle, important in other cultures, are much less common. 
						                        Historically, the most widespread influence on jewellery in terms of design and style have come from Asia.
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading" role="tab" id="headingThree">
						<h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse"
								data-parent="#accordion" href="#collapseThree"
								aria-expanded="false" aria-controls="collapseThree">
								reviwes!! </a>
						</h4>
					</div>
					<div id="collapseThree" class="panel-collapse collapse"
						role="tabpanel" aria-labelledby="headingThree">
						<div class="panel-body">Jewellery consists of small decorative items worn for personal adornment, such as brooches, rings, necklaces, earrings, and bracelets. 
						                        Jewellery may be attached to the body or the clothes, and the term is restricted to durable ornaments, excluding flowers 
						                        for example. For many centuries metal, often combined with gemstones, has been the normal material for jewellery, but other materials such as shells and other plant materials may be used. 
						                        It is one of the oldest type of archaeological artefact  with 100,000-year-old beads made from Nassarius shells thought to be the oldest known jewellery.
						                        The basic forms of jewellery vary between cultures but are often extremely long-lived; in European cultures the most common forms of jewellery listed above have persisted since ancient times, while other forms such as adornments for the nose or ankle, important in other cultures, are much less common. 
						                        Historically, the most widespread influence on jewellery in terms of design and style have come from Asia..
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading" role="tab" id="headingFour">
						<h4 class="panel-title">
							<a class="collapsed" role="button" data-toggle="collapse"
								data-parent="#accordion" href="#collapseFour"
								aria-expanded="false" aria-controls="collapseFour"> help </a>
						</h4>
					</div>
					<div id="collapseFour" class="panel-collapse collapse"
						role="tabpanel" aria-labelledby="headingFour">
						<div class="panel-body">Jewellery consists of small decorative items worn for personal adornment, such as brooches, rings, necklaces, earrings, and bracelets. 
						                        Jewellery may be attached to the body or the clothes, and the term is restricted to durable ornaments, excluding flowers 
						                        for example. For many centuries metal, often combined with gemstones, has been the normal material for jewellery, but other materials such as shells and other plant materials may be used. 
						                        It is one of the oldest type of archaeological artefact  with 100,000-year-old beads made from Nassarius shells thought to be the oldest known jewellery.
						                        The basic forms of jewellery vary between cultures but are often extremely long-lived; in European cultures the most common forms of jewellery listed above have persisted since ancient times, while other forms such as adornments for the nose or ankle, important in other cultures, are much less common. 
						                        Historically, the most widespread influence on jewellery in terms of design and style have come from Asia.
						</div>
					</div>
				</div>
			</div>
			<!-- collapse -->
			<!-- related products -->
			<div class="related-products">
				<h3>Related Products</h3>
				<div class="col-md-4 related products-grid">
					<img src="${images}/19.jpg" alt=" " class="img-responsive" />
					<div class="simpleCart_shelfItem rel">
						<p>
							<span class="overline">Rs.55000</span> <span
								class="item_price val">Rs.50000</span>
						</p>
						<div class="single-but item_add">
							<input type="submit" value="add to cart">
						</div>
					</div>
				</div>
				<div class="col-md-4 related products-grid">
					<img src="${images}/18.jpg" alt=" " class="img-responsive" />
					<div class="simpleCart_shelfItem rel">
						<p>
							<span class="overline">Rs.8000</span> <span
								class="item_price val">Rs.6800</span>
						</p>
						<div class="single-but item_add">
							<input type="submit" value="add to cart">
						</div>
					</div>
				</div>
				<div class="col-md-4 related products-grid">
					<img src="${images}/20.jpg" alt=" " class="img-responsive" />
					<div class="simpleCart_shelfItem rel">
						<p>
							<span class="overline">Rs.101000</span> <span
								class="item_price val">Rs.79000</span>
						</p>
						<div class="single-but item_add">
							<input type="submit" value="add to cart">
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<!-- //related products -->
		</div>
	</div>
	<!-- single -->
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="col-md-3 footer-grid">
				<h6>About us</h6>
				<p>The richness of tradition and eternal mystique of the Pendent
					cluster weave a magical tapestry that will hold every one
					spellbound. The most treasured occasions are those etched forever
					in your memory. Let your memories radiate with the eternal beauty
					of Nakshatra, as each unique piece of Nature's miracle adds magic
					to your special moments.</p>
			</div>
			<div class="col-md-3 footer-grid">
				<h6>Information</h6>
				<ul>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Delivery Information</a></li>
					<li><a href="#">Privacy Policy</a></li>
					<li><a href="#">Terms & Conditions</a></li>
				</ul>
			</div>
			<div class="col-md-3 footer-grid">
				<h6>My Account</h6>
				<ul>
				    <c1:if test="${pageContext.request.userPrincipal.name==null}">
					<li><a href="<c:url value="/login"></c:url>">My Account</a></li>
					</c1:if>
					<li><a href="#">Order History</a></li>
					<li><a href="#">Wish List</a></li>
					<li><a href="#">Newsletter</a></li>
				</ul>
			</div>
			<div class="col-md-3 footer-grid">
				<h6>Extras</h6>
				<ul>
					<li><a href="#">Brands</a></li>
					<li><a href="#">Gift Vouchers</a></li>
					<li><a href="#">Affiliates</a></li>
					<li><a href="#">Specials</a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<div class="footer-copy">
		<p>© 2016 Pendent Store</p>
	</div>
	<!-- //footer -->
	<!-- for bootstrap working -->
	<script src="${js}/bootstrap.js">
		
	</script>
	<!-- //for bootstrap working -->
</body>
</html>