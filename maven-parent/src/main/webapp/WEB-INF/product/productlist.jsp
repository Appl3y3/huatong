<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-12-06
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>产品列表</title>
</head>
<body>
<div class="eXtremeTable" >
    <table id="ec_table" class="tableRegion" width="98%" >
        <thead>
        <tr>
            <td class="tableHeader">产品id</td>
            <td class="tableHeader">产品批次号</td>
            <td class="tableHeader">产品名称</td>
            <td class="tableHeader">产品状态</td>
            <td class="tableHeader">产品数量</td>
            <td class="tableHeader">产品入库时间</td>
            <td class="tableHeader">产品数据修改时间</td>
        </tr>
        </thead>
        <tbody class="tableBody" >

        <forEach items="${productlist}" var="d" varStatus="status">
            <tr class="odd" onmouseover="this.className='highlight'" onmouseout="this.className='odd'">
                <td><input type="checkbox" name="productId" value="${d.productId}"/></td>
                <td>${d.productNo}</td>
                <td>${d.productName}</td>
                <td>${d.status}</td>
                <td>${d.num}</td>
                <td>${d.insert_time}</td>
                <td>${d.modifytime}</td>

               <%--
               <td><a href="toview?deptId=${d.deptId}">${d.deptName}</a></td>
                <td>
                    <c:if test="${d.state==1}"><a href="stop?deptId=${d.deptId}"><font color="green">启用</font></a></c:if>
                    <c:if test="${d.state==0}"><a href="start?deptId=${d.deptId}"><font color="red">停用</font></a></c:if>
                </td>
                --%>
            </tr>
        </forEach>

        </tbody>
    </table>
</div>
</body>
</html>
