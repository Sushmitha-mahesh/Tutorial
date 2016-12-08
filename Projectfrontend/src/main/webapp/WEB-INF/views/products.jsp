<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="Spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false"%>
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
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
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
<script type="text/javascript" src="js/megamenu.js"></script>
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
<!-- the jScrollPane script -->
<script type="text/javascript" src="${js}/jquery.jscrollpane.min.js"></script>
<script type="text/javascript" id="sourcecode">
	$(function() {
		$('.scroll-pane').jScrollPane();
	});
</script>
<!-- //the jScrollPane script -->
</head>

<body>
	<!-- top-header -->
	<div class="top_bg">
		<div class="container">
			<div class="header_top-sec">
				<div class="top_right">
					<ul>
						<li><a href="contact">Contact</a></li>|
						<li><a>Welcome ${pageContext.request.userPrincipal.name}</a></li>
					<li><a href="<c:url value="/j_spring_security_logout"></c:url>">logout</a></li> 
			
					</ul>
				</div>
				<div class="top_left">
					<ul>
						<li class="top_link">Email:<a href="open">pendentjwellery@yahoo.com</a></li>|
						<c1:if test="${pageContext.request.userPrincipal.name==null}">
							<li class="top_link"><a
								href="<c:url value="/login"></c:url>">My Account</a></li>
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
				<a href="index.jsp">Pendent Store</a>
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
					<li class="grid"><a class="color1" href="index">Home</a></li>
					<li class="active grid"><a class="color1" href="#">jewellery</a>
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
										<h4>Seating</h4>
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
										<h4>Seating</h4>
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
										<h4>Seating</h4>
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
	<!-- products -->
	<div class="products">

		<div class="container">
			<c1:forEach var="product" items="${pro}">
           <div class="products-grids">
            <div class="col-md-8 products-grid-left">
                 <div class="products-grid-lft">
                         <div class="products-grd">
                          <div class="p-one simpleCart_shelfItem prd">
                             <a href="single"> <img
										src="${images}/${product.getImage()}" alt=""
										class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
									</a>
									<h4>ForeEver Diamonds</h4>
									<p>
										<a class="item_add" href="#"><i></i> <span
											class=" item_price valsa">Rs.${product.getP_price()}</span></a>
									</p>
									<div class="pro-grd">
										<a href="single/${product.getP_id()}">10% Off</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
		</div>
	</div>
	</c1:forEach>
	<%-- 	<div class="products-grd">
							<div class="p-one simpleCart_shelfItem prd">
								<a href="single">
										<img src="${images}/10.jpg" alt="" class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
								</a>
								<h4>Diamonds Studded</h4>
								<p><a class="item_add" href="#"><i></i> <span class=" item_price valsa">Rs.729000</span></a></p>
								<div class="pro-grd">
									<a href="single">10% Off</a>
								</div>
							</div>	
						</div>
						<div class="products-grd">
							<div class="p-one simpleCart_shelfItem prd">
								<a href="single">
										<img src="${images}/9.jpg" alt="" class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
								</a>
								<h4>Precious Diamonds</h4>
								<p><a class="item_add" href="#"><i></i> <span class=" item_price valsa">Rs.729000</span></a></p>
								<div class="pro-grd">
									<a href="single">10% Off</a>
								</div>
							</div>	
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="products-grid-lft">
						<div class="products-grd">
							<div class="p-one simpleCart_shelfItem prd">
								<a href="single">
										<img src="${images}/1.jpg" alt="" class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
								</a>
								<h4>Diamonds for good!</h4>
								<p><a class="item_add" href="#"><i></i> <span class=" item_price valsa">Rs.729000</span></a></p>
								<div class="pro-grd">
									<a href="single">10% Off</a>
								</div>
							</div>	
						</div>
						<div class="products-grd">
							<div class="p-one simpleCart_shelfItem prd">
								<a href="single">
										<img src="${images}/9.jpg" alt="" class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
								</a>
								<h4>Real Diamonds</h4>
								<p><a class="item_add" href="#"><i></i> <span class=" item_price valsa">Rs.729000</span></a></p>
								<div class="pro-grd">
									<a href="single">10% Off</a>
								</div>
							</div>	
						</div>
						<div class="products-grd">
							<div class="p-one simpleCart_shelfItem prd">
								<a href="single">
										<img src="${images}/3.jpg" alt="" class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
								</a>
								<h4>Uncut Diamonds</h4>
								<p><a class="item_add" href="#"><i></i> <span class=" item_price valsa">Rs.729000</span></a></p>
								<div class="pro-grd">
									<a href="single">10% Off</a>
								</div>
							</div>	
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="products-grid-lft">
						<div class="products-grd">
							<div class="p-one simpleCart_shelfItem prd">
								<a href="single">
										<img src="${images}/2.jpg" alt="" class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
								</a>
								<h4>Diamonds for Sure!!</h4>
								<p><a class="item_add" href="#"><i></i> <span class=" item_price valsa">Rs.729000</span></a></p>
								<div class="pro-grd">
									<a href="single">10% Off</a>
								</div>
							</div>	
						</div>
						<div class="products-grd">
							<div class="p-one simpleCart_shelfItem prd">
								<a href="single">
										<img src="${images}/1.jpg" alt="" class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
								</a>
								<h4>Girly Diamonds</h4>
								<p><a class="item_add" href="#"><i></i> <span class=" item_price valsa">Rs.729000</span></a></p>
								<div class="pro-grd">
									<a href="single">10% Off</a>
								</div>
							</div>	
						</div>
						<div class="products-grd">
							<div class="p-one simpleCart_shelfItem prd">
								<a href="single">
										<img src="${images}/4.jpg" alt="" class="img-responsive" />
										<div class="mask">
											<span>Quick View</span>
										</div>
								</a>
								<h4>Beauty Of Diamonds</h4>
								<p><a class="item_add" href="#"><i></i> <span class=" item_price valsa">Rs.729000</span></a></p>
								<div class="pro-grd">
									<a href="single">10% Off</a>
								</div>
							</div>	
						</div> --%>
	<!-- 						<div class="clearfix"> </div> -->

	<!-- 					</div> -->
	<!-- 				</div> -->
	<div class="col-md-4 products-grid-right">
		<div class="w_sidebar">
			<div class="w_nav1">
				<h4>All</h4>
				<ul>
					<li><a href="women.jsp">women</a></li>
					<li><a href="#">new fashion</a></li>
					<li><a href="#">trends</a></li>
					<li><a href="#">boys</a></li>
					<li><a href="#">girls</a></li>
					<li><a href="#">sale</a></li>
				</ul>
			</div>
			<section class="sky-form">
				<h4>catogories</h4>
				<div class="row1 scroll-pane">
					<div class="col col-4">
						<label class="checkbox"><input type="checkbox"
							name="checkbox" checked=""><i></i>Necklaces</label>
					</div>
					<div class="col col-4">
						<label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>Ear Rings</label> <label class="checkbox"><input
							type="checkbox" name="checkbox"><i></i>Rings</label> <label
							class="checkbox"><input type="checkbox" name="checkbox"><i></i>Wedding
							Rings</label> <label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>Braceletes</label> <label class="checkbox"><input
							type="checkbox" name="checkbox"><i></i>Emeralds</label> <label
							class="checkbox"><input type="checkbox" name="checkbox"><i></i>Diamonds</label>
						<label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>Sapphires</label> <label class="checkbox"><input
							type="checkbox" name="checkbox"><i></i>Ruby</label> <label
							class="checkbox"><input type="checkbox" name="checkbox"><i></i>Pearls</label>
						<label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>WhiteMarbles</label> <label
							class="checkbox"><input type="checkbox" name="checkbox"><i></i>prince</label>
						<label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>mili</label> <label class="checkbox"><input
							type="checkbox" name="checkbox"><i></i>Brownnies</label> <label
							class="checkbox"><input type="checkbox" name="checkbox"><i></i>topazz</label>
					</div>
				</div>
			</section>
			<section class="sky-form">
				<h4>brand</h4>
				<div class="row1 scroll-pane">
					<div class="col col-4">
						<label class="checkbox"><input type="checkbox"
							name="checkbox" checked=""><i></i>Prince</label> <label
							class="checkbox"><input type="checkbox" name="checkbox"><i></i>Davanam</label>
						<label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>Malbar</label>
					</div>
					<div class="col col-4">
						<label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>vishnu</label> <label class="checkbox"><input
							type="checkbox" name="checkbox"><i></i>joyallukas</label> <label
							class="checkbox"><input type="checkbox" name="checkbox"><i></i>josallukas</label>
						<label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>Nakshtra</label> <label class="checkbox"><input
							type="checkbox" name="checkbox"><i></i>biba</label> <label
							class="checkbox"><input type="checkbox" name="checkbox"><i></i>shree</label>
						<label class="checkbox"><input type="checkbox"
							name="checkbox"><i></i>Tanishq</label>
					</div>
				</div>
			</section>
		</div>
	</div>
	<div class="clearfix"></div>
	</div>
	</div>
	</div>
	<!-- //products -->
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
					<c1:if test=" ${pageContext.request.userPrincipal.name==null}">
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
</body>
</html>