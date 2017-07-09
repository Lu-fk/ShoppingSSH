<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>Comodity Manager</title>
    
    <!-- 使网页适应不同分辨率的设备 -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
        
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

  </head>

  <body>
	<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-7 column">
					<h1 class="text-left">
						商品管理系统<small>Comodity Manager</small>
					</h1>
				</div>
				<div class="col-md-5 column">
					<ul class="nav navbar-nav navbar-right">
						<li style="top:30px">
							<a href="login.jsp">登录|切换账户</a>
						</li>
					</ul>
				</div>
			</div>
			
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <a class="navbar-brand" href="index.jsp">主页</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							 <a href="spInfo.action"><strong>查看商品</strong></a>
						</li>
						<li>
							 <a href="cartInfo.action"><strong>购物车</strong></a>
						</li>
						<li>
							 <a href="orderInfo.action"><strong>我的订单</strong></a>
						</li>
					</ul>
				
					<form class="navbar-form navbar-right" role="search" action="spdetail.action">
						<div class="form-group">
							<input class="form-control" type="text" name="id" placeholder="输入商品id搜索商品"/>
						</div> <button class="btn btn-default" type="submit">Search</button>
					</form>					
				</div>				
			</nav>
			
			<div class="jumbotron well">
				<h1 class="text-center">
					淘你喜欢，任你选购！
				</h1>
				
				<p class="text-center">
					 <a class="btn btn-primary btn-large" href="spInfo.action">立即剁手</a>
				</p>
			</div>
			
			<div class="carousel slide" id="carousel-122585">
				<ol class="carousel-indicators">
					<li class="active" data-target="#carousel-122585" data-slide-to="0">
					</li>
					<li data-target="#carousel-122585" data-slide-to="1">
					</li>
					<li data-target="#carousel-122585" data-slide-to="2">
					</li>
				</ol>
				<div class="carousel-inner" >
					<div class="item active">
						<img alt="" src="picture/iphone.jpg" style="width:100%"/>
						<div class="carousel-caption">
							<h4>
								猜你喜欢
							</h4>
							<p>
								点击查看买买买页面立即剁手！
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="picture/earphone.jpg" style="width:100%"/>
						<div class="carousel-caption">
							<h4>
								猜你喜欢
							</h4>
							<p>
								点击查看买买买页面立即剁手！
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="picture/keyboard.jpg" style="width:100%"/>
						<div class="carousel-caption">
							<h4>
								猜你喜欢
							</h4>
							<p>
								点击查看买买买页面立即剁手！
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-122585" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-122585" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
			
			<blockquote>
				<p>
					2017企业java大作业.
				</p> <small>141320128 <cite>陆永康</cite></small>
			</blockquote>
			
			
		</div>
	</div>
</div>
</body>

</html>