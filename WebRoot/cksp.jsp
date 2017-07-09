<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>Comodity Manager_comodity</title>
    
    <!-- 使网页适应不同分辨率的设备 -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
        
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	
	<script type="text/javascript">
		var msg="${requestScope.buyMessage}";
		 if(msg!=""){
		 	alert(msg);
		 }
	</script>

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
						<li class="active">
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
			
			<table class="table">
				<thead>
					<tr>
						<th>
							编号
						</th>
						<th>
							产品
						</th>
						<th>
							价格
						</th>
						<th>
							详细信息
						</th>
						<th>
							购买
						</th>
					</tr>
				</thead>
				<tbody>
				
				<!-- 输出商品信息 -->
				<s:iterator value="#request.list" id="sp">
					<tr>
						<td>
							<s:property value="#sp.SId" />
						</td>
						<td>
							<s:property value="#sp.name"/>
						</td>
						<td>
							<s:property value="#sp.price"/>
						</td>
						<td>					
							<!-- 通过标签给action传参数 -->
							<s:a href="spdetail.action?id=%{#sp.SId}"><input class="btn btn-default" type="submit" value="查看"></s:a>							
						</td>
						<td>
							<s:a href="addcart.action?id=%{#sp.SId}"><input class="btn btn-default" type="submit" value="添加至购物车"></s:a>
						</td>
					</tr>
				</s:iterator>
				
				</tbody>
			</table>
					
		</div>
	</div>
</div>
</body>

</html>