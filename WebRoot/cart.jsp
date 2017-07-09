<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>Comodity Manager_cart</title>
    
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
						商品管理系统 <small>Comodity Manager</small>
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
						<li class="active">
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
			
			<div class="panel panel-success">
			<div class="panel-heading">
				<h3 class="panel-title">
					购物车
				</h3>
			</div>
			<div class="panel-body">
				<table class="table">
					<thead>
						<tr>
							<th>商品ID</th>								
							<th>商品名</th>
							<th>单价</th>
							<th>数量</th>
							<th>总价</th>
							<th>修改数量</th>
						</tr>
					</thead>
					<tbody>
					<s:iterator value="#request.cart" id="c">
						<tr>
							<td><s:property value="#request.c.id.sid" /></td>
							<td><s:property value="#request.c.name" /></td>
							<td><s:property value="#request.c.price" /></td>
							<td><s:property value="#request.c.num" /></td>
							<td><s:property value="#request.c.nprice" /></td>
							<td>
								<ul class="pagination">
									<li><s:a href="add.action?id=%{#request.c.id.sid}">+</s:a></li>
									<li><s:a href="sub.action?id=%{#request.c.id.sid}">-</s:a></li>
								</ul>
							</td>
						</tr>
					</s:iterator>
					</tbody>
				</table>
			</div>

			<div class="panel-footer">
				<div>
					<h3>合计：<s:property value="#request.sum"/><h3>
					<s:a href="buy.action?sum=%{#request.sum}">
						<input class="btn btn-default" type="submit" value="结账" 
						onClick="if(!confirm('一经支付不可退还，确认支付吗？'))return false;else return true;">
					</s:a>
				</div>
			</div>					
		</div>
			
		</div>
	</div>
</div>
</body>

</html>