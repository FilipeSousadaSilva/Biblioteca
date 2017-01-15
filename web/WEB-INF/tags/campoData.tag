<%-- 
    Document   : campoData
    Created on : 24/11/2015, 11:58:30
    Author     : lab5aluno
--%>


<!DOCTYPE html>
<%@attribute name="id" required="true" %>

<input id="${id}" name="${id}" />

<script>
    $("#${id}").datepicker({dateFormat: 'dd/mm/yy'});
</script>
