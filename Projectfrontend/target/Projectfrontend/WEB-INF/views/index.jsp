<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c1" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html>
<html>
<head>
<c:url value="/resources/css" var="css"/>
<c:url value="/resources/images" var="images"/>
<c:url value="/resources/js" var="js"/>
<title>Pendent Store a Ecommerce Online Shopping Category Flat Bootstarp Resposive Website</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pendent Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="${css}/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="${css}/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="${js}/jquery-1.11.1.min.js"></script>
<!-- //js -->
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="${js}/move-top.js"></script>
<script type="text/javascript" src="${js}/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- start menu -->
<link href="${css}/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="${js}/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<script src="${js}/menu_jquery.js"></script>
<script src="${js}/simpleCart.min.js"> </script>
<link href='http://fonts.googleapis.com/css?family=Monda:400,700' rel='stylesheet' type='text/css'>
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
				<li><a href="contact">Contact</a></li>|
              <c1:if test="${pageContext.request.userPrincipal.name!=null}" >
		<security:authorize access="hasRole('ROLE_ADMIN')">
<%-- 				<li><a href="<c:url value="/Admin"/>">Admin</a></li> --%>
				
				   <li><a href="<c:url value="/addcategory"/>"> Manage Categories</a></li>|
					<li><a href="<c:url value="/addproduct"/>"> Manage Products</a></li>|
					<li><a href="<c:url value="/addsupplier"/>">Manage Suppliers</a></li>
					</security:authorize>
					
					 <li><a>Welcome ${pageContext.request.userPrincipal.name}</a></li>
					<li><a href="<c:url value="/j_spring_security_logout"></c:url>">logout</a></li> 
				
					</c1:if>
					
				</ul>
			</div>
			<div class="top_left">
				<ul>
				    
					<li class="top_link">Email:<a href="open">pendentjwellery@yahoo.com</a></li>|
					<c1:if test="${pageContext.request.userPrincipal.name==null}">
				     <li class="top_link"><a href="<c:url value="/login"></c:url>">My Account</a></li>
				     </c1:if>
									
				</ul>
			</div>
			<div class="clearfix"> </div>
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
				<h3> <div class="total">
					<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> items)</div>
					<img src="${images}/cart1.png" alt=""/></h3>
				</a>
				<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
				<div class="clearfix"> </div>
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
		
			<li class="active grid"><a class="color1" href="index">Home</a></li>
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
								<ul><li><a href="products">Soulmate</a></li>
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
    			</div>
			</li>
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
								<ul><li><a href="products">Soulmate</a></li>
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
    			</div>
			</li>				
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
								<ul><li><a href="products">Soulmate</a></li>
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
    			</div>
			</li>
								
		</ul> 
			<div class="search">
				 <form>
					<input type="text" value="" placeholder="Search...">
					<input type="submit" value="">
					</form>
			</div>
			<div class="clearfix"></div>
		 </div>
	  </div>
</div>
<!---->
<!-- banner -->
	<div class="banner">
		<div class="container">
<!-- Slider-starts-Here -->
				<script src="${js}/responsiveslides.min.js"></script>
				 <script>
				    // You can also use "$(window).load(function() {"
				    $(function () {
				      // Slideshow 4
				      $("#slider3").responsiveSlides({
				        auto: true,
				        pager: false,
				        nav: true,
				        speed: 500,
				        namespace: "callbacks",
				        before: function () {
				          $('.events').append("<li>before event fired.</li>");
				        },
				        after: function () {
				          $('.events').append("<li>after event fired.</li>");
				        }
				      });
				
				    });
				  </script>
			<!--//End-slider-script -->
			<div  id="top" class="callbacks_container">
				<ul class="rslides" id="slider3">
					<li>
						<div class="banner-info">
							<div class="banner-info1">
								<div class="banner-inf">
									<h1>A Trio Of Diamonds..</h1>
									<p>The article of jewelry around which centers tradition, antiquity, utility and symbolic meaning of the greatest reverential character.
DIAMOND ORNAMENTS</p>
									<div class="buy">
										<a href="single">Explore</a>
									</div>
								</div>
							</div>
						</div>
					</li>
					<li>
						<div class="banner-info">
							<div class="banner-info1">
								<div class="banner-inf">
									<h1>Open To Love!</h1>
									<p>The article of jewelry around which centers tradition, antiquity, utility and symbolic meaning of the greatest reverential character.
GOLD ORNAMENTS</p>
									<div class="buy">
										<a href="single">Explore</a>
									</div>
								</div>
							</div>
						</div>
					</li>
					<li>
						<div class="banner-info">
							<div class="banner-info1">
								<div class="banner-inf">
									<h1>Enticing Regelia!!!</h1>
									<p>The article of jewelry around which centers tradition, antiquity, utility and symbolic meaning of the greatest reverential character.
ANCIENT SECRET</p>
									<div class="buy">
										<a href="single">Explore</a>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
<!-- //banner -->
<!-- cate -->
	<div class="cate">
		<div class="container">
			<div class="cate-left">
				<h3>Necklaces<span>Our Catelog</span></h3>
			</div>
			<div class="cate-right">
				<!-- slider -->
				<ul id="flexiselDemo1">			
					<li>
						<div class="sliderfig-grid">
							<img src="${images}/a.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="sliderfig-grid">
							<img src="${images}/b.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="sliderfig-grid">
							<img src="${images}/c.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="sliderfig-grid">
							<img src="${images}/d.jpg" alt=" " class="img-responsive" />
						</div>
					</li>
					</ul>
					<script type="text/javascript">
							$(window).load(function() {
								$("#flexiselDemo1").flexisel({
									visibleItems: 4,
									animationSpeed: 1000,
									autoPlay: true,
									autoPlaySpeed: 3000,    		
									pauseOnHover: true,
									enableResponsiveBreakpoints: true,
									responsiveBreakpoints: { 
										portrait: { 
											changePoint:480,
											visibleItems: 3
										}, 
										landscape: { 
											changePoint:640,
											visibleItems:4
										},
										tablet: { 
											changePoint:768,
											visibleItems: 3
										}
									}
								});
								
							});
					</script>
					<script type="text/javascript" src="${js}/jquery.flexisel.js"></script>
			</div>
<!-- //slider -->
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //cate -->
<!-- cate-bottom -->
	<div class="cate-bottom">
		<div class="container">
			<div class="cate-bottom-info">
				<h3>New Collections</h3>
				<p>Add a Personal touch to fineese and style with handicrafted designeer jewellery.				
				<span>Opal is the MultiGem</span></p>
				<div class="buy let">
					<a href="single">Read More</a>
				</div>
			</div>
		</div>
	</div>
<!-- //cate-bottom -->
<!-- welcome -->
	<div class="welcome">
		<div class="container">
			<div class="welcome-info">
				<h3>Welcome To Our Store!</h3>
				<p class="non">A woman needs ropes and ropes of pearls.
				<span>With melted opals for my milk. Pearl-leaf for my cracker.</span></p>
				<p class="rep">There are three things extremely hard: steel, a diamond, and to know one's self.
				</p>
				<div class="buy wel">
					<a href="single">Read More</a>
				</div>
			</div>
		</div>
	</div>
<!-- //welcome -->
<!-- banner-bottom1 -->
	<div class="banner-bottom1">
		<div class="container">
			<div class="banner-bottom1-grids">
				<div class="banner-bot-grd">
					<div class="col-md-7 banner-bot-grid">
						<div class="jel-video">
							<iframe src="https://player.vimeo.com/video/45541146" width="500" height="281" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
						</div>
					</div>
					<div class="col-md-5 banner-bot-grid">
						<div class="banner-bot-grid1">
							<img src="${images}/a3.jpg" alt=" " class="img responsive" />
							<div class="pos-absolt">
								<h3>trendy collections</h3>
								<p>These gems have life in them: their colors speak, say what words fail of.
</p>
							</div>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-4 banner-bottom1-grid">
					<div class="banner-bottom1-grid1">
						<img src="${images}/6.jpg" alt=" " class="img-responsive" />
						<div class="head-para">
							<h3>stylish and glamorous</h3>
							<p>There is just one piece of jewelry that is equally becoming to everybody, lovely with almost every ensemble, appropriate for almost any occasion, and indispensable in every woman's wardrobe... long live the pearl necklace </p>
						</div>
					</div>
				</div>
				<div class="col-md-4 banner-bottom1-grid">
					<div class="banner-bottom1-grid1">
						<img src="${images}/5.jpg" alt=" " class="img-responsive" />
						<div class="head-para">
							<h3>Trinity</h3>
							<p>Accessories are like vitamins to fashion.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 banner-bottom1-grid">
					<div class="banner-bottom1-grid1">
						<img src="${images}/7.jpg" alt=" " class="img-responsive" />
						<div class="head-para">
							<h3>open to love</h3>
							<p>At the edge of madness you howl diamonds and pearls.</p>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //banner-bottom1 -->
<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container">
			<div class="product-one">
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">							
							<a href="single">
								<img src="${images}/1-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
							</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single">
								<img src="${images}/3-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single">
								<img src="${images}/2-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single">
								<img src="${images}/4-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">							
							<a href="single">
								<img src="${images}/5-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
							</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single">
								<img src="${images}/6-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="product-one">
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">							
							<a href="single">
								<img src="${images}/7-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
							</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single">
								<img src="${images}/13-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single">
								<img src="${images}/9-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single">
								<img src="${images}/10-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">							
							<a href="single">
								<img src="${images}/11-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
							</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single">
								<img src="${images}/12-.jpg" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">Rs.729000</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //banner-bottom -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="col-md-3 footer-grid">
				<h6>About us</h6>
				<p>The richness of tradition and eternal mystique of the Pendent cluster weave a magical tapestry that will hold every one spellbound. The most treasured occasions are those etched forever in your memory. Let your memories radiate with the eternal beauty of Nakshatra, as each unique piece of Nature's miracle adds magic to your special moments.</p>
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
		<p>© 2015 Pendent Store.</p>
	</div>
<!-- //footer -->
</body>
</html>