function getPage(currentPage,pageNum){

		if(pageNum == 0){
				$("#prePoint").hide();
				$("#sufPoint").hide();
		        $("#page_li2 a").hide();
		        $("#page_li3 a").hide();
		        $("#page_li4 a").hide();
		        $("#page_li5 a").hide();
	            $("#sufPage").attr("class","disabled"); 
	            $("#prePage").attr("class","disabled"); 
	            $("#sufPage a").attr('href', '#');
	            $("#prePage a").attr('href', '#'); 
		        return
		}
	
        $("#page_li2 a").text(currentPage*1-1);
        $("#page_li3 a").text(currentPage);
        $("#page_li4 a").text(currentPage*1+1);
        $("#page_li5 a").text(pageNum);
        

        $("#page_li3").attr("class","active");

        if(currentPage==1)  
        {
            $("#prePage").attr("class","disabled"); 
            $("#prePage a").attr('href', '#');   
        }

        if(currentPage==pageNum)    
        {
            $("#sufPage").attr("class","disabled"); 
            $("#sufPage a").attr('href', '#'); 
        }


        if(currentPage<=2){
            $("#prePoint").hide();
        }
        else if(currentPage==3){
            $("#prePoint").hide();
        }

        if(currentPage==1)
        {
            $("#page_li1").hide();
            $("#page_li2").hide();
        }
        else if(currentPage==2)
        {
            $("#page_li2").hide();
        }

        if(currentPage>=pageNum*1-2){
            $("#sufPoint").hide();
        }

        if(currentPage==pageNum)
        {
            $("#page_li4").hide();
            $("#page_li5").hide();
            $("#sufPoint").hide();
        }

        if(currentPage==pageNum*1-1)
        {
            $("#page_li4").hide();
        }
}