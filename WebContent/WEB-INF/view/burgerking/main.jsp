<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<script src ="../../js/burgerking/burgerking.js"></script>
<%@ include file="../common/head.jsp"%>
<body>
<div id ="wrapper">
<a  href="#">HOME</a>
<a  href="../index.jsp">로그아웃</a>
<%@ include file="../common/nav.jsp"%>
<section>
<article>
	<header>
		<hgroup>
			<h1>버거킹 주문 화면</h1>
			<h6>상품과 수량을 선택해주세요</h6>
		</hgroup>
	</header>	
</article>
<article>
	<form id="order_form" action="result.jsp" 
	 style ="width : 600px; margin: 0 auto">
<table>
	<tr>
		<td>
				<figure>
					<img src="../../img/hamburger.jpg"
							style="width: 200px; height: 200px;" alt="" /> 
					<figcaption>
	 					<input type="checkbox" name="menu" value="hamburger" />햄버거 :￦ 5500
						<input type="number" name= "hamburger-count" style="width :30px" min="1" max="9"/> 개
					</figcaption>
			</figure>
		</td>
		<td>
			<figure>
		<img src="../../img/cock.jpg"
			style="width: 200px; height: 200px;" alt="" />
			<figcaption>
			<input type="checkbox"	name="menu" value="cock" />콜라 : ￦1.000
			<input type="number" name= "cock-count" style="width :30px" min="1" max="9"/> 개
			</figcaption>
	</figure>
    </td>
	<td>
	<figure>
	<img src="../../img/bagel.jpg"
			style="width: 200px; height: 200px;" alt="" />
		<figcaption>
			<input type="checkbox"	name="menu" value="bagel" />베이글 : ￦4.000
			<input type="number" name= "bagel-count" style="width :30px" min="1" max="9"/> 개
		</figcaption>
	</figure>
		</td>
	</tr>
	<tr>
		<td>
		<figure>
		<img src="../../img/chip.jpg"
			style="width: 200px; height: 200px;" alt="" /> 
			<figcaption>
			<input type="checkbox" name="menu" value="chip" />감자칩 : ￦1.000 
			<input type="number" name= "chip-count" style="width :30px" min="1" max="9"/> 개
			</figcaption>
			</figure>
			</td>
		<td>
		<figure>
		<img src="../../img/coffee.jpg"
			style="width: 200px; height: 200px;" alt="" />
			 <figcaption>
			 <input	type="checkbox" name="menu" value="coffee" />커피 : ￦900
			<input type="number" name= "coffee-count" style="width :30px" min="1" max="9"/> 개
			 </figcaption>
			 </figure>
			 </td>
		<td>
		<figure>
		<img src="../../img/salad.jpg"
			style="width: 200px; height: 200px;" alt="" /> 
			<figcaption>
			<input	type="checkbox" name="menu" value="salad" />샐러드 : ￦3000
			<input type="number" name= "salad-count" style="width :30px" min="1" max="9"/> 개
		</figcaption>
		</figure>
			</td>
	</tr>
		<tr>
		<td colspan = "3">
			<input type="radio" name = "place" value = "매장식사" checked /> 매장식사
			<input type="radio" name = "place" value = "테이크아웃" />	테이크아웃
		</td>
	</tr>
	
	<tr>
		<td colspan="3">
		<input type="hidden" name="hamburger" value="5500" /> 
		<input type="hidden" name="coke" value="1000" />
	    <input type="hidden" name="chip" value="1000" /> 
	    <input type="hidden" name="bagel" value="4000" /> 
	    <input type="hidden" name="salad" value="3000" /> 
	    <input type="hidden" name="coffee" value="900"  />
	   <!--  <input type="text" name="count" 
	                style ="width : 200px; margin-left: 50px" placeholder = "수 량"/> -->
	    <input id = "burgerking_order_btn" type="button" value="전 송"
		      		style="width: 100%; height: 100%; margin-right: 20px" />
</table>
		</form>
		</article>
</section>
<aside></aside>
</div>
<%@ include file = "../common/footer.jsp" %>
</body>
</html>