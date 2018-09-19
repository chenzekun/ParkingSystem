var isLogin = false;

	

function checkLogin(){
	if(!isLogin){
		$("#verify").val("");
		var img = document.createElement("img");
		img.src = "images/err.png";
		img.style.width = "16px";
		img.style.height = "16px";
		$("#result").append(img);
	}
	return isLogin; 
}

function usable(obj,id){
	$("#btnChangeState").click(function(){
		$.post("AdminServlet?action=changeUsable&state=8",{adminId:id},
		function(data){
			if(data){
				window.location.href="AdminServlet?action=showAdmin";
			}
		})
	});
}

function unUsable(obj,id){
	$("#btnChangeState").click(function(){
		$.post("AdminServlet?action=changeUsable&state=7",{adminId:id},
		function(data){
			if(data){
				window.location.href="AdminServlet?action=showAdmin";
			}
		})
	});
}

function delAdmin(obj,id){
	$("#delAdmin").click(function(){
		$.post("AdminServlet?action=del",{adminId:id},
		function(data){
			if(data){
				window.location.href="AdminServlet?action=showAdmin";
			}
		})
	});

}


function enableUser(obj,id){
	$("#btnChangeState").click(function(){
		$.post("UserServlet?action=changeUsable&state=8",{userId:id},
		function(data){
			if(data){
				window.location.href="UserServlet?action=showUser";
			}
		})
	});
}

function disableUser(obj,id){
	$("#btnChangeState").click(function(){
		$.post("UserServlet?action=changeUsable&state=7",{userId:id},
		function(data){
			if(data){
				window.location.href="UserServlet?action=showUser";
			}
		})
	});
}

function delUser(obj,id){
	$("#delUser").click(function(){
		$.post("UserServlet?action=del",{userId:id},
		function(data){
			if(data){
				window.location.href="UserServlet?action=showUser";
			}
		})
	});

}


function resetUser(obj,id){
	$("#resetUser").click(function(){
		$.post("UserServlet?action=reset",{userId:id},
		function(data){
			if(data){
				window.location.href="UserServlet?action=showUser";
			}
		})
	});

}

function changePage(str){
	var action = "AdminServlet?action="+str;
		$.post(action ,$("#searchForm").serialize());
		window.location.href=action;
}

$(document).ready(function(e) {
   
	$("#verify").keyup(function(){
		isLogin = false;
		var lable = document.getElementById("result");
		lable.innerHTML ="";
		var checkcode = $("#verify").val();
		if(checkcode.length == 4){
					$.post("VerifyServlet?action=verify",{keycode:$("#verify").val()},
			function(data){
				if(data != "images/right.png"){
					isLogin = false;
				}else{
					isLogin = true;
				}
				var img = document.createElement("img");
				img.src = data;
				img.style.width = "16px";
				img.style.height = "16px";
				lable.appendChild(img);
			});
			}else{
				var img = document.createElement("img");
				img.src = "images/err.png";
				img.style.width = "16px";
				img.style.height = "16px";
				$("#result").append(img);
			}
		});		
	
	$("#btnAddAdmin").click(function(){
		$.getJSON("RoleServlet?action=getRoleList",
		function(data){
			var option="";
			$("#roleSel").html("");
			$.each(data,function(i,item){
				option+="<option value="+item.roleId+">"+item.roleName+"</option>";
			})	
			 $("#roleSel").append(option);
			 $(".doctor").hide("fast");
		});
	
	});
	
	
	$("#addAdmin1").click(function(){
		$.post("AdminServlet?action=add",$("#addAdminForm").serialize(),
			function(data){
				if(data){
					location.href="AdminServlet?action=showAdmin";
				}else{
					var div = document.createElement("div");
					div.className="alert alert-danger";
					div.value="添加失败,请确认信息是否正确!"
					$("#errInfo").append(div);
				}
			}
		);
		
	});
	
	
	$("#addUser").click(function(){
		$.post("UserServlet?action=add",$("#addUserForm").serialize(),
			function(data){
				if(data){
					location.href="UserServlet?action=showUser";
				}else{
					var div = document.createElement("div");
					div.className="alert alert-danger";
					div.value="添加失败,请确认信息是否正确!"
					$("#errInfo").append(div);
				}
			}
		);
		
	});
	

});