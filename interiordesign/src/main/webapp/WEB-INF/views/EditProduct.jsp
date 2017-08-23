<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="Admin.jsp"></jsp:include>
<div class="bg-content">
  <div class="container">
     <div align="Center">
<h3>Edit a Product</h3>
</br><br/>
<form:form action="EditProduct" method="POST" commandName="EditProduct1">

  <fieldset>
      
      <p>
      	<label>Product Id:</label>
         <form:input type="text" path="pid" readonly="true"/>
      </p>

       <p><label >Product Quantity</label>
         <form:input type="text" path="pquan"/>
      </p>
       <p><label >Product Price</label>
         <form:input type="text" path="pcost"/>
      </p>

      <p><input type="submit" value="Update Product"/></p>
    </fieldset>
  </form:form>  
  </div>
  </div>
  </div>    
</div>
