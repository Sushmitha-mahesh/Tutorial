<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<c:url value="/resources/css" var="css"/>
<c:url value="/resources/images" var="images"/>
<c:url value="/resources/js" var="js"/>
<title>Pendent Store</title>
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
					<li><a href="contact">Contact</a></li>
				</ul>
			</div>
			<div class="top_left">
				<ul>
					<li class="top_link">Email:<a href="open">pendentjwellery@yahoo.com</a></li>|
					<%-- <c1:if test=" ${pageContext.request.userPrincipal.name==null}"> --%>
					<li class="top_link"><a href=" v"/login">My Account</a></li>				
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
		 	<a href="index.jsp">Pendent Store</a>			 
		</div>
		<div class="header_right">
			<div class="cart box_1">
				<a href="checkout.jsp">
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
								<ul>
									<li><a href="products">Soulmate</a></li>
									<li><a href="products">His & her</a></li>
									<li><a href="products">ancient</a></li>
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
								<ul>
									<li><a href="products">Soulmate</a></li>
									<li><a href="products">his& her</a></li>
									<li><a href="products">ancient</a></li>
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
								<ul>
									<li><a href="products">Soulmate</a></li>
									<li><a href="products">his&her</a></li>
									<li><a href="products">ancient</a></li>
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
									<li><a href="products">fusion</a></li>
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
<!-- addcat-form -->
	<div class="cat-form">
		<div class="container">
			<div class="addcat">
				
				<c:url var="subt" value="/categoryValue" />
                 <form:form method="POST" commandName="user" action="${subt}">
				 
					<ul>
						<li class="text-info"><form:label path="C_NAME" >Category Name:</form:label> </li>
						 <form:input type="text" name="C_NAME" path="C_NAME" value="" />
					</ul>
					<ul>
						<li class="text-info"><form:label path="C_DESCRIPTION" >Category Description: </form:label></li>
						<form:input type="text" name="C_DESCRIPTION" path="C_DESCRIPTION" value="" />
					 </ul>				 
					
						
					<input type="submit" value="Submit">
					</form:form>
					<table class="table table-striped">
				   <tr>
				   <th class="col-md-4">Category Id:</th>
				   <th class="col-md-4">Category Name:</th>
				   <th class="col-md-4">Category Description:</th>
				   <th class="col-md-4">Edit/Delete</th>
				  
				   </tr>
				   
				  <c1:forEach var="name" items="${list}" >
				  <tr>
				  <td class="col-md-4">${name.getC_Id()}</td>
				   <td class="col-md-4" >${name.getC_NAME()}</td>
				   <td class="col-md-4">${name.getC_DESCRIPTION()}</td>
<!-- 				   <td class="col-md-4"><input type="button" class="btn btn-xs btn-success" value="Edit"/> -->
<%-- 				   <input type="button" class="btn btn-xs btn-danger" value="Delete"/><a href='<c:url value="delete/${name.c_Id}"></c:url>'></a></td> --%>
					
					
					<td><a href='<c:url value="/cedit/${name.c_Id}"></c:url>'>Edit</a></td>
<%-- 				  <td><a href='<c:url value="/cedit/${name.c_Id}"></c:url>'>Edit</a></td> --%>
				   <td><a href='<c:url value="/cdelete/${name.c_Id}"></c:url>'>Delete</a></td>
				   
			        </tr>
				   </c1:forEach>
				    
				   </table>
				
			</div>
		</div>
	</div>
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
					<li><a href="login">My Account</a></li>
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
		<p>© 2015 Pendent Store.</a></p>
	</div>
<!-- //footer -->
</body>
</html>