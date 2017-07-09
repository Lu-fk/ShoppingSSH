<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<title>login</title>		
		<link href="css/c1.css" type="text/css" media="screen" rel="stylesheet" />
		
		<!-- 弹出错误提示  -->
		<script type="text/javascript">
			var msg="${requestScope.errMessage}";
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
					<h2>Register</h2>
				</div>
				<form name="form1" method="post" action="register.action">
					<fieldset class="form">
                        <p>
							<label for="user_name">Input UserID:</label>
							<input name="user.name" id="user_name" type="text" />
						</p>
						<p>
							<label for="user_password">Input Password:</label>
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
							<button type="submit" class="positive" name="Submit" onclick="check_fields();">Submit</button>
							<button type="reset" >Reset</button>
						</div>	
                     </fieldset>	
                 </form>					
			</div>
		</div> 	 
	</body>
</html>