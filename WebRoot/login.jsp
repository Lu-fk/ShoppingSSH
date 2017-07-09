<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<title>login</title>		
		<link href="css/c1.css" type="text/css" media="screen" rel="stylesheet" />
		<!-- 验证码（生成图片） -->
		<script language="javascript">   
			function loadimage(){   
				document.getElementById("randImage").src = "image.jsp?"+Math.random();   
			}   
		</script>
		
		<!-- 弹出错误提示 -->			 
		<script type="text/javascript">
			var msg="${requestScope.tipMessage}";
		 	if(msg!=""){
		 		alert(msg);
		 	}
		</script>
	</head>
	<body id="login">
		<div id="wrapper">
			<div id="content">
				<div id="header">
					<h1>Comodity Manager</h1>
				</div>						
				<div id="darkbanner">
					<h2>Login</h2>
				</div>
				<form name="form1" method="post" action="login.action">
					<fieldset class="form">
                        <p>
							<label for="user_name">UserID:</label>
							<input name="user.name" id="user_name" type="text" />
						</p>
						<p>
							<label for="user_password">Password:</label>
							<input name="user.psw" id="user_password" type="password" />
						</p>  
							
						<p>
							<label for="yznumber">验证码：</label>	
							<input type="text" name="Rand" size="15">   
   
							<img alt="yzm" name="randImage" id="randImage" src="image.jsp"  
								width="60" height="20" border="1" >   
     
							<a href="javascript:loadimage();"><font class=pt95>看不清</font></a>      
						</p>
						<div id="logbutton">
							<button type="submit" class="positive" name="Submit">Login</button>
							<button type="reset" >Reset</button>
						</div>	
                      </fieldset>	
                  </form>					
				</div>
			</div> 
		<div id="wrapperbottom_branding">
			<div id="wrapperbottom_branding_text">
				<a href="register.jsp" style='text-decoration:none'>
				注册新用户</a>
			</div>
		</div> 		 
	</body>
</html>